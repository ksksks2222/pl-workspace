/**
 * @ModifyAuthPermCommand.java Create on 2016-5-24下午3:43:12
 * Copyright (c) 2012 by www.hg365.com。
 */
package hg.demo.member.common.spi.command.authPerm;

import hg.demo.member.common.domain.model.AuthRole;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @类功能说明：
 * @类修改者：
 * @修改日期：2016-5-24下午3:43:12
 * @修改说明：
 * @公司名称：浙江汇购科技有限公司
 * @作者：<a href=gaoce@hgtech365.com>gaoce</a>
 * @创建时间：2016-5-24下午3:43:12
 * @version：
 */
public class DeleteAuthPermCommand  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * id
	 */
	private String id;
	/**
	 * 批量删除ID组
	 */
	private String[] ids;
	/**
	 * 名称
	 */
	private String displayName;
	/**
	 * url
	 */
	private String url;
	/**
	 * 资源类型
	 */
	private Short permType;
	/**
	 * 需要检查的角色
	 */
	private String permRole;
	/**
	 * 上级资源
	 */
	private String parentId;
	/**
	 * 资源对应的角色
	 */
	private Set<AuthRole> authRoleSet = new LinkedHashSet<AuthRole>();

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String[] getIds() {
		return ids;
	}

	public void setIds(String[] ids) {
		this.ids = ids;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Short getPermType() {
		return permType;
	}

	public void setPermType(Short permType) {
		this.permType = permType;
	}

	public String getPermRole() {
		return permRole;
	}

	public void setPermRole(String permRole) {
		this.permRole = permRole;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Set<AuthRole> getAuthRoleSet() {
		return authRoleSet;
	}

	public void setAuthRoleSet(Set<AuthRole> authRoleSet) {
		this.authRoleSet = authRoleSet;
	}
	
}