package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class ObservableSingleSingle<T> extends Single<T> {

    /* renamed from: a */
    public final ObservableSource f65523a;

    /* renamed from: b */
    public final Object f65524b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSingleSingle$a */
    /* loaded from: classes5.dex */
    public static final class C11056a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65525a;

        /* renamed from: b */
        public final Object f65526b;

        /* renamed from: c */
        public Disposable f65527c;

        /* renamed from: d */
        public Object f65528d;

        /* renamed from: e */
        public boolean f65529e;

        public C11056a(SingleObserver singleObserver, Object obj) {
            this.f65525a = singleObserver;
            this.f65526b = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65527c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65527c.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65529e) {
                return;
            }
            this.f65529e = true;
            Object obj = this.f65528d;
            this.f65528d = null;
            if (obj == null) {
                obj = this.f65526b;
            }
            if (obj != null) {
                this.f65525a.onSuccess(obj);
            } else {
                this.f65525a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65529e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65529e = true;
            this.f65525a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65529e) {
                return;
            }
            if (this.f65528d != null) {
                this.f65529e = true;
                this.f65527c.dispose();
                this.f65525a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f65528d = obj;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65527c, disposable)) {
                this.f65527c = disposable;
                this.f65525a.onSubscribe(this);
            }
        }
    }

    public ObservableSingleSingle(ObservableSource<? extends T> observableSource, T t) {
        this.f65523a = observableSource;
        this.f65524b = t;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65523a.subscribe(new C11056a(singleObserver, this.f65524b));
    }
}
