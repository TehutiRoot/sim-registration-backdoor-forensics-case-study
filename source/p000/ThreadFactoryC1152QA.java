package p000;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: QA */
/* loaded from: classes4.dex */
public class ThreadFactoryC1152QA implements ThreadFactory {

    /* renamed from: e */
    public static final ThreadFactory f4973e = Executors.defaultThreadFactory();

    /* renamed from: a */
    public final AtomicLong f4974a = new AtomicLong();

    /* renamed from: b */
    public final String f4975b;

    /* renamed from: c */
    public final int f4976c;

    /* renamed from: d */
    public final StrictMode.ThreadPolicy f4977d;

    public ThreadFactoryC1152QA(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f4975b = str;
        this.f4976c = i;
        this.f4977d = threadPolicy;
    }

    /* renamed from: a */
    public static /* synthetic */ void m66642a(ThreadFactoryC1152QA threadFactoryC1152QA, Runnable runnable) {
        threadFactoryC1152QA.m66641b(runnable);
    }

    /* renamed from: b */
    public final /* synthetic */ void m66641b(Runnable runnable) {
        Process.setThreadPriority(this.f4976c);
        StrictMode.ThreadPolicy threadPolicy = this.f4977d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f4973e.newThread(new Runnable() { // from class: PA
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC1152QA.m66642a(ThreadFactoryC1152QA.this, runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f4975b, Long.valueOf(this.f4974a.getAndIncrement())));
        return newThread;
    }
}
