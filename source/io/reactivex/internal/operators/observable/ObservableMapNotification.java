package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class ObservableMapNotification<T, R> extends AbstractC11091a {

    /* renamed from: a */
    public final Function f65379a;

    /* renamed from: b */
    public final Function f65380b;

    /* renamed from: c */
    public final Callable f65381c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableMapNotification$a */
    /* loaded from: classes5.dex */
    public static final class C11031a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65382a;

        /* renamed from: b */
        public final Function f65383b;

        /* renamed from: c */
        public final Function f65384c;

        /* renamed from: d */
        public final Callable f65385d;

        /* renamed from: e */
        public Disposable f65386e;

        public C11031a(Observer observer, Function function, Function function2, Callable callable) {
            this.f65382a = observer;
            this.f65383b = function;
            this.f65384c = function2;
            this.f65385d = callable;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65386e.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65386e.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            try {
                this.f65382a.onNext((ObservableSource) ObjectHelper.requireNonNull(this.f65385d.call(), "The onComplete ObservableSource returned is null"));
                this.f65382a.onComplete();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65382a.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            try {
                this.f65382a.onNext((ObservableSource) ObjectHelper.requireNonNull(this.f65384c.apply(th2), "The onError ObservableSource returned is null"));
                this.f65382a.onComplete();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f65382a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            try {
                this.f65382a.onNext((ObservableSource) ObjectHelper.requireNonNull(this.f65383b.apply(obj), "The onNext ObservableSource returned is null"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65382a.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65386e, disposable)) {
                this.f65386e = disposable;
                this.f65382a.onSubscribe(this);
            }
        }
    }

    public ObservableMapNotification(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, Callable<? extends ObservableSource<? extends R>> callable) {
        super(observableSource);
        this.f65379a = function;
        this.f65380b = function2;
        this.f65381c = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super ObservableSource<? extends R>> observer) {
        this.source.subscribe(new C11031a(observer, this.f65379a, this.f65380b, this.f65381c));
    }
}
