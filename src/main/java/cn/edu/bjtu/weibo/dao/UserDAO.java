package cn.edu.bjtu.weibo.dao;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;

public interface UserDAO {
	String insertNewUser(User user);
	
	//设置用户状态
	boolean setState(String id, boolean s);
	
	String getUserName(String userId);
	boolean updateUserName(String userId, String userName);
	
	String getUserIntroduction(String userId);
	boolean updateUserIntroduction(String userId, String introduction);
	
	String getLocation(String userId);
	String updateLocation(String userId, String location);
	
	String getBirthday(String userId);
	String updateBirthday(String userId, String birthday);
	
	String getSex(String userId);
	String updateSex(String userId, String sex);
	
	String getLastWeiboId(String userId);
	String updateLastWeiboId(String userId, String weiboId);
	
	String getWeiboNumber(String userId);
	String updateWeiboNumber(String userId, String weiboNumber);
	
	String getFollowerNumber(String userId);
	String updateFollowerNumber(String userId, String followerNumber);
	
	String getFollowingNumber(String userId);
	String updateFollowingNumber(String userId, String followeingNumber);
	
	
	List<String> getFollowers(String userId);  //返回一个UserID的List
	boolean insertFollower(String userId, String followerId);
	boolean deleteFollower(String userId, String followerId);
	
	List<String> getFollowing(String userId);  //返回一个UserID的List
	boolean insertFollowing(String userId, String followingId);
	boolean deleteFollowing(String userId, String followingId);
	
	List<String> getPircurlOr(String userId);  //返回一个PircurlOr的List
	List<String> getPicurlTh(String userId);  //返回一个PicurlTh的List
	boolean insertPicurl(String userId, String picId); //同时插入图片的原图和缩略
	boolean deletePicurl(String userId, String picId); //同时删除图片的原图和缩略
	
	List<String> getLikePicurlOr(String userId);  //返回一个LikePircurlOr的List
	List<String> getLikePicurlTh(String userId);  //返回一个LikePircurlOr的List
	boolean insertLikePicurl(String userId, String picId);  //同时插入点赞过的图片的原图和缩略
	boolean deleteLikePicurl(String userId, String picId);  //同时删除点赞过的图片的原图和缩略
	
	List<String> getForwordWeibo(String userId);  //返回一个WeiboID的List
	boolean insertForwordWeibo(String userId, String weiboId);
	boolean deleteForwordWeibo(String userId, String weiboId);
	
	List<String> getLikeWeibo(String userId);  //返回一个WeiboID的List
	boolean insertLikeWeibo(String userId, String weiboId);
	boolean deleteLikeWeibo(String userId, String weiboId);
	
	List<String> getCommentWeibo(String userId);  //返回一个WeiboID的List
	boolean insertCommentWeibo(String userId, String weiboId);
	boolean deleteCommentWeibo(String userId, String weiboId);
	
}
