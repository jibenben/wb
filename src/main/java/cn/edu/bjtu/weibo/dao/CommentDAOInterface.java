package cn.edu.bjtu.weibo.dao;

public interface CommentDAOInterface {
	//��ȡ��������
	String getComment(String commentid);
	
	//��ȡ�����ߵ��û�ID
	String getOwner(String commentid);
	
	//��ȡʱ��
	String getTime(String commentid);
}
