package cn.edu.bjtu.weibo.dao;

import java.util.List;

import cn.edu.bjtu.weibo.model.Topic;

public interface TopicDAOInterface {
	//����һ������
	public boolean insertNewTopic(Topic t);
	
	//��ȡ�û����µ��û�Id��List
	List<String> getUserList(String topicid);
	
	//��ȡ���������
	String getContent(String topicid);
	
	//��ȡ������û�����
	String getTopicUserNumber(String topicid);
	
	//��ȡ����Ľ�����
	String getOwner(String topicid);
	
	//��ȡ�����ʱ��
	String getTime(String topicid);
}
 