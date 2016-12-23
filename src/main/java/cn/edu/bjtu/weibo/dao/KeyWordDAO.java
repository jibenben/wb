package cn.edu.bjtu.weibo.dao;

import java.util.List;

/**
 * 
 * @author ji
 *
 */
public interface KeyWordDAO {
	/**
	 * 
	 * @param word
	 * @return
	 */
	boolean insert(String word);
	/**
	 * 
	 * @return
	 */
	List<String> getAll(int pageIndex, int pagePerNumber);
	/**
	 * 
	 * @param word
	 * @return
	 */
	boolean delete(String word);
}
