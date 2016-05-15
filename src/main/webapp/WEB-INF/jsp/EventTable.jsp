<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%><%@taglib
	uri="http://www.springframework.org/tags" prefix="spring"%><%@taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div>
	<c:forEach items="${events.events}" var="event">

		<div class="col-sm-6 col-md-4">
			<div class="thumbnail">
				<img src="${event.imageUrl}" alt="story 4">
				<div class="caption">
					<h3>${event.header}</h3>
					<p>${event.description}</p>
					<p>
						<a href="#" class="btn btn-default" role="button">find More</a>
					</p>
				</div>
			</div>
		</div>
	</c:forEach>
</div>