package cn.edu.bjtu.weibo.service;

import java.util.List;

/**
 * All the operation are related to forward weibo
 * @author Liu Jinfeng
 *
 */

public interface ForwardWeiboService {
	/**
	 * high frequency usage, it will show under some weibo
	 * @param weiboId
	 * @return
	 */
	int getForwardNumber(int weiboId);
	/**
	 * when a user want to see all the user id who forward this weibo
	 * it needs pagination
	 * @param weiboId
	 * @return
	 */
	List<?> getForwardUserIdList(int weiboId, int pageIndex, int numberPerPage);
	/**
	 * When a user do forward weibo action
	 * @param userId
	 * @param weiboId
	 * @return
	 */
	boolean	forwardWeiboAction(int userId, int weiboId);
}
