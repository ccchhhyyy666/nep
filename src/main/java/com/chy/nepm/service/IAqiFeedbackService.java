package com.chy.nepm.service;

import java.util.List;

import com.chy.nepm.po.AqiFeedback;

public interface IAqiFeedbackService {

	public int saveAqiFeedback(AqiFeedback aqiFeedback);
	
	
	public List<AqiFeedback> listAqiFeedbackByTelId(String telId);
}
