package cn.edu.bjtu.weibo.service;

/**
 * Delete weibo then it just remove the weiboId from the weiboId list under a specified userId
 * 
 * @author Liu Jinfeng
 *
 */

public interface DeleteWeiboService {
	/**
	 * 
	 * @param userId
	 * @param weiboId
	 * @return
	 */
	boolean DeleteWeibo(int userId,int weiboId);
}
