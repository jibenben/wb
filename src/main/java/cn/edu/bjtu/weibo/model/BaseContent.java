package cn.edu.bjtu.weibo.model;

import java.util.List;

/**
 * BaseContent means it is the general definition of words contents.
 * it has contents, number of 'likes' and create date.
 * 
 * so weibo and its comments are special case of BaseContent. 
 * we extract similar common properties from each bring a lot of benefits.
 * 
 * one of the benefits is the search, for now search can index both weibo and its comment, unified now.
 * 
 * @author Liu Jinfeng
 *
 */

public class BaseContent {
	private String content;
	private int like;
	private String date;
	private int commentNumber;
	private String userId;
	
	private List<String> atUserIdList;
	private List<String> topicIdList;
	
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
	
	public int getCommentNumber() {
		return commentNumber;
	}

	public void setCommentNumber(int commentNumber) {
		this.commentNumber = commentNumber;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
