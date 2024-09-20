package com.chy.nepm.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.chy.nepm.po.Supervisor;

public interface ISupervisorService {
	/********************neps工程********************/

	public Supervisor getSupervisorByIdByPass(Supervisor supervisor);
	/********************neps工程********************/

}
