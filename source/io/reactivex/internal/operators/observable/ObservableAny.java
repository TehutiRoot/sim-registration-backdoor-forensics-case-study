package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableAny<T> extends AbstractC11091a {

    /* renamed from: a */
    public final Predicate f65020a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableAny$a */
    /* loaded from: classes5.dex */
    public static final class C10967a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65021a;

        /* renamed from: b */
        public final Predicate f65022b;

        /* renamed from: c */
        public Disposable f65023c;

        /* renamed from: d */
        public boolean f65024d;

        public C10967a(Observer observer, Predicate predicate) {
            this.f65021a = observer;
            this.f65022b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65023c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65023c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.f65024d) {
                this.f65024d = true;
                this.f65021a.onNext(Boolean.FALSE);
                this.f65021a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65024d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65024d = true;
            this.f65021a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65024d) {
                return;
            }
            try {
                if (this.f65022b.test(obj)) {
                    this.f65024d = true;
                    this.f65023c.dispose();
                    this.f65021a.onNext(Boolean.TRUE);
                    this.f65021a.onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65023c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65023c, disposable)) {
                this.f65023c = disposable;
                this.f65021a.onSubscribe(this);
            }
        }
    }

    public ObservableAny(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f65020a = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Boolean> observer) {
        this.source.subscribe(new C10967a(observer, this.f65020a));
    }
}
