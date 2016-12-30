package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.BaseContent;
import cn.edu.bjtu.weibo.model.Topic;

/**
 * When a user want to see all the weibo or comment contain the topic, this service will help
 * @author Liu Jinfeng
 *
 */

public interface TopicService {
	/**
	 * 
	 * @param topicId
	 * @param pageIndex
	 * @param pagePerPage
	 * @return
	 */
	List<Topic> getWeiboOrCommentListUnderTopic(String topicId, int pageIndex, int pagePerPage);
}
