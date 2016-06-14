$(function(){

	$('.modify').on('click', function() {
		// get selectors
		var title = $(this).parent().parent().children().find('input[name="title"]');
		var content = $(this).parent().parent().children().find('textarea[name="content"]');
		var author = $(this).parent().parent().children().find('input[name="author"]');
		var keyword=$(this).parent().parent().children().find('input[name="keyword"]');
		var summary = $(this).parent().parent().children().find('textarea[name="summary"]');
		// initialize a JSON object
		var readyData = {
				title: title.val()==title.prop('defaultValue') ? null : title.val(),
				content: content.val()==content.prop('defaultValue') ? null : content.val(),
				author: author.val()==author.prop('defaultValue') ? null : author.val(),
				keyword:keyword.val()==keyword.prop('defaultValue') ? null : keyword.val(),		
				summary:summary.val()==summary.prop('defaultValue') ? null : summary.val()
		}
		$.post('test/test.do', readyData, function(res) {
			console.log(res);
		});
	});
});
