package com.chy.nepm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chy.nepm.mapper.GridMemberMapper;
import com.chy.nepm.po.GridMember;
import com.chy.nepm.service.IGridMemberService;

@Service
public class GridMemberServiceImpl implements IGridMemberService {

	@Autowired
	private GridMemberMapper gridMemberMapper;

	@Override
	public List<GridMember> listGridMemberByProvinceId(GridMember gridMember) {
		QueryWrapper<GridMember> qw = new QueryWrapper<GridMember>();
		qw.eq("province_id", gridMember.getProvinceId());
		qw.eq("city_id", gridMember.getCityId());
		qw.eq("state", gridMember.getState());
		return gridMemberMapper.selectList(qw);
	}

}
