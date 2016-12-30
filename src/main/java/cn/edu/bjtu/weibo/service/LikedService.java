package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.Like;

import java.util.List;

/**
 * UserController中，需要有获取某一用户所有被点赞的信息的方法
 *
 * @author 王国桥
 */
public interface LikedService {
    /**
     * 获取某一用户全部被点赞的信息
     *
     * @param userId 用户Id
     * @return 被点赞信息的列表，其中Like对象包括userId, userActionId, WeiboIdOrCommentId, time
     */
    public List<Like> getAll(String userId);
}
