package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.User;

public interface UsermanageService {
	public boolean banUser(User user);
	public boolean unbanUser(User user);

}
