package cn.edu.bjtu.weibo.service;

/**
 * When user like some weibo or comment, he can use it.
 * @author Liu Jinfeng
 *
 */
public interface LikeActionService {
	
	/**
	 * Like weibo
	 * @param userId
	 * @param weiboId
	 * @return
	 */
	boolean LikeWeiboAction(int userId ,int weiboId);
	/**
	 * Like comment
	 * @param userId
	 * @param commentId
	 * @return
	 */
	boolean LikeCommentAction(int userId ,int commentId);
}
