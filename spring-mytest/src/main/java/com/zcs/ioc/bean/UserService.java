package com.zcs.ioc.bean;

/**
 * @author: zhoucg
 * @date: 2019-07-13
 */
public class UserService {

	private UserDAO userDAO;
	public void add(String user) {
		userDAO.save(user);
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
