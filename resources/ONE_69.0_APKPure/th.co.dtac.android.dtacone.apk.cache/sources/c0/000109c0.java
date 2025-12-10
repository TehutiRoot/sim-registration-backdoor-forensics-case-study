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
    public static class C13439a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f77973a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f77974b;

        /* renamed from: c */
        public final /* synthetic */ AtomicReference f77975c;

        public C13439a(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f77973a = countDownLatch;
            this.f77974b = atomicReference;
            this.f77975c = atomicReference2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f77973a.countDown();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            AbstractC23094xo1.m479a(this.f77974b, null, th2);
            this.f77973a.countDown();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f77975c.set(obj);
        }
    }

    public static <T> Future<T> toFuture(Observable<? extends T> observable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        return new FutureC13440b(countDownLatch, observable.single().subscribe((Subscriber<? super Object>) new C13439a(countDownLatch, atomicReference2, atomicReference)), atomicReference2, atomicReference);
    }

    /* renamed from: rx.internal.operators.BlockingOperatorToFuture$b */
    /* loaded from: classes7.dex */
    public static class FutureC13440b implements Future {

        /* renamed from: a */
        public volatile boolean f77976a;

        /* renamed from: b */
        public final /* synthetic */ CountDownLatch f77977b;

        /* renamed from: c */
        public final /* synthetic */ Subscription f77978c;

        /* renamed from: d */
        public final /* synthetic */ AtomicReference f77979d;

        /* renamed from: e */
        public final /* synthetic */ AtomicReference f77980e;

        public FutureC13440b(CountDownLatch countDownLatch, Subscription subscription, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f77977b = countDownLatch;
            this.f77978c = subscription;
            this.f77979d = atomicReference;
            this.f77980e = atomicReference2;
        }

        /* renamed from: a */
        public final Object m23344a() {
            Throwable th2 = (Throwable) this.f77979d.get();
            if (th2 == null) {
                if (!this.f77976a) {
                    return this.f77980e.get();
                }
                throw new CancellationException("Subscription unsubscribed");
            }
            throw new ExecutionException("Observable onError", th2);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (this.f77977b.getCount() > 0) {
                this.f77976a = true;
                this.f77978c.unsubscribe();
                this.f77977b.countDown();
                return true;
            }
            return false;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            this.f77977b.await();
            return m23344a();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f77976a;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            if (this.f77977b.getCount() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.concurrent.Future
        public Object get(long j, TimeUnit timeUnit) {
            if (this.f77977b.await(j, timeUnit)) {
                return m23344a();
            }
            throw new TimeoutException("Timed out after " + timeUnit.toMillis(j) + "ms waiting for underlying Observable.");
        }
    }
}