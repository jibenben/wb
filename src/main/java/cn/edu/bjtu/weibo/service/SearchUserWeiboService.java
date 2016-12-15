package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.WeiboSR;

/**
 * Search something in some user`s weibo content.
 * 
 * @author Liu Jinfeng
 *
 */
public interface SearchUserWeiboService {
	/**
	 * it needs pagination
	 * @param userId
	 * @return
	 */
	List<WeiboSR> getSearchedUserWeiboList(int userId, String keyword, int pageIndex, int numberPerPage);
}
