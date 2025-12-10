package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableDebounceTimed<T> extends AbstractC11078a {

    /* renamed from: a */
    public final long f65226a;

    /* renamed from: b */
    public final TimeUnit f65227b;

    /* renamed from: c */
    public final Scheduler f65228c;

    /* loaded from: classes5.dex */
    public static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Runnable, Disposable {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final C10973a parent;
        final T value;

        public DebounceEmitter(T t, long j, C10973a c10973a) {
            this.value = t;
            this.idx = j;
            this.parent = c10973a;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.m30314a(this.idx, this.value, this);
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDebounceTimed$a */
    /* loaded from: classes5.dex */
    public static final class C10973a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65229a;

        /* renamed from: b */
        public final long f65230b;

        /* renamed from: c */
        public final TimeUnit f65231c;

        /* renamed from: d */
        public final Scheduler.Worker f65232d;

        /* renamed from: e */
        public Disposable f65233e;

        /* renamed from: f */
        public Disposable f65234f;

        /* renamed from: g */
        public volatile long f65235g;

        /* renamed from: h */
        public boolean f65236h;

        public C10973a(Observer observer, long j, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f65229a = observer;
            this.f65230b = j;
            this.f65231c = timeUnit;
            this.f65232d = worker;
        }

        /* renamed from: a */
        public void m30314a(long j, Object obj, DebounceEmitter debounceEmitter) {
            if (j == this.f65235g) {
                this.f65229a.onNext(obj);
                debounceEmitter.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65233e.dispose();
            this.f65232d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65232d.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65236h) {
                return;
            }
            this.f65236h = true;
            Disposable disposable = this.f65234f;
            if (disposable != null) {
                disposable.dispose();
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            this.f65229a.onComplete();
            this.f65232d.dispose();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65236h) {
                RxJavaPlugins.onError(th2);
                return;
            }
            Disposable disposable = this.f65234f;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f65236h = true;
            this.f65229a.onError(th2);
            this.f65232d.dispose();
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65236h) {
                return;
            }
            long j = this.f65235g + 1;
            this.f65235g = j;
            Disposable disposable = this.f65234f;
            if (disposable != null) {
                disposable.dispose();
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(obj, j, this);
            this.f65234f = debounceEmitter;
            debounceEmitter.setResource(this.f65232d.schedule(debounceEmitter, this.f65230b, this.f65231c));
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65233e, disposable)) {
                this.f65233e = disposable;
                this.f65229a.onSubscribe(this);
            }
        }
    }

    public ObservableDebounceTimed(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler) {
        super(observableSource);
        this.f65226a = j;
        this.f65227b = timeUnit;
        this.f65228c = scheduler;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10973a(new SerializedObserver(observer), this.f65226a, this.f65227b, this.f65228c.createWorker()));
    }
}