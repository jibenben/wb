package cn.edu.bjtu.weibo.service;

/**
 * this can be helpful for both upload picture and avatar
 * @author Liu Jinfeng
 *
 */

public interface PictureService {
	/**
	 * not sure the pictureId is string or int
	 * @param pictureId
	 * @return
	 */
	boolean uploadPicture(String pictureId);
}
