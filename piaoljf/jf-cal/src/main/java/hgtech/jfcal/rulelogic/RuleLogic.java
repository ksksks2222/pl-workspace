/**
 * @文件名称：RuleLogic.java
 * @类路径：hgtech.jfcal.rulelogic
 * @描述：TODO
 * @作者：xinglj
 * @时间：2014-9-3下午3:21:35
 */
package hgtech.jfcal.rulelogic;

import java.io.Serializable;

import hgtech.jfcal.model.*;

/**
 * @类功能说明：单个规则计算逻辑
 * @类修改者：
 * @修改日期：2014-9-3下午3:21:35
 * @修改说明：
 * @公司名称：浙江汇购科技有限公司
 * @作者：xinglj
 * @创建时间：2014-9-3下午3:21:35
 *
 */
public interface RuleLogic extends SingleRule{
	/**
	 * 
	 * @方法功能说明：
	 * @修改者名字：xinglj
	 * @修改时间：2014年11月12日上午9:49:34
	 * @修改内容：
	 * @参数：@param flow
	 * @参数：@return
	 * @参数：@throws Exception
	 * @return:CalResult , may null.
	 * @throws
	 */
	public abstract CalResult compute(Serializable flow) throws Exception;

}