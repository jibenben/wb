package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;
import cn.edu.bjtu.weibo.model.Weibo;

/**
 * Try to help find popular weibo belong to some user
 * 
 * @author Liu Jinfeng
 *
 */

public interface HotUserWeiboService {
	/**
	 * 
	 * @param user
	 * @param pageIndex
	 * @param numberPerPage
	 * @return
	 */
	List<Weibo> HotUserWeiboList(User user, int pageIndex, int numberPerPage);
}
