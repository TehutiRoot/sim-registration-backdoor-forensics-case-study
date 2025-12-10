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
    public final ObservableSource f65586a;

    /* renamed from: b */
    public final Object f65587b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSingleSingle$a */
    /* loaded from: classes5.dex */
    public static final class C11043a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65588a;

        /* renamed from: b */
        public final Object f65589b;

        /* renamed from: c */
        public Disposable f65590c;

        /* renamed from: d */
        public Object f65591d;

        /* renamed from: e */
        public boolean f65592e;

        public C11043a(SingleObserver singleObserver, Object obj) {
            this.f65588a = singleObserver;
            this.f65589b = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65590c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65590c.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65592e) {
                return;
            }
            this.f65592e = true;
            Object obj = this.f65591d;
            this.f65591d = null;
            if (obj == null) {
                obj = this.f65589b;
            }
            if (obj != null) {
                this.f65588a.onSuccess(obj);
            } else {
                this.f65588a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65592e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65592e = true;
            this.f65588a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65592e) {
                return;
            }
            if (this.f65591d != null) {
                this.f65592e = true;
                this.f65590c.dispose();
                this.f65588a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f65591d = obj;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65590c, disposable)) {
                this.f65590c = disposable;
                this.f65588a.onSubscribe(this);
            }
        }
    }

    public ObservableSingleSingle(ObservableSource<? extends T> observableSource, T t) {
        this.f65586a = observableSource;
        this.f65587b = t;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65586a.subscribe(new C11043a(singleObserver, this.f65587b));
    }
}