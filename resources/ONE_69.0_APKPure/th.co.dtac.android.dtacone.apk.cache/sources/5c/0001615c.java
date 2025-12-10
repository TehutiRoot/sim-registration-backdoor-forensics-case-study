package p000;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: xg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC23069xg0 implements Executor {

    /* renamed from: b */
    public static volatile Executor f108808b;

    /* renamed from: a */
    public final ExecutorService f108809a = Executors.newFixedThreadPool(2, new ThreadFactoryC17070a());

    /* renamed from: xg0$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC17070a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f108810a = new AtomicInteger(0);

        public ThreadFactoryC17070a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f108810a.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: a */
    public static Executor m491a() {
        if (f108808b != null) {
            return f108808b;
        }
        synchronized (ExecutorC23069xg0.class) {
            try {
                if (f108808b == null) {
                    f108808b = new ExecutorC23069xg0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f108808b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f108809a.execute(runnable);
    }
}