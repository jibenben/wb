package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;

public interface SameAttentionService {
	public List<User> getSameAttention(User user1,User user2);

}
