package cn.edu.bjtu.weibo.service;

import java.util.List;

/**
 * Recommend some user for a user, it depends on your recommendation algorithm.
 * 
 * @author Liu Jinfeng
 *
 */

public interface RecommendUsersService {
	/**
	 * 
	 * @param userId
	 * @return
	 */
	List<?> getRecommendUserIdList(int userId);
}
