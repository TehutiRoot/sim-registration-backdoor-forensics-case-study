package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Throwables;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ForwardingListenableFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class MoreExecutors {

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$a */
    /* loaded from: classes4.dex */
    public class ExecutorC8257a implements Executor {

        /* renamed from: a */
        public final /* synthetic */ Executor f54368a;

        /* renamed from: b */
        public final /* synthetic */ Supplier f54369b;

        public ExecutorC8257a(Executor executor, Supplier supplier) {
            this.f54368a = executor;
            this.f54369b = supplier;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f54368a.execute(Callables.m39592i(runnable, this.f54369b));
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$b */
    /* loaded from: classes4.dex */
    public class C8258b extends F62 {

        /* renamed from: c */
        public final /* synthetic */ Supplier f54370c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8258b(ScheduledExecutorService scheduledExecutorService, Supplier supplier) {
            super(scheduledExecutorService);
            this.f54370c = supplier;
        }

        @Override // p000.E62
        /* renamed from: a */
        public Runnable mo39471a(Runnable runnable) {
            return Callables.m39592i(runnable, this.f54370c);
        }

        @Override // p000.E62
        /* renamed from: c */
        public Callable mo39470c(Callable callable) {
            return Callables.m39591j(callable, this.f54370c);
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$c */
    /* loaded from: classes4.dex */
    public class ExecutorC8259c implements Executor {

        /* renamed from: a */
        public final /* synthetic */ Executor f54371a;

        /* renamed from: b */
        public final /* synthetic */ AbstractFuture f54372b;

        public ExecutorC8259c(Executor executor, AbstractFuture abstractFuture) {
            this.f54371a = executor;
            this.f54372b = abstractFuture;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f54371a.execute(runnable);
            } catch (RejectedExecutionException e) {
                this.f54372b.setException(e);
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$d */
    /* loaded from: classes4.dex */
    public static class C8260d {

        /* renamed from: com.google.common.util.concurrent.MoreExecutors$d$a */
        /* loaded from: classes4.dex */
        public class RunnableC8261a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ ExecutorService f54373a;

            /* renamed from: b */
            public final /* synthetic */ long f54374b;

            /* renamed from: c */
            public final /* synthetic */ TimeUnit f54375c;

            /* renamed from: d */
            public final /* synthetic */ C8260d f54376d;

            public RunnableC8261a(C8260d c8260d, ExecutorService executorService, long j, TimeUnit timeUnit) {
                this.f54373a = executorService;
                this.f54374b = j;
                this.f54375c = timeUnit;
                this.f54376d = c8260d;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f54373a.shutdown();
                    this.f54373a.awaitTermination(this.f54374b, this.f54375c);
                } catch (InterruptedException unused) {
                }
            }
        }

        /* renamed from: a */
        public final void m39469a(ExecutorService executorService, long j, TimeUnit timeUnit) {
            Preconditions.checkNotNull(executorService);
            Preconditions.checkNotNull(timeUnit);
            m39468b(MoreExecutors.m39476c("DelayedShutdownHook-for-" + executorService, new RunnableC8261a(this, executorService, j, timeUnit)));
        }

        /* renamed from: b */
        public void m39468b(Thread thread) {
            Runtime.getRuntime().addShutdownHook(thread);
        }

        /* renamed from: c */
        public final ExecutorService m39467c(ThreadPoolExecutor threadPoolExecutor) {
            return m39466d(threadPoolExecutor, 120L, TimeUnit.SECONDS);
        }

        /* renamed from: d */
        public final ExecutorService m39466d(ThreadPoolExecutor threadPoolExecutor, long j, TimeUnit timeUnit) {
            MoreExecutors.m39472g(threadPoolExecutor);
            ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
            m39469a(threadPoolExecutor, j, timeUnit);
            return unconfigurableExecutorService;
        }

        /* renamed from: e */
        public final ScheduledExecutorService m39465e(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
            return m39464f(scheduledThreadPoolExecutor, 120L, TimeUnit.SECONDS);
        }

        /* renamed from: f */
        public final ScheduledExecutorService m39464f(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, TimeUnit timeUnit) {
            MoreExecutors.m39472g(scheduledThreadPoolExecutor);
            ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
            m39469a(scheduledThreadPoolExecutor, j, timeUnit);
            return unconfigurableScheduledExecutorService;
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$e */
    /* loaded from: classes4.dex */
    public static class C8262e extends AbstractListeningExecutorService {

        /* renamed from: a */
        public final ExecutorService f54377a;

        public C8262e(ExecutorService executorService) {
            this.f54377a = (ExecutorService) Preconditions.checkNotNull(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            return this.f54377a.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f54377a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f54377a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f54377a.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f54377a.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List shutdownNow() {
            return this.f54377a.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.f54377a + "]";
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$f */
    /* loaded from: classes4.dex */
    public static final class C8263f extends C8262e implements ListeningScheduledExecutorService {

        /* renamed from: b */
        public final ScheduledExecutorService f54378b;

        /* renamed from: com.google.common.util.concurrent.MoreExecutors$f$a */
        /* loaded from: classes4.dex */
        public static final class C8264a extends ForwardingListenableFuture.SimpleForwardingListenableFuture implements ListenableScheduledFuture {

            /* renamed from: b */
            public final ScheduledFuture f54379b;

            public C8264a(ListenableFuture listenableFuture, ScheduledFuture scheduledFuture) {
                super(listenableFuture);
                this.f54379b = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean z) {
                boolean cancel = super.cancel(z);
                if (cancel) {
                    this.f54379b.cancel(z);
                }
                return cancel;
            }

            @Override // java.lang.Comparable
            /* renamed from: e */
            public int compareTo(Delayed delayed) {
                return this.f54379b.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f54379b.getDelay(timeUnit);
            }
        }

        /* renamed from: com.google.common.util.concurrent.MoreExecutors$f$b */
        /* loaded from: classes4.dex */
        public static final class RunnableC8265b extends AbstractFuture.AbstractC8187i implements Runnable {

            /* renamed from: h */
            public final Runnable f54380h;

            public RunnableC8265b(Runnable runnable) {
                this.f54380h = (Runnable) Preconditions.checkNotNull(runnable);
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            public String pendingToString() {
                return "task=[" + this.f54380h + "]";
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f54380h.run();
                } catch (Throwable th2) {
                    setException(th2);
                    throw th2;
                }
            }
        }

        public C8263f(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f54378b = (ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService);
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            RunnableC8265b runnableC8265b = new RunnableC8265b(runnable);
            return new C8264a(runnableC8265b, this.f54378b.scheduleAtFixedRate(runnableC8265b, j, j2, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            RunnableC8265b runnableC8265b = new RunnableC8265b(runnable);
            return new C8264a(runnableC8265b, this.f54378b.scheduleWithFixedDelay(runnableC8265b, j, j2, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask m39389A = TrustedListenableFutureTask.m39389A(runnable, null);
            return new C8264a(m39389A, this.f54378b.schedule(m39389A, j, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask m39388B = TrustedListenableFutureTask.m39388B(callable);
            return new C8264a(m39388B, this.f54378b.schedule(m39388B, j, timeUnit));
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static void addDelayedShutdownHook(ExecutorService executorService, long j, TimeUnit timeUnit) {
        new C8260d().m39469a(executorService, j, timeUnit);
    }

    /* renamed from: b */
    public static boolean m39477b() {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            Class.forName("com.google.appengine.api.utils.SystemProperty");
            if (Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", null).invoke(null, null) == null) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static Thread m39476c(String str, Runnable runnable) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(runnable);
        Thread newThread = platformThreadFactory().newThread(runnable);
        Objects.requireNonNull(newThread);
        try {
            newThread.setName(str);
        } catch (SecurityException unused) {
        }
        return newThread;
    }

    /* renamed from: d */
    public static Executor m39475d(Executor executor, AbstractFuture abstractFuture) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(abstractFuture);
        if (executor == directExecutor()) {
            return executor;
        }
        return new ExecutorC8259c(executor, abstractFuture);
    }

    public static Executor directExecutor() {
        return DirectExecutor.INSTANCE;
    }

    /* renamed from: e */
    public static Executor m39474e(Executor executor, Supplier supplier) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(supplier);
        return new ExecutorC8257a(executor, supplier);
    }

    /* renamed from: f */
    public static ScheduledExecutorService m39473f(ScheduledExecutorService scheduledExecutorService, Supplier supplier) {
        Preconditions.checkNotNull(scheduledExecutorService);
        Preconditions.checkNotNull(supplier);
        return new C8258b(scheduledExecutorService, supplier);
    }

    /* renamed from: g */
    public static void m39472g(ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.setThreadFactory(new ThreadFactoryBuilder().setDaemon(true).setThreadFactory(threadPoolExecutor.getThreadFactory()).build());
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor, long j, TimeUnit timeUnit) {
        return new C8260d().m39466d(threadPoolExecutor, j, timeUnit);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, TimeUnit timeUnit) {
        return new C8260d().m39464f(scheduledThreadPoolExecutor, j, timeUnit);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ListeningExecutorService listeningDecorator(ExecutorService executorService) {
        ListeningExecutorService c8262e;
        if (executorService instanceof ListeningExecutorService) {
            return (ListeningExecutorService) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            c8262e = new C8263f((ScheduledExecutorService) executorService);
        } else {
            c8262e = new C8262e(executorService);
        }
        return c8262e;
    }

    @GwtIncompatible
    public static ListeningExecutorService newDirectExecutorService() {
        return new C1452UI();
    }

    @GwtIncompatible
    public static Executor newSequentialExecutor(Executor executor) {
        return new SequentialExecutor(executor);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ThreadFactory platformThreadFactory() {
        if (!m39477b()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", null).invoke(null, null);
        } catch (ClassNotFoundException e) {
            e = e;
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (NoSuchMethodException e3) {
            e = e3;
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (InvocationTargetException e4) {
            throw Throwables.propagate(e4.getCause());
        }
    }

    @CanIgnoreReturnValue
    @J2ktIncompatible
    @GwtIncompatible
    public static boolean shutdownAndAwaitTermination(ExecutorService executorService, long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j) / 2;
        executorService.shutdown();
        try {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (!executorService.awaitTermination(nanos, timeUnit2)) {
                executorService.shutdownNow();
                executorService.awaitTermination(nanos, timeUnit2);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            executorService.shutdownNow();
        }
        return executorService.isTerminated();
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor) {
        return new C8260d().m39467c(threadPoolExecutor);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        return new C8260d().m39465e(scheduledThreadPoolExecutor);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ListeningScheduledExecutorService listeningDecorator(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof ListeningScheduledExecutorService) {
            return (ListeningScheduledExecutorService) scheduledExecutorService;
        }
        return new C8263f(scheduledExecutorService);
    }
}
