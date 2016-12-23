package cn.edu.bjtu.weibo.dao;

public interface LoginDAO {
	/*
	 * register
	 */
	boolean insert(String userLoginName,String password);
	boolean updatePassword(String userLoginName, String oldPassword, String newPassword);
	String getUserId(String userLoginName, String password);
	/*
	 * if the userLoginName exits
	 */
	boolean select(String userLoginName);
}
