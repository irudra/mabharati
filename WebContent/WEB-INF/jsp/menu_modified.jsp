<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%><%@taglib
	uri="http://www.springframework.org/tags" prefix="spring"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<h3>
<nav >
    <ul class="menu tricolor safronborder" >
		<c:forEach items="${pagedetails.sidePaneList}" var="paneitem">
			<li><a href="/${pagedetails.path}/${paneitem.name}">${paneitem.value}</a><br>
		</c:forEach>
	</ul>
</nav>
</h3>