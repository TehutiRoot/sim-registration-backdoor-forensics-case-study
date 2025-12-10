package com.zxy.tiny.core;

import com.zxy.tiny.callback.CallbackDispatcher;
import com.zxy.tiny.common.Logger;
import com.zxy.tiny.common.TinyUtil;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes5.dex */
public class CompressFutureTask<T> extends FutureTask<T> {

    /* renamed from: a */
    public CallbackDispatcher f60964a;

    public CompressFutureTask(Callable<T> callable, CallbackDispatcher<T> callbackDispatcher) {
        super(callable);
        this.f60964a = callbackDispatcher;
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        super.done();
        Logger.m31988e("task is done! thread-name:" + Thread.currentThread().getName());
    }

    @Override // java.util.concurrent.FutureTask
    public void set(T t) {
        super.set(t);
        MainThreadExecutor.postToMainThread(t, this.f60964a);
    }

    @Override // java.util.concurrent.FutureTask
    public void setException(Throwable th2) {
        super.setException(th2);
        MainThreadExecutor.postToMainThread(null, this.f60964a, th2);
        TinyUtil.printExceptionMessage(th2);
    }
}
