package p046rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.Subscription;

/* renamed from: rx.internal.operators.BlockingOperatorToFuture */
/* loaded from: classes7.dex */
public final class BlockingOperatorToFuture {

    /* renamed from: rx.internal.operators.BlockingOperatorToFuture$a */
    /* loaded from: classes7.dex */
    public static class C13438a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f77767a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f77768b;

        /* renamed from: c */
        public final /* synthetic */ AtomicReference f77769c;

        public C13438a(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f77767a = countDownLatch;
            this.f77768b = atomicReference;
            this.f77769c = atomicReference2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f77767a.countDown();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            AbstractC17300An1.m69050a(this.f77768b, null, th2);
            this.f77767a.countDown();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f77769c.set(obj);
        }
    }

    public static <T> Future<T> toFuture(Observable<? extends T> observable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        return new FutureC13439b(countDownLatch, observable.single().subscribe((Subscriber<? super Object>) new C13438a(countDownLatch, atomicReference2, atomicReference)), atomicReference2, atomicReference);
    }

    /* renamed from: rx.internal.operators.BlockingOperatorToFuture$b */
    /* loaded from: classes7.dex */
    public static class FutureC13439b implements Future {

        /* renamed from: a */
        public volatile boolean f77770a;

        /* renamed from: b */
        public final /* synthetic */ CountDownLatch f77771b;

        /* renamed from: c */
        public final /* synthetic */ Subscription f77772c;

        /* renamed from: d */
        public final /* synthetic */ AtomicReference f77773d;

        /* renamed from: e */
        public final /* synthetic */ AtomicReference f77774e;

        public FutureC13439b(CountDownLatch countDownLatch, Subscription subscription, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f77771b = countDownLatch;
            this.f77772c = subscription;
            this.f77773d = atomicReference;
            this.f77774e = atomicReference2;
        }

        /* renamed from: a */
        public final Object m23156a() {
            Throwable th2 = (Throwable) this.f77773d.get();
            if (th2 == null) {
                if (!this.f77770a) {
                    return this.f77774e.get();
                }
                throw new CancellationException("Subscription unsubscribed");
            }
            throw new ExecutionException("Observable onError", th2);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (this.f77771b.getCount() > 0) {
                this.f77770a = true;
                this.f77772c.unsubscribe();
                this.f77771b.countDown();
                return true;
            }
            return false;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            this.f77771b.await();
            return m23156a();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f77770a;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            if (this.f77771b.getCount() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.concurrent.Future
        public Object get(long j, TimeUnit timeUnit) {
            if (this.f77771b.await(j, timeUnit)) {
                return m23156a();
            }
            throw new TimeoutException("Timed out after " + timeUnit.toMillis(j) + "ms waiting for underlying Observable.");
        }
    }
}
