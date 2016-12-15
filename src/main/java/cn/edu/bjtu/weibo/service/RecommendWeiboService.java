package cn.edu.bjtu.weibo.service;

import java.util.List;

/**
 * Recommend some weibo for a given user, it depends on the recommendation algorithm
 * 
 * you can use the user profile information, or base on the user weibo content to recommend similar ones.
 * 
 * @author Liu Jinfeng
 *
 */

public interface RecommendWeiboService {
	/**
	 * it needs pagination
	 * @param userId
	 * @return
	 */
	List<?> getRecommentWeiboIdList(int userId, int pageIndex, int numberPerPage);
}
