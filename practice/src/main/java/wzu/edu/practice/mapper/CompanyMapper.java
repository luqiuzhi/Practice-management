package wzu.edu.practice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import wzu.edu.practice.entity.Company;

public interface CompanyMapper {

	/**
	 * 根据公司ID查找公司
	 * @param id
	 * @return
	 */
	public Company findById(@Param("id")int id);
	
	/**
	 * 得到所有的公司信息
	 * @return
	 */
	public List<Company> findAllCompany();
}
