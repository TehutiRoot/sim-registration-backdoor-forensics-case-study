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
    public final SingleSource f65920a;

    /* renamed from: b */
    public final long f65921b;

    /* renamed from: c */
    public final TimeUnit f65922c;

    /* renamed from: d */
    public final Scheduler f65923d;

    /* renamed from: e */
    public final boolean f65924e;

    /* renamed from: io.reactivex.internal.operators.single.SingleDelay$a */
    /* loaded from: classes5.dex */
    public final class C11099a implements SingleObserver {

        /* renamed from: a */
        public final SequentialDisposable f65925a;

        /* renamed from: b */
        public final SingleObserver f65926b;

        /* renamed from: io.reactivex.internal.operators.single.SingleDelay$a$a */
        /* loaded from: classes5.dex */
        public final class RunnableC11100a implements Runnable {

            /* renamed from: a */
            public final Throwable f65928a;

            public RunnableC11100a(Throwable th2) {
                this.f65928a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11099a.this.f65926b.onError(this.f65928a);
            }
        }

        /* renamed from: io.reactivex.internal.operators.single.SingleDelay$a$b */
        /* loaded from: classes5.dex */
        public final class RunnableC11101b implements Runnable {

            /* renamed from: a */
            public final Object f65930a;

            public RunnableC11101b(Object obj) {
                this.f65930a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                C11099a.this.f65926b.onSuccess(this.f65930a);
            }
        }

        public C11099a(SequentialDisposable sequentialDisposable, SingleObserver singleObserver) {
            this.f65925a = sequentialDisposable;
            this.f65926b = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            long j;
            SequentialDisposable sequentialDisposable = this.f65925a;
            Scheduler scheduler = SingleDelay.this.f65923d;
            RunnableC11100a runnableC11100a = new RunnableC11100a(th2);
            SingleDelay singleDelay = SingleDelay.this;
            if (singleDelay.f65924e) {
                j = singleDelay.f65921b;
            } else {
                j = 0;
            }
            sequentialDisposable.replace(scheduler.scheduleDirect(runnableC11100a, j, singleDelay.f65922c));
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f65925a.replace(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            SequentialDisposable sequentialDisposable = this.f65925a;
            Scheduler scheduler = SingleDelay.this.f65923d;
            RunnableC11101b runnableC11101b = new RunnableC11101b(obj);
            SingleDelay singleDelay = SingleDelay.this;
            sequentialDisposable.replace(scheduler.scheduleDirect(runnableC11101b, singleDelay.f65921b, singleDelay.f65922c));
        }
    }

    public SingleDelay(SingleSource<? extends T> singleSource, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        this.f65920a = singleSource;
        this.f65921b = j;
        this.f65922c = timeUnit;
        this.f65923d = scheduler;
        this.f65924e = z;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        singleObserver.onSubscribe(sequentialDisposable);
        this.f65920a.subscribe(new C11099a(sequentialDisposable, singleObserver));
    }
}