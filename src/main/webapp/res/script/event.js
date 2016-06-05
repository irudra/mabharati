$(function() {

	    $("#datepicker").datepicker({dateFormat: 'yy-mm-dd'});
	    
	    $("#addevent").click(function() {
	    	var name=$("#name").val();
	    	var short=$("#description").val();
	    	var date =$("#datepicker").val();

	    	var description=$("#description").val();

var json ={ "imageUrl" : "/res/image/Story4.jpg" , "header" : name , "description" : description , "eventDate" : date, "eventUser" : "admin"};

	    	var data = JSON.stringify(json);
	    	alert(data);

	  	  $.ajax({
	  	    type: "GET",
	  	    url: "/addEvent",
	  	    data: {"json":data},
	  	  success: function(resposeJsonObject){
	  		$('#response').html("The event is added successfully").fadeIn('slow');
	      },
	  	    error:function(resposeJsonObject){
		  		$('#response').html("We encounterd some error while inserting event").fadeIn('slow');
		      }
	  	  });

	  	});
  });

