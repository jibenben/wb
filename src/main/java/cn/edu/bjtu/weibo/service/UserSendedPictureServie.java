package cn.edu.bjtu.weibo.service;

import java.util.List;

/**
 * When a user want to see all the picture some user owned.
 * 
 * @author Liu Jinfeng
 *
 */
public interface UserSendedPictureServie {
	/**
	 * it needs pagination
	 * @param userId
	 * @param pageIndex
	 * @param numberPerPage
	 * @return
	 */
	List<?> getUserSendedPictureIdList(int userId, int pageIndex, int numberPerPage);
}
