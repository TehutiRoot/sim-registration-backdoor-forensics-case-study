package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.core.impl.utils.futures.a */
/* loaded from: classes.dex */
public abstract class AbstractC2550a implements ListenableFuture {

    /* renamed from: androidx.camera.core.impl.utils.futures.a$a */
    /* loaded from: classes.dex */
    public static class C2551a extends AbstractC2550a {

        /* renamed from: a */
        public final Throwable f11339a;

        public C2551a(Throwable th2) {
            this.f11339a = th2;
        }

        @Override // androidx.camera.core.impl.utils.futures.AbstractC2550a, java.util.concurrent.Future
        public Object get() {
            throw new ExecutionException(this.f11339a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f11339a + "]]";
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.futures.a$b */
    /* loaded from: classes.dex */
    public static final class ScheduledFutureC2552b extends C2551a implements ScheduledFuture {
        public ScheduledFutureC2552b(Throwable th2) {
            super(th2);
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.futures.a$c */
    /* loaded from: classes.dex */
    public static final class C2553c extends AbstractC2550a {

        /* renamed from: b */
        public static final AbstractC2550a f11340b = new C2553c(null);

        /* renamed from: a */
        public final Object f11341a;

        public C2553c(Object obj) {
            this.f11341a = obj;
        }

        @Override // androidx.camera.core.impl.utils.futures.AbstractC2550a, java.util.concurrent.Future
        public Object get() {
            return this.f11341a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f11341a + "]]";
        }
    }

    /* renamed from: a */
    public static ListenableFuture m62834a() {
        return C2553c.f11340b;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger.m63227e("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract Object get();

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        Preconditions.checkNotNull(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
