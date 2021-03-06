package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.RelationType;

/**
 * Manage your relation with other users
 * there are 3 actions you can do
 * 1 follow some user you are interested.
 * 2 unfollow some user when you are boring
 * 3 some user follow you but you dislike be followed by him, you can remove it from your fans list
 * 
 * @author Liu Jinfeng
 *
 */

public interface RelationManageService {
	/**
	 * you want to follow someone
	 * @param userId
	 * @param userIdfollowed
	 * @return
	 */
	boolean followAction(String userId, String followedUserId);
	/**
	 * you want to unfollow someone
	 * @param userId
	 * @param userIdunfollowed
	 * @return
	 */
	boolean unfollowAction(String userId, String unfollowedUserId);
	/**
	 * the one who follow you, but you don`t want him to be your fans, you can remove him.
	 * @param userId
	 * @param userIddelete
	 * @return
	 */
	boolean removeFollowerAction(String userId, String removedUserId);
	
	/**
	 * given a userId, try to find what is the relation of targetUser for him
	 * so here, A is user, B is targetUser
	 * when a user login his account, A is himself, B can be any one he want to find relation with him
	 * 4 types,
	 * follower, B is the follower of A, means B is a fans of A
	 * following, B is the following of A, means A is a fans of B, A is interest in B
	 * ff, A follow B and B follow A.
	 * NO, just means no relation
	 * @param userId
	 * @param targetUserId
	 * @return
	 */
	RelationType getUserRelationType(String userId, String targetUserId);
}
