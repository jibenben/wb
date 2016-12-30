package cn.edu.bjtu.weibo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bjtu.weibo.dao.UserDAO;
import cn.edu.bjtu.weibo.service.LikeMyContentService;

@Service("likeMyContentService")
public class LikeMyContentServiceImpl implements LikeMyContentService{
	@Autowired
	private UserDAO userDAO;
	
	public List<String> getLikeMyContentList(String userId, int pageIndex, int numberPerPage)
	{
		return userDAO.getContentLikeMeMessage(userId, pageIndex, numberPerPage);
	}
}
