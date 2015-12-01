package org.knl.user.mapper;

import java.util.List;

import org.knl.user.bean.User;

/**
 * 用户mapper映射类
 * @author yanglikai
 *
 */
public interface UserMapper {
	/**
	 * 根据id查询用户信息
	 * @param id
	 * @return
	 */
	User getUser(String id);
	
	/**
	 * 查询所有用户信息
	 * @return
	 */
	List<User> getUsers();
	
	/**
	 * 添加用户信息
	 * @param user
	 */
	int addUser(User user);
	
	/**
	 * 根据id删除用户信息
	 * @param id
	 * @return
	 */
	int deleteUser(String id);
	
	/**
	 * 根据id更新用户信息
	 * @param id
	 * @param name
	 * @return
	 */
	int updateUser(String id, String name);
}
