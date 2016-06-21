package com.oushangfeng.ounews.module.wlzgnews.view;

import com.oushangfeng.ounews.base.BaseView;
import com.oushangfeng.ounews.bean.wlzgnews.RemoteResult;
import com.oushangfeng.ounews.common.DataLoadType;

/**
 * ClassName: INewsListView<p>
 * Author: oubowu<p>
 * Fuction: 新闻列表视图接口<p>
 * CreateDate: 2016/2/18 14:42<p>
 * UpdateUser: <p>
 * UpdateDate: <p>
 */
public interface INewsListView extends BaseView {

    void updateNewsList(RemoteResult data, @DataLoadType.DataLoadTypeChecker int type);

}
