package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class SingleDelay<T> extends Single<T> {

    /* renamed from: a */
    public final SingleSource f65857a;

    /* renamed from: b */
    public final long f65858b;

    /* renamed from: c */
    public final TimeUnit f65859c;

    /* renamed from: d */
    public final Scheduler f65860d;

    /* renamed from: e */
    public final boolean f65861e;

    /* renamed from: io.reactivex.internal.operators.single.SingleDelay$a */
    /* loaded from: classes5.dex */
    public final class C11112a implements SingleObserver {

        /* renamed from: a */
        public final SequentialDisposable f65862a;

        /* renamed from: b */
        public final SingleObserver f65863b;

        /* renamed from: io.reactivex.internal.operators.single.SingleDelay$a$a */
        /* loaded from: classes5.dex */
        public final class RunnableC11113a implements Runnable {

            /* renamed from: a */
            public final Throwable f65865a;

            public RunnableC11113a(Throwable th2) {
                this.f65865a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11112a.this.f65863b.onError(this.f65865a);
            }
        }

        /* renamed from: io.reactivex.internal.operators.single.SingleDelay$a$b */
        /* loaded from: classes5.dex */
        public final class RunnableC11114b implements Runnable {

            /* renamed from: a */
            public final Object f65867a;

            public RunnableC11114b(Object obj) {
                this.f65867a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                C11112a.this.f65863b.onSuccess(this.f65867a);
            }
        }

        public C11112a(SequentialDisposable sequentialDisposable, SingleObserver singleObserver) {
            this.f65862a = sequentialDisposable;
            this.f65863b = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            long j;
            SequentialDisposable sequentialDisposable = this.f65862a;
            Scheduler scheduler = SingleDelay.this.f65860d;
            RunnableC11113a runnableC11113a = new RunnableC11113a(th2);
            SingleDelay singleDelay = SingleDelay.this;
            if (singleDelay.f65861e) {
                j = singleDelay.f65858b;
            } else {
                j = 0;
            }
            sequentialDisposable.replace(scheduler.scheduleDirect(runnableC11113a, j, singleDelay.f65859c));
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f65862a.replace(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            SequentialDisposable sequentialDisposable = this.f65862a;
            Scheduler scheduler = SingleDelay.this.f65860d;
            RunnableC11114b runnableC11114b = new RunnableC11114b(obj);
            SingleDelay singleDelay = SingleDelay.this;
            sequentialDisposable.replace(scheduler.scheduleDirect(runnableC11114b, singleDelay.f65858b, singleDelay.f65859c));
        }
    }

    public SingleDelay(SingleSource<? extends T> singleSource, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        this.f65857a = singleSource;
        this.f65858b = j;
        this.f65859c = timeUnit;
        this.f65860d = scheduler;
        this.f65861e = z;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        singleObserver.onSubscribe(sequentialDisposable);
        this.f65857a.subscribe(new C11112a(sequentialDisposable, singleObserver));
    }
}
