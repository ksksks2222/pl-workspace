package hg.pojo.command.warehousingnotice;

import hg.common.component.BaseCommand;

/**
 * @类功能说明：
 * @备注：
 * @类修改者：
 * @修改日期：2015-03-17 16:59:24
 * @修改说明：
 * @公司名称：浙江汇购科技有限公司
 * @作者：cc
 * @创建时间：2015-03-17 16:59:24
 */
public class RemoveWarehousingNoticeCommand extends BaseCommand {
	private static final long serialVersionUID = 1L;
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}