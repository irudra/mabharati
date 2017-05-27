<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
<meta charset="UTF-8">
  <meta name="description" content="Ma Bharati Social service Masi, we are working for underprivileged children, old age, farmers, small traders and  actively involved in other social reform in Uttarakhand region.">
  <meta name="keywords" content="NGO, uttarakhand, children, education, farmer, old age, hills, pahad, self help, trader, society">
  <meta name="author" content="Hemant Gaur">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
<sec:csrfMetaTags/>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link rel="icon" 
      type="image/png" 
      href="/res/image/icon.png">
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.0/themes/cupertino/jquery-ui.css" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
 <link rel="stylesheet" href="/res/script/mabharatistyle.css" />
 <link rel="stylesheet" href="/res/script/style.css" />
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="/res/script/mabharati.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.2/jquery-ui.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

  
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