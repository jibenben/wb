package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.WeiboSR;

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
	List<WeiboSR> getSearchedWeiboList(String keyword, int pageIndex, int numberPerPage);
}
