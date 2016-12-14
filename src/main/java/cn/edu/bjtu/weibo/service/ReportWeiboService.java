package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.User;
import cn.edu.bjtu.weibo.model.Weibo;

public interface ReportWeiboService {
	public boolean ReportWeibo(User user,Weibo weibo);
}
