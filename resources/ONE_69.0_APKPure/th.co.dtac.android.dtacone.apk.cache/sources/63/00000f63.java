package p000;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: QA */
/* loaded from: classes4.dex */
public class ThreadFactoryC1141QA implements ThreadFactory {

    /* renamed from: e */
    public static final ThreadFactory f5139e = Executors.defaultThreadFactory();

    /* renamed from: a */
    public final AtomicLong f5140a = new AtomicLong();

    /* renamed from: b */
    public final String f5141b;

    /* renamed from: c */
    public final int f5142c;

    /* renamed from: d */
    public final StrictMode.ThreadPolicy f5143d;

    public ThreadFactoryC1141QA(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f5141b = str;
        this.f5142c = i;
        this.f5143d = threadPolicy;
    }

    /* renamed from: a */
    public static /* synthetic */ void m66813a(ThreadFactoryC1141QA threadFactoryC1141QA, Runnable runnable) {
        threadFactoryC1141QA.m66812b(runnable);
    }

    /* renamed from: b */
    public final /* synthetic */ void m66812b(Runnable runnable) {
        Process.setThreadPriority(this.f5142c);
        StrictMode.ThreadPolicy threadPolicy = this.f5143d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f5139e.newThread(new Runnable() { // from class: PA
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC1141QA.m66813a(ThreadFactoryC1141QA.this, runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f5141b, Long.valueOf(this.f5140a.getAndIncrement())));
        return newThread;
    }
}