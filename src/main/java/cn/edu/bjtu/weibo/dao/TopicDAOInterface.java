package cn.edu.bjtu.weibo.dao;

import java.util.List;

import cn.edu.bjtu.weibo.model.Topic;

public interface TopicDAOInterface {
	//新增一个话题
	public boolean insertNewTopic(Topic t);
	
	//获取该话题下的用户Id的List
	List<String> getUserList(String topicid);
	
	//获取话题的内容
	String getContent(String topicid);
	
	//获取话题的用户数量
	String getTopicUserNumber(String topicid);
	
	//获取话题的建立者
	String getOwner(String topicid);
	
	//获取话题的时间
	String getTime(String topicid);
}
 