package cn.edu.bjtu.weibo.service;

import java.util.List;

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
	List<?> getSearchedWeiboIdList(int userId, String keyword, int pageIndex, int numberPerPage);
}
