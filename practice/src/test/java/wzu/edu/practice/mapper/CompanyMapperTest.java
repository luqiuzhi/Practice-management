package wzu.edu.practice.mapper;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import wzu.edu.practice.entity.Company;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyMapperTest {

	@Autowired
	CompanyMapper companyMapper;
	
	@Test
	@Ignore
	public void testFindById() {
		Company company = companyMapper.findById(1);
		System.out.println(company);
	}
	
	@Test
	public void testFindAll(){
		List<Company> list = companyMapper.findAllCompany();
		for(Company company:list){
			System.out.println(company);
		}
	}

}
