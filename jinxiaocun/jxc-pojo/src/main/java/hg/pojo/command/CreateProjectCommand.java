package hg.pojo.command;


/**
 * 创建项目
 * @author liujz
 *
 */
@SuppressWarnings("serial")
public class CreateProjectCommand extends JxcCommand {

	/**
	 * 项目名称
	 */
	private String name;
	
	/**
	 * 密钥
	 */
	private String key;
	
	/**
	 * 推送接口地址
	 */
	private String postUrl;
	
	/**
	 * 项目模式
	 */
	private String projectModeId;
	
	
	/**
	 * 项目类型
	 */
	private String projectTypeId;
	
	/**
	 * 运营模式
	 */
	private String operationFormId;
	
	/**
	 * 项目负责人
	 */
	private String projectLeader;
	
	/**
	 * 联系电话
	 */
	private String linkPhone;
	
	/**
	 * 联系邮箱
	 */
	private String linkEmail;
	
	/**
	 * 备注
	 */
	private String remark;
	
	/**
	 * 是否启用
	 */
	private Boolean using;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getPostUrl() {
		return postUrl;
	}

	public void setPostUrl(String postUrl) {
		this.postUrl = postUrl;
	}

	public String getProjectModeId() {
		return projectModeId;
	}

	public void setProjectModeId(String projectModeId) {
		this.projectModeId = projectModeId;
	}

	public String getProjectTypeId() {
		return projectTypeId;
	}

	public void setProjectTypeId(String projectTypeId) {
		this.projectTypeId = projectTypeId;
	}

	public String getOperationFormId() {
		return operationFormId;
	}

	public void setOperationFormId(String operationFormId) {
		this.operationFormId = operationFormId;
	}

	public String getProjectLeader() {
		return projectLeader;
	}

	public void setProjectLeader(String projectLeader) {
		this.projectLeader = projectLeader;
	}

	public String getLinkPhone() {
		return linkPhone;
	}

	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}

	public String getLinkEmail() {
		return linkEmail;
	}

	public void setLinkEmail(String linkEmail) {
		this.linkEmail = linkEmail;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Boolean getUsing() {
		return using;
	}

	public void setUsing(Boolean using) {
		this.using = using;
	}

}