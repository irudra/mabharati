<%-- 
    Document   : homeBody
    Created on : May 7, 2013, 5:35:40 PM
    Author     : hemant
--%>
<%@taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<div class="container">
	<section class="tm-banner">
		<div class="flexslider flexslider-banner" id="div1">
		  <ul class="slides">
		  <c:forEach items="${pagedetails.page.carousels}" var="carousel">
		    <li>
			    <div class="tm-banner-inner">
					<h1 class="tm-banner-title"><span class="tm-yellow-text">${carousel.heading}</span></h1>
					<p class="tm-banner-subtitle">${carousel.message}</p>
					<a href="#tour" class="tm-banner-link">Learn More</a>	
				</div>
				<img src="${carousel.imageLink}" alt="${carousel.imageAlt}" />	
		    </li>
		    </c:forEach>
		  </ul>
		</div>	
	</section>
</div>
