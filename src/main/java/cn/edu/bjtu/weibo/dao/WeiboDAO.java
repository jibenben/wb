package cn.edu.bjtu.weibo.dao;

import java.util.List;

public interface WeiboDAO {
	 String getOwner(String weiboId);
	
	 String getContent(String weiboId);
	 boolean updateContent(String weiboId, String content);
	
	 String getTime(String weiboId);
	
	 List<String> getWeiboPicurlOr(String weiboId);
	
	 List<String> getWeiboPicurlTh(String weiboId);
	
	 String getLikeNumber(String weiboId);
	
	 String getCommentNumber(String weiboId);
	
	 String getForwardNumber(String weiboId);
	
	 List<String> getLikeLIst(String weiboId, int pageIndex, int numberPerPage);
	
	 List<String> getForwardList(String weiboId, int pageIndex, int numberPerPage);
	
	 List<String> getCommentList(String weiboId, int pageIndex, int numberPerPage);
	
	 boolean deleteWeibo(String WeiboId);
}
