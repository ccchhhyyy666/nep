package com.chy.nepm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chy.nepm.po.GridProvince;
import com.chy.nepm.service.impl.GridProvinceServiceImpl;

@RestController
@RequestMapping("/gridProvince")
public class GridProvinceController {
	/********************neps工程********************/
	
	@Autowired
	private GridProvinceServiceImpl gridProvinceServiceImpl;
	
	@RequestMapping("/listGridProvinceAll") // gridProvince/listGridProvinceAll
	public List<GridProvince> listGridProvinceAll(){
		return gridProvinceServiceImpl.listGridProvinceAll();
	}
	
	
	/********************neps工程********************/
	
}
