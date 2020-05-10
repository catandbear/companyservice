package com.fsd2020.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd2020.data.entity.CompanyEntity;
import com.fsd2020.data.mapper.CompanyMapper;

@RestController
@RequestMapping("admin/company")
public class ManagementController {

	@Autowired
	private CompanyMapper companyMapper;
	
	@GetMapping("add")
	public String addCompany(@RequestBody(required = true) CompanyEntity company) {
		
		int status = companyMapper.addCompany(company);
		
		if (status==1) {
			return "ok";
		}
		
		return "failed";
	}
	
	@GetMapping("disable")
	public String disableCompany(@RequestBody(required = true) String companyCode) {
		
		
		
		return "failed";
	}
}
