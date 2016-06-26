<%-- 
    Document   : kogin
    Created on : May 7, 2013, 1:34:18 PM
    Author     : hemant
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
    <div class="container">
		<form:form class="form-signin mg-btm" name='f' action="/login" method='POST'>
    	<h3 class="heading-desc">Welcome</h3>
		<div class="main">	
		<input type="text" class="form-control" name='username' placeholder="Email" autofocus>
        <input type="password" class="form-control" name='password' placeholder="Password">
        Are you a business? <a href=""> Get started here</a>
		<span class="clearfix"></span>	
        </div>
		<div class="login-footer">
		<div class="row">
                        <div class="col-xs-6 col-md-6">
                            <div class="left-section">
								<a href="">Forgot your password?</a>
								<a href="">Sign up now</a>
							</div>
                        </div>
                        <div class="col-xs-6 col-md-6 pull-right">
                            <button type="submit" name="submit" class="btn btn-large btn-danger pull-right">Login</button>
                        </div>
                    </div>
		
		</div>
      </form:form>
</div>
	
