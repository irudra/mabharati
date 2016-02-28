<%-- 
    Document   : homeLayout
    Created on : May 7, 2013, 5:19:04 PM
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
 <link rel="stylesheet" href="/res/script/js-image-slider.css" />
 <script type="text/javascript" src="/res/script/js-image-slider.js"></script>
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
</head>
<body class="tricolor" >
<table cellpadding="2" cellspacing="2" Style=" margin-left: 50px;height:100%; width: 93%;">
    <tr  Style="height:10%">
        <td colspan="2"><tiles:insertAttribute name="header" />
        </td>
    </tr>
    
    <tr  Style="height:50%">
        <td Style="width:30%" valign="top"><tiles:insertAttribute name="menu" /></td>
        <td Style="width:70%; background-color: #001433;"><tiles:insertAttribute name="body" /></td>
    </tr>
    <tr cellpadding="4" Style="height:10%; width: 100%">
        <td colspan="2"><tiles:insertAttribute name="service" />
        </td>
    </tr>
    <tr Style="height:20%">
        <td height="30" Style="width:50%" colspan="1"><tiles:insertAttribute name="shortDescription" />
        </td>
        <td height="30" Style="width:50%" colspan="1"><tiles:insertAttribute name="shortEvents" />
        </td>
    </tr>
    <tr Style="height:10%">
        <td height="30" colspan="2"><tiles:insertAttribute name="footer" />
        </td>
    </tr>
</table>
</body>
</html>
