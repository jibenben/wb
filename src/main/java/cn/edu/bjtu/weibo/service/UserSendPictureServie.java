package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.Picture;
import cn.edu.bjtu.weibo.model.User;
/**
 * the history of picture about a user
 */
public interface UserSendPictureServie {
	 List<Picture> UserSendPicture(int userId);
}
