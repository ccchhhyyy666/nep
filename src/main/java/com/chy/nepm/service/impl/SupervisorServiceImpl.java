package com.chy.nepm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chy.nepm.mapper.SupervisorMapper;
import com.chy.nepm.po.Supervisor;
import com.chy.nepm.service.ISupervisorService;

@Service
public class SupervisorServiceImpl implements ISupervisorService {

	@Autowired
	private SupervisorMapper supervisorMapper;

	@Override
	public Supervisor getSupervisorByIdByPass(Supervisor supervisor) {
		return supervisorMapper.getSupervisorByIdByPass(supervisor);
	}

	@Override
	public int saveSupervisor(Supervisor supervisor) {
		return supervisorMapper.insert(supervisor);
	}

	@Override
	public Supervisor getSupervisorById(String telId) {
		return supervisorMapper.selectById(telId);
	}

}
