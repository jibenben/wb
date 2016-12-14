package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.User;

public interface UserProfileService {
	public void createUserInterface(User user);
	public User	getUserInterface(User user);
	public boolean	updateUserInterface(User user);

}
