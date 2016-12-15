package cn.edu.bjtu.weibo.service;

import java.util.List;

/**
 * When user try to make some weibo into favor list or view all his favorite weibo list
 * @author Liu Jinfeng
 *
 */

public interface FavoriteWeiboService {
	/**
	 * it needs pagination
	 * @param userId
	 * @return
	 */
	List<?>	getFavoriteWeiboIdList(int userId, int pageIndex, int numberPerPage);
	/**
	 * 
	 * @param userId
	 * @param weiboId
	 * @return
	 */
	boolean	favoriteWeiboAction(int userId, int weiboId);
}