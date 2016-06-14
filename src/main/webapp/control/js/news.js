$(function(){

	$('.modify').on('click', function() {
		// get selectors
		var title = $(this).parent().parent().children().find('input[name="title"]');
		var content = $(this).parent().parent().children().find('textarea[name="content"]');
		var releaser = $(this).parent().parent().children().find('select');
		var summary = $(this).parent().parent().children().find('textarea[name="summary"]');
		// initialize a JSON object
		var readyData = {
				title: title.val()==title.prop('defaultValue') ? null : title.val(),
				content: content.val()==content.prop('defaultValue') ? null : content.val(),
				releaser: releaser.val(),
				summary:summary.val()==summary.prop('defaultValue') ? null : summary.val()
		}
		$.post('test/test.do', readyData, function(res) {
			console.log(res);
		});
	});
});
