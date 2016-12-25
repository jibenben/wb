package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;

/**
 * Use this service, you can classify your interested user you want to follow.
 * 
 * @author Liu Jinfeng
 *
 */

public interface UserFollowingGroupService {
	/**
	 * When the user want to follow another user, he can put that user into a new created group
	 * @param userId
	 * @param groupName
	 * @return
	 */
	boolean addToNewGroup(String userId, String otherUserId, String groupName);
	/**
	 * Add some user to existed group.
	 * @param userId
	 * @param otherUserId
	 * @param groupId
	 * @return
	 */
	boolean addToExistedGroup(String userId, String otherUserId, String groupName);
	/**
	 * Get all group names for display.
	 * @param userId
	 * @return
	 */
	List<String> getGroupNames(String userId);
	/**
	 * Get all users belong to some group
	 * @param groupId
	 * @return
	 */
	List<User> getUsersByGroup(String userId, String groupId, String pageIndex, String numberPerPage);
}
