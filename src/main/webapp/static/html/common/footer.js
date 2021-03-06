﻿(function(){
	"use strict"
	var footerScript = document.getElementsByTagName('script'),
		path;
	for(var i = footerScript.length; i > 0; i--) {
	    path = footerScript[i-1].getAttribute('data-js');
		if(path != null){
			break;	
		}
	}
	var footerTpl = function(){
		/*
		<div class="common_footer">
            
            <div class="common_footer_list">
                <img src="/institute/static/img/common/logo.png" class="icon_logo">
                <ul class="footer_list">
                    <li><a href="/institute/static/html/leader.html"><img src="/institute/static/img/common/leader.png">学术带头人</a></li>
                    <li><a href="/institute/static/html/listMembers.html"><img src="/institute/static/img/common/member.png">团队成员</a></li>
                    <li><a href="/institute/static/html/news.html"><img src="/institute/static/img/common/new.png">新闻动态</a></li>
                </ul>
                <ul class="footer_list">
                    <li><a href="/institute/static/html/listGrads.html"><img src="/institute/static/img/common/gradu.png">已毕业成员</a></li>
                    <li><a href="/institute/static/html/project.html"><img src="/institute/static/img/common/disco.png">研究成果</a></li>
                    <li><a href="/institute/static/html/essay_list.html"><img src="/institute/static/img/common/paper.png">论文专著</a></li>
                </ul>
            </div>
            <div class="common_footer_ps">
                <p class="footer_ps">
                    <span class="footer_icon">
                        版权所有 |
                    </span>
                    <span class="footer_icon">
                        重庆邮电大学 |
                    </span>
                    <span class="footer_icon">
                        重庆市南岸区崇文路2号 |
                    </span>
                    <span class="footer_icon">
                        400065 |
                    </span>
                    <span class="footer_icon">
                        渝ICP: 10005091-2
                    </span>     
                </p>
            </div>
        </div>
		*/
	}
	var footer = footerTpl.toString().replace(/^[^\/]+\/\*!?/, '').replace(/\*\/[^\/]+$/, '') +
				'<script src="/institute/static/js/lib/r.js" data-main="/institute/static/js/page/' + path + '"></script>'+
			  '</body></html>';
	document.write(footer);

    /*导航功能*/
    var lis=$(".header_nav_list>a").find("li"),
        li_last,
        len,
        i,
        index,
        about;
    about=$(".about");    
    len=lis.length;
    li_last=lis.eq(len-1);
    
    var title=["首页","研究成果","新闻动态","论文专著","相关单位"];
    for(var t in title){
        if(document.title==title[t]){
             lis.eq(t).addClass("is");
        }
    }

    /*获取当前页面i*/

    lis.each(function(i){
            if($(this).hasClass("is")){
                index=i;
            }
        });
    
    
    /*nav悬浮*/
    lis.hover(function(){
        $(this).addClass("select").parent().siblings()
               .children("li").removeClass("select");
    },function(){
        $(this).removeClass("select");
    });

    /*nav点击*/
    lis.each(function(i){
        var $this=$(this);
        $this.click(function(){
            if(i<4){
               about.hide();
               $this.addClass("is")
                  .parent().siblings().children("li")
                  .removeClass("is");
         
              index=i;
              console.log(index);
           }
         });
             
        });

    /*相关单位*/
    var tpl=function(){
        /*
            {@each data as item}
                <li>
                    <a>
                        <img src=/institute/upload/${item.picture.link}>
                        <a href=${item.url}>
                          <span class="about_name">${item.name}</span>
                        </a>
                    </a>
                </li>
            {@/each}
        */
    };

    var tplToString=tpl.toString().replace(/^[^\/]+\/\*!?/, '').replace(/\*\/[^\/]+$/, '');
    
    /*获取相关页面数据*/
    $.post(
            _api.listdepartment,
            {},
            function(res){
                var tmp=juicer(tplToString,res);
                $(".about > ul").html(tmp);
            }
        );

    // 点击相关页面时
    li_last.click(function(){
        
        if(about.is(":visible")){
            li_last.removeClass("is");
            about.hide();
            lis.eq(index).addClass("is");
        }else{

            li_last.addClass("is")
                   .parent().siblings().children("li")
                   .removeClass("is");
            about.show();
        }
    });

    /*
        搜素框
    */
    $(".icon_search").on('click',function(){

        var searchValue=$(".header_search").val();
        
    });


})();
