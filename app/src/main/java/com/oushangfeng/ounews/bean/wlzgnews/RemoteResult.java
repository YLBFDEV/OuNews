package com.oushangfeng.ounews.bean.wlzgnews;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("result")
public class RemoteResult {
	@XStreamAlias("hot")
	private FocusNews focusNews;
	@XStreamAlias("items")
	private ListNews listNews;

	public FocusNews getFocusNews() {
		return focusNews;
	}

	public void setFocusNews(FocusNews focusNews) {
		this.focusNews = focusNews;
	}

	public ListNews getListNews() {
		return listNews;
	}

	public void setListNews(ListNews listNews) {
		this.listNews = listNews;
	}

}
