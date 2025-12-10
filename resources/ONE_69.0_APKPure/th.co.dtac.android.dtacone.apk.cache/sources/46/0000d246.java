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
public final class ObservableScanSeed<T, R> extends AbstractC11078a {

    /* renamed from: a */
    public final BiFunction f65552a;

    /* renamed from: b */
    public final Callable f65553b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableScanSeed$a */
    /* loaded from: classes5.dex */
    public static final class C11039a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65554a;

        /* renamed from: b */
        public final BiFunction f65555b;

        /* renamed from: c */
        public Object f65556c;

        /* renamed from: d */
        public Disposable f65557d;

        /* renamed from: e */
        public boolean f65558e;

        public C11039a(Observer observer, BiFunction biFunction, Object obj) {
            this.f65554a = observer;
            this.f65555b = biFunction;
            this.f65556c = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65557d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65557d.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65558e) {
                return;
            }
            this.f65558e = true;
            this.f65554a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65558e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65558e = true;
            this.f65554a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65558e) {
                return;
            }
            try {
                Object requireNonNull = ObjectHelper.requireNonNull(this.f65555b.apply(this.f65556c, obj), "The accumulator returned a null value");
                this.f65556c = requireNonNull;
                this.f65554a.onNext(requireNonNull);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65557d.dispose();
                onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65557d, disposable)) {
                this.f65557d = disposable;
                this.f65554a.onSubscribe(this);
                this.f65554a.onNext(this.f65556c);
            }
        }
    }

    public ObservableScanSeed(ObservableSource<T> observableSource, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        super(observableSource);
        this.f65552a = biFunction;
        this.f65553b = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        try {
            this.source.subscribe(new C11039a(observer, this.f65552a, ObjectHelper.requireNonNull(this.f65553b.call(), "The seed supplied is null")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}