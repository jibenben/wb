package cn.edu.bjtu.weibo.service;

<<<<<<< HEAD
import cn.edu.bjtu.weibo.model.User;

/*
when a user report esle user

*/
public interface ReportUserService {
	/*
	the secound para is the id by report
	
	*/
	 boolean ReportUser(int UserId,int UserIdreport);
=======
public interface ReportUserService {
	boolean ReportUser(int userId, int reportedUserId);
>>>>>>> 1c854f0a8cc65c8bb7dce631d3eecd7b36f3f61a
}
