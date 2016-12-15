package cn.edu.bjtu.weibo.dao;

import java.util.List;

import cn.edu.bjtu.weibo.model.Weibo;

public interface WeiboDAOInterface {
	//����һ����΢��
	public boolean insertNewWeibo(Weibo w);
	
	//ɾ��һ��΢��
	public boolean deleteWeibo(String weiboId);
	
	//��ȡĳ��΢���ķ�����
	public String getOwner(String weiboId);
	
	//��ȡ΢������
	public String getContent(String weiboId);
	
	//��ȡ΢������ʱ��
	public String getTime(String weiboId);
	
	//��ȡ΢����ͼƬԭͼ���ӵ�List
	public List<String> getWeiboPicurlOr(String weiboId);
	
	//��ȡ΢����ͼƬ����ͼ���ӵ�List
	public List<String> getWeiboPicurlTh(String weiboId);
	
	//��ȡ��������
	public String getLikeNumber(String weiboId);
	
	//��ȡ��������
	public String getCommentNumber(String weiboId);
	
	//ת������
	public String getForwardNumber(String weiboId);
	
	//��ȡ���޹����û���Id��List
	public List<String> getLikeLIst(String weiboId);  //����һ��UserId��List
	
	//��ȡת�������û���Id��List
	public List<String> getForwardList(String weiboId);  //����һ��UserId��List
	
	//��ȡ���۹����û���Id��List
	public List<String> getCommentList(String weiboId);  //����һ��CommentId��List
}
