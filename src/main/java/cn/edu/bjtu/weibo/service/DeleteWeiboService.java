package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.User;
import cn.edu.bjtu.weibo.model.Weibo;

public interface DeleteWeiboService {
	public boolean DeleteWeibo(User user,Weibo weibo);
}
