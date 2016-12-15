package cn.edu.bjtu.weibo.service;

import java.util.List;

/**
 * This service show the hot weibo id for a given userId
 * 
 * @author Liu Jinfeng
 *
 */
public interface UserHotWeiboService {
	/**
	 * it needs pagination
	 * @param user
	 * @param pageIndex
	 * @param numberPerPage
	 * @return weibo id list
	 */
	List<?> getUserHotWeiboIdList(int userId, int pageIndex, int numberPerPage);
}
