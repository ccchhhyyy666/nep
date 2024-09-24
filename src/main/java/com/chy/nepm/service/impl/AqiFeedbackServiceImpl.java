package com.chy.nepm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chy.nepm.mapper.AqiFeedbackMapper;
import com.chy.nepm.po.AqiFeedback;
import com.chy.nepm.service.IAqiFeedbackService;

@Service
public class AqiFeedbackServiceImpl implements IAqiFeedbackService {

	@Autowired
	private AqiFeedbackMapper aqiFeedbackMapper;

	@Override
	public int saveAqiFeedback(AqiFeedback aqiFeedback) {
		return aqiFeedbackMapper.insert(aqiFeedback);
	}

	@Override
	public List<AqiFeedback> listAqiFeedbackByTelId(String telId) {
		return aqiFeedbackMapper.listAqiFeedbackByTelId(telId);
	}

}
