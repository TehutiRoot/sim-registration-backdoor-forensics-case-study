package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableTakeUntilPredicate<T> extends AbstractC11078a {

    /* renamed from: a */
    public final Predicate f65646a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTakeUntilPredicate$a */
    /* loaded from: classes5.dex */
    public static final class C11052a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65647a;

        /* renamed from: b */
        public final Predicate f65648b;

        /* renamed from: c */
        public Disposable f65649c;

        /* renamed from: d */
        public boolean f65650d;

        public C11052a(Observer observer, Predicate predicate) {
            this.f65647a = observer;
            this.f65648b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65649c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65649c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.f65650d) {
                this.f65650d = true;
                this.f65647a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (!this.f65650d) {
                this.f65650d = true;
                this.f65647a.onError(th2);
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (!this.f65650d) {
                this.f65647a.onNext(obj);
                try {
                    if (this.f65648b.test(obj)) {
                        this.f65650d = true;
                        this.f65649c.dispose();
                        this.f65647a.onComplete();
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f65649c.dispose();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65649c, disposable)) {
                this.f65649c = disposable;
                this.f65647a.onSubscribe(this);
            }
        }
    }

    public ObservableTakeUntilPredicate(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f65646a = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11052a(observer, this.f65646a));
    }
}