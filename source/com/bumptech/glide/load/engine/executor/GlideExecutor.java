package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class GlideExecutor implements ExecutorService {

    /* renamed from: b */
    public static final long f42112b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public static volatile int f42113c;

    /* renamed from: a */
    public final ExecutorService f42114a;

    /* loaded from: classes3.dex */
    public static final class Builder {
        public static final long NO_THREAD_TIMEOUT = 0;

        /* renamed from: a */
        public final boolean f42115a;

        /* renamed from: b */
        public int f42116b;

        /* renamed from: c */
        public int f42117c;

        /* renamed from: d */
        public ThreadFactory f42118d = new ThreadFactoryC5822b();

        /* renamed from: e */
        public UncaughtThrowableStrategy f42119e = UncaughtThrowableStrategy.DEFAULT;

        /* renamed from: f */
        public String f42120f;

        /* renamed from: g */
        public long f42121g;

        public Builder(boolean z) {
            this.f42115a = z;
        }

        public GlideExecutor build() {
            if (!TextUtils.isEmpty(this.f42120f)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f42116b, this.f42117c, this.f42121g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC5824c(this.f42118d, this.f42120f, this.f42119e, this.f42115a));
                if (this.f42121g != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new GlideExecutor(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f42120f);
        }

        public Builder setName(String str) {
            this.f42120f = str;
            return this;
        }

        public Builder setThreadCount(@IntRange(from = 1) int i) {
            this.f42116b = i;
            this.f42117c = i;
            return this;
        }

        @Deprecated
        public Builder setThreadFactory(@NonNull ThreadFactory threadFactory) {
            this.f42118d = threadFactory;
            return this;
        }

        public Builder setThreadTimeoutMillis(long j) {
            this.f42121g = j;
            return this;
        }

        public Builder setUncaughtThrowableStrategy(@NonNull UncaughtThrowableStrategy uncaughtThrowableStrategy) {
            this.f42119e = uncaughtThrowableStrategy;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public interface UncaughtThrowableStrategy {
        public static final UncaughtThrowableStrategy DEFAULT;
        public static final UncaughtThrowableStrategy IGNORE = new C5818a();
        public static final UncaughtThrowableStrategy LOG;
        public static final UncaughtThrowableStrategy THROW;

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$a */
        /* loaded from: classes3.dex */
        public class C5818a implements UncaughtThrowableStrategy {
            @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy
            public void handle(Throwable th2) {
            }
        }

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$b */
        /* loaded from: classes3.dex */
        public class C5819b implements UncaughtThrowableStrategy {
            @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy
            public void handle(Throwable th2) {
                if (th2 != null) {
                    Log.isLoggable("GlideExecutor", 6);
                }
            }
        }

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$c */
        /* loaded from: classes3.dex */
        public class C5820c implements UncaughtThrowableStrategy {
            @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy
            public void handle(Throwable th2) {
                if (th2 == null) {
                    return;
                }
                throw new RuntimeException("Request threw uncaught throwable", th2);
            }
        }

        static {
            C5819b c5819b = new C5819b();
            LOG = c5819b;
            THROW = new C5820c();
            DEFAULT = c5819b;
        }

        void handle(Throwable th2);
    }

    /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$b */
    /* loaded from: classes3.dex */
    public static final class ThreadFactoryC5822b implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$b$a */
        /* loaded from: classes3.dex */
        public class C5823a extends Thread {
            public C5823a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public ThreadFactoryC5822b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C5823a(runnable);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$c */
    /* loaded from: classes3.dex */
    public static final class ThreadFactoryC5824c implements ThreadFactory {

        /* renamed from: a */
        public final ThreadFactory f42123a;

        /* renamed from: b */
        public final String f42124b;

        /* renamed from: c */
        public final UncaughtThrowableStrategy f42125c;

        /* renamed from: d */
        public final boolean f42126d;

        /* renamed from: e */
        public final AtomicInteger f42127e = new AtomicInteger();

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$c$a */
        /* loaded from: classes3.dex */
        public class RunnableC5825a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f42128a;

            public RunnableC5825a(Runnable runnable) {
                this.f42128a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (ThreadFactoryC5824c.this.f42126d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f42128a.run();
                } catch (Throwable th2) {
                    ThreadFactoryC5824c.this.f42125c.handle(th2);
                }
            }
        }

        public ThreadFactoryC5824c(ThreadFactory threadFactory, String str, UncaughtThrowableStrategy uncaughtThrowableStrategy, boolean z) {
            this.f42123a = threadFactory;
            this.f42124b = str;
            this.f42125c = uncaughtThrowableStrategy;
            this.f42126d = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f42123a.newThread(new RunnableC5825a(runnable));
            newThread.setName("glide-" + this.f42124b + "-thread-" + this.f42127e.getAndIncrement());
            return newThread;
        }
    }

    public GlideExecutor(ExecutorService executorService) {
        this.f42114a = executorService;
    }

    /* renamed from: a */
    public static int m50327a() {
        if (calculateBestThreadCount() >= 4) {
            return 2;
        }
        return 1;
    }

    public static int calculateBestThreadCount() {
        if (f42113c == 0) {
            f42113c = Math.min(4, AbstractC21886rA1.m23355a());
        }
        return f42113c;
    }

    public static Builder newAnimationBuilder() {
        return new Builder(true).setThreadCount(m50327a()).setName("animation");
    }

    public static GlideExecutor newAnimationExecutor() {
        return newAnimationBuilder().build();
    }

    public static Builder newDiskCacheBuilder() {
        return new Builder(true).setThreadCount(1).setName("disk-cache");
    }

    public static GlideExecutor newDiskCacheExecutor() {
        return newDiskCacheBuilder().build();
    }

    public static Builder newSourceBuilder() {
        return new Builder(false).setThreadCount(calculateBestThreadCount()).setName("source");
    }

    public static GlideExecutor newSourceExecutor() {
        return newSourceBuilder().build();
    }

    public static GlideExecutor newUnlimitedSourceExecutor() {
        return new GlideExecutor(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f42112b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactoryC5824c(new ThreadFactoryC5822b(), "source-unlimited", UncaughtThrowableStrategy.DEFAULT, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f42114a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f42114a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f42114a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f42114a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f42114a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f42114a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f42114a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f42114a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f42114a.submit(runnable);
    }

    public String toString() {
        return this.f42114a.toString();
    }

    @Deprecated
    public static GlideExecutor newAnimationExecutor(int i, UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newAnimationBuilder().setThreadCount(i).setUncaughtThrowableStrategy(uncaughtThrowableStrategy).build();
    }

    @Deprecated
    public static GlideExecutor newDiskCacheExecutor(UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newDiskCacheBuilder().setUncaughtThrowableStrategy(uncaughtThrowableStrategy).build();
    }

    @Deprecated
    public static GlideExecutor newSourceExecutor(UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newSourceBuilder().setUncaughtThrowableStrategy(uncaughtThrowableStrategy).build();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f42114a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f42114a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.f42114a.submit(runnable, t);
    }

    @Deprecated
    public static GlideExecutor newDiskCacheExecutor(int i, String str, UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newDiskCacheBuilder().setThreadCount(i).setName(str).setUncaughtThrowableStrategy(uncaughtThrowableStrategy).build();
    }

    @Deprecated
    public static GlideExecutor newSourceExecutor(int i, String str, UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newSourceBuilder().setThreadCount(i).setName(str).setUncaughtThrowableStrategy(uncaughtThrowableStrategy).build();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f42114a.submit(callable);
    }
}
