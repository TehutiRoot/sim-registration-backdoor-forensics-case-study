package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableTakeWhile<T> extends AbstractC11078a {

    /* renamed from: a */
    public final Predicate f65651a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTakeWhile$a */
    /* loaded from: classes5.dex */
    public static final class C11053a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65652a;

        /* renamed from: b */
        public final Predicate f65653b;

        /* renamed from: c */
        public Disposable f65654c;

        /* renamed from: d */
        public boolean f65655d;

        public C11053a(Observer observer, Predicate predicate) {
            this.f65652a = observer;
            this.f65653b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65654c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65654c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65655d) {
                return;
            }
            this.f65655d = true;
            this.f65652a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65655d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65655d = true;
            this.f65652a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65655d) {
                return;
            }
            try {
                if (!this.f65653b.test(obj)) {
                    this.f65655d = true;
                    this.f65654c.dispose();
                    this.f65652a.onComplete();
                    return;
                }
                this.f65652a.onNext(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65654c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65654c, disposable)) {
                this.f65654c = disposable;
                this.f65652a.onSubscribe(this);
            }
        }
    }

    public ObservableTakeWhile(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f65651a = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11053a(observer, this.f65651a));
    }
}