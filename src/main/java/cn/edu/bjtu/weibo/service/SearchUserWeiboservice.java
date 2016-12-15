package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;
import cn.edu.bjtu.weibo.model.Weibo;
/**
 * when user search the weibo in his weibo list
 */
public interface SearchUserWeiboservice {
	/**
	 * para userId
	 */
	 List<Weibo> SearchUserWeibo(int userId);
}
