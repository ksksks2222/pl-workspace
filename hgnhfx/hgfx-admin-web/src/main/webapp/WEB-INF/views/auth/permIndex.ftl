<#assign contextPath=springMacroRequestContext.getContextPath() />

<style type="text/css">
	ul.rightTools {float:right; display:block;}
	ul.rightTools li{float:left; display:block; margin-left:5px}
</style>

<div class="pageContent" style="padding:5px">
	<div class="tabs">
		<div class="tabsHeader">
			<div class="tabsHeaderContent">
				<ul>
					<li><a href="javascript:;"><span>权限资源管理</span></a></li>
				</ul>
			</div>
		</div>
		<div class="tabsContent">
			<div>
			
				<div layoutH="50" style="float:left; display:block; overflow:auto; width:240px; border:solid 1px #CCC; line-height:21px; background:#fff">
				    ${authPermTreeHtml!}
				</div>
				
				<div id="jbsxBoxAuthPerm" class="unitBox" style="margin-left:246px;">
				<#include "/auth/permList.ftl">
				</div>
	
			</div>
			
		</div>
		<div class="tabsFooter">
			<div class="tabsFooterContent"></div>
		</div>
	</div>
	
</div>

