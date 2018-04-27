package hsl.api.v1.response.company;

import java.util.List;

import hsl.api.base.ApiResponse;
import hsl.pojo.dto.company.CompanyDTO;
import hsl.pojo.dto.company.CompanyListDTO;
import hsl.pojo.dto.company.DepartmentDTO;
import hsl.pojo.dto.company.MemberDTO;

/**
 * 
 * @类功能说明：部门成员查询结果
 * @类修改者：
 * @修改日期：
 * @修改说明：
 * @公司名称：浙江汇购科技有限公司
 * @部门：技术部
 * @作者：yuqz
 * @创建时间：2014年10月20日上午9:59:44
 * @版本：V1.0
 *
 */
public class CompanyListResponse extends ApiResponse{
	
	/**
	 * 公司列表
	 */
	private List<CompanyListDTO> companyList;
	
	public final static String COMPANY_NOT_EXIST = "-1";//没有组织

	public List<CompanyListDTO> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(List<CompanyListDTO> companyList) {
		this.companyList = companyList;
	}

}
