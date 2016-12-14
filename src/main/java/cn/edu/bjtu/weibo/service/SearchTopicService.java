package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.Topic;

public interface SearchTopicService {
	public List<Topic> SearchTopic(String topic);
}
