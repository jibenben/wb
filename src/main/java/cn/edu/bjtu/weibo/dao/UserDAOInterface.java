package cn.edu.bjtu.weibo.dao;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;


public interface UserDAOInterface {
	//添加新用户
	public boolean insertNewUser(User user);
	
	//设置用户状态
	public boolean setState(String id, boolean s);
	
	//名称
	public String getName(String id);
	public String updateName(String id);
	
	//密码
	public String getPassword(String id);
	public String updatePassword(String id);
	
	//位置
	public String getLocation(String id);
	public String updateLocation(String id);
	
	//出生日期
	public String getBirthday(String id);
	public String updateBirthday(String id);
	
	//性别
	public String getSex(String id);
	public String updateSex(String id);
	
	//最新发布微博的时间
	public String getLastTime(String id);
	public String updateLastTime(String id);
	
	//个人发过的微博个数
	public String getWeiBoNumber(String id);
	public String updateWeiBoNumber(String id);
	
	//粉丝数量
	public String getFansNumber(String id);
	public String updateFansNumber(String id);
	
	//关注的人数量
	public String getAttentionNumber(String id);
	public String updateAttentionNumber(String id);
	
	//返回一个存放粉丝的UserID的List
	public List<String> getFans(String id);  
	public boolean insertFans(String id);
	public boolean deleteFans(String id);
	
	//返回一个存放关注的人的UserID的List
	public List<String> getAttention(String id);  
	public boolean insertAttentions(String id);
	public boolean deleteAttentions(String id);
	
	public List<String> getPircurlOr(String id);  //返回一个PircurlOr的List
	public List<String> getPicurlTh(String id);  //返回一个PicurlTh的List
	public boolean insertPicurl(String id); //同时插入图片的原图和缩略url
	public boolean deletePicurl(String id); //同时删除图片的原图和缩略url
	
	public List<String> getLikePicurlOr(String id);  //返回一个LikePircurlOr的List
	public List<String> getLikePicurlTh(String id);  //返回一个LikePircurlTh的List
	public boolean insertLikePicurl(String id);  //同时插入点赞过的图片的原图和缩略url
	public boolean deleteLikePicurl(String id);  //同时删除点赞过的图片的原图和缩略url
	
	//返回一个存放着该用户转发过的WeiboID的List
	public List<String> getForwordWeibo(String id); 
	public boolean insertForwordWeibo(String id);
	public boolean deleteForwordWeibo(String id);
	
	//返回一个存放着该用户点赞过的WeiboID的List
	public List<String> getLikeWeibo(String id);  
	public boolean insertLikeWeibo(String id);
	public boolean deleteLikeWeibo(String id);
	
	//返回一个存放着该用户评论过的WeiboID的List
	public List<String> getCommentWeibo(String id);  
	public boolean insertCommentWeibo(String id);
	public boolean deleteCommentWeibo(String id);
	
}
