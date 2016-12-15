package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.User;
import cn.edu.bjtu.weibo.model.Weibo;
/*
uesr like a weibo Action
*/
public interface LikeActionService {
	
	/*
	userId
	weiboId
	*/
	public boolean Like(int userId ,int weiboId);
}
