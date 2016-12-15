package cn.edu.bjtu.weibo.service;

import java.util.List;

/**
 * When a user want to know all the weibo which @ him.
 * 
 * @author Liu Jinfeng
 *
 */

public interface AtMeService {
	/**
	 * it needs pagination
	 * @param userId
	 * @param pageIndex
	 * @param numberPerPage
	 * @return
	 */
	List<?> getAtMeWeiboIdList(int userId, int pageIndex, int numberPerPage);
}
