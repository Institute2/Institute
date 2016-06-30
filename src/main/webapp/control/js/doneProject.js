$(function(){
	$('.modify').on('click', function(event) {
		// get selectors
		var title = $(this).parent().parent().children().find('input[name="title"]');
		var leader = $(this).parent().parent().children().find('input[name="leader"]');
		var content = $(this).parent().parent().children().find('input[name="content"]');
		var id=$(this).parent().parent().children().find('input[name="id"]');
		// initialize a JSON object
		var readyData = {
				id:id.val(),
				title: title.val()==title.prop('defaultValue') ? null : title.val(),
				leader: leader.val()==leader.prop('defaultValue') ? null : leader.val(),
				content:content.val()==content.prop('defaultValue') ? null : content.val()
		};
		if(readyData.title=="" || readyData.leader=="" ||readyData.startline=="" || readyData.deadline==""){
			alert("有值为空！");
			event.preventDefault();
			return false;
		}
		if(readyData.title==null && readyData.leader==null && readyData.content==null ){
			alert("没有修改，不用保存");
			event.preventDefault();
			return false;
		}
		$.post('modifyDoneProject.do', readyData, function(res) {
			alert(res.msg);  
			location.reload();
		});
	});
	
		$('.add').on('click', function(event) {
			// get selectors
			var title = $(this).parent().parent().children().find('input[name="title"]');
			var leader = $(this).parent().parent().children().find('input[name="leader"]');
			var deadline = $(this).parent().parent().children().find('input[name="deadline"]');
			var startline = $(this).parent().parent().children().find('input[name="startline"]');
			var content=$(this).parent().parent().children().find('input[name="content"]');
			// initialize a JSON object
			var readyData = {
					startline:startline.val(),
					deadline:deadline.val(),
					title: title.val(),
					content:content.val(),
					leader: leader.val()
			};
			if(readyData.title=="" || readyData.leader=="" ||readyData.startline=="" || readyData.deadline==""){
				alert("有值为空！");
				event.preventDefault();
				return false;
			}
			$.post(	'addDoneProject.do', readyData,  function(res) {
				alert(res.msg);  
				location.reload();
			});
		});
		$('.del').on('click', function(event) {
			var id=$(this).parent().parent().children().find('input[name="id"]');
			// initialize a JSON object
			var readyData = {
					id:id.val()
			};
			
			$.post(	'delDoneProject.do', readyData,  function(res) {
				alert(res.msg);  
				location.reload();
			});
		});
	});


