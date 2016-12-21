package cn.edu.bjtu.weibo.dao;

import java.util.List;

import cn.edu.bjtu.weibo.model.Topic;
/**
 * this is the data about topic
 * @author ji
 *
 */
public interface TopicDAO {
	
	/**
	 * insert a new topic 
	 * @param content (the topic content)
	 * @param UserId (the id of user who create topic)
	 * @param date 
	 * @param WeiboId(the id of weibo which contains the topic )
	 * @return
	 */
	 boolean insertNewTopic(String content,String UserId,String date,String WeiboId);
	/**
	 * 
	 * @param topicid
	 * @param pageIndex
	 * @param pagePerNumber
	 * @return
	 */
	List<String> getAllWeibo(String topicid,int pageIndex, int pagePerNumber);
	/**
	 * 
	 * @param topicid
	 * @param pageIndex
	 * @param pagePerNumber
	 * @return
	 */
	List<String> getAllComment(String topicid,int pageIndex, int pagePerNumber);
	/**
	 * 
	 * @param pageIndex
	 * @param pagePerNumber
	 * @return
	 */
	List<String> getAllTopic(int pageIndex,int pagePerNumber);
	/**
	 * 
	 * @param topicid
	 * @return
	 */
	String getContent(String topicid);
	/**
	 * 
	 * @param topicid
	 * @param weiboId
	 * @return
	 */
	boolean insertWeibo(String topicid,String weiboId);
	/**
	 * 
	 * @param topicid
	 * @param commentid
	 * @return
	 */
	boolean insertComment(String topicid,String commentid);
	/**
	 * 
	 * @param topicid
	 * @return
	 */
	int getHotOfTopic(String topicid);
}
 