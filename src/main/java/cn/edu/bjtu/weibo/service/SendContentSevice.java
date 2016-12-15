package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.BaseContent;

/**
 * this work for both weibo and comment, usually some one like to upload some picture in the same time
 * but it is uploadpicture`s responsibility.
 * @author Liu Jinfeng
 *
 */
public interface SendContentSevice {
	boolean sendWeiboOrComment(BaseContent weiboOrComment);
}
