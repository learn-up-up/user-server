package com.bgs.mylove.mapper;

import com.bgs.mylove.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author wujianwen
 * @Date	20180418
 */
@Mapper
public interface UserMapper {

	@Insert("insert into mylove_user.user(id,username,password,phone,email,create_time) values(#{id},#{username},#{password},#{phone},#{email},now())")
	void insert(User user);

	@Select("select * from mylove_user.user u where u.phone like '%${phone}%'")
	List<User> select(@Param("phone") String phone);
}
