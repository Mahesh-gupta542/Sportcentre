package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.*;



/**
 * Servlet implementation class SportServlet
 */
@WebServlet("/SportServlet")
public class SportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SportServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("userName"));
		if (request.getParameter("userName").equalsIgnoreCase("Cricket")){
			
			response.setContentType("text/plain");
			response.getWriter().write("inside Cricket");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("selectedValue").equalsIgnoreCase("Cricket")){
try{
			HashMap<Integer, String> MatchList =new HashMap<Integer, String>();
			HashMap<Integer, String> MatchScores =new HashMap<Integer, String>();
			URL url = new URL("http://cricapi.com/api/matches/?apikey=8vFya3q0knOJ9XrkBVqJeCdQtNr1");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				   throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
				}
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			System.out.println("Output from Server .... \n");
			String output;
			String cricMtchs="";
			String mtchScore="";
			while (( output = br.readLine()) != null) {
				cricMtchs=output;
			}
			JSONObject apiRes= new JSONObject(cricMtchs);
			JSONArray cricMtchsArr = apiRes.getJSONArray("matches");
			String MtchTitle="";
			for (int i = 0; i<cricMtchsArr.length(); i++ ){
				
				if (cricMtchsArr.getJSONObject(i).getBoolean("matchStarted")){
					MtchTitle=cricMtchsArr.getJSONObject(i).getString("team-1")+" vs "+cricMtchsArr.getJSONObject(i).getString("team-2");
					MatchList.put(cricMtchsArr.getJSONObject(i).getInt("unique_id"), MtchTitle);
					url = new URL("http://cricapi.com/api/cricketScore/?unique_id="+cricMtchsArr.getJSONObject(i).getInt("unique_id")+"&apikey=8vFya3q0knOJ9XrkBVqJeCdQtNr1");
					conn = (HttpURLConnection) url.openConnection();
					conn.setRequestMethod("GET");
					conn.setRequestProperty("Accept", "application/json");
					br = new BufferedReader(new InputStreamReader(
							(conn.getInputStream())));
					while (( output = br.readLine()) != null) {
						mtchScore=output;
					}
					JSONObject mtchScoreJson= new JSONObject(mtchScore);
					MatchScores.put(cricMtchsArr.getJSONObject(i).getInt("unique_id"), mtchScoreJson.getString("score"));
					
				}
			}
			
			System.out.println(MatchList.size());
			System.out.println(MatchScores.size());
			
			response.getWriter().append("output from Cricapi: ").append(cricMtchs);
			//System.out.println(cricMtchs);
			
			
		}catch (Exception e){
			e.printStackTrace();
		}

		}

	}

}
