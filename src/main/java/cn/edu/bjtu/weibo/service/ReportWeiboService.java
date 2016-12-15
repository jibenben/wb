package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.User;
import cn.edu.bjtu.weibo.model.Weibo;

/*
when a user will report the weibo 
*/
public interface ReportWeiboService {
	 boolean ReportWeibo(int UserId,int weiboId);
}
