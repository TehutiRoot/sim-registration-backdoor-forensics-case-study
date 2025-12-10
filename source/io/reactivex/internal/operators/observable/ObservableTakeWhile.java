package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableTakeWhile<T> extends AbstractC11091a {

    /* renamed from: a */
    public final Predicate f65588a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTakeWhile$a */
    /* loaded from: classes5.dex */
    public static final class C11066a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65589a;

        /* renamed from: b */
        public final Predicate f65590b;

        /* renamed from: c */
        public Disposable f65591c;

        /* renamed from: d */
        public boolean f65592d;

        public C11066a(Observer observer, Predicate predicate) {
            this.f65589a = observer;
            this.f65590b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65591c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65591c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65592d) {
                return;
            }
            this.f65592d = true;
            this.f65589a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65592d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65592d = true;
            this.f65589a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65592d) {
                return;
            }
            try {
                if (!this.f65590b.test(obj)) {
                    this.f65592d = true;
                    this.f65591c.dispose();
                    this.f65589a.onComplete();
                    return;
                }
                this.f65589a.onNext(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65591c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65591c, disposable)) {
                this.f65591c = disposable;
                this.f65589a.onSubscribe(this);
            }
        }
    }

    public ObservableTakeWhile(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f65588a = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11066a(observer, this.f65588a));
    }
}
