package com.chy.nepm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chy.nepm.dto.AfPageRequestDto;
import com.chy.nepm.dto.PageResponseDto;
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

	@Override
	public int getAqiFeedbackCount(AfPageRequestDto afPageRequestDto) {
		return 0;
	}

	@Override
	public PageResponseDto<AqiFeedback> listAqiFeedbaockPage(AfPageRequestDto request) {
		PageResponseDto<AqiFeedback> response = new PageResponseDto<>();
		// 获取总行数
		int totalRow = aqiFeedbackMapper.getAqiFeedbackCount(request);
		System.out.println("获取总行数"+totalRow);
		// 添加总行数
		response.setTotalRow(totalRow);
		// 如果总行数为0，直接返回
		if (totalRow == 0) {
			return response;
		}
		// 计算总页数
		int totalPageNum = 0;
		if (totalRow % request.getMaxPageNum() == 0) {
			totalPageNum = totalRow / request.getMaxPageNum();
		} else {
			totalPageNum = totalRow / request.getMaxPageNum() + 1;
		}
		System.out.println("获取总页数"+totalPageNum);
		response.setTotalPageNum(totalPageNum);
		// 上一页、下一页计算
		int pageNum = request.getPageNum();
		response.setPreNum(pageNum-1);
		response.setNextNum(pageNum+1);
		if (pageNum > 1) {
			response.setPreNum(pageNum - 1);
		}
		if (pageNum < totalPageNum) {
			response.setNextNum(pageNum + 1);
		}
		// 计算开始查询记录
		request.setBeginNum((pageNum - 1) * request.getMaxPageNum());
		// 查询业务数据
		
		List<AqiFeedback> list = aqiFeedbackMapper.listAqiFeedbaockPage(request);
		
		System.out.println("获取当前页"+pageNum);

		// 给返回数据对象填充剩余数据
		response.setPageNum(pageNum);
		response.setMaxPageNum(request.getMaxPageNum());
		response.setList(list);
		
		System.out.println(totalRow);
		System.out.println(totalRow);
		
		return response;
	}

	@Override
	public AqiFeedback getAqiFeedbaockById(Integer afId) {
		return aqiFeedbackMapper.getAqiFeedbaockById(afId);
	}

}
