package com.chy.nepm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chy.nepm.mapper.GridProvinceMapper;
import com.chy.nepm.po.GridProvince;
import com.chy.nepm.service.IGridProvinceService;

@Service
public class GridProvinceServiceImpl implements IGridProvinceService {

	@Autowired
	private GridProvinceMapper gridProvinceMapper;
	
	@Override
	public List<GridProvince> listGridProvinceAll() {
		return gridProvinceMapper.selectList(null); // 全表查询
	}

}
