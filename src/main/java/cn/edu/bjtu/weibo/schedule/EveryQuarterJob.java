package cn.edu.bjtu.weibo.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EveryQuarterJob {
	
	@Scheduled(fixedDelay = 15*60*1000)
	public void startTask() {
	}
}
