package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.User;

/**
 * All the operations when user try to add or modify the person`s information
 * 
 * @author Liu Jinfeng
 *
 */

public interface UserProfileService {
	/**
	 * Create a new user
	 * @param user
	 * @return
	 */
	boolean createNewUser(User user);
	/**
	 * Get a user profile
	 * @param userId
	 * @return
	 */
	User getUserProfile(int userId);
	/**
	 * Update user name
	 * @param userId
	 * @param userName
	 * @return
	 */
	boolean updateUserName(int userId, String userName);
	/**
	 * Update user introduction
	 * @param userId
	 * @param introduction
	 * @return
	 */
	boolean updateUserIntroduction(int userId, String introduction);
	/**
	 * Update user phone number
	 * @param userId
	 * @param phoneNumber
	 * @return
	 */
	boolean updateUserPhoneNumber(int userId, String phoneNumber);
	/**
	 * Update user sex
	 * @param userId
	 * @param sex
	 * @return
	 */
	boolean updateUserSex(int userId, String sex);
	/**
	 * Update user age
	 * @param userId
	 * @param age
	 * @return
	 */
	boolean updateUserAge(int userId, int age);
	/**
	 * Update user birthday
	 * @param userId
	 * @param birthday
	 * @return
	 */
	boolean updateUserBirthday(int userId, String birthday);
	/**
	 * Update user location
	 * @param userId
	 * @param location
	 * @return
	 */
	boolean updateUserLocation(int userId, String location);
	/**
	 * Update user email address
	 * @param userId
	 * @param email
	 * @return
	 */
	boolean updateUserEmail(int userId, String email);
	/**
	 * Update user qq
	 * @param userId
	 * @param qq
	 * @return
	 */
	boolean updateUserQQ(int userId, String qq);
	/**
	 * Update user education
	 * @param userId
	 * @param education
	 * @return
	 */
	boolean updateUserEducation(int userId, String education);
	/**
	 * Update last weibo Id
	 * @param userId
	 * @param lastWeiboId
	 * @return
	 */
	boolean updateUserLastWeiboId(int userId, String lastWeiboId);
}
