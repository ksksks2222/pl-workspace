package hgria.admin.app.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @类功能说明：command和qo参数的基类
 * @类修改者：
 * @修改日期：
 * @修改说明：
 * @公司名称：浙江汇购科技有限公司
 * @部门：技术部
 * @作者：yuxx
 * @创建时间：2014年9月9日上午9:56:54
 *
 */
@SuppressWarnings("serial")
public class BaseParam implements Serializable {
    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 命令处理结束时间
     */
    private Date finishDate;

    /**
     * 操作许可令牌
     */
    private String token;

    /**
     * 命令来源项目
     */
    private String fromProjectId;

    /**
     * 命令来源用户
     */
    private String fromProjectUserId;

    /**
     * 命令来源管理员
     */
    private String fromAdminId;

    /**
     * 命令来源客户端标识
     */
    private String clientId;

    /**
     * 命令来源客户端标识
     */
    private String fromIp;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getFromIp() {
        return fromIp;
    }

    public void setFromIp(String fromIp) {
        this.fromIp = fromIp;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getFromProjectId() {
        return fromProjectId;
    }

    public void setFromProjectId(String fromProjectId) {
        this.fromProjectId = fromProjectId;
    }

    public String getFromProjectUserId() {
        return fromProjectUserId;
    }

    public void setFromProjectUserId(String fromProjectUserId) {
        this.fromProjectUserId = fromProjectUserId;
    }

    public String getFromAdminId() {
        return fromAdminId;
    }

    public void setFromAdminId(String fromAdminId) {
        this.fromAdminId = fromAdminId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
