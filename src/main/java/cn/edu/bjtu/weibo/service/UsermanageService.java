package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.User;

/**
 * when the admin manage the use
 */
public interface UsermanageService {
	/**
	 * ban a user by userid
	 * @param userid
	 */
	 boolean banUser(int userId);
	 boolean unbanUser(int userId);
}
