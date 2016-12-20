package cn.edu.bjtu.weibo.model;

import java.util.List;

public class Weibo extends BaseContent{
	private int forwardNumber;
	private List<String> atUserIdList;
	private List<String> topicIdList;

	public int getForwardNumber() {
		return forwardNumber;
	}

	public void setForwardNumber(int forwardNumber) {
		this.forwardNumber = forwardNumber;
	}

	public List<String> getAtUserIdList() {
		return atUserIdList;
	}

	public void setAtUserIdList(List<String> atUserIdList) {
		this.atUserIdList = atUserIdList;
	}

	public List<String> getTopicIdList() {
		return topicIdList;
	}

	public void setTopicIdList(List<String> topicIdList) {
		this.topicIdList = topicIdList;
	}
	
}
