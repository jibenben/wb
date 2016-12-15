package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.Picture;

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
	List<Picture> getUserSendedPictureList(int userId, int pageIndex, int numberPerPage);
}
