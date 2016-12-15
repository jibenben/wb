package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.User;

/*
follow a user
unfollow user
deletefans
*/
public interface RelationService {
	 boolean	followAction(int userId,int userIdfollowed);
	 boolean	unfollowAction(int userId,int userIdunfollowed);
	 boolean	deletefansAction(int userId,int userIddelete);
}
