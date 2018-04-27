<#assign contextPath=springMacroRequestContext.getContextPath() />

<div class="pageHeader">
	<form id="pagerForm" rel="pagerForm" onsubmit="return navTabSearch(this);"
		action="${contextPath}/auth/role/list" method="post">
	
		<input type="hidden" name="pageNum" value="${pagination.pageNo?c}" />
		<input type="hidden" name="numPerPage" value="${pagination.pageSize?c}" />
		<div class="searchBar">
			<ul class="searchContent">
				<li>
					<label>角色名称：</label>
					<input type="text" name="roleName" value="${roleName!?html}" />
				</li>
			</ul>
			<div class="subBar">
				<ul><li><div class="buttonActive">
					<div class="buttonContent">
						<button type="submit">查询</button>
					</div>
				</div></li></ul>
			</div>
		</div>
	</form>
</div>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="${contextPath}/auth/role/toCreate"
				   lookupgroup="orgLookup" mask="true" width="650" height="500"><span>添加</span>
			</a>
			</li>
			<li class="line">line</li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="140">
		<thead>
			<tr>
				<th width="50">角色名</th>
				<th width="50">显示名</th>
				<th width="10">角色人数</th>
				<th width="20">添加时间</th>
				<th width="40">操作</th>
			</tr>
		</thead>
		<tbody>
			<#list pagination.list as role>
			<tr>
				<td>${role.roleName!?html}</td>
				<td>${role.displayName!?html}</td>
				<td><#if role.authUserSet??>${role.authUserSet?size}</#if></td>
				<td>${role.createTime!?html}</td>
				<td><a title="删除" target="ajaxTodo"
					href="${contextPath}/auth/role/deleteRole?id=${role.id}" class="btnDel">删除</a>
					<a title="编辑" lookupgroup="orgLookup" width="650" height="500" mask="true" href="${contextPath}/auth/role/toEdit?id=${role.id}"
					target="dialog" class="btnEdit">编辑</a></td>
			</tr>
			</#list>
		</tbody>
	</table>
	
	<#include "/public/pagination/pagination.html">
</div>
