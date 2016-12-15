package cn.edu.bjtu.weibo.service;

import java.util.List;

/**
 * When the user search some keyword in the weibo content.
 * 
 * @author Liu Jinfeng
 *
 */
public interface SearchWeiboContentService {
	/**
	 * it needs pagination
	 * @param keyword
	 * @return
	 */
	List<?> getSearchedWeiboIdList(String keyword, int pageIndex, int numberPerPage);
}
