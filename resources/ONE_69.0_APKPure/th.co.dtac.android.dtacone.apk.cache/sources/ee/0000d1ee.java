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
public final class ObservableMapNotification<T, R> extends AbstractC11078a {

    /* renamed from: a */
    public final Function f65442a;

    /* renamed from: b */
    public final Function f65443b;

    /* renamed from: c */
    public final Callable f65444c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableMapNotification$a */
    /* loaded from: classes5.dex */
    public static final class C11018a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65445a;

        /* renamed from: b */
        public final Function f65446b;

        /* renamed from: c */
        public final Function f65447c;

        /* renamed from: d */
        public final Callable f65448d;

        /* renamed from: e */
        public Disposable f65449e;

        public C11018a(Observer observer, Function function, Function function2, Callable callable) {
            this.f65445a = observer;
            this.f65446b = function;
            this.f65447c = function2;
            this.f65448d = callable;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65449e.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65449e.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            try {
                this.f65445a.onNext((ObservableSource) ObjectHelper.requireNonNull(this.f65448d.call(), "The onComplete ObservableSource returned is null"));
                this.f65445a.onComplete();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65445a.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            try {
                this.f65445a.onNext((ObservableSource) ObjectHelper.requireNonNull(this.f65447c.apply(th2), "The onError ObservableSource returned is null"));
                this.f65445a.onComplete();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f65445a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            try {
                this.f65445a.onNext((ObservableSource) ObjectHelper.requireNonNull(this.f65446b.apply(obj), "The onNext ObservableSource returned is null"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65445a.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65449e, disposable)) {
                this.f65449e = disposable;
                this.f65445a.onSubscribe(this);
            }
        }
    }

    public ObservableMapNotification(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, Callable<? extends ObservableSource<? extends R>> callable) {
        super(observableSource);
        this.f65442a = function;
        this.f65443b = function2;
        this.f65444c = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super ObservableSource<? extends R>> observer) {
        this.source.subscribe(new C11018a(observer, this.f65442a, this.f65443b, this.f65444c));
    }
}