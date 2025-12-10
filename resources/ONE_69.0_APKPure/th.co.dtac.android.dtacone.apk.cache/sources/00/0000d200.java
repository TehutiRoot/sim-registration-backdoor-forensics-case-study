package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class ObservableOnErrorReturn<T> extends AbstractC11078a {

    /* renamed from: a */
    public final Function f65466a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableOnErrorReturn$a */
    /* loaded from: classes5.dex */
    public static final class C11021a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65467a;

        /* renamed from: b */
        public final Function f65468b;

        /* renamed from: c */
        public Disposable f65469c;

        public C11021a(Observer observer, Function function) {
            this.f65467a = observer;
            this.f65468b = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65469c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65469c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65467a.onComplete();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            try {
                Object apply = this.f65468b.apply(th2);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th2);
                    this.f65467a.onError(nullPointerException);
                    return;
                }
                this.f65467a.onNext(apply);
                this.f65467a.onComplete();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f65467a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65467a.onNext(obj);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65469c, disposable)) {
                this.f65469c = disposable;
                this.f65467a.onSubscribe(this);
            }
        }
    }

    public ObservableOnErrorReturn(ObservableSource<T> observableSource, Function<? super Throwable, ? extends T> function) {
        super(observableSource);
        this.f65466a = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11021a(observer, this.f65466a));
    }
}