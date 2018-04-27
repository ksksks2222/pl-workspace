package plfx.gnjp.app.dao;

import hg.common.component.BaseDao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import plfx.gnjp.domain.model.order.GNJPPassenger;
import plfx.yeexing.qo.admin.PassengerQO;

/**
 * 
 * @类功能说明：乘客DAO
 * @公司名称：浙江汇购科技有限公司
 * @部门：技术部
 * @作者：yuqz
 * @创建时间：2015年6月30日下午2:49:40
 * @版本：V1.0
 *
 */
@Repository
public class PassengerDAO extends BaseDao<GNJPPassenger, PassengerQO>{

	@Override
	protected Criteria buildCriteria(Criteria criteria, PassengerQO qo) {
		if (qo != null) {
			//姓名
			if(qo.getName()!=null){
				criteria.add(Restrictions.like("name", qo.getName(), MatchMode.ANYWHERE));
			}
			//证件号
			if(qo.getCardNo()!=null){
				criteria.add(Restrictions.like("cardNo", qo.getCardNo(), MatchMode.ANYWHERE));
			}
			//手机号
			if(qo.getMobilePhone()!=null){
				criteria.add(Restrictions.like("mobilePhone", qo.getMobilePhone(), MatchMode.ANYWHERE));
			}
		}
		return criteria;
	}

	@Override
	protected Class<GNJPPassenger> getEntityClass() {
		return GNJPPassenger.class;
	}
	
	/**
	 * 
	 * @方法功能说明：通过商城订单号（经销商订单号） 查询该订单的乘客列表
	 * @修改者名字：renfeng
	 * @修改时间：2014年8月1日下午6:04:18
	 * @修改内容：
	 * @参数：@return
	 * @return:List<FlightPassengerDTO>
	 * @throws
	 */
	@SuppressWarnings({"unchecked" })
	public List<GNJPPassenger> findPassengerListByDealerOrderId(String dealerOrderId){
		
		//List<GNJPPassenger> passengerList = new ArrayList<GNJPPassenger>();
		String queryHql="from GNJPPassenger p where p.jpOrderId in(select id from GNJPOrder o where o.dealerOrderCode=?)";
		
		return this.find(queryHql, dealerOrderId);
	}

}