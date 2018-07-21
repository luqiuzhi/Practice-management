package wzu.edu.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import wzu.edu.practice.entity.Company;
import wzu.edu.practice.service.CompanyService;
import wzu.edu.practice.vo.TablePage;

@Controller
public class CompanyController {

	@Autowired
	CompanyService companyService;

	@RequestMapping("/allCompany")			//采用restful的get方法
	public String turnToAllCompany(Model model){
		List<Company> allCompany = companyService.findAllCompany();
		model.addAttribute("",allCompany);
		return "test";
	}
	
	@RequestMapping("/table/allCompany")			//采用restful的get方法
	@ResponseBody
	public String getAllCompany(){
		List<Company> allCompany = companyService.findAllCompany();
		TablePage<List<Company>> tablePage=new TablePage<List<Company>>(0, "", allCompany.size(), allCompany);
		System.out.println(JSON.toJSONString(tablePage));
		return JSON.toJSONString(tablePage);
	}
	
}
