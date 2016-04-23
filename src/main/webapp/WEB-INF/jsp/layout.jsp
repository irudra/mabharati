<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link rel="icon" 
      type="image/png" 
      href="/res/image/icon.png">
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.0/themes/cupertino/jquery-ui.css" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
 <link rel="stylesheet" href="/res/script/mabharatistyle.css" />
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.2/jquery-ui.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script>
$(function() {

  });
  </script>
  
</head>
<body class="tricolor">
<table style="width:100%">
    <tr>
        <td colspan="2"><tiles:insertAttribute name="header" />
        </td>
    </tr>
    <tr>
    <tr >
        <td Style="width:20%"><tiles:insertAttribute name="menu" />
        </td>
    </tr>
        <tr>
        	<td Style="width:80%"><div id="MenuContent"><tiles:insertAttribute name="body" /></div>
        	</td>
        </tr>
    <tr>
        <td height="30" colspan="2"><tiles:insertAttribute name="footer" />

    </tr>
</table>
</body>
</html>