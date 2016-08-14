<%-- 
    Document   : homeBody
    Created on : May 7, 2013, 5:35:40 PM
    Author     : hemant
--%>
<%@taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
<c:forEach items="${pagedetails.page.carousels}" var="carousel">
      <div class="item ${carousel.active}">
        <img src="${carousel.imageLink}" alt="${carousel.imageAlt}" class="img-responsive">
        <div class="carousel-caption">
          <h3 style="color: black;">${carousel.heading}</h3>
          <p style="color: black;">${carousel.message}</p>
        </div>      
      </div>
</c:forEach>
    <!-- Wrapper for slides -->

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
