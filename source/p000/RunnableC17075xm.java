package p000;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: xm */
/* loaded from: classes.dex */
public class RunnableC17075xm extends FutureChain implements Runnable {

    /* renamed from: c */
    public AsyncFunction f108497c;

    /* renamed from: d */
    public final BlockingQueue f108498d = new LinkedBlockingQueue(1);

    /* renamed from: e */
    public final CountDownLatch f108499e = new CountDownLatch(1);

    /* renamed from: f */
    public ListenableFuture f108500f;

    /* renamed from: g */
    public volatile ListenableFuture f108501g;

    /* renamed from: xm$a */
    /* loaded from: classes.dex */
    public class RunnableC17076a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ListenableFuture f108502a;

        public RunnableC17076a(ListenableFuture listenableFuture) {
            this.f108502a = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    RunnableC17075xm.this.m62839a(Futures.getUninterruptibly(this.f108502a));
                } catch (CancellationException unused) {
                    RunnableC17075xm.this.cancel(false);
                    RunnableC17075xm.this.f108501g = null;
                    return;
                } catch (ExecutionException e) {
                    RunnableC17075xm.this.m62838b(e.getCause());
                }
                RunnableC17075xm.this.f108501g = null;
            } catch (Throwable th2) {
                RunnableC17075xm.this.f108501g = null;
                throw th2;
            }
        }
    }

    public RunnableC17075xm(AsyncFunction asyncFunction, ListenableFuture listenableFuture) {
        this.f108497c = (AsyncFunction) Preconditions.checkNotNull(asyncFunction);
        this.f108500f = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
    }

    /* renamed from: c */
    public final void m395c(Future future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (super.cancel(z)) {
            m394d(this.f108498d, Boolean.valueOf(z));
            m395c(this.f108500f, z);
            m395c(this.f108501g, z);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m394d(BlockingQueue blockingQueue, Object obj) {
        boolean z = false;
        while (true) {
            try {
                blockingQueue.put(obj);
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: f */
    public final Object m393f(BlockingQueue blockingQueue) {
        Object take;
        boolean z = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public Object get() {
        if (!isDone()) {
            ListenableFuture listenableFuture = this.f108500f;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.f108499e.await();
            ListenableFuture listenableFuture2 = this.f108501g;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return super.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, androidx.camera.core.impl.utils.futures.AsyncFunction] */
    @Override // java.lang.Runnable
    public void run() {
        ListenableFuture apply;
        try {
        } catch (UndeclaredThrowableException e) {
            m62838b(e.getCause());
        }
        try {
            try {
                try {
                    try {
                        apply = this.f108497c.apply(Futures.getUninterruptibly(this.f108500f));
                        this.f108501g = apply;
                    } catch (CancellationException unused) {
                        cancel(false);
                    } catch (ExecutionException e2) {
                        m62838b(e2.getCause());
                    }
                } catch (Error e3) {
                    m62838b(e3);
                }
            } catch (Exception e4) {
                m62838b(e4);
            }
            if (isCancelled()) {
                apply.cancel(((Boolean) m393f(this.f108498d)).booleanValue());
                this.f108501g = null;
                return;
            }
            apply.addListener(new RunnableC17076a(apply), CameraXExecutors.directExecutor());
        } finally {
            this.f108497c = null;
            this.f108500f = null;
            this.f108499e.countDown();
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            ListenableFuture listenableFuture = this.f108500f;
            if (listenableFuture != null) {
                long nanoTime = System.nanoTime();
                listenableFuture.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f108499e.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - nanoTime2);
                ListenableFuture listenableFuture2 = this.f108501g;
                if (listenableFuture2 != null) {
                    listenableFuture2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j, timeUnit);
    }
}
