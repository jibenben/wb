package cn.edu.bjtu.weibo.service;

import java.util.List;

/**
 * When a user want to know all the weibo which @ him.
 * 
 * @author Liu Jinfeng
 *
 */

public interface AtUserService {
	/**
	 * 
	 * @param userId
	 * @return
	 */
	List<?> getAtMeWeiboList(int userId);
}
