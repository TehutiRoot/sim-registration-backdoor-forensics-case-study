package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableAll<T> extends AbstractC11078a {

    /* renamed from: a */
    public final Predicate f65067a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableAll$a */
    /* loaded from: classes5.dex */
    public static final class C10951a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65068a;

        /* renamed from: b */
        public final Predicate f65069b;

        /* renamed from: c */
        public Disposable f65070c;

        /* renamed from: d */
        public boolean f65071d;

        public C10951a(Observer observer, Predicate predicate) {
            this.f65068a = observer;
            this.f65069b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65070c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65070c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65071d) {
                return;
            }
            this.f65071d = true;
            this.f65068a.onNext(Boolean.TRUE);
            this.f65068a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65071d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65071d = true;
            this.f65068a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65071d) {
                return;
            }
            try {
                if (!this.f65069b.test(obj)) {
                    this.f65071d = true;
                    this.f65070c.dispose();
                    this.f65068a.onNext(Boolean.FALSE);
                    this.f65068a.onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65070c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65070c, disposable)) {
                this.f65070c = disposable;
                this.f65068a.onSubscribe(this);
            }
        }
    }

    public ObservableAll(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f65067a = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Boolean> observer) {
        this.source.subscribe(new C10951a(observer, this.f65067a));
    }
}