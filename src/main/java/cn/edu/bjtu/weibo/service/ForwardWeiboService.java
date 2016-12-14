package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;
import cn.edu.bjtu.weibo.model.Weibo;

public interface ForwardWeiboService {
	public int	getForwardNumber(Weibo weibo) ;//获取转发人数
	public List<User>	getForwardList(Weibo weibo); //转发列表
	public boolean	forwardWeiboAction(Weibo weibo,User user);//转发动作
}
