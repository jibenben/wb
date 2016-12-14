package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;

public interface SearchUserService {
	public List<User> SearchUser(String user);
}
