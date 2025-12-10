package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: N70 */
/* loaded from: classes.dex */
public final class N70 implements Executor {

    /* renamed from: b */
    public static volatile Executor f4013b;

    /* renamed from: a */
    public final ExecutorService f4014a = Executors.newSingleThreadExecutor(new ThreadFactoryC0922a());

    /* renamed from: N70$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC0922a implements ThreadFactory {
        public ThreadFactoryC0922a() {
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
    public static Executor m67242a() {
        if (f4013b != null) {
            return f4013b;
        }
        synchronized (N70.class) {
            try {
                if (f4013b == null) {
                    f4013b = new N70();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f4013b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f4014a.execute(runnable);
    }
}
