package cn.edu.bjtu.weibo.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import cn.edu.bjtu.weibo.service.SearchTopicService;

@Component
public class EveryQuarterJob {
	@Autowired
	private SearchTopicService searchTopicService;
	
	@Scheduled(fixedDelay = 15*60*1000)
	public void startTask() {
		this.searchTopicService.updateSearchIndex();
	}
}
