package com.bgs.mylove.userserver.mapper;

import com.bgs.mylove.userserver.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author wujianwen
 * @Date	20180418
 */
@Mapper
public interface UserMapper {

	//#{}转义，${}不转义
	@Insert("insert into mylove_user.user(id,username,password,phone,email,create_time) values(#{id},#{username},#{password},#{phone},#{email},now())")
	void addOne(User user);

	@Select("select * from mylove_user.user_account u where u.phone like '%${phone}%'")
	List<User> getListByPhone(@Param("phone") String phone);

	@Select("select * from mylove_user.user_account u where u.id = #{id}")
	User getOneById(@Param("id") String accountId);

	@Delete("delete from mylove_user.user_account u where u.id= #{id}")
	void removeById(@Param("id") String id);

	@Update("update mylove_user.user_account u set u.username = #{id}, u.password = # where u.id = #{id}")
	boolean updateById(User user);
}
