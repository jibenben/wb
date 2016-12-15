package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.Weibo;

/**
 * This service show the hot weibo list for a given userId
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
	List<Weibo> getUserHotWeiboList(int userId, int pageIndex, int numberPerPage);
}
