package com.bgs.mylove.userserver.service;

import com.bgs.mylove.userserver.entity.User;
import com.bgs.mylove.userserver.mapper.UserMapper;
import com.bgs.mylove.api.base.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	/**
	 *
	 * @param user
	 * @return user's id
	 */
	public String createOne(User user) {
		String id = getId();
		user.setId(id);
		userMapper.addOne(user);
		return id;
	}

	private String getId() {
		DateFormat dateFormat =  new SimpleDateFormat("yyyyMMddHHmmss");
		String id = dateFormat.format(new Date());
		return id;
	}

	public PageBean<User> queryByPhone(String phone) {
		List<User> list = userMapper.getListByPhone(phone);
		return new PageBean<>(0,20,1,list.size(),list);
	}
}
