package com.zxy.tiny.core;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public class CompressThreadFactory implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f60978a = new AtomicInteger(1);

    /* renamed from: com.zxy.tiny.core.CompressThreadFactory$a */
    /* loaded from: classes5.dex */
    public class RunnableC10010a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f60979a;

        public RunnableC10010a(Runnable runnable) {
            this.f60979a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(0);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            this.f60979a.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        RunnableC10010a runnableC10010a = new RunnableC10010a(runnable);
        Thread thread = new Thread(runnableC10010a, "tiny-compress-thread-" + this.f60978a.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}