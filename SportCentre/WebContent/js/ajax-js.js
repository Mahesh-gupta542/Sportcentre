$(document).ready(function(){
	    $("button").click(function(){
	        $.ajax({
	        	url : 'SportServlet',
	        	type:"post",
	        	data : {
	        		selectedValue : "Cricket"
				},
	        	success: function(result){
/*	        		var _html='<table >';
	        	    _html += '<tr>';
	        	    _html += '<th>Blockk No</th>';
	        	    _html += '<th>Lott No</th>';
	        	    _html += '<th>Extentt</th>';
	        	    _html += '<th>Land Value</th>';
	        	    _html += '<th>On Booking Amount</th>';
	        	    _html += '</tr>';*/
	            $("#div1").html(result);
	        }});
	    });
	});