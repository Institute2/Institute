$(function(){

	$('.modify').on('click', function() {
		// get selectors
		var name = $(this).parent().parent().children().find('input[name="name"]');
		var zhiwu = $(this).parent().parent().children().find('input[name="zhiwu"]');
		var whereabout = $(this).parent().parent().children().find('input[name="whereabout"]');
		var jianjie = $(this).parent().parent().children().find('textarea[name="jianjie"]');
		// initialize a JSON object
		var readyData = {
				name: name.val()==name.prop('defaultValue') ? null : name.val(),
				zhiwu: zhiwu.val()==zhiwu.prop('defaultValue') ? null : zhiwu.val(),
				whereabout: whereabout.val()==whereabout.prop('defaultValue') ? null : whereabout.val(),
				jianjie: jianjie.val()==jianjie.prop('defaultValue') ? null : jianjie.val()
		}
		$.post('test/test.do', readyData, function(res) {
			console.log(res);
		});
	});
});
