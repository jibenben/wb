package cn.edu.bjtu.weibo.service;

import java.util.List;

/**
 * when you search user by user's name
 */
import cn.edu.bjtu.weibo.model.User;

public interface SearchUserService {
	 List<User> SearchUser(String username);
}
