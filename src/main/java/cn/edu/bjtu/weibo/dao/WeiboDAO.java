package cn.edu.bjtu.weibo.dao;

import java.util.List;

public interface WeiboDAO {
	 boolean updateNumberofWeibo();
	 String getWeiboNumber();
	 String getOwner(String weiboId);
	 boolean insertweibo(String userId,String content,String sendTime,List<String> list);
	 /**
	  * weibo content related
	  * @param weiboId
	  * @return
	  */
	 
	 String getContent(String weiboId);
	 boolean updateContent(String weiboId, String content);
	
	 String getsendTime(String weiboId);
	 
	 /**
	  * weibo attached picture related operation
	  * @param weiboId
	  * @return
	  */
	 
	 List<String> getWeiboPicurl(String weiboId);
	 boolean insertWeiboPicture(String weiboId, String picId);
	 
	 boolean deleteWeiboPicture(String weiboId, String picId);
	
	 /**
	  * weibo profile related
	  * @param weiboId
	  * @return
	  */
	 
	 String getLikeNumber(String weiboId);
	 boolean updateLikeNmuber(String weiboId);
	 boolean updateLikeList(String weiboId,String userId);
	
	 String getCommentNumber(String weiboId);
	 boolean updateCommentNumber(String weiboId);
	 boolean updateCommentList(String weiboId,String userId);
	 
	 String getForwardNumber(String weiboId);
	 boolean updateForwordNumber(String weiboId);
	 boolean updateForwardList(String weiboId,String userId);
	 /**
	  * weibo like, forward, comment related 
	  * @param weiboId
	  * @param pageIndex
	  * @param numberPerPage
	  * @return
	  */
	 
	 List<String> getLikeLst(String weiboId, int pageIndex, int numberPerPage);
	
	 List<String> getForwardList(String weiboId, int pageIndex, int numberPerPage);
	
	 List<String> getCommentList(String weiboId, int pageIndex, int numberPerPage);
	
	 boolean deleteWeibo(String weiboId);
	 
	 boolean deleteCommentFromWeibo(String fromWeiboId, String commentId);
	 
	 List<String> getAtUserList(String weiboId);
	 
	 List<String> getTopicList(String weiboId);
}
