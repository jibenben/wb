package cn.edu.bjtu.weibo.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import cn.edu.bjtu.weibo.model.Picture;

/**
 * this can be helpful for both upload picture and avatar
 * 
 * it is the basic service for all upload picture related function.
 * 
 * @author Liu Jinfeng
 *
 */

public interface PictureService {
	/**
	 * it will be called by weibopicture servcie and useravatarservice.
	 * @param multipartFile
	 * @return
	 */
	List<String> uploadPicture(MultipartFile multipartFile);
	
	Picture getPicture(String picId);
}
