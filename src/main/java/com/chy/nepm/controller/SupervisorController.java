package com.chy.nepm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chy.nepm.po.Supervisor;
import com.chy.nepm.service.ISupervisorService;

@RestController
@RequestMapping("/supervisor")
public class SupervisorController {
	/********************neps工程********************/
	@Autowired
	private ISupervisorService iSupervisorService;
	
	// 公众监督员登录
	@RequestMapping("/getSupervisorByIdByPass") // supervisor/getSupervisorByIdByPass
	public Supervisor getSupervisorByIdByPass(@RequestBody Supervisor supervisor){ // @RequestBody 后端序列化处理
//		// 实现MD5 加密
//		String md5Hex = DigestUtils.md5DigestAsHex(supervisor.getPassword().getBytes());
//		System.out.println(md5Hex);
//		// 在来一次
//		String md5Hex2 = DigestUtils.md5DigestAsHex(md5Hex.getBytes());
//		System.out.println(md5Hex2);
//		supervisor.setPassword(md5Hex2);
		
		return iSupervisorService.getSupervisorByIdByPass(supervisor);
		
	}
	
	// 公众监督员注册
	@RequestMapping("/saveSupervisor") // supervisor/saveSupervisor
	public int saveSupervisor(@RequestBody Supervisor supervisor){
//		// 实现MD5 加密
//		String md5Hex = DigestUtils.md5DigestAsHex(supervisor.getPassword().getBytes());
//		System.out.println(md5Hex);
//		// 在来一次
//		String md5Hex2 = DigestUtils.md5DigestAsHex(md5Hex.getBytes());
//		System.out.println(md5Hex2);
//		supervisor.setPassword(md5Hex2);
		
		return iSupervisorService.saveSupervisor(supervisor);
		
	}
	
	// 公众监督员注册手机号校验
	@RequestMapping("/getSupervisorById") // supervisor/getSupervisorById
	public Supervisor getSupervisorById(@RequestBody Supervisor supervisor){ // @RequestBody 后端序列化处理
		return iSupervisorService.getSupervisorById(supervisor.getTelId());
	}
	/********************neps工程********************/

} 
