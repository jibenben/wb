package cn.edu.bjtu.weibo.service;

import java.util.List;

/**
 * When a use want to see all his fans
 * 
 * @author Liu Jinfeng
 *
 */

public interface FansUsersService {
	/**
	 * it needs pagination
	 * @param userId
	 * @param pageIndex
	 * @param numberPerPage
	 * @return
	 */
	List<?> getFansUserIdList(int userId, int pageIndex, int numberPerPage);
}
