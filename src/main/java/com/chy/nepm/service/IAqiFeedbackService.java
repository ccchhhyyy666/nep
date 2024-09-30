package com.chy.nepm.service;

import java.util.List;

import com.chy.nepm.dto.AfPageRequestDto;
import com.chy.nepm.dto.PageResponseDto;
import com.chy.nepm.po.AqiFeedback;

public interface IAqiFeedbackService {

	public int saveAqiFeedback(AqiFeedback aqiFeedback);
	
	
	public List<AqiFeedback> listAqiFeedbackByTelId(String telId);
	
	
	/********************nepm工程********************/

	// 查询分页数据的总行数
	public int getAqiFeedbackCount(AfPageRequestDto afPageRequestDto);
	
	// 查询具体的业务数量
	public PageResponseDto<AqiFeedback> listAqiFeedbaockPage(AfPageRequestDto afPageRequestDto);
	
	// 
	public AqiFeedback getAqiFeedbaockById(Integer afId);
	/********************nepm工程********************/
}
