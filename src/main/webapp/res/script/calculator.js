$(function() {

	    $("#estimationDate").datepicker({dateFormat: 'yy-mm-dd'});
	    
	    $("#calculate").click(function() {
	    	var subscriptionAmount=$("#subscriptionAmount").val();
	    	var sucscriptionNumber=$("#sucscriptionNumber").val();
	    	var annualRateOfIntrestOnDeposit=$("#annualRateOfIntrestOnDeposit").val();
	    	var intrestRateOnLoan=$("#intrestRateOnLoan").val();
	    	var avgPeriod=$("#avgPeriod").val();
	    	var estimationDate =$("#estimationDate").val();

var json ={"depositInput":{"subscriptionAmount":subscriptionAmount,"sucscriptionNumber":sucscriptionNumber,"annualRateOfIntrestOnDeposit":annualRateOfIntrestOnDeposit},"loanInput":{"intrestRateOnLoan":intrestRateOnLoan,"avgPeriod":avgPeriod},"estimationDate":estimationDate};

	    	var data = JSON.stringify(json);
	    	alert(data);

	  	  $.ajax({
	  	    type: "GET",
	  	    url: "/calculate",
	  	    data: {"json":data},
	  	  success: function(resposeJsonObject){
	  		$("#reportContainer").html(resposeJsonObject);
	      },
	  	    error:function(resposeJsonObject){
		  		$('#reportContainer').html("We encounterd some error while inserting event").fadeIn('slow');
		      }
	  	  });

	  	});
  });