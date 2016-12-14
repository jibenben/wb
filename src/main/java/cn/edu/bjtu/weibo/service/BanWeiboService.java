package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.User;
import cn.edu.bjtu.weibo.model.Weibo;

public interface BanWeiboService {
	public boolean BanUser(User user,Weibo weibo);
}
