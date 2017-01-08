$(function() {

	    $("#datepicker").datepicker({dateFormat: 'yy-mm-dd'});
	    
	    $("#addevent").click(function() {
	    	var name=$("#name").val();
	    	var short=$("#description").val();
	    	var date =$("#datepicker").val();
	    	var image = $("#imageUrl").val();
	    	var description=$("#description").val();

var json ={ "imageUrl" : image , "header" : name , "description" : description , "eventDate" : date, "eventUser" : "admin"};

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

function readURL() {
    if ($("#imageUrl").val()!='') {
    	 $('#image')
         .attr('src', $("#imageUrl").val())
         .width(150)
         .height(200);
    }
}
