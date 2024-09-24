package com.chy.nepm.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chy.nepm.po.AqiFeedback;

public interface AqiFeedbackMapper extends BaseMapper<AqiFeedback> {

	// 向空气质量公众监督反馈表添加信息 saveAqiFeedback
	
	// 查询空气质量公众监督反馈表 listAqiFeedbackByTelId
	public List<AqiFeedback> listAqiFeedbackByTelId(String telId);

	
}
