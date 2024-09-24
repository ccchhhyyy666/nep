package com.chy.nepm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chy.nepm.po.AqiFeedback;
import com.chy.nepm.service.impl.AqiFeedbackServiceImpl;

@RestController
@RequestMapping("/aqiFeedback")
public class AqiFeedbackController {
	/********************neps工程********************/

	@Autowired
	private AqiFeedbackServiceImpl aqiFeedbackServiceImpl;
	
	// 向空气质量公众监督反馈表添加信息 saveAqiFeedback
	@RequestMapping("/saveAqiFeedback") // aqiFeedback/saveAqiFeedback
	public int saveAqiFeedback(@RequestBody AqiFeedback aqiFeedback){
		return aqiFeedbackServiceImpl.saveAqiFeedback(aqiFeedback);
	}

	// 查询空气质量公众监督反馈表 listAqiFeedbackByTelId
	@RequestMapping("/listAqiFeedbackByTelId") // aqiFeedback/listAqiFeedbackByTelId
	public List<AqiFeedback> listAqiFeedbackByTelId(@RequestBody AqiFeedback aqiFeedback){
		return aqiFeedbackServiceImpl.listAqiFeedbackByTelId(aqiFeedback.getTelId());
	}
	
	/********************neps工程********************/

}
