package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.User;

public interface AtMessageService {
	public boolean AtMessage(User user,User user1,String str);
}
