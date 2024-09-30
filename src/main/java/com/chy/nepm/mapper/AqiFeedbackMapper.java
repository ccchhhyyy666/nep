package com.chy.nepm.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chy.nepm.dto.AfPageRequestDto;
import com.chy.nepm.po.AqiFeedback;

public interface AqiFeedbackMapper extends BaseMapper<AqiFeedback> {
	/********************neps工程********************/

	// 向空气质量公众监督反馈表添加信息 saveAqiFeedback
	
	// 查询空气质量公众监督反馈表 listAqiFeedbackByTelId
	public List<AqiFeedback> listAqiFeedbackByTelId(String telId);
	
	/********************neps工程********************/
	
	
	/********************nepm工程********************/

	// 查询分页数据的总行数
	public int getAqiFeedbackCount(AfPageRequestDto afPageRequestDto);
	
	// 查询具体的业务数量
	public List<AqiFeedback> listAqiFeedbaockPage(AfPageRequestDto afPageRequestDto);
	
	// 根据AqiId来查询
	public AqiFeedback getAqiFeedbaockById(Integer afId);

	/********************nepm工程********************/

}
