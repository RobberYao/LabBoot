package com.lab.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lab.Dao.UserMapper;
import com.lab.Entry.User;

@RestController
@RequestMapping({"/home"})
public class UserController {
	@Autowired
	UserMapper userMapper;

	@RequestMapping(value = "/user")
	@ResponseBody
	public String user() {
		User user = userMapper.findUserByName("haha");
		return user.getName() + "---------" + user.getAge();
	}

}
