package com.dao;

import org.apache.ibatis.annotations.Param;

import com.dao.domain.UserObject;

/**
 * UserMapper数据库操作接口类
 */
public interface UserMapper {


	/**
	 * 查询（根据主键ID查询）
	 */
	UserObject selectById( @Param("id") int id );

}