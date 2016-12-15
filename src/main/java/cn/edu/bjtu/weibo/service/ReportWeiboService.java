package cn.edu.bjtu.weibo.service;

/**
 * When some weibo contain illegal or unreal content, you can use this service to report this weibo to Admin
 * 
 * @author Liu Jinfeng
 *
 */
public interface ReportWeiboService {
	boolean reportWeibo(int userId,int weiboId);
}
