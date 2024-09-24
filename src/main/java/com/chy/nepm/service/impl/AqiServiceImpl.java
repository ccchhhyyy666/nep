package com.chy.nepm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chy.nepm.mapper.AqiMapper;
import com.chy.nepm.po.Aqi;
import com.chy.nepm.service.IAqiService;

@Service
public class AqiServiceImpl implements IAqiService {

	@Autowired
	private AqiMapper aqimapper;
	
	@Override
	public List<Aqi> listAqiAll() {
		QueryWrapper<Aqi> qw = new QueryWrapper<>();
		qw.orderByAsc("aqi_id"); // 根据数据库字段进行asc排序升序
		return aqimapper.selectList(qw); // 全表查询
	}

}
