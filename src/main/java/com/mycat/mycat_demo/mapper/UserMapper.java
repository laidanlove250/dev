/**
 * 
 */
package com.mycat.mycat_demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.mycat.mycat_demo.entity.User;

/**
 * @author Administrator
 *
 */
@Mapper
public interface UserMapper {

	@Insert("insert into user(id,name,create_time,update_time) values(#{id},#{name},#{createTime},#{updateTime}) ")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public Integer insert(User user);
	
	@Select("select "
			+ "id as id,"
			+ "name as name,"
			+ "create_time as createTime,"
			+ "update_time as updateTime"
			+ " from user ")
	public List<User> querUserList(User user);
}
