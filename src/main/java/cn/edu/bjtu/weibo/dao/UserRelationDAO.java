package cn.edu.bjtu.weibo.dao;

import cn.edu.bjtu.weibo.model.RelationType;

public interface UserRelationDAO {
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
	RelationType getRelation(String userId, String targetUserId);
}
