package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.Comment;
import cn.edu.bjtu.weibo.model.User;

public interface LikeMessageService {
	public boolean LikeMessage(User user ,Comment comment);
}
