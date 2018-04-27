<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/common.jsp"%>
<!doctype html>
<html>
<head>
<title>票量旅游注册有礼</title>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<meta name="format-detection" content="telephone=no">
	<meta http-equiv="Cache-Control" content="max-age=1" />
<link type="text/css" rel="stylesheet"  href="g.css">
 <style type="text/css">
 
 @import url('showLoading.css');
/*common*/
html,body,div,span,object,iframe,h1,h2,h3,h4,h5,h6,p,blockquote,pre,a,abbr,acronym,address,big,cite,code,del,dfn,em,img,ins,kbd,q,samp,small,strike,strong,sub,sup,var,b,u,i,dl,dt,dd,ol,ul,li,fieldset,form,label,legend,caption,article,aside,canvas,details,embed,figure,figcaption,footer,header,hgroup,menu,nav,output,ruby,section,summary,time,mark,audio,video,hr,dialog{
	margin:0;
	padding:0;
	border:0;	
	/*font-family: Tahoma, Geneva, sans-serif, arial;*/
	font-style:normal;
}
/*禁止页面a标签中href长按弹出复制对话框*/
html,body{
	-webkit-touch-callout: none;
	-webkit-text-size-adjust:none;
	-webkit-tap-highlight-color: rgba(0, 0, 0, 0);
	/*-webkit-user-select:none;*/
}
body{
	margin:0;
	padding:0;
	background-color:#fff;
	color:#000;
	font-family: "微软雅黑","Microsoft YaHei","Helvitica","Verdana","Tohoma","Arial","san-serif";
}

article,aside,details,hgroup,nav,span{
	display:inline-block;
}
footer,header,section,dialog,menu,a,label,strong,var,del,time,figcaption,figure,pre,img,small,mark,cite,code,fieldset,button{
	display:block;
}
::-webkit-scrollbar{
	width:0;height:0;
}
a,a:hover,a:visited{
	text-decoration:none;
}
ol,ul{
	list-style:none;
}
:focus{
	outline:none;
	border:0;
	-webkit-appearance:none;
	-moz-appearance:none;
	appearance:none;
}
img{
	max-width: 100%;
	width: 100%;
	vertical-align: middle;
	display:inline-block;
}

 

 #con_info{
	position:absolute;
	top:0;
	left:0;
	/*left:50%;*/
	/*margin-left:-25%;*/
	width:100%;
	min-height:100%;
	overflow:hidden;
	max-width: 640px;
	min-width: 320px;	
}

 @media screen and (min-width: 600px) {
	#con_info{left:50%;margin-left:-320px;}
	.alertNavList{max-width: 640px;margin:0 auto;left:auto;}
}
 
#link{ position:absolute; right:8%;top:32%; width:37%; height:38%} 
.login{ position:absolute; right:10%;top:72%; color:#FF7E00;font-size:10px}


</style>
</head>
 <body>
<div id="con_info">
<p><img src="images/s_01.png"></p>
<p style="position:relative"><img src="images/s_02.png"><a href="${ctx }/user/reg" id="link"></a> <a href="${ctx}/user/login" class="login">已有账号，直接登录>></a></p>
<p><img src="images/s_03.png"></p>
<p><img src="images/s_04.png" ></p>
<p><img src="images/s_05.png"></p>
<p><img src="images/s_06.jpg"></p>
</div>
</body>
</html>
