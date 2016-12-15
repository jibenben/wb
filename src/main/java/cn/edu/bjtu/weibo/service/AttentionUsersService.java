package cn.edu.bjtu.weibo.service;

import java.util.List;
/**
 * When user try to view all the interested user for him
 * 
 * @author Liu Jinfeng
 *
 */
public interface AttentionUsersService {
	/**
	 * 
	 * @param userId
	 * @param pageIndex
	 * @param numberPerPage
	 * @return the userId collection for more flexible
	 */
	List<?> getAttentionUserIdList(int userId, int pageIndex, int numberPerPage);
}
