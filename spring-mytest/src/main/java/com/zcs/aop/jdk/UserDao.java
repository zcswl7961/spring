package com.zcs.aop.jdk;

/**
 * @description: User的数据库持久层
 * @project: spring
 */
public interface UserDao {

	int saveUser(User user);

	User getUserByName(String userName);
}
