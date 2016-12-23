package cn.edu.bjtu.weibo.dao;

import java.util.List;

public interface CommentDAO {
	/**
	 * 
	 * @param commentContent
	 * @param becommentedWeiboOrComment
	 * @param owner
	 * @param time
	 * @return the id 
	 */
	
	String  insert(String commentContent,String becommentedWeiboOrComment,String owner,String time );
	boolean updateNumberofComment();
	String getCommentNumber();
	
	boolean updateLikeNumber();
	boolean updateLikeList(String commentid,String userId);
	
	boolean updateCommentNUmber();
	boolean updateCOmmentList(String commentid,String commemtidComment);
	
	String getContent(String commentId);
	List<String> getAtUsersInComment(String commentId);
	List<String> getTpoicInComment(String commentId);
	String getBeCommentedWeiboOrCommentId(String commentId);
	String getLikeNumber(String commentId);
	String getCommentNumber(String commentId);
	
	List<String> getLikeList(String commentId);
	List<String> getCommentList(String commentId);
	
	boolean deleteComment(String commentId);
	
	boolean deleteCommentFromComment(String fromCommentId, String commentId);
	
	String getOwner(String commentid);
	String getTime(String commentid);
	
}
