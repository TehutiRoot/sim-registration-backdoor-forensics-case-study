package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableScan<T> extends AbstractC11091a {

    /* renamed from: a */
    public final BiFunction f65483a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableScan$a */
    /* loaded from: classes5.dex */
    public static final class C11051a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65484a;

        /* renamed from: b */
        public final BiFunction f65485b;

        /* renamed from: c */
        public Disposable f65486c;

        /* renamed from: d */
        public Object f65487d;

        /* renamed from: e */
        public boolean f65488e;

        public C11051a(Observer observer, BiFunction biFunction) {
            this.f65484a = observer;
            this.f65485b = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65486c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65486c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65488e) {
                return;
            }
            this.f65488e = true;
            this.f65484a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65488e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65488e = true;
            this.f65484a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65488e) {
                return;
            }
            Observer observer = this.f65484a;
            Object obj2 = this.f65487d;
            if (obj2 == null) {
                this.f65487d = obj;
                observer.onNext(obj);
                return;
            }
            try {
                Object requireNonNull = ObjectHelper.requireNonNull(this.f65485b.apply(obj2, obj), "The value returned by the accumulator is null");
                this.f65487d = requireNonNull;
                observer.onNext(requireNonNull);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65486c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65486c, disposable)) {
                this.f65486c = disposable;
                this.f65484a.onSubscribe(this);
            }
        }
    }

    public ObservableScan(ObservableSource<T> observableSource, BiFunction<T, T, T> biFunction) {
        super(observableSource);
        this.f65483a = biFunction;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11051a(observer, this.f65483a));
    }
}
