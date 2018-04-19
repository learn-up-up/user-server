package com.bgs.mylove.service;

import com.bgs.mylove.entity.User;
import com.bgs.mylove.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		userMapper.insert(user);
		return id;
	}

	public String getId() {
		DateFormat dateFormat =  new SimpleDateFormat("yyyyMMddHHmmss");
		String id = dateFormat.format(new Date());
		return id;
	}
}
