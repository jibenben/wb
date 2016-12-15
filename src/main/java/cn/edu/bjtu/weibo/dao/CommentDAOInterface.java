package cn.edu.bjtu.weibo.dao;

public interface CommentDAOInterface {
	//获取评论内容
	String getComment(String commentid);
	
	//获取评论者的用户ID
	String getOwner(String commentid);
	
	//获取时间
	String getTime(String commentid);
}
