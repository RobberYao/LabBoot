package com.lab.Dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lab.Entry.User;

@Mapper
public interface UserMapper {

	@Select("select * from user where name = #{name}")
	User findUserByName(@Param("name") String name);

	@Update("update user set age=#{age} where name=#{name}")
	int updateUser(User user);
	
	@Insert("insert into user (name,age) value (#{name},#{age})")
	int addUser(User user);
	
	@Delete("delete from user where name=#{name}")
	int deleteUser(User user);
	
	
	
	
	
	
	
}
