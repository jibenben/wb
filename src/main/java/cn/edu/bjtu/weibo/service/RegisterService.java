package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.LoginUser;

/**
 * Register a new user, make sure the password should be encrypted
 * 
 * @author Liu Jinfeng
 *
 */

public interface RegisterService {
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	boolean registerNewUser(LoginUser user);
	/**
	 * 
	 * @param username
	 * @return
	 */
	boolean isUserNameExisted(String username);
}
