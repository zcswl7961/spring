package com.zcs.aop.jdk;

/**
 * @description: UserDao的实现类
 * @project: spring
 */
public class UserDaoImpl implements UserDao {

	@Override
	public int saveUser(User user) {
		System.out.println("插入成功：" + user);
		return 1;
	}

	@Override
	public User getUserByName(String userName) {
		User user = new User(userName, "12345678@qq.com");
		System.out.println("查询成功：" + user);
		return user;
	}
}
