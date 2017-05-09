package com.lab.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lab.Dao.UserMapper;
import com.lab.Entry.User;

@RestController
@RequestMapping({ "/home" })
public class UserController {
	@Autowired
	UserMapper userMapper;

	@RequestMapping(value = "/user")
	@ResponseBody
	public String user() {
		User user = userMapper.findUserByName("haha");
		return user.getName() + "---------" + user.getAge();
	}

	@RequestMapping(value = "/update")
	@ResponseBody
	public int update() {
		User user = new User("eee", 17);
		int i = userMapper.updateUser(user);
		System.out.println(user.getId() + "=====" + user.getName() + "========" + user.getAge());
		return i;
	}

	@RequestMapping(value = "/insert")
	@ResponseBody
	public String addUser() {
		User user = new User("123", 23);
		int i = userMapper.addUser(user);
		return "add :  name= " + user.getName() + "  age= " + user.getAge();
	}

	@RequestMapping(value = "/delete")
	@ResponseBody
	public int deleteUser() {
		User user = new User("123", 23);
		int i = userMapper.deleteUser(user);

		return i;
	}

}
