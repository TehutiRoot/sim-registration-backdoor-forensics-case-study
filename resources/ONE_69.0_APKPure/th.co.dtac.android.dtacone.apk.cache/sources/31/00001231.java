package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: T70 */
/* loaded from: classes.dex */
public final class T70 implements Executor {

    /* renamed from: b */
    public static volatile Executor f6261b;

    /* renamed from: a */
    public final ExecutorService f6262a = Executors.newSingleThreadExecutor(new ThreadFactoryC1349a());

    /* renamed from: T70$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC1349a implements ThreadFactory {
        public ThreadFactoryC1349a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    /* renamed from: a */
    public static Executor m66368a() {
        if (f6261b != null) {
            return f6261b;
        }
        synchronized (T70.class) {
            try {
                if (f6261b == null) {
                    f6261b = new T70();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f6261b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f6262a.execute(runnable);
    }
}