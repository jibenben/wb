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
	 * it needs pagination
	 * @param userId
	 * @param pageIndex
	 * @param numberPerPage
	 * @return
	 */
	List<?> getRecommendUserIdList(int userId, int pageIndex, int numberPerPage);
}
