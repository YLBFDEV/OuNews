package com.oushangfeng.ounews.bean.wlzgnews;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("hot")
public class FocusNews {

	@XStreamImplicit
	private List<News> news;

	public List<News> getNews() {
		return news;
	}

	public void setNews(List<News> news) {
		this.news = news;
	}
	
}
