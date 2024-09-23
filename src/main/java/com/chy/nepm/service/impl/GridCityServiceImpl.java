package com.chy.nepm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chy.nepm.mapper.GridCityMapper;
import com.chy.nepm.po.GridCity;
import com.chy.nepm.service.IGridCityService;

@Service
public class GridCityServiceImpl implements IGridCityService {

	@Autowired
	private GridCityMapper gridCityMapper;
	
	@Override
	public List<GridCity> listGridCityAll(Integer provinceId) {
		// TODO 自动生成的方法存根
		QueryWrapper<GridCity> qw = new QueryWrapper<GridCity>();
		qw.eq("province_id", provinceId);
		return gridCityMapper.selectList(qw);
	}

}
