package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.Picture;

/**
 * Display all the Avatar pic belong to some user
 * @author Liu Jinfeng
 *
 */

public interface UserAvatarsService {
	/**
	 * 
	 * @param userId
	 * @param pageIndex
	 * @param numberPerPage
	 * @return
	 */
	List<Picture> getUserAvatarList(int userId, int pageIndex, int numberPerPage);
}
