package com.oushangfeng.ounews.module.wlzgnews.model;

import com.oushangfeng.ounews.bean.wlzgnews.RemoteResult;
import com.oushangfeng.ounews.callback.RequestCallback;
import com.oushangfeng.ounews.http.HostType;
import com.oushangfeng.ounews.http.manager.RetrofitManager;
import com.socks.library.KLog;

import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;

/**
 * ClassName: INewsListInteractorImpl<p>
 * Author: oubowu<p>
 * Fuction: 新闻列表Model层接口实现<p>
 * CreateDate: 2016/2/17 21:02<p>
 * UpdateUser: <p>
 * UpdateDate: <p>
 */
public class INewsListInteractorImpl implements INewsListInteractor<RemoteResult> {

    @Override
    public Subscription requestNewsList(final RequestCallback<RemoteResult> callback, final String id) {
        KLog.e("新闻列表：id=" + id);
        return RetrofitManager.getInstance(HostType.WLZG_NEWS).getWLZGNewsListObservable(id)
                .doOnSubscribe(new Action0() {
                    @Override
                    public void call() {
                        // 订阅之前回调回去显示加载动画
                        callback.beforeRequest();
                    }
                }).subscribeOn(AndroidSchedulers.mainThread()) // 订阅之前操作在主线程
                .doOnError(new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        KLog.e("错误时处理：" + throwable + " --- " + throwable.getLocalizedMessage());
                    }
                }).subscribe(new Subscriber<RemoteResult>() {
                    @Override
                    public void onCompleted() {
                        callback.requestComplete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        KLog.e(e.getLocalizedMessage() + "\n" + e);
                        callback.requestError(e.getLocalizedMessage() + "\n" + e);
                    }

                    @Override
                    public void onNext(RemoteResult neteastNewsSummaries) {

                        callback.requestSuccess(neteastNewsSummaries);
                    }
                });
    }
}
