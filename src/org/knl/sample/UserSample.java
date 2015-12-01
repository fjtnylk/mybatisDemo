package org.knl.sample;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.knl.user.bean.User;
import org.knl.user.mapper.UserMapper;

/**
 * 用户操作测试类
 * @author yanglikai
 *
 */
public class UserSample {
	public static void main(String[] args) throws IOException {
		// ==== 读取配置文件
		String path = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(path);
		// ==== 创建sqlSession工厂
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		// ==== 创建sqlSession
		SqlSession sqlSession = factory.openSession();
		// ==== 获取mapper
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
//		// ==============================【单用户添加】操作(start)=============================
//		System.out.println("==============================【单用户添加】操作(start)=============================");
//		User addUser = new User();
//		addUser.setId("10001");
//		addUser.setName("zhangsan");
//		int addUserResult = userMapper.addUser(addUser);
//		String addUserOutput = addUserResult >= 1 ? "添加用户成功!" : "添加用户失败!";
//		System.out.println(addUserOutput);
//		System.out.println("==============================【单用户添加】操作(end)===============================");
//		// ==============================【单用户添加】操作(end)===============================
//		
//		// ==============================【单用户删除】操作(start)=============================
//		System.out.println("==============================【单用户删除】操作(start)=============================");
//		int delUserResult = userMapper.deleteUser("10001");
//		String delUserOutput = delUserResult >= 1 ? "删除用户成功!" : "删除用户失败!";
//		System.out.println(delUserOutput);
//		System.out.println("==============================【单用户删除】操作(end)===============================");
//		// ==============================【单用户删除】操作(end)===============================
//		
//		// ==============================【单用户更新】操作(start)=============================
//		System.out.println("==============================【单用户更新】操作(start)=============================");
//		int updUserResult = userMapper.updateUser("10001", "lisi");
//		String updUserOutput = updUserResult >= 1 ? "更新用户成功!" : "更新用户失败!";
//		System.out.println(updUserOutput);
//		System.out.println("==============================【单用户更新】操作(end)===============================");
//		// ==============================【单用户更新】操作(end)===============================
		
		// ==============================【单用户查询】操作(start)=============================
		System.out.println("==============================【单用户查询】操作(start)=============================");
		User user = userMapper.getUser("10001");
		// ==== 输出结果
		System.out.println("用户ID:" + user.getId());
		System.out.println("用户名称:" + user.getName());
		System.out.println("==============================【单用户查询】操作(end)===============================");
		// ==============================【单用户查询】操作(end)===============================
		
		// ==============================【多用户查询】操作(start)=============================
		System.out.println("==============================【多用户查询】操作(start)=============================");
		List<User> users = userMapper.getUsers();
		// ==== 输出结果
		for(User result : users){
			System.out.println("用户ID:" + result.getId());
			System.out.println("用户名称:" + result.getName());
		}
		System.out.println("==============================【多用户查询】操作(end)===============================");
		// ==============================【多用户查询】操作(end)===============================
		
		// ==== 关闭sqlSession
		sqlSession.close();
	}
}
