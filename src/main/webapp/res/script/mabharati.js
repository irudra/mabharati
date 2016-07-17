$(function() {

	$("#datepicker").datepicker({
		dateFormat : 'yy-mm-dd'
	});

	$("#addevent")
			.click(
					function() {
						var name = $("#name").val();
						var short = $("#description").val();
						var date = $("#datepicker").val();

						var description = $("#description").val();

						var json = {
							"imageUrl" : "/res/image/Story4.jpg",
							"header" : name,
							"description" : description,
							"eventDate" : date,
							"eventUser" : "admin"
						};

						var data = JSON.stringify(json);

						$
								.ajax({
									type : "GET",
									url : "/addEvent",
									data : {
										"json" : data
									},
									success : function(resposeJsonObject) {
										$('#response')
												.html(
														"The event is added successfully")
												.fadeIn('slow');
									},
									error : function(resposeJsonObject) {
										$('#response')
												.html(
														"We encounterd some error while inserting event")
												.fadeIn('slow');
									}
								});

					});
});

var tableToExcel = (function () {
    var uri = 'data:application/vnd.ms-excel;base64,'
    , template = '<html xmlns:o="urn:schemas-microsoft-com:office:office" xmlns:x="urn:schemas-microsoft-com:office:excel" xmlns="http://www.w3.org/TR/REC-html40"><head><!--[if gte mso 9]><xml><x:ExcelWorkbook><x:ExcelWorksheets><x:ExcelWorksheet><x:Name>{worksheet}</x:Name><x:WorksheetOptions><x:DisplayGridlines/></x:WorksheetOptions></x:ExcelWorksheet></x:ExcelWorksheets></x:ExcelWorkbook></xml><![endif]--></head><body><table>{table}</table></body></html>'
    , base64 = function (s) { return window.btoa(unescape(encodeURIComponent(s))) }
    , format = function (s, c) { return s.replace(/{(\w+)}/g, function (m, p) { return c[p]; }) }
    return function (table, name, filename) {
        if (!table.nodeType) table = document.getElementById(table)
        var ctx = { worksheet: name || 'Worksheet', table: table.innerHTML }

        document.getElementById("dlink").href = uri + base64(format(template, ctx));
        document.getElementById("dlink").download = filename;
        document.getElementById("dlink").click();

    }
})()