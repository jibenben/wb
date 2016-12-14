package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;
import cn.edu.bjtu.weibo.model.Weibo;

public interface WeiboListService {
	public List<Weibo> WeiboList(User user);
	public List<Weibo> WeiboList();
}
