/**
 * 
 * @author gaoxiang
 */
require.config({
	baseUrl: MIS.STATIC_ROOT
});
require(['lib/jquery', 'util/request','util/funcTpl','lib/juicer'], function($, request, funcTpl) {


    var i=1;
	var leader={

		init:function(){
             leader.getData();
             
             leader.show_info();
             leader.tag();
		},

		headerTpl:function(){
			/*
		    {@each data.person as it}
		    	<li>
		    		<div class="headpic">
		    			<img src=/institute/upload/${it.picture.link}>
		    			<span class="black"></span>
		    			<span class="name">姓名：${it.name}<br/></span>
		    			<span class="info">
		    				方向：${it.zhiwu}<br/>
		    				专业：${it.xibie}<br/>
		    			</span>
		    			<span class="profile">
		    				个人简介：${it.jianjie}
		    			</span>
		    		</div>
		    	</li>
		    {@/each}
		     */
		},

		tag:function(){
			var i=parseInt($('#tag_nub').val());
			$('#btn2').on('click',function(event){
				if(i<js.data.pageSum){
					i=i+1;
					leader.getData();
					$('#tag_nub').val(i);
					leader.show_info();
					$('#btn1').css('color','white');
					if(i==js.data.pageSum){
						$('#btn2').css('color','black');
						return false;
					};
					return false;
				}
			});
			$('#btn1').on('click',function(event){
				if(i>1){
					i=i-1;
					leader.getData();
					$('#tag_nub').val(i);
					leader.show_info();
					$('#btn2').css('color','white');
					if(i==1){
						$('#btn1').css('color','black');
						return false;
					};
					return false;
				}
			});
		},

		show_info:function (){
			
			$('.headpic>span').hide();

			$('#content').on('mouseover',function(e){
				$(e.target).children('span').stop(false,true).show('fast');
				$('.headpic').mouseleave(function(event) {
					if($('.detial_info').css('display')=='none'){
						$(this).children('span').hide('fast');
					}
				});
			});

			$('#content').on('click',function(e){
				if($(e.target).parent().children('.name').html()){
					var info='<img id="close_info" src="/institute/static/img/page/close.png">'
								+$(e.target).parent().children('.name').html()
								+$(e.target).parent().children('.info').html()
								+$(e.target).parent().children('.profile').html();
					$('.detial_info').html(info);
					$('.detial_info').show('fast');
					$('.headpic>span').css({'opacity':'0.5','filter':'alpha(opacity=50)'});
					$('#close_info').click(function(event) {
						$('.detial_info').hide('fast');
						$('.headpic>span').hide();
						$('.headpic>span:gt(0)').css({'opacity':'0.5','filter':'alpha(opacity=50)'});
						event.stopPropagation();
					});
				};
			});
		},

		getData:function(){
			request.post(
				_api.listMembers,
				{
					"pageNow":i,
					"pageSize":6
                },
				function(res){
					js=res;
            		var tpl=juicer(funcTpl(leader.headerTpl),res);
            		$('#content').html('<div class="detial_info"></div>'+tpl);
            		$('.headpic>span').hide();
					}
				);
		},
	};
	leader.init();
});