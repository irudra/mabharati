<%-- 
    Document   : kogin
    Created on : May 7, 2013, 1:34:18 PM
    Author     : hemant
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%-- 
    Document   : homeLayout
    Created on : May 7, 2013, 5:19:04 PM
    Author     : hemant
--%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<meta charset="UTF-8">
<meta name="description"
	content="Ma Bharati Social service Masi, we are working for underprivileged children, old age, farmers, small traders and  actively involved in other social reform in Uttarakhand region.">
<meta name="keywords"
	content="NGO, uttarakhand, children, education, farmer, old age, hills, pahad, self help, trader, society">
<meta name="author" content="Hemant Gaur">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link rel="icon" type="image/png"
	href="https://raw.githubusercontent.com/rudralife/mabharati/UIchangeslocal/src/main/webapp/res/image/icon.png">
<link rel="stylesheet"
	href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.0/themes/cupertino/jquery-ui.css" />
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="/res/script/mabharatistyle.css" />
<link rel="stylesheet" href="/res/script/js-image-slider.css" />
<link rel="stylesheet" href="/res/script/flexslider.css" />
<script type="text/javascript" src="/res/script/js-image-slider.js"></script>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.2/jquery-ui.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="/res/script/jquery.flexslider-min.js"></script>
<script src="/res/script/slider.js"></script>
<script src="/res/script/mabharati.js"></script>
<script>
	$(function() {

	});
</script>
</head>
<body >
	<div class="container">
		<form:form class="form-signin mg-btm" name='f' action="/login"
			method='POST'>
			<a href="/home"> <img alt="image" src="res/image/cancel.png">
			</a>
			<h3 class="heading-desc">Welcome</h3>
			<div class="main">
				<input type="text" class="form-control" name='username'
					placeholder="Email" autofocus> <input type="password"
					class="form-control" name='password' placeholder="Password">

			</div>
			<div class="login-footer">
				<div class="row">
					<div class="col-xs-6 col-md-6">
						<div class="left-section">
							Forgot your password? <a href="">Just message here</a>
						</div>
					</div>
					<div class="col-xs-6 col-md-6 pull-right">
						<button type="submit" name="submit"
							class="btn btn-large btn-danger pull-right">Login</button>
					</div>
				</div>

			</div>
		</form:form>
	</div>
</body>
</html>