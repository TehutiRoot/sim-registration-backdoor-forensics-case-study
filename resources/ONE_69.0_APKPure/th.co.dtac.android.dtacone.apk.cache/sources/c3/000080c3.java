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
    public static final long f42124b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public static volatile int f42125c;

    /* renamed from: a */
    public final ExecutorService f42126a;

    /* loaded from: classes3.dex */
    public static final class Builder {
        public static final long NO_THREAD_TIMEOUT = 0;

        /* renamed from: a */
        public final boolean f42127a;

        /* renamed from: b */
        public int f42128b;

        /* renamed from: c */
        public int f42129c;

        /* renamed from: d */
        public ThreadFactory f42130d = new ThreadFactoryC5811b();

        /* renamed from: e */
        public UncaughtThrowableStrategy f42131e = UncaughtThrowableStrategy.DEFAULT;

        /* renamed from: f */
        public String f42132f;

        /* renamed from: g */
        public long f42133g;

        public Builder(boolean z) {
            this.f42127a = z;
        }

        public GlideExecutor build() {
            if (!TextUtils.isEmpty(this.f42132f)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f42128b, this.f42129c, this.f42133g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC5813c(this.f42130d, this.f42132f, this.f42131e, this.f42127a));
                if (this.f42133g != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new GlideExecutor(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f42132f);
        }

        public Builder setName(String str) {
            this.f42132f = str;
            return this;
        }

        public Builder setThreadCount(@IntRange(from = 1) int i) {
            this.f42128b = i;
            this.f42129c = i;
            return this;
        }

        @Deprecated
        public Builder setThreadFactory(@NonNull ThreadFactory threadFactory) {
            this.f42130d = threadFactory;
            return this;
        }

        public Builder setThreadTimeoutMillis(long j) {
            this.f42133g = j;
            return this;
        }

        public Builder setUncaughtThrowableStrategy(@NonNull UncaughtThrowableStrategy uncaughtThrowableStrategy) {
            this.f42131e = uncaughtThrowableStrategy;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public interface UncaughtThrowableStrategy {
        public static final UncaughtThrowableStrategy DEFAULT;
        public static final UncaughtThrowableStrategy IGNORE = new C5807a();
        public static final UncaughtThrowableStrategy LOG;
        public static final UncaughtThrowableStrategy THROW;

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$a */
        /* loaded from: classes3.dex */
        public class C5807a implements UncaughtThrowableStrategy {
            @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy
            public void handle(Throwable th2) {
            }
        }

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$b */
        /* loaded from: classes3.dex */
        public class C5808b implements UncaughtThrowableStrategy {
            @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy
            public void handle(Throwable th2) {
                if (th2 != null) {
                    Log.isLoggable("GlideExecutor", 6);
                }
            }
        }

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$c */
        /* loaded from: classes3.dex */
        public class C5809c implements UncaughtThrowableStrategy {
            @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy
            public void handle(Throwable th2) {
                if (th2 == null) {
                    return;
                }
                throw new RuntimeException("Request threw uncaught throwable", th2);
            }
        }

        static {
            C5808b c5808b = new C5808b();
            LOG = c5808b;
            THROW = new C5809c();
            DEFAULT = c5808b;
        }

        void handle(Throwable th2);
    }

    /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$b */
    /* loaded from: classes3.dex */
    public static final class ThreadFactoryC5811b implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$b$a */
        /* loaded from: classes3.dex */
        public class C5812a extends Thread {
            public C5812a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public ThreadFactoryC5811b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C5812a(runnable);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$c */
    /* loaded from: classes3.dex */
    public static final class ThreadFactoryC5813c implements ThreadFactory {

        /* renamed from: a */
        public final ThreadFactory f42135a;

        /* renamed from: b */
        public final String f42136b;

        /* renamed from: c */
        public final UncaughtThrowableStrategy f42137c;

        /* renamed from: d */
        public final boolean f42138d;

        /* renamed from: e */
        public final AtomicInteger f42139e = new AtomicInteger();

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$c$a */
        /* loaded from: classes3.dex */
        public class RunnableC5814a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f42140a;

            public RunnableC5814a(Runnable runnable) {
                this.f42140a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (ThreadFactoryC5813c.this.f42138d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f42140a.run();
                } catch (Throwable th2) {
                    ThreadFactoryC5813c.this.f42137c.handle(th2);
                }
            }
        }

        public ThreadFactoryC5813c(ThreadFactory threadFactory, String str, UncaughtThrowableStrategy uncaughtThrowableStrategy, boolean z) {
            this.f42135a = threadFactory;
            this.f42136b = str;
            this.f42137c = uncaughtThrowableStrategy;
            this.f42138d = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f42135a.newThread(new RunnableC5814a(runnable));
            newThread.setName("glide-" + this.f42136b + "-thread-" + this.f42139e.getAndIncrement());
            return newThread;
        }
    }

    public GlideExecutor(ExecutorService executorService) {
        this.f42126a = executorService;
    }

    /* renamed from: a */
    public static int m50324a() {
        if (calculateBestThreadCount() >= 4) {
            return 2;
        }
        return 1;
    }

    public static int calculateBestThreadCount() {
        if (f42125c == 0) {
            f42125c = Math.min(4, AbstractC21433oB1.m26146a());
        }
        return f42125c;
    }

    public static Builder newAnimationBuilder() {
        return new Builder(true).setThreadCount(m50324a()).setName("animation");
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
        return new GlideExecutor(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f42124b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactoryC5813c(new ThreadFactoryC5811b(), "source-unlimited", UncaughtThrowableStrategy.DEFAULT, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f42126a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f42126a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f42126a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f42126a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f42126a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f42126a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f42126a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f42126a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f42126a.submit(runnable);
    }

    public String toString() {
        return this.f42126a.toString();
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
        return this.f42126a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f42126a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.f42126a.submit(runnable, t);
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
        return this.f42126a.submit(callable);
    }
}