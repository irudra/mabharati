<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%><%@taglib
	uri="http://www.springframework.org/tags" prefix="spring"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	 <ul class="nav nav-tabs" >
		<c:forEach items="${pagedetails.sidePaneList}" var="paneitem">
		<li><a href="#" class="list-group-item sidepane" id="/${pagedetails.path}/${paneitem.name}">${paneitem.value}</a><li>
		</c:forEach>
	</ul>

<script>
   $(function() {
   $("#sidemenu").menu();
    $(".sidepane").click(function(){
    $("#MenuContent").load($(this).attr("id"));
    });
  });
</script>
