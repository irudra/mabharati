<%-- 
    Document   : start
    Created on : May 7, 2013, 5:27:16 PM
    Author     : hemant
--%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link rel="icon" 
      type="image/png" 
      href="/res/image/icon.png">
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.0/themes/cupertino/jquery-ui.css" />
 <link rel="stylesheet" href="/res/script/mabharatistyle.css" />
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.2/jquery-ui.min.js"></script>
<script>
   $(function() {
    $( "#datepicker" ).datepicker();
     $( ".menu" ).menu();
     $("#tabs").tabs();
      $( "button" ).button();
  });
  </script>
  <style>.tricolor{
  background: linear-gradient(to top,#138808, #FFFFFF 60%, #FFFFFF 60%, #FFFFFF 60%, #3BB9FF );}
</style>
</head>
