package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class ObservableSkipWhile<T> extends AbstractC11091a {

    /* renamed from: a */
    public final Predicate f65551a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSkipWhile$a */
    /* loaded from: classes5.dex */
    public static final class C11060a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65552a;

        /* renamed from: b */
        public final Predicate f65553b;

        /* renamed from: c */
        public Disposable f65554c;

        /* renamed from: d */
        public boolean f65555d;

        public C11060a(Observer observer, Predicate predicate) {
            this.f65552a = observer;
            this.f65553b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65554c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65554c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65552a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65552a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65555d) {
                this.f65552a.onNext(obj);
                return;
            }
            try {
                if (!this.f65553b.test(obj)) {
                    this.f65555d = true;
                    this.f65552a.onNext(obj);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65554c.dispose();
                this.f65552a.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65554c, disposable)) {
                this.f65554c = disposable;
                this.f65552a.onSubscribe(this);
            }
        }
    }

    public ObservableSkipWhile(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f65551a = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11060a(observer, this.f65551a));
    }
}
