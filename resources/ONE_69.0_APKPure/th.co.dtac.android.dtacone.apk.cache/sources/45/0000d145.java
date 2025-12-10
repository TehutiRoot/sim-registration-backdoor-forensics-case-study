package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableAny<T> extends AbstractC11078a {

    /* renamed from: a */
    public final Predicate f65083a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableAny$a */
    /* loaded from: classes5.dex */
    public static final class C10954a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65084a;

        /* renamed from: b */
        public final Predicate f65085b;

        /* renamed from: c */
        public Disposable f65086c;

        /* renamed from: d */
        public boolean f65087d;

        public C10954a(Observer observer, Predicate predicate) {
            this.f65084a = observer;
            this.f65085b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65086c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65086c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.f65087d) {
                this.f65087d = true;
                this.f65084a.onNext(Boolean.FALSE);
                this.f65084a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65087d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65087d = true;
            this.f65084a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65087d) {
                return;
            }
            try {
                if (this.f65085b.test(obj)) {
                    this.f65087d = true;
                    this.f65086c.dispose();
                    this.f65084a.onNext(Boolean.TRUE);
                    this.f65084a.onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65086c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65086c, disposable)) {
                this.f65086c = disposable;
                this.f65084a.onSubscribe(this);
            }
        }
    }

    public ObservableAny(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f65083a = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Boolean> observer) {
        this.source.subscribe(new C10954a(observer, this.f65083a));
    }
}