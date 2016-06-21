package com.oushangfeng.ounews.bean.wlzgnews;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("result")
public class WelcomeBean {

	private String image_url;
	private boolean is_update;
	private float version;
	
	public float getVersion() {
		return version;
	}
	public void setVersion(float version) {
		this.version = version;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public boolean isIs_update() {
		return is_update;
	}
	public void setIs_update(boolean is_update) {
		this.is_update = is_update;
	}
	
	
}
