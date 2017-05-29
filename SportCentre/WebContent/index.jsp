<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sport Centre</title>
	<link rel="stylesheet" href="css/style.css" type="text/css">
	<script type = "text/javascript" src = "https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script type = "text/javascript" src = "js/ajax-js.js">
	
	
	</script>
</head>
<body>
	<div class="header">
		<div>
			<a href="index.html" id="logo"><img src="images/logo.png" height="50px" alt="logo"></a>
			<ul>
				<li class="selected">
					<a href="index.html">Home</a>
				</li>
				<li>
					<a href="about.html">About</a>
				</li>
				<li>
					<a href="collections.html">Collections</a>
					<ul>
						<li>
							<a href="collections.html">Women's</a>
						</li>
						<li>
							<a href="collections.html">Men's</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="blog.html">Blog</a>
				</li>
				<li>
					<a href="locator.html">Store Locator</a>
				</li>
			</ul>
		</div>
		<div class="featured">
			<div id="div1">
				
			</div>
		</div>
	</div>
	<div class="body">
		<div id="result">
			<h2>Welcome to the Sports World</h2>
			<p>
							</p>
			<ul>
				<li id="cricketDiv">
					<a href=""><img src="images/figure2.jpg" alt="" style="height: 350px; width: 250px"></a> <button>Cricket</button>
				</li>
				<li>
					<a href=""><img src="images/figure3.jpg" alt="" style="height: 350px; width: 250px"></a> <input type="submit" name="selectedValue" value="Fotball" style="padding: 5px 15px; background:#ccc; border:0 none; cursor:pointer; -webkit-border-radius: 5px; border-radius: 5px;">
				</li>
				<li>
					<a href=""><img src="images/figure4.jpg" alt="" style="height: 350px; width: 250px"></a> <input type="submit" name="selectedValue" value="Hockey" style="padding: 5px 15px; background:#ccc; border:0 none; cursor:pointer; -webkit-border-radius: 5px; border-radius: 5px;">
				</li>
				<li>
					<a href=""><img src="images/figure5.jpg" alt="" style="height: 350px; width: 250px"></a> <input type="submit" name="selectedValue" value="Tennis" style="padding: 5px 15px; background:#ccc; border:0 none; cursor:pointer; -webkit-border-radius: 5px; border-radius: 5px;">
				</li>
			</ul>
		</div>
	</div>
	<div id="cricket123"></div>
	
	<div class="footer">
		<div>
			<p>
				&#169; 
			</p>
			<ul>
				<li>
					<a href="#">Privacy Policy</a>
				</li>
				<li>
					<a href="#">Terms And Conditons</a>
				</li>
			</ul>
			<div class="connect">
				
			</div>
		</div>
	</div>
</body>
</html>