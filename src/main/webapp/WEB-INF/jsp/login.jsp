<%-- 
    Document   : kogin
    Created on : May 7, 2013, 1:34:18 PM
    Author     : hemant
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<h3>Login with Username and Password</h3>
 
	<c:if test="${not empty error}">
		<div class="errorblock">
			Your login attempt was not successful, try again.<br /> Caused :
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>
 
	<form name='f' action="<c:url value='j_spring_security_check' />"
		method='POST'>
 
		<table>
			<tr>
				<td>User:</td>
                                <td><input type='text' name='j_username' value=''>
				</td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='j_password' />
				</td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" class="safroncolor" type="submit"
					value="submit" />
				</td>
			</tr>
			<tr>
				<td colspan='2'><input name="reset" class="safroncolor" type="reset" />
				</td>
			</tr>
		</table>
 
	</form>
