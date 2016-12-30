package cn.edu.bjtu.weibo.dao;

import java.util.List;

import cn.edu.bjtu.weibo.model.Like;
/**
 * 
 * @author ji
 *
 */
public interface LikeDAO {
	/**
	 * when you insert  a like action
	 * @param userId
	 * @param userAcitonId
	 * @param weiboIdorCommentId
	 * @param time
	 * @return
	 */
	boolean insert(String userId,String userAcitonId,String weiboIdorCommentId,String time);
	/**
	 * when you delete a like action
	 * @param userId
	 * @param userAcitonId
	 * @param weiboIdorCommentId
	 * @return
	 */
	boolean delete(String userId,String userAcitonId,String weiboIdorCommentId);
	/**
	 * when you need query all like information
	 * @param userId
	 * @return
	 */
	List<Like> queryAll(String userId);
	/**
	 * when you need query some like information 
	 * @param userId
	 * @param pageIndex
	 * @param pageNumber
	 * @return
	 */
	List<Like> query(String userId,int pageIndex,int pageNumber);
	
}
