package cn.edu.bjtu.weibo.service;

import java.util.List;

/**
 * Search some keywords in the topic.
 * 
 * @author Liu Jinfeng
 *
 */

public interface SearchTopicService {
	List<?> getSearchedTopicIdList(String topic);
}
