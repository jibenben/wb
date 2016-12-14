package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.User;
import cn.edu.bjtu.weibo.model.Weibo;
public interface LikeActionService {
	public boolean Like(User user ,Weibo weibo);
}
