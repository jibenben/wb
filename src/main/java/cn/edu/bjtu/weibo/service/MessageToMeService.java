package cn.edu.bjtu.weibo.service;

public interface MessageToMeService {
	boolean atMeInform(int fromUserId ,int toUserId);
	boolean commentMyWeiboInform(int fromUserId, int toUserId, int commentId);
	boolean likeMyWeiboInform(int fromUserId, int toUserId, int weiboId);
	boolean likeMyCommentInform(int fromUserId, int toUserId, int commentId);
}
