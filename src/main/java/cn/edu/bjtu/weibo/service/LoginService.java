package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.LoginUser;

/**
 * When user try to login weibo
 * @author Liu Jinfeng
 *
 */
public interface LoginService {
	/**
	 * 
	 * @param usename
	 * @param password
	 * @return
	 */
	String getLoginUserToken(LoginUser user);
}
