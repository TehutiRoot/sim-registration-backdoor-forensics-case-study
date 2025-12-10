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
public final class ObservableDebounce<T, U> extends AbstractC11091a {

    /* renamed from: a */
    public final Function f65151a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDebounce$a */
    /* loaded from: classes5.dex */
    public static final class C10984a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65152a;

        /* renamed from: b */
        public final Function f65153b;

        /* renamed from: c */
        public Disposable f65154c;

        /* renamed from: d */
        public final AtomicReference f65155d = new AtomicReference();

        /* renamed from: e */
        public volatile long f65156e;

        /* renamed from: f */
        public boolean f65157f;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableDebounce$a$a */
        /* loaded from: classes5.dex */
        public static final class C10985a extends DisposableObserver {

            /* renamed from: b */
            public final C10984a f65158b;

            /* renamed from: c */
            public final long f65159c;

            /* renamed from: d */
            public final Object f65160d;

            /* renamed from: e */
            public boolean f65161e;

            /* renamed from: f */
            public final AtomicBoolean f65162f = new AtomicBoolean();

            public C10985a(C10984a c10984a, long j, Object obj) {
                this.f65158b = c10984a;
                this.f65159c = j;
                this.f65160d = obj;
            }

            /* renamed from: a */
            public void m29975a() {
                if (this.f65162f.compareAndSet(false, true)) {
                    this.f65158b.m29976a(this.f65159c, this.f65160d);
                }
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                if (this.f65161e) {
                    return;
                }
                this.f65161e = true;
                m29975a();
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th2) {
                if (this.f65161e) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
                this.f65161e = true;
                this.f65158b.onError(th2);
            }

            @Override // io.reactivex.Observer
            public void onNext(Object obj) {
                if (this.f65161e) {
                    return;
                }
                this.f65161e = true;
                dispose();
                m29975a();
            }
        }

        public C10984a(Observer observer, Function function) {
            this.f65152a = observer;
            this.f65153b = function;
        }

        /* renamed from: a */
        public void m29976a(long j, Object obj) {
            if (j == this.f65156e) {
                this.f65152a.onNext(obj);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65154c.dispose();
            DisposableHelper.dispose(this.f65155d);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65154c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65157f) {
                return;
            }
            this.f65157f = true;
            Disposable disposable = (Disposable) this.f65155d.get();
            if (disposable != DisposableHelper.DISPOSED) {
                ((C10985a) disposable).m29975a();
                DisposableHelper.dispose(this.f65155d);
                this.f65152a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.f65155d);
            this.f65152a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65157f) {
                return;
            }
            long j = this.f65156e + 1;
            this.f65156e = j;
            Disposable disposable = (Disposable) this.f65155d.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f65153b.apply(obj), "The ObservableSource supplied is null");
                C10985a c10985a = new C10985a(this, j, obj);
                if (AbstractC17300An1.m69050a(this.f65155d, disposable, c10985a)) {
                    observableSource.subscribe(c10985a);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                dispose();
                this.f65152a.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65154c, disposable)) {
                this.f65154c = disposable;
                this.f65152a.onSubscribe(this);
            }
        }
    }

    public ObservableDebounce(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<U>> function) {
        super(observableSource);
        this.f65151a = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10984a(new SerializedObserver(observer), this.f65151a));
    }
}
