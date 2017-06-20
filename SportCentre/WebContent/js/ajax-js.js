$(document).ready(function(){
	    $("button").click(function(){
	        $.ajax({
	        	url : 'SportServlet',
	        	type:"post",
	        	data : {
	        		selectedValue : "Cricket"
				},
				dataType: 'json',
	        	success: function(result){
	        		var _html='<table >';
	        	    _html += '<tr>';
	        	    _html += '<th>Match</th>';
	        	    _html += '<th>Score</th>';
	        	    _html += '</tr>';
	        	    console.log(JSON.stringify(result.data));
 	        		$.each(result.data, function (index, value) {
	        			_html += '<tr>';
	        			_html += '<td>'+value.title+'</td>';
	        			_html += '<td>'+value.score+'</td>';
	        			_html += '</tr>';
	        		});
	        		_html += '</table>';
	            $("#div1").html(_html);
	        },
	        error : function (jqXHR, status, err) {
	            alert("Local error callback.");
	          } 
				
	        });
	        
	    });
	});