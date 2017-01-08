<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%><%@taglib
	uri="http://www.springframework.org/tags" prefix="spring"%><%@taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div>
	<div id="contents">
		<div class="clearfix">
			<div class="sidebar">
				<div>
				<h2>Recent News</h2>
				<p>This web site template has been designed by Rudra Technology  for Ma bharati.com, for free.
				This is still under development.</p>
				<p>We will replace this data with the actual data once we will get the data.</p>
				<p>If you want to suggest something to us please drop a mail .</p>
			</div>
			<div>
				<h2>Student Testimonials</h2>
				<p>
					&ldquo;Demo data for Student. We're very
					happy.&rdquo; <span>- Kishor</span>
				</p>
			</div>
			</div>
			<div class="main">
				<h1>News</h1>
				<ul class="news">
					<c:forEach items="${events.events}" var="event">
						<li>
							<div class="box">
								<img src="${event.imageUrl}" alt="Img" height="245" width="213">
							</div>
							<p class="info">
								${event.eventDate} by <span class="author">${event.eventUser}</span>
							</p>
							<h2>${event.header}</h2>

							<p>Event date : ${event.eventDate}</p>

							<p>${event.description}</p>
						</li>
					</c:forEach>
				</ul>
			</div>
		</div>
	</div>
</div>


