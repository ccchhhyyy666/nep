package com.chy.nepm.mapper;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chy.nepm.po.Admins;
import com.chy.nepm.po.AqiFeedback;

public interface AdminsMapper extends BaseMapper<AqiFeedback> {

	@Select("SELECT * FROM `admins` WHERE admin_code = #{adminCode} AND password = #{password}")
	public Admins getAdminsByCodeBypass(Admins admins);

}
