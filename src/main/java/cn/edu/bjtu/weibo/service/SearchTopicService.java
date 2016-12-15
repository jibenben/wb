package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.Topic;

/**
 * when you search topic by some keyword
 */
public interface SearchTopicService {
	List<Topic> SearchTopic(String topic);
}
