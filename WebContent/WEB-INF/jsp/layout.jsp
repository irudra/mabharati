<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link rel="icon" 
      type="image/png" 
      href="/res/image/icon.png">
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.0/themes/cupertino/jquery-ui.css" />
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
  <style>
      .safroncolor{color: #FFFFFF;
                   border: 1px solid #F4C430;
                   background-image: url(http://i1316.photobucket.com/albums/t611/ma_bharati/buttonbackground1_zps29cfc635.jpg);
      }
      
      .tricolor{background: #6c9730;
  background: url('linear-gradient-stops.png') 0 0 repeat-y;
  background: linear-gradient(to bottom, #F4C430, #FFFFFF, #138808);}
  </style>
</head>
<body class="tricolor">
<table cellpadding="2" cellspacing="2" Style="height:100%; width: 100%;">
    <tr  Style="height:10%">
        <td colspan="2"><tiles:insertAttribute name="header" />
        </td>
    </tr>
    
    <tr  Style="height:70%">
        <td Style="width:20%" valign="top"><tiles:insertAttribute name="menu" /></td>
        <td Style="width:80%"><tiles:insertAttribute name="body" /></td>
    </tr>
    <tr Style="height:10%">
        <td height="30" colspan="2"><tiles:insertAttribute name="footer" />
        </td>
    </tr>
</table>
</body>
</html>