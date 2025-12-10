package io.realm.internal.async;

import io.realm.RealmAsyncTask;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes5.dex */
public final class RealmAsyncTaskImpl implements RealmAsyncTask {

    /* renamed from: a */
    public final Future f66805a;

    /* renamed from: b */
    public final ThreadPoolExecutor f66806b;

    /* renamed from: c */
    public volatile boolean f66807c = false;

    public RealmAsyncTaskImpl(Future<?> future, ThreadPoolExecutor threadPoolExecutor) {
        this.f66805a = future;
        this.f66806b = threadPoolExecutor;
    }

    @Override // io.realm.RealmAsyncTask
    public void cancel() {
        this.f66805a.cancel(true);
        this.f66807c = true;
        this.f66806b.getQueue().remove(this.f66805a);
    }

    @Override // io.realm.RealmAsyncTask
    public boolean isCancelled() {
        return this.f66807c;
    }
}
