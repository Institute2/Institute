$(function(){

	$('.modify').on('click', function() {
		// get selectors
		var title = $(this).parent().parent().children().find('input[name="title"]');
		var leader = $(this).parent().parent().children().find('input[name="leader"]');
		var content = $(this).parent().parent().children().find('input[name="content"]');
		// initialize a JSON object
		var readyData = {
				title: title.val()==title.prop('defaultValue') ? null : title.val(),
				leader: leader.val()==leader.prop('defaultValue') ? null : leader.val(),
				content:content.val()==content.prop('defaultValue') ? null : content.val()
		}
		$.post('test/test.do', readyData, function(res) {
			console.log(res);
		});
	});
});
