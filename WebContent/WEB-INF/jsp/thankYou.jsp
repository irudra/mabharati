<h1>I am thank you</h1>

<div id ="div1">I am a div</div>
<div id ="div2">I am div 2</div>

<script>
   $(function() {
    $( "#div1").click(function(){$('#div2').load('/aboutUS');});
  });
  </script>