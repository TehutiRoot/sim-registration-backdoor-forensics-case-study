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
public abstract class AbstractC2532a implements ListenableFuture {

    /* renamed from: androidx.camera.core.impl.utils.futures.a$a */
    /* loaded from: classes.dex */
    public static class C2533a extends AbstractC2532a {

        /* renamed from: a */
        public final Throwable f11427a;

        public C2533a(Throwable th2) {
            this.f11427a = th2;
        }

        @Override // androidx.camera.core.impl.utils.futures.AbstractC2532a, java.util.concurrent.Future
        public Object get() {
            throw new ExecutionException(this.f11427a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f11427a + "]]";
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.futures.a$b */
    /* loaded from: classes.dex */
    public static final class ScheduledFutureC2534b extends C2533a implements ScheduledFuture {
        public ScheduledFutureC2534b(Throwable th2) {
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
    public static final class C2535c extends AbstractC2532a {

        /* renamed from: b */
        public static final AbstractC2532a f11428b = new C2535c(null);

        /* renamed from: a */
        public final Object f11429a;

        public C2535c(Object obj) {
            this.f11429a = obj;
        }

        @Override // androidx.camera.core.impl.utils.futures.AbstractC2532a, java.util.concurrent.Future
        public Object get() {
            return this.f11429a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f11429a + "]]";
        }
    }

    /* renamed from: a */
    public static ListenableFuture m62782a() {
        return C2535c.f11428b;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger.m63175e("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
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