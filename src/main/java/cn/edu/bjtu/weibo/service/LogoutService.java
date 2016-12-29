package cn.edu.bjtu.weibo.service;
/**
 * When user try to logout weibo
 * @author Liu Jinfeng
 *
 */
public interface LogoutService {
	/**
	 * 
	 * @param userToken
	 * @return
	 */
	boolean logout(String userToken);
}
