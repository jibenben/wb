package cn.edu.bjtu.weibo.service;

import java.util.List;

public interface BanedKeywordService {
	/**
	 * add baned keyword, it is used by backend
	 * @param word
	 * @return
	 */
	boolean addBanedKeyword(String word);
	/**
	 * remove baned keyword, it is used by backend
	 * @param word
	 * @return
	 */
	boolean removeBanedKeyword(String word);
	/**
	 * 
	 * @return
	 */
	List<String> getAllWord();
}
