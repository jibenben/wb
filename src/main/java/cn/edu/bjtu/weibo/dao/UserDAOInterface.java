package cn.edu.bjtu.weibo.dao;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;


public interface UserDAOInterface {
	//������û�
	public boolean insertNewUser(User user);
	
	//�����û�״̬
	public boolean setState(String id, boolean s);
	
	//����
	public String getName(String id);
	public String updateName(String id);
	
	//����
	public String getPassword(String id);
	public String updatePassword(String id);
	
	//λ��
	public String getLocation(String id);
	public String updateLocation(String id);
	
	//��������
	public String getBirthday(String id);
	public String updateBirthday(String id);
	
	//�Ա�
	public String getSex(String id);
	public String updateSex(String id);
	
	//���·���΢����ʱ��
	public String getLastTime(String id);
	public String updateLastTime(String id);
	
	//���˷�����΢������
	public String getWeiBoNumber(String id);
	public String updateWeiBoNumber(String id);
	
	//��˿����
	public String getFansNumber(String id);
	public String updateFansNumber(String id);
	
	//��ע��������
	public String getAttentionNumber(String id);
	public String updateAttentionNumber(String id);
	
	//����һ����ŷ�˿��UserID��List
	public List<String> getFans(String id);  
	public boolean insertFans(String id);
	public boolean deleteFans(String id);
	
	//����һ����Ź�ע���˵�UserID��List
	public List<String> getAttention(String id);  
	public boolean insertAttentions(String id);
	public boolean deleteAttentions(String id);
	
	public List<String> getPircurlOr(String id);  //����һ��PircurlOr��List
	public List<String> getPicurlTh(String id);  //����һ��PicurlTh��List
	public boolean insertPicurl(String id); //ͬʱ����ͼƬ��ԭͼ������url
	public boolean deletePicurl(String id); //ͬʱɾ��ͼƬ��ԭͼ������url
	
	public List<String> getLikePicurlOr(String id);  //����һ��LikePircurlOr��List
	public List<String> getLikePicurlTh(String id);  //����һ��LikePircurlTh��List
	public boolean insertLikePicurl(String id);  //ͬʱ������޹���ͼƬ��ԭͼ������url
	public boolean deleteLikePicurl(String id);  //ͬʱɾ�����޹���ͼƬ��ԭͼ������url
	
	//����һ������Ÿ��û�ת������WeiboID��List
	public List<String> getForwordWeibo(String id); 
	public boolean insertForwordWeibo(String id);
	public boolean deleteForwordWeibo(String id);
	
	//����һ������Ÿ��û����޹���WeiboID��List
	public List<String> getLikeWeibo(String id);  
	public boolean insertLikeWeibo(String id);
	public boolean deleteLikeWeibo(String id);
	
	//����һ������Ÿ��û����۹���WeiboID��List
	public List<String> getCommentWeibo(String id);  
	public boolean insertCommentWeibo(String id);
	public boolean deleteCommentWeibo(String id);
	
}
