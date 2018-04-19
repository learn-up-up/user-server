package com.bgs.mylove.mapper;

import com.bgs.mylove.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author wujianwen
 * @Date	20180418
 */
@Mapper
public interface UserMapper {

	@Insert("insert into mylove_user.user(id,username,password,phone,email,create_time) values(#{id},#{username},#{password},#{phone},#{email},now())")
	void insert(User user);
}
