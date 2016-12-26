package cn.edu.bjtu.weibo.dao;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;

public interface UserDAO {
	
	/**
	 * Create a new user profile in the system, the userId will be created or get from loginDAO
	 * @param user
	 * @return new User id
	 */
	boolean insertNewUserProfile(String userId, User user);
	/**
	 * delete a user from the system
	 * @param userId
	 * @return
	 */
	boolean deleteUser(String userId);
	/**
	 * return the user
	 * @param userId
	 * @return
	 */
	User getUser(String userId);
	
	List<String> getTotalUserId();
	int getTotalUserNumber();
	/**
	 * user profile related
	 */
	String getUserName(String userId);
	boolean updateUserName(String userId, String userName);
	
	String getUserIntroduction(String userId);
	boolean updateUserIntroduction(String userId, String introduction);
	
	String getUserPhoneNumber(String userId);
	boolean updateUserPhoneNumber(String userId, String phoneNumber);
	
	String getUserAge(String userId);
	boolean updateUserAge(String userId, String age);
	
	String getUserEmail(String userId);
	boolean updateUserEmail(String userId, String email);
	
	String getUserQQ(String userId);
	boolean updateUserQQ(String userId, String qq);
	
	String getUserEducation(String userId);
	boolean updateUserEducation(String userId, String education);
	
	String getLocation(String userId);
	String updateLocation(String userId, String location);
	
	String getBirthday(String userId);
	String updateBirthday(String userId, String birthday);
	
	String getSex(String userId);
	String updateSex(String userId, String sex);
	
	String getLastWeiboId(String userId);
	String updateLastWeiboId(String userId, String weiboId);
	
	/**
	 * user send or delete weibo, the number the weibo of this user will automaticlly updated.
	 * @param userId
	 * @param weiboId
	 * @return
	 */
	boolean insertWeibo(String userId, String weiboId);
	boolean deleteWeibo(String userId, String weiboId);
	List<String> getWeibo(String userId, int pageIndex, int pagePerNumber);
	int getWeiboNumber(String userId);
	
	/**
	 * add or delete follower from the user , the number the follower of this user will automatically updated.
	 */
	boolean insertFollower(String userId, String followerId);
	boolean deleteFollower(String userId, String followerId);
	List<String> getFollowers(String userId, int pageIndex, int pagePerNumber); 
	int getFollowerNumber(String userId);
	
	/**
	 * add or delete following from the user , the number the following of this user will automatically updated.
	 * @param userId
	 * @param followingId
	 * @return
	 */
	boolean insertFollowing(String userId, String followingId);
	boolean deleteFollowing(String userId, String followingId);
	List<String> getFollowing(String userId, int pageIndex, int pagePerNumber);
	int getFollowingNumber(String userId);
		
	/**
	 * add or delete forward from the user
	 * @param userId
	 * @param weiboId
	 * @return
	 */
	boolean insertForwardWeibo(String userId, String weiboId);
	boolean deleteForwardWeibo(String userId, String weiboId);
	List<String> getForwardWeibo(String userId, int pageIndex, int pagePerNumber);  
	
	/**
	 * like weibo related
	 */
	boolean insertLikeWeibo(String userId, String weiboId);
	boolean deleteLikeWeibo(String userId, String weiboId);
	List<String> getLikeWeibo(String userId, int pageIndex, int pagePerNumber);  
	
	/**
	 * comment on weibo related
	 */
	boolean insertCommentOnWeibo(String userId, String weiboId);
	boolean deleteCommentOnWeibo(String userId, String weiboId);
	List<String> getCommentOnWeibo(String userId, int pageIndex, int pagePerNumber);  
	
	
	/**
	 * comment on comment related
	 */
	List<String> getCommentOnComment(String userId, int pageIndex, int pagePerNumber);  
	boolean insertCommentOnComment(String userId, String commentId);
	boolean deleteCommentOnComment(String userId, String commentId);
	
	
	/**
	 * favorite info related
	 */
	boolean insertFavoriteWeibo(String userId, String weiboId);
	boolean deleteFavoriteWeibo(String userId, String weiboId);
	List<String> getFavoriteWeibo(String userId, int pageIndex, int pagePerNumber);
	
	/**
	 * Group info related
	 */
	boolean insertNewGroup(String userId, String group);
	boolean deleteGroup(String userId, String group);
	List<String> getGroups(String userId);
	boolean insertUserToGroup(String userId, String group, String followingUserId);
	boolean deleteUserFromGroup(String userId, String group, String followingUserId);
	List<String> getUsersByGroup(String userId, String group, int pageIndex, int pagePerNumber);
	
	
	/*
	 * User msg @ me related
	 */
	List<String> getWeiboAtMeMessage(String userId, int pageIndex, int pagePerNumber);
	List<String> getCommentAtMeMessage(String userId, int pageIndex, int pagePerNumber);
	int getNewComingContentAtMeMessageNumber(String userId);
	boolean insertWeiboAtMe(String fromUserId, String toUserId, String weiboId);
	boolean insertCommentAtMe(String userId, String commentId);
	boolean deleteWeiboAtMe(String userId, String weiboId);
	boolean deleteCommentAtMe(String userId, String commentId);
	
	/*
	 * User msg comment me related
	 */
	List<String> getWeiboCommentMeMessage(String userId, int pageIndex, int pagePerNumber);
	List<String> getCommentCommentMeMessage(String userId, int pageIndex, int pagePerNumber);
	int getNewComingContentCommentMeMessageNumber(String userId);
	boolean insertWeiboCommentMe(String userId, String weiboId);
	boolean insertCommentCommentMe(String userId, String commentId);
	boolean deleteWeiboCommentMe(String userId, String weiboId);
	boolean deleteCommentCommentMe(String userId, String commentId);
	
	/*
	 * User msg like me related
	 */
	List<String> getWeiboLikeMeMessage(String userId, int pageIndex, int pagePerNumber);
	List<String> getCommentLikeMeMessage(String userId, int pageIndex, int pagePerNumber);
	int getNewComingContentLikeMeMessageNumber(String userId);
	boolean insertWeiboLikeMe(String fromUserId, String toUserId, String weiboId);
	boolean insertCommentLikeMe(String fromUserId, String toUserId, String commentId);
	boolean deleteWeiboLikeMe(String fromUserId, String toUserId, String weiboId);
	boolean deleteCommentLikeMe(String fromUserId, String toUserId, String commentId);
	
	/*
	 * user avatar related
	 */
	
	List<String> getUserAvatars(String userId, int pageIndex, int pagePerNumber);
	String getCurrentUserAvatar(String userId);
	boolean setCurrentUserAvatar(String userId,String imgid);
	boolean insertUserAvatar(String userId, String picId);
	boolean deleteUserAvatar(String userId, String picId);
}
