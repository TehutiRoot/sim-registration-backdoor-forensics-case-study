package p000;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: rg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC21967rg0 implements Executor {

    /* renamed from: b */
    public static volatile Executor f77364b;

    /* renamed from: a */
    public final ExecutorService f77365a = Executors.newFixedThreadPool(2, new ThreadFactoryC13286a());

    /* renamed from: rg0$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC13286a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f77366a = new AtomicInteger(0);

        public ThreadFactoryC13286a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f77366a.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: a */
    public static Executor m23296a() {
        if (f77364b != null) {
            return f77364b;
        }
        synchronized (ExecutorC21967rg0.class) {
            try {
                if (f77364b == null) {
                    f77364b = new ExecutorC21967rg0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f77364b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f77365a.execute(runnable);
    }
}
