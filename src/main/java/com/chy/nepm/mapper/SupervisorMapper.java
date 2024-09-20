package com.chy.nepm.mapper;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chy.nepm.po.Supervisor;

// 不用加注解，因为在NepmApplication中使用@MapperScan("com.chy.nepm.mapper")
public interface SupervisorMapper extends BaseMapper<Supervisor>{ // 继承BaseMapper实现mybatis-plus
	
	/********************neps工程********************/
	// 通过电话号和密码，获取公共监督员信息  用于登录
	@Select("SELECT * FROM supervisor WHERE tel_id=#{telId} AND `password`=#{password}")
	public Supervisor getSupervisorByIdByPass(Supervisor supervisor);
	
	//saveSupervisor
	// 增加信息 
	
	//getSupervisorById
	
	/********************neps工程********************/

}
