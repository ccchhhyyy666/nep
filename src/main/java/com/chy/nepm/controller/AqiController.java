package com.chy.nepm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chy.nepm.po.Aqi;
import com.chy.nepm.service.IAqiService;


@RestController
@RequestMapping("/aqi")
public class AqiController {
	/********************neps工程********************/
	
	@Autowired
	private  IAqiService iAqiService;
	
	@RequestMapping("/listAqiAll") // aqi/listAqiAll
	public List<Aqi> listAqiAll(){
		return iAqiService.listAqiAll(); // 调用省id
	}
	
	/********************neps工程********************/
}
