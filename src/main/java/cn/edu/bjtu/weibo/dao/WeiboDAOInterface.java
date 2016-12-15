package cn.edu.bjtu.weibo.dao;

import java.util.List;

import cn.edu.bjtu.weibo.model.Weibo;

public interface WeiboDAOInterface {
	//插入一条新微博
	public boolean insertNewWeibo(Weibo w);
	
	//删除一条微博
	public boolean deleteWeibo(String weiboId);
	
	//获取某条微博的发送者
	public String getOwner(String weiboId);
	
	//获取微博内容
	public String getContent(String weiboId);
	
	//获取微博发送时间
	public String getTime(String weiboId);
	
	//获取微博中图片原图链接的List
	public List<String> getWeiboPicurlOr(String weiboId);
	
	//获取微博中图片缩略图链接的List
	public List<String> getWeiboPicurlTh(String weiboId);
	
	//获取点赞数量
	public String getLikeNumber(String weiboId);
	
	//获取评论数量
	public String getCommentNumber(String weiboId);
	
	//转发数量
	public String getForwardNumber(String weiboId);
	
	//获取点赞过的用户的Id的List
	public List<String> getLikeLIst(String weiboId);  //返回一个UserId的List
	
	//获取转发过的用户的Id的List
	public List<String> getForwardList(String weiboId);  //返回一个UserId的List
	
	//获取评论过的用户的Id的List
	public List<String> getCommentList(String weiboId);  //返回一个CommentId的List
}
