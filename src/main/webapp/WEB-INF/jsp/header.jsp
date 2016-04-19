<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%><%@taglib
	uri="http://www.springframework.org/tags" prefix="spring"%><%@taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div
	style="background-image: url(/res/image/header.jpg); background-repeat: no-repeat;">

	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">WebSiteName</a>
			</div>
			<ul class="nav navbar-nav" id="menuheader">
				<c:forEach items="${pagedetails.headerList}" var="button">
					<li><a href="/${button.url}" >${button.displayValue}</a></li>
				</c:forEach>
			</ul>
		</div>
	</nav>
</div>
