package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableSingleMaybe<T> extends Maybe<T> {

    /* renamed from: a */
    public final ObservableSource f65518a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSingleMaybe$a */
    /* loaded from: classes5.dex */
    public static final class C11055a implements Observer, Disposable {

        /* renamed from: a */
        public final MaybeObserver f65519a;

        /* renamed from: b */
        public Disposable f65520b;

        /* renamed from: c */
        public Object f65521c;

        /* renamed from: d */
        public boolean f65522d;

        public C11055a(MaybeObserver maybeObserver) {
            this.f65519a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65520b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65520b.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65522d) {
                return;
            }
            this.f65522d = true;
            Object obj = this.f65521c;
            this.f65521c = null;
            if (obj == null) {
                this.f65519a.onComplete();
            } else {
                this.f65519a.onSuccess(obj);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65522d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65522d = true;
            this.f65519a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65522d) {
                return;
            }
            if (this.f65521c != null) {
                this.f65522d = true;
                this.f65520b.dispose();
                this.f65519a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f65521c = obj;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65520b, disposable)) {
                this.f65520b = disposable;
                this.f65519a.onSubscribe(this);
            }
        }
    }

    public ObservableSingleMaybe(ObservableSource<T> observableSource) {
        this.f65518a = observableSource;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f65518a.subscribe(new C11055a(maybeObserver));
    }
}
