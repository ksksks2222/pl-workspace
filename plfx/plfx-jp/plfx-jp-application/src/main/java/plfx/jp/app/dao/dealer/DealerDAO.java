package plfx.jp.app.dao.dealer;

import hg.common.component.BaseDao;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import plfx.jp.domain.model.dealer.Dealer;
import plfx.jp.qo.admin.dealer.DealerQO;
/**
 * 
 * @类功能说明：经销商DAO
 * @公司名称：浙江汇购科技有限公司
 * @部门：技术部
 * @作者：yuqz
 * @创建时间：2015年7月2日下午2:19:30
 * @版本：V1.0
 *
 */
@Repository
public class DealerDAO extends BaseDao<Dealer, DealerQO>  {

	@Override
	protected Criteria buildCriteria(Criteria criteria, DealerQO qo) {
		if (qo != null) {
			if(qo.getCreateDateAsc()!=null){
				criteria.addOrder(qo.getCreateDateAsc()?Order.asc("createDate"):Order.desc("createDate"));
			}
			if(qo.getStatus()!=null&&qo.getStatus().length()!=0){
				criteria.add(Restrictions.eq("status", qo.getStatus()));
			}
			if(qo.getBeginTime()!=null){
				criteria.add(Restrictions.ge("createDate", qo.getBeginTime()));
			}
			if(qo.getEndTime()!=null){
				criteria.add(Restrictions.le("createDate", qo.getEndTime()));
			}			
			if(qo.getName()!=null&&qo.getName().length()!=0){
				criteria.add(Restrictions.like("name", qo.getName(), MatchMode.ANYWHERE));
			}
			if(qo.getCode()!=null&&qo.getCode().length()!=0){
				criteria.add(Restrictions.like("code", qo.getCode(), MatchMode.ANYWHERE));
			}
		}				
		return criteria;
	}

	@Override
	protected Class<Dealer> getEntityClass() {
		return Dealer.class;
	}

}
