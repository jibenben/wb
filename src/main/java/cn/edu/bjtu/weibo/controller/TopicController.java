package cn.edu.bjtu.weibo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.bjtu.weibo.model.Topic;

@RestController
@RequestMapping("/t")
public class TopicController {
	@RequestMapping(value = "/topic")
	public List<Topic> getAllTopic() {
		List<Topic> topicList = new ArrayList<Topic>();
		Topic topic1 = new Topic();
		topic1.setDate("2016/12/26 10:10:10");
		topic1.setOwner("xiaoming");
		topic1.setTopic(" •µÆ¥Û’Ω");
		topicList.add(topic1);
		
		Topic topic2 = new Topic();
		topic2.setDate("2016/12/26 12:10:12");
		topic2.setOwner("xiaoming");
		topic2.setTopic("2017¥∫‘À");
		topicList.add(topic2);
		return topicList;
	}
}
