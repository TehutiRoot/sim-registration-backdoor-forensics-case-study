package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class ObservableDelay<T> extends AbstractC11078a {

    /* renamed from: a */
    public final long f65238a;

    /* renamed from: b */
    public final TimeUnit f65239b;

    /* renamed from: c */
    public final Scheduler f65240c;

    /* renamed from: d */
    public final boolean f65241d;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDelay$a */
    /* loaded from: classes5.dex */
    public static final class C10974a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65242a;

        /* renamed from: b */
        public final long f65243b;

        /* renamed from: c */
        public final TimeUnit f65244c;

        /* renamed from: d */
        public final Scheduler.Worker f65245d;

        /* renamed from: e */
        public final boolean f65246e;

        /* renamed from: f */
        public Disposable f65247f;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableDelay$a$a */
        /* loaded from: classes5.dex */
        public final class RunnableC10975a implements Runnable {
            public RunnableC10975a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C10974a.this.f65242a.onComplete();
                } finally {
                    C10974a.this.f65245d.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.ObservableDelay$a$b */
        /* loaded from: classes5.dex */
        public final class RunnableC10976b implements Runnable {

            /* renamed from: a */
            public final Throwable f65249a;

            public RunnableC10976b(Throwable th2) {
                this.f65249a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C10974a.this.f65242a.onError(this.f65249a);
                } finally {
                    C10974a.this.f65245d.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.ObservableDelay$a$c */
        /* loaded from: classes5.dex */
        public final class RunnableC10977c implements Runnable {

            /* renamed from: a */
            public final Object f65251a;

            public RunnableC10977c(Object obj) {
                this.f65251a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                C10974a.this.f65242a.onNext(this.f65251a);
            }
        }

        public C10974a(Observer observer, long j, TimeUnit timeUnit, Scheduler.Worker worker, boolean z) {
            this.f65242a = observer;
            this.f65243b = j;
            this.f65244c = timeUnit;
            this.f65245d = worker;
            this.f65246e = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65247f.dispose();
            this.f65245d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65245d.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65245d.schedule(new RunnableC10975a(), this.f65243b, this.f65244c);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            long j;
            Scheduler.Worker worker = this.f65245d;
            RunnableC10976b runnableC10976b = new RunnableC10976b(th2);
            if (this.f65246e) {
                j = this.f65243b;
            } else {
                j = 0;
            }
            worker.schedule(runnableC10976b, j, this.f65244c);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65245d.schedule(new RunnableC10977c(obj), this.f65243b, this.f65244c);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65247f, disposable)) {
                this.f65247f = disposable;
                this.f65242a.onSubscribe(this);
            }
        }
    }

    public ObservableDelay(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(observableSource);
        this.f65238a = j;
        this.f65239b = timeUnit;
        this.f65240c = scheduler;
        this.f65241d = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SerializedObserver serializedObserver;
        if (this.f65241d) {
            serializedObserver = observer;
        } else {
            serializedObserver = new SerializedObserver(observer);
        }
        this.source.subscribe(new C10974a(serializedObserver, this.f65238a, this.f65239b, this.f65240c.createWorker(), this.f65241d));
    }
}