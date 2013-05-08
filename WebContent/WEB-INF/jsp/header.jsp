<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%><%@taglib
    uri="http://www.springframework.org/tags" prefix="spring"%><%@taglib
        uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <div>

            <table style="width:100%">
                <tr>

                    <td style="width:90%"><a style="float:left" href="home"><img alt="ma bharati" src="http://i1316.photobucket.com/albums/t611/ma_bharati/mabharati_zps43976dd9.png"></a>
                    </td>
                    <td  style="width:10%;">
                        <c:choose>
                            <c:when test="${login=='true'}">
                                <a href="<c:url value="j_spring_security_logout" />" > Logout</a>
                            </c:when>
                            <c:otherwise>
                                <a href="/welcome" style="width:10%; color: #000000">login</a></td>
                            </c:otherwise>
                        </c:choose>
                </tr></table>
            <div style="height:70%">
                <c:if test="${login=='true'}">
                    <h3>Hello ${username}</h3>
                </c:if>
                <h3 >
                    <nav>
                        <c:forEach items="${pagedetails.headerList}" var="button">
                            <a href="/${button.url}" style="margin-left:50px"><button class="safroncolor" >${button.displayValue}</button></a>
                            </c:forEach>
                    </nav></h3>
            </div>
        </div>
