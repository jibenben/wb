package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;
import cn.edu.bjtu.weibo.model.Weibo;

public interface RecommendWeiboservice {
	 List<Weibo> getRecommentWeibo(User user);
}
