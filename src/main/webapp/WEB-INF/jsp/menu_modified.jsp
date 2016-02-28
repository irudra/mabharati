<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%><%@taglib
	uri="http://www.springframework.org/tags" prefix="spring"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<h3>
    <ul class="sidemenu" >
		<c:forEach items="${pagedetails.sidePaneList}" var="paneitem">
                    <li><div class = "menu-item sidepane" id="/${pagedetails.path}/${paneitem.name}">${paneitem.value}</div></li>
		</c:forEach>
	</ul>
</h3>

<script>
   $(function() {
   $("#sidemenu").menu();
    $(".sidepane").click(function(){
    $("#MenuContent").load($(this).attr("id"));
    });
  });
</script>
