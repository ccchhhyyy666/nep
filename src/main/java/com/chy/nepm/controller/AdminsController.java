package com.chy.nepm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chy.nepm.po.Admins;
import com.chy.nepm.service.IAdminsService;

@RestController
@RequestMapping("/admins")
public class AdminsController {
	/********************nepm工程********************/
	
	@Autowired
	private  IAdminsService iAdminsService;
	
	@RequestMapping("/getAdminsByCodeBypass") // admins/getAdminsByCodeBypass
	public Admins getAdminsByCodeBypass(@RequestBody Admins admins) {
		return iAdminsService.getAdminsByCodeBypass(admins); // 调用省id
	}
	
	/********************nepm工程********************/
}
