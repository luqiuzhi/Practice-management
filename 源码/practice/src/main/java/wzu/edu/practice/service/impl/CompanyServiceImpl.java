package wzu.edu.practice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wzu.edu.practice.entity.Company;
import wzu.edu.practice.mapper.CompanyMapper;
import wzu.edu.practice.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyMapper companyMapper;
	
	@Override
	public Company findById(int id) {
		return companyMapper.findById(id);
	}

	@Override
	public List<Company> findAllCompany() {
		return companyMapper.findAllCompany();
	}

}
