<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 

<div id="contents">
<br><br>
		<div class="clearfix">
			<div class="sidebar">
				<div>
					<h2>Contact Info</h2>
					<ul class="contact">
						<li>
							<p>
								<span class="home"></span> <em>Ma Bharati Social Service Group </em> Post office masi, district Almora, Uttarakhand, India
							</p>
						</li>
						<li>
							<p class="phone">
								Phone: (+91) 5966257367
							</p>
						</li>
						
						<li>
							<p class="mail">
								Email: wemabharati@gmail.com
							</p>
						</li>
					</ul>
				</div>
			</div>
			<div class="main">
				<h1>Contact</h1>
				<p>
					Have any doubt, wants to know more about us or anything. please send us message.
				</p>
				<form:form method="post" id="contactForm" class="message" action="/contactUs">
					<label>First Name</label><input	type="text" class="form-control" placeholder="First Name" name="firstName">
					<label>Last Name</label><input		type="text" class="form-control" placeholder="Last Name" name="lastName">
					<label>Email Address</label><input type="text" placeholder="abc@xyz.com" name="email">
					<label>Message</label>	<textarea class="form-control" id="description" rows="3" name="message"></textarea>

					<input type="submit" id="mail" value="Send Message">
				</form:form>
			</div>
		</div>
	</div>
	
	<script>
	$(function() {
		$('#contactForm').submit(function(e) {
			var frm = $('#contactForm');
			e.preventDefault();
 
		    var data = {};
		    var Form = this;

		    //Gather Data also remove undefined keys(buttons)
		    $.each(this, function(i, v){
		            var input = $(v);
		            data[input.attr("name")] = input.val();
		        delete data["undefined"];
		    });
		    
		    var header = $("meta[name='_csrf_header']").attr("content");
		    var token = $("meta[name='_csrf']").attr("content");
		    alert(JSON.stringify(data));
        $.ajax({
            type: frm.attr('method'),
            url: frm.attr('action'),
            data : {"json":JSON.stringify(data)},
            beforeSend: function(xhr){
		        xhr.setRequestHeader(header, token);
		    },
            success : function(callback){
                $(this).html("Success!");
            },
            error : function(){
                $(this).html("Error!");
            }
        });
		});
	    
  });
	</script>
	