package cn.edu.bjtu.weibo.service;

/**
 * When some action happened, notify the user in his message box
 * 
 * @author Liu Jinfeng
 *
 */

public interface MessageToMeService {
	/**
	 * when a user @ another user, it will alter that user.
	 * @param fromUserId
	 * @param toUserId
	 * @return
	 */
	boolean atMeInform(int fromUserId ,int toUserId);
	/**
	 * When a user comment another user`s comment, that user should be notified
	 * @param fromUserId
	 * @param toUserId
	 * @param commentId
	 * @param originalCommentId
	 * @return
	 */
	boolean commentMyCommentInform(int fromUserId, int toUserId, int commentId, int originalCommentId);
	/**
	 * When a user comment another user`s weibo, that user should be notified
	 * @param fromUserId
	 * @param toUserId
	 * @param commentId
	 * @param weiboId
	 * @return
	 */
	boolean commentMyWeiboInform(int fromUserId, int toUserId, int commentId, int weiboId);
	/**
	 * When a user like some user`s weibo, that user should be notified
	 * @param fromUserId
	 * @param toUserId
	 * @param weiboId
	 * @return
	 */
	boolean likeMyWeiboInform(int fromUserId, int toUserId, int weiboId);
	/**
	 * When a user like some user`s comment, that user should be notified
	 * @param fromUserId
	 * @param toUserId
	 * @param commentId
	 * @return
	 */
	boolean likeMyCommentInform(int fromUserId, int toUserId, int commentId);
}
