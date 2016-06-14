$(function(){

	$('.modify').on('click', function() {
		// get selectors
		var name = $(this).parent().parent().children().find('input[name="name"]');
		var xibie = $(this).parent().parent().children().find('input[name="xibie"]');
		var zhiwu = $(this).parent().parent().children().find('input[name="zhiwu"]');
		var jianjie = $(this).parent().parent().children().find('textarea[name="jianjie"]');
		// initialize a JSON object
		var readyData = {
				name: name.val()==name.prop('defaultValue') ? null : name.val(),
				xibie: xibie.val()==xibie.prop('defaultValue') ? null : xibie.val(),
				zhiwu: zhiwu.val()==zhiwu.prop('defaultValue') ? null : zhiwu.val(),
				jianjie: jianjie.val()==jianjie.prop('defaultValue') ? null : jianjie.val()
		}
		$.post('test/test.do', readyData, function(res) {
			console.log(res);
		});
	});
});
