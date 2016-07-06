<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%><%@taglib
	uri="http://www.springframework.org/tags" prefix="spring"%><%@taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div
	style="background-image: url(/res/image/header.jpg); background-repeat: no-repeat;">
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="/home">Ma Bharati</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <c:forEach items="${pagedetails.headerList}" var="button">
					<li><a href="/${button.url}" >${button.displayValue}</a></li>
		</c:forEach>
        <li>
        <c:choose>
   			<c:when test="${pageContext['request'].userPrincipal == null}">
   				<a href="/login">login${pageContext.request.userPrincipal.name}</a>
    		</c:when>    
    		<c:otherwise>
       			<a href="/logout">${pageContext.request.userPrincipal.name} </a>
    		</c:otherwise>
		</c:choose></li>
      </ul>
    </div>
  </div>
</nav>
</div>
