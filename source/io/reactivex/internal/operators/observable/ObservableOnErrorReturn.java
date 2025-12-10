package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class ObservableOnErrorReturn<T> extends AbstractC11091a {

    /* renamed from: a */
    public final Function f65403a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableOnErrorReturn$a */
    /* loaded from: classes5.dex */
    public static final class C11034a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65404a;

        /* renamed from: b */
        public final Function f65405b;

        /* renamed from: c */
        public Disposable f65406c;

        public C11034a(Observer observer, Function function) {
            this.f65404a = observer;
            this.f65405b = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65406c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65406c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65404a.onComplete();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            try {
                Object apply = this.f65405b.apply(th2);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th2);
                    this.f65404a.onError(nullPointerException);
                    return;
                }
                this.f65404a.onNext(apply);
                this.f65404a.onComplete();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f65404a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65404a.onNext(obj);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65406c, disposable)) {
                this.f65406c = disposable;
                this.f65404a.onSubscribe(this);
            }
        }
    }

    public ObservableOnErrorReturn(ObservableSource<T> observableSource, Function<? super Throwable, ? extends T> function) {
        super(observableSource);
        this.f65403a = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11034a(observer, this.f65403a));
    }
}
