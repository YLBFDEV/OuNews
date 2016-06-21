package com.oushangfeng.ounews.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * Created by ylbf_ on 2016/4/5.
 */

public class WLZGNewsSummary {


    public RootResult result;

    public RootResult getResult() {
        return result;
    }

    public void setResult(RootResult result) {
        this.result = result;
    }

    @XStreamAlias("result")
    public static class RootResult {

        @XStreamAlias("hot")
        public HotNews hot;

        @XStreamAlias("items")
        public ItemsNews items;

        public HotNews getHot() {
            return hot;
        }

        public void setHot(HotNews hot) {
            this.hot = hot;
        }

        public ItemsNews getItems() {
            return items;
        }

        public void setItems(ItemsNews items) {
            this.items = items;
        }
    }

    @XStreamAlias("hot")
    public static class HotNews {

        @XStreamImplicit
        public List<ItemNews> item;

        public List<ItemNews> getItem() {
            return item;
        }

        public void setItem(List<ItemNews> item) {
            this.item = item;
        }
    }

    @XStreamAlias("items")
    public static class ItemsNews {

        @XStreamImplicit
        public List<ItemNews> item;

        public List<ItemNews> getItem() {
            return item;
        }

        public void setItem(List<ItemNews> item) {
            this.item = item;
        }
    }

    @XStreamAlias("item")
    public static class ItemNews {

        public String title;

        public String date;

        public String source;

        public String summary;

        public String url;

        public String image_url;


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

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

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }
    }

}
