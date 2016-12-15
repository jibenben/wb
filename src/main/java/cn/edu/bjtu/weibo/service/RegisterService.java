package cn.edu.bjtu.weibo.service;

/*
Register  a user
*/
public interface RegisterService {
	/*
	username
	password
	*/
	Boolean registerNewUser(String username, String password);
}
