package com.oushangfeng.ounews.bean.wlzgnews;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("item")
public class NewsContent {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
