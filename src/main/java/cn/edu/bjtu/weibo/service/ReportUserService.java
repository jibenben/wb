package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.User;

/*
when a user report esle user

*/
public interface ReportUserService {
	/*
	the secound para is the id by report
	
	*/
	 boolean ReportUser(int UserId,int UserIdreport);
}
