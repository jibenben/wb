package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.Picture;
import cn.edu.bjtu.weibo.model.User;

public interface LikePictureService {
	public boolean LikePicture(User user ,Picture picture);

}
