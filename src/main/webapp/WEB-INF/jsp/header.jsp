<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%><%@taglib
    uri="http://www.springframework.org/tags" prefix="spring"%><%@taglib
        uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <div style="background-image: url(/res/image/header.jpg) ; background-repeat: no-repeat;">

			<div style="height:70%">
                <c:if test="${login=='true'}">
                    <h3>Hello ${username}</h3>
                    <br>
                </c:if>
                <h3 >
                    <nav>
                    <ul class="ui-menu" id="menuheader" style="opacity: 0.6">
                      <c:forEach items="${pagedetails.headerList}" var="button">
                        <li>
                            <a href="/${button.url}" class =".ui-menu-item" >${button.displayValue}</a>
                            </li>
                            </c:forEach>
                            </ul>
                    </nav></h3>
            </div>

            <table style="width:100%">
                <tr>
                    <td >
                        <c:choose>
                            <c:when test="${login=='true'}">
                                <a class="login" href="<c:url value="j_spring_security_logout" />" > Logout</a>
                            </c:when>
                            <c:otherwise>
                                <a class="login" href="/welcome" style="float: right ; margin-right: 10px;width:10%; color: #000000">login</a></td>
                            </c:otherwise>
                        </c:choose>
                </tr></table>
            <br> <br>
        </div>
        
        <script>
  $(function() {
    $("#menuheader").menu();
  });
  </script>
