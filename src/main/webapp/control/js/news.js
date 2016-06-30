$(function(){

	$('.modify').on('click', function() {
		// get selectors
		var title = $(this).parent().parent().children().find('input[name="title"]');
		var content = $(this).parent().parent().children().find('textarea[name="content"]');
		var releaser = $(this).parent().parent().children().find('select');
		var summary = $(this).parent().parent().children().find('textarea[name="summary"]');
		var id=$(this).parent().parent().children().find('textarea[name="id"]');
		// initialize a JSON object
		var readyData = {
				id:id.val(),
				title: title.val()==title.prop('defaultValue') ? null : title.val(),
				content: content.val()==content.prop('defaultValue') ? null : content.val(),
				releaser: releaser.val(),
				summary:summary.val()==summary.prop('defaultValue') ? null : summary.val()
		}
		if(readyData.title==null &&  readyData.content ==null && readyData.releaser==null && readyData.summary==null){
			alert("没有修改，不用保存");
			event.preventDefault();
			return false;
		}
		$.post('test/test.do', readyData, function(res) {
			console.log(res);
		});
	});
});
