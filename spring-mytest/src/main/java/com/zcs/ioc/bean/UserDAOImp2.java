package com.zcs.ioc.bean;

/**
 * @author: zhoucg
 * @date: 2019-07-13
 */
public class UserDAOImp2 implements UserDAO{

	private int daoId;
	public int getDaoId() {
		return daoId;
	}
	public void setDaoId(int daoId) {
		this.daoId = daoId;
	}
	public void save(String user) {
		System.out.println("user saved!   2");
	}
	@Override
	public String toString() {
		return "daoId=" + daoId;
	}
}
