package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class ObservableDelay<T> extends AbstractC11091a {

    /* renamed from: a */
    public final long f65175a;

    /* renamed from: b */
    public final TimeUnit f65176b;

    /* renamed from: c */
    public final Scheduler f65177c;

    /* renamed from: d */
    public final boolean f65178d;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDelay$a */
    /* loaded from: classes5.dex */
    public static final class C10987a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65179a;

        /* renamed from: b */
        public final long f65180b;

        /* renamed from: c */
        public final TimeUnit f65181c;

        /* renamed from: d */
        public final Scheduler.Worker f65182d;

        /* renamed from: e */
        public final boolean f65183e;

        /* renamed from: f */
        public Disposable f65184f;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableDelay$a$a */
        /* loaded from: classes5.dex */
        public final class RunnableC10988a implements Runnable {
            public RunnableC10988a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C10987a.this.f65179a.onComplete();
                } finally {
                    C10987a.this.f65182d.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.ObservableDelay$a$b */
        /* loaded from: classes5.dex */
        public final class RunnableC10989b implements Runnable {

            /* renamed from: a */
            public final Throwable f65186a;

            public RunnableC10989b(Throwable th2) {
                this.f65186a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C10987a.this.f65179a.onError(this.f65186a);
                } finally {
                    C10987a.this.f65182d.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.ObservableDelay$a$c */
        /* loaded from: classes5.dex */
        public final class RunnableC10990c implements Runnable {

            /* renamed from: a */
            public final Object f65188a;

            public RunnableC10990c(Object obj) {
                this.f65188a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                C10987a.this.f65179a.onNext(this.f65188a);
            }
        }

        public C10987a(Observer observer, long j, TimeUnit timeUnit, Scheduler.Worker worker, boolean z) {
            this.f65179a = observer;
            this.f65180b = j;
            this.f65181c = timeUnit;
            this.f65182d = worker;
            this.f65183e = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65184f.dispose();
            this.f65182d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65182d.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65182d.schedule(new RunnableC10988a(), this.f65180b, this.f65181c);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            long j;
            Scheduler.Worker worker = this.f65182d;
            RunnableC10989b runnableC10989b = new RunnableC10989b(th2);
            if (this.f65183e) {
                j = this.f65180b;
            } else {
                j = 0;
            }
            worker.schedule(runnableC10989b, j, this.f65181c);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65182d.schedule(new RunnableC10990c(obj), this.f65180b, this.f65181c);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65184f, disposable)) {
                this.f65184f = disposable;
                this.f65179a.onSubscribe(this);
            }
        }
    }

    public ObservableDelay(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(observableSource);
        this.f65175a = j;
        this.f65176b = timeUnit;
        this.f65177c = scheduler;
        this.f65178d = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SerializedObserver serializedObserver;
        if (this.f65178d) {
            serializedObserver = observer;
        } else {
            serializedObserver = new SerializedObserver(observer);
        }
        this.source.subscribe(new C10987a(serializedObserver, this.f65175a, this.f65176b, this.f65177c.createWorker(), this.f65178d));
    }
}
