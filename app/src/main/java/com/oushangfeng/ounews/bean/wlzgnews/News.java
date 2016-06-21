package com.oushangfeng.ounews.bean.wlzgnews;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("item")
public class News {


	private String title;
	private String summary;
	private String image_url;
	private int url;
	private String date;
	private String source;
//	</date><source>
	private String br;
	//这个暂时没有
	private int type;
	
	
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getUrl() {
		return url;
	}
	public void setUrl(int url) {
		this.url = url;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
}
