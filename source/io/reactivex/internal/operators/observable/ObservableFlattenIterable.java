package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableFlattenIterable<T, R> extends AbstractC11091a {

    /* renamed from: a */
    public final Function f65274a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableFlattenIterable$a */
    /* loaded from: classes5.dex */
    public static final class C11003a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65275a;

        /* renamed from: b */
        public final Function f65276b;

        /* renamed from: c */
        public Disposable f65277c;

        public C11003a(Observer observer, Function function) {
            this.f65275a = observer;
            this.f65276b = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65277c.dispose();
            this.f65277c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65277c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Disposable disposable = this.f65277c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                return;
            }
            this.f65277c = disposableHelper;
            this.f65275a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            Disposable disposable = this.f65277c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65277c = disposableHelper;
            this.f65275a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65277c == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                Observer observer = this.f65275a;
                for (T t : (Iterable) this.f65276b.apply(obj)) {
                    try {
                        try {
                            observer.onNext(ObjectHelper.requireNonNull(t, "The iterator returned a null value"));
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            this.f65277c.dispose();
                            onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        this.f65277c.dispose();
                        onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                this.f65277c.dispose();
                onError(th4);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65277c, disposable)) {
                this.f65277c = disposable;
                this.f65275a.onSubscribe(this);
            }
        }
    }

    public ObservableFlattenIterable(ObservableSource<T> observableSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        super(observableSource);
        this.f65274a = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.source.subscribe(new C11003a(observer, this.f65274a));
    }
}
