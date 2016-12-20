package cn.edu.bjtu.weibo.model;

/**
 * Comment is one special case of BaseContent
 * 
 * currently, we leave it as it should be.
 * 
 * @author Liu Jinfeng
 *
 */
public class Comment extends BaseContent{
	private String commentOrWeiboId;

	public String getCommentOrWeiboId() {
		return commentOrWeiboId;
	}

	public void setCommentOrWeiboId(String commentOrWeiboId) {
		this.commentOrWeiboId = commentOrWeiboId;
	}
	
}
