package io.realm.internal.async;

import android.os.Process;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public class BgPriorityCallable<T> implements Callable<T> {

    /* renamed from: a */
    public final Callable f66803a;

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        Process.setThreadPriority(10);
        return (T) this.f66803a.call();
    }
}
