package p000;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ef0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC19728ef0 implements Callable, Disposable {

    /* renamed from: f */
    public static final FutureTask f61551f = new FutureTask(Functions.EMPTY_RUNNABLE, null);

    /* renamed from: a */
    public final Runnable f61552a;

    /* renamed from: d */
    public final ExecutorService f61555d;

    /* renamed from: e */
    public Thread f61556e;

    /* renamed from: c */
    public final AtomicReference f61554c = new AtomicReference();

    /* renamed from: b */
    public final AtomicReference f61553b = new AtomicReference();

    public CallableC19728ef0(Runnable runnable, ExecutorService executorService) {
        this.f61552a = runnable;
        this.f61555d = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public Void call() {
        this.f61556e = Thread.currentThread();
        try {
            this.f61552a.run();
            m31515c(this.f61555d.submit(this));
            this.f61556e = null;
        } catch (Throwable th2) {
            this.f61556e = null;
            RxJavaPlugins.onError(th2);
        }
        return null;
    }

    /* renamed from: b */
    public void m31516b(Future future) {
        Future future2;
        boolean z;
        do {
            future2 = (Future) this.f61554c.get();
            if (future2 == f61551f) {
                if (this.f61556e != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!AbstractC17300An1.m69050a(this.f61554c, future2, future));
    }

    /* renamed from: c */
    public void m31515c(Future future) {
        Future future2;
        boolean z;
        do {
            future2 = (Future) this.f61553b.get();
            if (future2 == f61551f) {
                if (this.f61556e != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!AbstractC17300An1.m69050a(this.f61553b, future2, future));
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        boolean z;
        AtomicReference atomicReference = this.f61554c;
        FutureTask futureTask = f61551f;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        boolean z2 = false;
        if (future != null && future != futureTask) {
            if (this.f61556e != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
        Future future2 = (Future) this.f61553b.getAndSet(futureTask);
        if (future2 != null && future2 != futureTask) {
            if (this.f61556e != Thread.currentThread()) {
                z2 = true;
            }
            future2.cancel(z2);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (this.f61554c.get() == f61551f) {
            return true;
        }
        return false;
    }
}
