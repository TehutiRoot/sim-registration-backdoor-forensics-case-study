package p000;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraFactory;
import androidx.core.util.Preconditions;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Gj */
/* loaded from: classes.dex */
public class ExecutorC0470Gj implements Executor {

    /* renamed from: c */
    public static final ThreadFactory f2062c = new ThreadFactoryC0471a();

    /* renamed from: a */
    public final Object f2063a = new Object();

    /* renamed from: b */
    public ThreadPoolExecutor f2064b = m68242c();

    /* renamed from: Gj$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC0471a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f2065a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f2065a.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m68243a(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Logger.m63176e("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }

    /* renamed from: c */
    public static ThreadPoolExecutor m68242c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f2062c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: Fj
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                ExecutorC0470Gj.m68243a(runnable, threadPoolExecutor2);
            }
        });
        return threadPoolExecutor;
    }

    /* renamed from: d */
    public void m68241d() {
        synchronized (this.f2063a) {
            try {
                if (!this.f2064b.isShutdown()) {
                    this.f2064b.shutdown();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public void m68240e(CameraFactory cameraFactory) {
        ThreadPoolExecutor threadPoolExecutor;
        Preconditions.checkNotNull(cameraFactory);
        synchronized (this.f2063a) {
            try {
                if (this.f2064b.isShutdown()) {
                    this.f2064b = m68242c();
                }
                threadPoolExecutor = this.f2064b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int max = Math.max(1, cameraFactory.getAvailableCameraIds().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.f2063a) {
            this.f2064b.execute(runnable);
        }
    }
}