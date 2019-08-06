package com.jfinal.qyweixin.sdk.msg.send;

import java.util.HashMap;
import java.util.Map;

/**
 * 图片消息
 * @author Javen
 *
 */
public class QiYeImageMsg extends QiYeBaseMsg {
	private String media_id;
	
	private Map<String, String> image;
	
	public Map<String, String> getImage() {
		return image;
	}

	public void setImage(Map<String, String> image) {
		this.image = image;
	}

	public String getMedia_id() {
		return media_id;
	}

	public void setMedia_id(String mediaId) {
		media_id = mediaId;
	}

	public QiYeImageMsg(String mediaId) {
		media_id = mediaId;
		this.msgtype=MessageType.image.name();
	}
	public QiYeImageMsg() {
		this.msgtype=MessageType.image.name();
	}
	
}
