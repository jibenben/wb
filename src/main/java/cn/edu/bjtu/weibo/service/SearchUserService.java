package cn.edu.bjtu.weibo.service;

import java.util.List;

/**
 * When user want to search some user according to the given name
 * 
 * @author Liu Jinfeng
 *
 */

public interface SearchUserService {
	/**
	 * it needs pagination
	 * @param username
	 * @param pageIndex
	 * @param numberPerPage
	 * @return
	 */
	List<?> getSearchedUserIdList(String username, int pageIndex, int numberPerPage);
}
