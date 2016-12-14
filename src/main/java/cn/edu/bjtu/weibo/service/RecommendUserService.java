package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;

public interface RecommendUserService {
	public List<User> getRecommend(User user);
}
