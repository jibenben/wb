package cn.edu.bjtu.weibo.dao;

import java.util.List;
import java.util.Map;

public interface RecommendDAO {
	
	//Weibo label related
	
	/**
	 * get weibo labels according to weibo id, which is useful for recommendation
	 * @param weiboId
	 * @return
	 */
	List<String> getWeiboLabels(String weiboId);
	
	/**
	 * set labels for a weibo
	 * @param weiboId
	 * @param label
	 * @return
	 */
	
	boolean setWeiboLabels(String weiboId, String[] labels);
	
	/**
	 * get user label
	 * @param userId
	 * @return
	 * String: label name
	 * Double: weight
	 */
	
	Map<String, Double> getUserLabel(String userId);
	
	/**
	 * set labels for user by user id
	 * @param userId
	 * @param labels, String for label name and double for label weight.
	 * @return
	 */
	boolean setUserLabels(String userId, Map<String, Double> labels);
	
	/**
	 * get recommend weibo list for some user
	 * @param userId
	 * @param pageIndex
	 * @param numberPerPage
	 * @return
	 */
	List<String> getRecommendWeiboList(String userId, int pageIndex, int numberPerPage);
	
	/**
	 * set recommmended weibo for some user
	 * @param userId
	 * @param weiboIdList
	 * @return
	 */
	boolean setRecommendWeiboList(String userId, List<String> weiboIdList);
	
	/**
	 * delete all recommended weibo for this user
	 * @param userId
	 * @return
	 */
	boolean deleteRecommendWeibo(String userId);
	/**
	 * 
	 * @param weiboId
	 * @param userId
	 * @return
	 */
	boolean deleteRcommendWeiboById(String weiboId,String userId);
	
	
}
