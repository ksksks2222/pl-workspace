<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/common.jsp"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0,user-scalable=no" name="viewport" />
		<title>选择游玩人</title>
		<link href="${ctx}/resources/css/common.css" rel="stylesheet" />
		<link href="${ctx}/resources/css/global.css" rel="stylesheet" />
		<link href="${ctx}/resources/css/person_list.css" rel="stylesheet" />
		<script src="${ctx}/resources/js/zepto.min.js" language="javascript"></script>
		<script src="${ctx}/resources/js/frozen.js" language="javascript"></script>
		<script src="${ctx}/resources/js/person_list.js" language="javascript"></script>
	</head>
	
	<body>
		<div class="body">
			<div class="content"  id="main" >
			    <ul class="ui-list ui-list-text ui-border-tb  m_addPerson">
			        <li class="ui-border-t" id="addPerson">
			            <div class="ui-list-info">
			               <h4><i class="iconfont">&#xf014d;</i>新增游玩人</h4>
			            </div>
			            <div class="ui-list-action add_btn"></div>
			        </li>
			    </ul>
			    <ul class="ui-list ui-list-text ui-list-link ui-border-b m-subTitle m_person_list" id="personList">
			        <li class="ui-border-t box" rel="0" choose="true">
			            <label class="choose on">
			                <i class="iconfont gou">&#xe68a;</i>
			                <i class="iconfont">&#xe643;</i>
			            </label>
			            <h4 class="ui-nowrap person">
			                <span class="di">asd</span>
			                <label class="di"><i>手机号</i>：<i class="num mobile">15867107162</i></label>
			                <label class="di"><i class="type" rel="1">身份证</i>：<i class="num cardid">330327199011193033</i></label>
			            </h4>
			            <a href="order_addperson.html?id=1" class="editor pa">编辑</a>
			        </li>
			    </ul>
			</div>
		    <div class="fixedBtn box">
		        <div class="leftBtn">已选择<i>0</i>成人<i>0</i>儿童</div>
		        <div class="next-btn">确定</div>
		    </div>
		</div>
	</body>
</html>