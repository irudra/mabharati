<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%><%@taglib
	uri="http://www.springframework.org/tags" prefix="spring"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<h3>
<nav >
    <ul class="menu tricolor" >
		<c:forEach items="${pagedetails.sidePaneList}" var="paneitem">
                    <li><a href="/${pagedetails.path}/${paneitem.name}" ><FONT COLOR="#246BB2">${paneitem.value}</FONT></a><br>
		</c:forEach>
	</ul>
</nav>
</h3>