package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableDebounce<T, U> extends AbstractC11078a {

    /* renamed from: a */
    public final Function f65214a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDebounce$a */
    /* loaded from: classes5.dex */
    public static final class C10971a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65215a;

        /* renamed from: b */
        public final Function f65216b;

        /* renamed from: c */
        public Disposable f65217c;

        /* renamed from: d */
        public final AtomicReference f65218d = new AtomicReference();

        /* renamed from: e */
        public volatile long f65219e;

        /* renamed from: f */
        public boolean f65220f;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableDebounce$a$a */
        /* loaded from: classes5.dex */
        public static final class C10972a extends DisposableObserver {

            /* renamed from: b */
            public final C10971a f65221b;

            /* renamed from: c */
            public final long f65222c;

            /* renamed from: d */
            public final Object f65223d;

            /* renamed from: e */
            public boolean f65224e;

            /* renamed from: f */
            public final AtomicBoolean f65225f = new AtomicBoolean();

            public C10972a(C10971a c10971a, long j, Object obj) {
                this.f65221b = c10971a;
                this.f65222c = j;
                this.f65223d = obj;
            }

            /* renamed from: a */
            public void m30315a() {
                if (this.f65225f.compareAndSet(false, true)) {
                    this.f65221b.m30316a(this.f65222c, this.f65223d);
                }
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                if (this.f65224e) {
                    return;
                }
                this.f65224e = true;
                m30315a();
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th2) {
                if (this.f65224e) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
                this.f65224e = true;
                this.f65221b.onError(th2);
            }

            @Override // io.reactivex.Observer
            public void onNext(Object obj) {
                if (this.f65224e) {
                    return;
                }
                this.f65224e = true;
                dispose();
                m30315a();
            }
        }

        public C10971a(Observer observer, Function function) {
            this.f65215a = observer;
            this.f65216b = function;
        }

        /* renamed from: a */
        public void m30316a(long j, Object obj) {
            if (j == this.f65219e) {
                this.f65215a.onNext(obj);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65217c.dispose();
            DisposableHelper.dispose(this.f65218d);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65217c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65220f) {
                return;
            }
            this.f65220f = true;
            Disposable disposable = (Disposable) this.f65218d.get();
            if (disposable != DisposableHelper.DISPOSED) {
                ((C10972a) disposable).m30315a();
                DisposableHelper.dispose(this.f65218d);
                this.f65215a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.f65218d);
            this.f65215a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65220f) {
                return;
            }
            long j = this.f65219e + 1;
            this.f65219e = j;
            Disposable disposable = (Disposable) this.f65218d.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f65216b.apply(obj), "The ObservableSource supplied is null");
                C10972a c10972a = new C10972a(this, j, obj);
                if (AbstractC23094xo1.m479a(this.f65218d, disposable, c10972a)) {
                    observableSource.subscribe(c10972a);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                dispose();
                this.f65215a.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65217c, disposable)) {
                this.f65217c = disposable;
                this.f65215a.onSubscribe(this);
            }
        }
    }

    public ObservableDebounce(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<U>> function) {
        super(observableSource);
        this.f65214a = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10971a(new SerializedObserver(observer), this.f65214a));
    }
}