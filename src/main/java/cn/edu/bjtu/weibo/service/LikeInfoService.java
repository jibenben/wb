package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;
import cn.edu.bjtu.weibo.model.Weibo;

public interface LikeInfoService {
	public List<Weibo> LikeWeiboList(User user);
}
