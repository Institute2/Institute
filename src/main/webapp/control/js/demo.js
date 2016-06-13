$(function(){

	$('.modify').on('click', function() {
		// get selectors
		var name = $(this).parent().parent().children().find('input[name="name"]');
		var xibie = $(this).parent().parent().children().find('input[name="xibie"]');
		var zhicheng = $(this).parent().parent().children().find('input[name="zhicheng"]');
		var jianjie = $(this).parent().parent().children().find('textarea[name="jianjie"]');
		// initialize a JSON object
		var readyData = {
				name: name.val()==name.prop('defaultValue') ? null : name.val(),
				xibie: xibie.val()==xibie.prop('defaultValue') ? null : xibie.val(),
				zhicheng: zhicheng.val()==zhicheng.prop('defaultValue') ? null : zhicheng.val(),
				jianjie: jianjie.val()==jianjie.prop('defaultValue') ? null : jianjie.val()
		}

		console.log(xibie.val())

		$.post('test/test.do', readyData, function(res) {
			console.log(res);
		});
	});





		/*alert(name+"lalal");
		alert(name.value);
		alert(name.defaultValue);
     	$.ajax({

     		type:"POST",
     		url:"/Project/test/test.do",
     		dataType:"JSON",
     		data: {
     			name: (name.value!=name.defaultValue)?name.value :null,
     			xiebie:(xiebie.value!=xiebie.defaultValue)?xiebie.value :null,
     			zhicheng:(zhichen.value!=zhichen.defaultValue)?zhichen.value :null,
     			jianjie:(jianjie.value!=jianjie.defaultValue)?jianjie.value :null
     		},
     		success:function(res){
                 console.log("success");
                 alert(res.msg);
     		},
     		error:function(res){
                  console.log("error");
     		}
     	});*/

});
