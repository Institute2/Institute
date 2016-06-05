function getTime(){
	var date= new Date();
	return date.toString();
}

$(function(){
     $('#sub').click(function(){
     	console.log($("#name").val());
        var d=getTime();
     	$.ajax({
     		type:"POST",
     		url:"/Project/test/test.do",
     		dataType:"JSON",
     		//data:"username="+$("#name").val()+"&password="+$("#pa").val()+"&date="+d,
     		data: {
     			username: $("#name").val(),
     			password: $("#pa").val(),
     			date: d
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