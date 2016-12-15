package cn.edu.bjtu.weibo.service;

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
	 * check if a weiboContent contain baned keyword, if true, this weibo won`t be sended.
	 * and also inform user to notice.
	 * @param word
	 * @return
	 */
	boolean isBanedKeywordInside(String weiboContent);
}
