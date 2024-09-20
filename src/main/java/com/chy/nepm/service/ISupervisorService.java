package com.chy.nepm.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.chy.nepm.po.Supervisor;

public interface ISupervisorService {
	/********************neps工程********************/

	public Supervisor getSupervisorByIdByPass(Supervisor supervisor);
	
	public int saveSupervisor(Supervisor supervisor);
	
	public Supervisor getSupervisorById(String telId);

	/********************neps工程********************/

}
