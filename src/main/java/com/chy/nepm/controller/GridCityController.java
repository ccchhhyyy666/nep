package com.chy.nepm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chy.nepm.po.GridCity;
import com.chy.nepm.service.impl.GridCityServiceImpl;

@RestController
@RequestMapping("/gridCity")
public class GridCityController {
	/********************neps工程********************/
	
	@Autowired
	private  GridCityServiceImpl  gridCityServiceImpl;
	
	@RequestMapping("/listGridCityAll") // gridCity/listGridCityAll
	public List<GridCity> listGridCityAll(@RequestBody GridCity gridCity){
		return gridCityServiceImpl.listGridCityAll(gridCity.getProvinceId()); // 调用省id
	}
	
	/********************neps工程********************/
}
