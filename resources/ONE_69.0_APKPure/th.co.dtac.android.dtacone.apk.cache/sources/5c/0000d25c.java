package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class ObservableSkipWhile<T> extends AbstractC11078a {

    /* renamed from: a */
    public final Predicate f65614a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSkipWhile$a */
    /* loaded from: classes5.dex */
    public static final class C11047a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65615a;

        /* renamed from: b */
        public final Predicate f65616b;

        /* renamed from: c */
        public Disposable f65617c;

        /* renamed from: d */
        public boolean f65618d;

        public C11047a(Observer observer, Predicate predicate) {
            this.f65615a = observer;
            this.f65616b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65617c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65617c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65615a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65615a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65618d) {
                this.f65615a.onNext(obj);
                return;
            }
            try {
                if (!this.f65616b.test(obj)) {
                    this.f65618d = true;
                    this.f65615a.onNext(obj);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65617c.dispose();
                this.f65615a.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65617c, disposable)) {
                this.f65617c = disposable;
                this.f65615a.onSubscribe(this);
            }
        }
    }

    public ObservableSkipWhile(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f65614a = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11047a(observer, this.f65614a));
    }
}