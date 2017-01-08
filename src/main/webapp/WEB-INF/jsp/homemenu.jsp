<%-- 
    Document   : homemenu
    Created on : May 8, 2013, 4:20:50 PM
    Author     : hemant
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="tour" class="bg-1">
	<div class="container">
		<h3 class="text-center">${pagedetails.page.homeMenu.heading}</h3>
		<p class="text-center">${pagedetails.page.homeMenu.text}</p>
		<div class="row text-center">
			<c:forEach items="${pagedetails.page.homeMenu.thumbnails}"
				var="thumbnail">
				<div class="col-sm-4">
					<div class="thumbnail">
						<img src="${thumbnail.imageSource}" alt="Ma bharati pic"
							width="400" height="300">
						<p>
							<strong>${thumbnail.heading}</strong>
						</p>
						<p>${thumbnail.caption}
						</p>
						<a href="${thumbnail.link}">${thumbnail.linkCaption}</a>
					</div>
				</div>
			</c:forEach>

		</div>

	</div>
</div>