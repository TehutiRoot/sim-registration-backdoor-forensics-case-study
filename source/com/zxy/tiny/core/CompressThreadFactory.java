package com.zxy.tiny.core;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public class CompressThreadFactory implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f60966a = new AtomicInteger(1);

    /* renamed from: com.zxy.tiny.core.CompressThreadFactory$a */
    /* loaded from: classes5.dex */
    public class RunnableC10021a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f60967a;

        public RunnableC10021a(Runnable runnable) {
            this.f60967a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(0);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            this.f60967a.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        RunnableC10021a runnableC10021a = new RunnableC10021a(runnable);
        Thread thread = new Thread(runnableC10021a, "tiny-compress-thread-" + this.f60966a.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
