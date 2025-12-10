package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableTakeUntilPredicate<T> extends AbstractC11091a {

    /* renamed from: a */
    public final Predicate f65583a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTakeUntilPredicate$a */
    /* loaded from: classes5.dex */
    public static final class C11065a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65584a;

        /* renamed from: b */
        public final Predicate f65585b;

        /* renamed from: c */
        public Disposable f65586c;

        /* renamed from: d */
        public boolean f65587d;

        public C11065a(Observer observer, Predicate predicate) {
            this.f65584a = observer;
            this.f65585b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65586c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65586c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.f65587d) {
                this.f65587d = true;
                this.f65584a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (!this.f65587d) {
                this.f65587d = true;
                this.f65584a.onError(th2);
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (!this.f65587d) {
                this.f65584a.onNext(obj);
                try {
                    if (this.f65585b.test(obj)) {
                        this.f65587d = true;
                        this.f65586c.dispose();
                        this.f65584a.onComplete();
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f65586c.dispose();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65586c, disposable)) {
                this.f65586c = disposable;
                this.f65584a.onSubscribe(this);
            }
        }
    }

    public ObservableTakeUntilPredicate(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f65583a = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11065a(observer, this.f65583a));
    }
}
