package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: s70  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ScheduledExecutorServiceC22048s70 extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: b */
    public static ThreadLocal f79570b = new C13894a();

    /* renamed from: a */
    public final Handler f79571a;

    /* renamed from: s70$a */
    /* loaded from: classes.dex */
    public class C13894a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return CameraXExecutors.mainThreadExecutor();
            }
            if (Looper.myLooper() != null) {
                return new ScheduledExecutorServiceC22048s70(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* renamed from: s70$b */
    /* loaded from: classes.dex */
    public class CallableC13895b implements Callable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f79572a;

        public CallableC13895b(Runnable runnable) {
            this.f79572a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            this.f79572a.run();
            return null;
        }
    }

    /* renamed from: s70$c */
    /* loaded from: classes.dex */
    public static class RunnableScheduledFutureC13896c implements RunnableScheduledFuture {

        /* renamed from: a */
        public final AtomicReference f79574a = new AtomicReference(null);

        /* renamed from: b */
        public final long f79575b;

        /* renamed from: c */
        public final Callable f79576c;

        /* renamed from: d */
        public final ListenableFuture f79577d;

        /* renamed from: s70$c$a */
        /* loaded from: classes.dex */
        public class C13897a implements CallbackToFutureAdapter.Resolver {

            /* renamed from: a */
            public final /* synthetic */ Handler f79578a;

            /* renamed from: b */
            public final /* synthetic */ Callable f79579b;

            /* renamed from: s70$c$a$a */
            /* loaded from: classes.dex */
            public class RunnableC13898a implements Runnable {
                public RunnableC13898a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (RunnableScheduledFutureC13896c.this.f79574a.getAndSet(null) != null) {
                        C13897a c13897a = C13897a.this;
                        c13897a.f79578a.removeCallbacks(RunnableScheduledFutureC13896c.this);
                    }
                }
            }

            public C13897a(Handler handler, Callable callable) {
                this.f79578a = handler;
                this.f79579b = callable;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                completer.addCancellationListener(new RunnableC13898a(), CameraXExecutors.directExecutor());
                RunnableScheduledFutureC13896c.this.f79574a.set(completer);
                return "HandlerScheduledFuture-" + this.f79579b.toString();
            }
        }

        public RunnableScheduledFutureC13896c(Handler handler, long j, Callable callable) {
            this.f79575b = j;
            this.f79576c = callable;
            this.f79577d = CallbackToFutureAdapter.getFuture(new C13897a(handler, callable));
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return this.f79577d.cancel(z);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f79577d.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f79575b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f79577d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f79577d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) this.f79574a.getAndSet(null);
            if (completer != null) {
                try {
                    completer.set(this.f79576c.call());
                } catch (Exception e) {
                    completer.setException(e);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public Object get(long j, TimeUnit timeUnit) {
            return this.f79577d.get(j, timeUnit);
        }
    }

    public ScheduledExecutorServiceC22048s70(Handler handler) {
        this.f79571a = handler;
    }

    /* renamed from: c */
    public static ScheduledExecutorService m22709c() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f79570b.get();
        if (scheduledExecutorService == null) {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                ScheduledExecutorServiceC22048s70 scheduledExecutorServiceC22048s70 = new ScheduledExecutorServiceC22048s70(new Handler(myLooper));
                f79570b.set(scheduledExecutorServiceC22048s70);
                return scheduledExecutorServiceC22048s70;
            }
            throw new IllegalStateException("Current thread has no looper!");
        }
        return scheduledExecutorService;
    }

    /* renamed from: a */
    public final RejectedExecutionException m22710a() {
        return new RejectedExecutionException(this.f79571a + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC22048s70.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (this.f79571a.post(runnable)) {
            return;
        }
        throw m22710a();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(new CallableC13895b(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC22048s70.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC22048s70.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC22048s70.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC22048s70.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j, timeUnit);
        RunnableScheduledFutureC13896c runnableScheduledFutureC13896c = new RunnableScheduledFutureC13896c(this.f79571a, uptimeMillis, callable);
        return this.f79571a.postAtTime(runnableScheduledFutureC13896c, uptimeMillis) ? runnableScheduledFutureC13896c : Futures.immediateFailedScheduledFuture(m22710a());
    }
}
