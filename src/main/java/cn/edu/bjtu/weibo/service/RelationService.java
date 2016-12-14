package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.User;

public interface RelationService {
	public boolean	followAction(User user1,User user2);
	public boolean	unfollowAction(User user1,User user2);
	public boolean	deletefansAction(User user1,User user2);

}
