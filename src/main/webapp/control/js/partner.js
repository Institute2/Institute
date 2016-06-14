$(function(){

	$('.modify').on('click', function() {
		// get selectors
		var name = $(this).parent().parent().children().find('input[name="name"]');
		var url = $(this).parent().parent().children().find('input[name="url"]');
		// initialize a JSON object
		var readyData = {
				name: name.val()==name.prop('defaultValue') ? null : name.val(),
				url: url.val()==url.prop('defaultValue') ? null : url.val(),
		}
		$.post('test/test.do', readyData, function(res) {
			console.log(res);
		});
	});
});
