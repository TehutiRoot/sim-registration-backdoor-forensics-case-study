package p000;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: s62  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C22047s62 extends ThreadPoolExecutor {

    /* renamed from: a */
    public final Map f79568a;

    public C22047s62(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        this.f79568a = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public Set m22711a() {
        return new HashSet(this.f79568a.keySet());
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) {
        if (runnable instanceof RunnableC21875r62) {
            this.f79568a.remove(runnable);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof RunnableC21875r62) {
            this.f79568a.put((RunnableC21875r62) runnable, Boolean.TRUE);
        }
    }
}
