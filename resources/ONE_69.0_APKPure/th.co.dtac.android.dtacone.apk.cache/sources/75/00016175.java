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
public class RunnableC17077xm extends FutureChain implements Runnable {

    /* renamed from: c */
    public AsyncFunction f108841c;

    /* renamed from: d */
    public final BlockingQueue f108842d = new LinkedBlockingQueue(1);

    /* renamed from: e */
    public final CountDownLatch f108843e = new CountDownLatch(1);

    /* renamed from: f */
    public ListenableFuture f108844f;

    /* renamed from: g */
    public volatile ListenableFuture f108845g;

    /* renamed from: xm$a */
    /* loaded from: classes.dex */
    public class RunnableC17078a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ListenableFuture f108846a;

        public RunnableC17078a(ListenableFuture listenableFuture) {
            this.f108846a = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    RunnableC17077xm.this.m62787a(Futures.getUninterruptibly(this.f108846a));
                } catch (CancellationException unused) {
                    RunnableC17077xm.this.cancel(false);
                    RunnableC17077xm.this.f108845g = null;
                    return;
                } catch (ExecutionException e) {
                    RunnableC17077xm.this.m62786b(e.getCause());
                }
                RunnableC17077xm.this.f108845g = null;
            } catch (Throwable th2) {
                RunnableC17077xm.this.f108845g = null;
                throw th2;
            }
        }
    }

    public RunnableC17077xm(AsyncFunction asyncFunction, ListenableFuture listenableFuture) {
        this.f108841c = (AsyncFunction) Preconditions.checkNotNull(asyncFunction);
        this.f108844f = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
    }

    /* renamed from: c */
    public final void m483c(Future future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (super.cancel(z)) {
            m482d(this.f108842d, Boolean.valueOf(z));
            m483c(this.f108844f, z);
            m483c(this.f108845g, z);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m482d(BlockingQueue blockingQueue, Object obj) {
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
    public final Object m481f(BlockingQueue blockingQueue) {
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
            ListenableFuture listenableFuture = this.f108844f;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.f108843e.await();
            ListenableFuture listenableFuture2 = this.f108845g;
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
            m62786b(e.getCause());
        }
        try {
            try {
                try {
                    try {
                        apply = this.f108841c.apply(Futures.getUninterruptibly(this.f108844f));
                        this.f108845g = apply;
                    } catch (CancellationException unused) {
                        cancel(false);
                    } catch (ExecutionException e2) {
                        m62786b(e2.getCause());
                    }
                } catch (Error e3) {
                    m62786b(e3);
                }
            } catch (Exception e4) {
                m62786b(e4);
            }
            if (isCancelled()) {
                apply.cancel(((Boolean) m481f(this.f108842d)).booleanValue());
                this.f108845g = null;
                return;
            }
            apply.addListener(new RunnableC17078a(apply), CameraXExecutors.directExecutor());
        } finally {
            this.f108841c = null;
            this.f108844f = null;
            this.f108843e.countDown();
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
            ListenableFuture listenableFuture = this.f108844f;
            if (listenableFuture != null) {
                long nanoTime = System.nanoTime();
                listenableFuture.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f108843e.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - nanoTime2);
                ListenableFuture listenableFuture2 = this.f108845g;
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