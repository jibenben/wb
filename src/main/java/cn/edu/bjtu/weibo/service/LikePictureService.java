package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.Picture;
import cn.edu.bjtu.weibo.model.User;
/*
when user likes a picture
*/
public interface LikePictureService {
	/*
	userId
	pictureurl
	
	*/
	public boolean LikePicture(int userId ,String picurl);

}
