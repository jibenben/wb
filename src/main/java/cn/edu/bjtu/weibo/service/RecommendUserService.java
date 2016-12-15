package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;


public interface RecommendUserService {
	/*
	when you recommend userlist you will use user‘s information
	*/
	 List<User> getRecommend(User user);
}
