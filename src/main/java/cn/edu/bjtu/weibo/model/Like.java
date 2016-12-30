package cn.edu.bjtu.weibo.model;

public class Like {
	public String userId;
	public String userActionId;
	public String WeiboIdOrCommentId;
	public String time;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserActionId() {
		return userActionId;
	}
	public void setUserActionId(String userActionId) {
		this.userActionId = userActionId;
	}
	public String getWeiboIdOrCommentId() {
		return WeiboIdOrCommentId;
	}
	public void setWeiboIdOrCommentId(String weiboIdOrCommentId) {
		WeiboIdOrCommentId = weiboIdOrCommentId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
