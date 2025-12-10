package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableAll<T> extends AbstractC11091a {

    /* renamed from: a */
    public final Predicate f65004a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableAll$a */
    /* loaded from: classes5.dex */
    public static final class C10964a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65005a;

        /* renamed from: b */
        public final Predicate f65006b;

        /* renamed from: c */
        public Disposable f65007c;

        /* renamed from: d */
        public boolean f65008d;

        public C10964a(Observer observer, Predicate predicate) {
            this.f65005a = observer;
            this.f65006b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65007c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65007c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65008d) {
                return;
            }
            this.f65008d = true;
            this.f65005a.onNext(Boolean.TRUE);
            this.f65005a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65008d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65008d = true;
            this.f65005a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65008d) {
                return;
            }
            try {
                if (!this.f65006b.test(obj)) {
                    this.f65008d = true;
                    this.f65007c.dispose();
                    this.f65005a.onNext(Boolean.FALSE);
                    this.f65005a.onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65007c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65007c, disposable)) {
                this.f65007c = disposable;
                this.f65005a.onSubscribe(this);
            }
        }
    }

    public ObservableAll(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f65004a = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Boolean> observer) {
        this.source.subscribe(new C10964a(observer, this.f65004a));
    }
}
