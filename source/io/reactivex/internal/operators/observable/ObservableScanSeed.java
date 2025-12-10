package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class ObservableScanSeed<T, R> extends AbstractC11091a {

    /* renamed from: a */
    public final BiFunction f65489a;

    /* renamed from: b */
    public final Callable f65490b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableScanSeed$a */
    /* loaded from: classes5.dex */
    public static final class C11052a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65491a;

        /* renamed from: b */
        public final BiFunction f65492b;

        /* renamed from: c */
        public Object f65493c;

        /* renamed from: d */
        public Disposable f65494d;

        /* renamed from: e */
        public boolean f65495e;

        public C11052a(Observer observer, BiFunction biFunction, Object obj) {
            this.f65491a = observer;
            this.f65492b = biFunction;
            this.f65493c = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65494d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65494d.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65495e) {
                return;
            }
            this.f65495e = true;
            this.f65491a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65495e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65495e = true;
            this.f65491a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65495e) {
                return;
            }
            try {
                Object requireNonNull = ObjectHelper.requireNonNull(this.f65492b.apply(this.f65493c, obj), "The accumulator returned a null value");
                this.f65493c = requireNonNull;
                this.f65491a.onNext(requireNonNull);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65494d.dispose();
                onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65494d, disposable)) {
                this.f65494d = disposable;
                this.f65491a.onSubscribe(this);
                this.f65491a.onNext(this.f65493c);
            }
        }
    }

    public ObservableScanSeed(ObservableSource<T> observableSource, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        super(observableSource);
        this.f65489a = biFunction;
        this.f65490b = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        try {
            this.source.subscribe(new C11052a(observer, this.f65489a, ObjectHelper.requireNonNull(this.f65490b.call(), "The seed supplied is null")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
