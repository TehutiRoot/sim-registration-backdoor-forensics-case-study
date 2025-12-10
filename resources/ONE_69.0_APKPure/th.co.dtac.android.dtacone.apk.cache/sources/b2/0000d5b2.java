package io.realm.internal.async;

import io.realm.RealmAsyncTask;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes5.dex */
public final class RealmAsyncTaskImpl implements RealmAsyncTask {

    /* renamed from: a */
    public final Future f66868a;

    /* renamed from: b */
    public final ThreadPoolExecutor f66869b;

    /* renamed from: c */
    public volatile boolean f66870c = false;

    public RealmAsyncTaskImpl(Future<?> future, ThreadPoolExecutor threadPoolExecutor) {
        this.f66868a = future;
        this.f66869b = threadPoolExecutor;
    }

    @Override // io.realm.RealmAsyncTask
    public void cancel() {
        this.f66868a.cancel(true);
        this.f66870c = true;
        this.f66869b.getQueue().remove(this.f66868a);
    }

    @Override // io.realm.RealmAsyncTask
    public boolean isCancelled() {
        return this.f66870c;
    }
}