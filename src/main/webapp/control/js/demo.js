var name1 = document.getElementById("name");
var xibie=document.getElementById("xibie");
var jianjie=document.getElementById("jianjie");
var zhichen=document.getElementById("zhichen");
$(function(){   $('#sub').click(function(){    	
		alert($("#name").val());
		alert($("#name"));
    	
     	$.ajax({
     		type:"POST",
     		url:"/Project/test/test.do",
     		dataType:"JSON",
     		data: {
     			name: (name.value!=name.defaultValue)?name.value :null,
     			xiebie:(xiebie.value!=xiebie.defaultValue)?xiebie.value :null,
     			zhichen:(zhichen.value!=zhichen.defaultValue)?zhichen.value :null,
     			jianjie:(jianjie.value!=jianjie.defaultValue)?jianjie.value :null
     		},
     		success:function(res){
                 console.log("success");
     		},
     		error:function(res){
                  console.log("error");
     		}
     	});
     });
});