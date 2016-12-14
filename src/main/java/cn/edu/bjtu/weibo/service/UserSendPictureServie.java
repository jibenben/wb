package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.Picture;
import cn.edu.bjtu.weibo.model.User;

public interface UserSendPictureServie {
	public List<Picture> UserSendPicture(User user);
}
