<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.0/themes/cupertino/jquery-ui.css" />
  <link rel="stylesheet" href="/res/script/style.css">
  <link rel="stylesheet" href="/res/script/mabharatistyle.css">
   <script type="text/javascript" src="/res/script/js-image-slider.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.2/jquery-ui.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/res/script/calculator.js"></script>
<script type="text/javascript" src="/res/script/mabharati.js"></script>
</head>
<body>
<div id="contents">
		<div class="clearfix">
			<div class="sidebar">
<form id="Calculator" >
				<fieldset class="form-group">
					<label for="name">Subscription Amount</label> <input type="text"
						class="form-control" id="subscriptionAmount" placeholder="500">
				</fieldset>
<fieldset class="form-group">
					<label for="name"> Subscription Number</label>
					<input type='text' id="sucscriptionNumber" placeholder="2000"/>
				</fieldset>

				<fieldset class="form-group">
					<label for="shortdescription">Annual rate Of interest on Deposit</label> <input
						type="text" class="form-control" id="annualRateOfIntrestOnDeposit"
						placeholder="10">
				</fieldset>
				
				<fieldset class="form-group">
					<label for="shortdescription">Interest Rate on Loan</label> <input
						type="text" class="form-control" id="intrestRateOnLoan"
						placeholder="12">
				</fieldset>
				<fieldset class="form-group">
					<label for="shortdescription">avg Period</label> <input
						type="text" class="form-control" id="avgPeriod"
						placeholder="15">
				</fieldset>

				<fieldset class="form-group">
					<label for="shortdescription">Estimation Date</label> <input type="text"
						class="form-control" id="estimationDate" placeholder="dd/MM/yyyy">
				</fieldset>
				
				<fieldset class="form-group">
					<input type="button" id="calculate" value="calculate">
				</fieldset>
				
				<div id="response">
				</div>
				
			</form>
</div>
<div id="reportContainer" class="main">
</div>
</div>
	</div>
</body>
</html>

