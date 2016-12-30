package cn.edu.bjtu.weibo.service;

import java.util.List;

public interface LikeMyContentService {
	List<String> getLikeMyContentList(String userId, int pageIndex, int numberPerPage);
}
