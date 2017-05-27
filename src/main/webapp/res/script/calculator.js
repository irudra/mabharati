$(function() {

	$("#estimationDate").datepicker({
		dateFormat : 'yy-mm-dd'
	});
	$("#startDate").datepicker({
		dateFormat : 'yy-mm-dd'
	});

	$("#calculate")
			.click(
					function() {
						var initialDeposit = $("#initialDeposit").val();
						var subscriptionAmount = $("#subscriptionAmount").val();
						var sucscriptionNumber = $("#sucscriptionNumber").val();
						var annualRateOfIntrestOnDeposit = $(
								"#annualRateOfIntrestOnDeposit").val();
						var intrestRateOnLoan = $("#intrestRateOnLoan").val();
						var outLoan = $("#outLoan").val();
						var avgPeriod = $("#avgPeriod").val();
						var estimationDate = $("#estimationDate").val();
						var startDate = $("#startDate").val();

						var json = {
							"depositInput" : {
								"initialDeposit" : initialDeposit,
								"subscriptionAmount" : subscriptionAmount,
								"sucscriptionNumber" : sucscriptionNumber,
								"annualRateOfIntrestOnDeposit" : annualRateOfIntrestOnDeposit
							},
							"loanInput" : {
								"intrestRateOnLoan" : intrestRateOnLoan,
								"outLoan" : outLoan,
								"avgPeriod" : avgPeriod
							},
							"startDate" : startDate,
							"estimationDate" : estimationDate
						};

						var data = JSON.stringify(json);

						$
								.ajax({
									type : "GET",
									url : "/calculate",
									data : {
										"json" : data
									},
									success : function(resposeJsonObject) {
										$("#reportContainer").html(
												resposeJsonObject);
									},
									error : function(resposeJsonObject) {
										$('#reportContainer')
												.html(
														"We encounterd some error while inserting event")
												.fadeIn('slow');
									}
								});

					});
});