package com.chy.nepm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chy.nepm.mapper.AdminsMapper;
import com.chy.nepm.po.Admins;
import com.chy.nepm.service.IAdminsService;

@Service
public class AdminsServiceImpl implements IAdminsService {

	@Autowired
	private AdminsMapper adminsMapper;
	
	@Override
	public Admins getAdminsByCodeBypass(Admins admins) {
		return adminsMapper.getAdminsByCodeBypass(admins);
	}

}
