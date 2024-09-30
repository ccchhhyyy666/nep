package com.chy.nepm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chy.nepm.po.GridMember;
import com.chy.nepm.service.impl.GridMemberServiceImpl;

@RestController
@RequestMapping("/gridMember")
public class GridMemberController {
	@Autowired
	private GridMemberServiceImpl gridMemberServiceImpl;

	@RequestMapping("/listGridMemberByProvinceId") // gridMember/listGridMemberByProvinceId
	public List<GridMember> listGridMemberByProvinceId(@RequestBody GridMember gridMember) {
		return gridMemberServiceImpl.listGridMemberByProvinceId(gridMember); 
	}
}
