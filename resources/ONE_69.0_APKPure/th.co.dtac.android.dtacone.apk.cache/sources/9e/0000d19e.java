package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class ObservableElementAtSingle<T> extends Single<T> implements FuseToObservable<T> {

    /* renamed from: a */
    public final ObservableSource f65311a;

    /* renamed from: b */
    public final long f65312b;

    /* renamed from: c */
    public final Object f65313c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableElementAtSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10988a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65314a;

        /* renamed from: b */
        public final long f65315b;

        /* renamed from: c */
        public final Object f65316c;

        /* renamed from: d */
        public Disposable f65317d;

        /* renamed from: e */
        public long f65318e;

        /* renamed from: f */
        public boolean f65319f;

        public C10988a(SingleObserver singleObserver, long j, Object obj) {
            this.f65314a = singleObserver;
            this.f65315b = j;
            this.f65316c = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65317d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65317d.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.f65319f) {
                this.f65319f = true;
                Object obj = this.f65316c;
                if (obj != null) {
                    this.f65314a.onSuccess(obj);
                } else {
                    this.f65314a.onError(new NoSuchElementException());
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65319f) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65319f = true;
            this.f65314a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65319f) {
                return;
            }
            long j = this.f65318e;
            if (j == this.f65315b) {
                this.f65319f = true;
                this.f65317d.dispose();
                this.f65314a.onSuccess(obj);
                return;
            }
            this.f65318e = j + 1;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65317d, disposable)) {
                this.f65317d = disposable;
                this.f65314a.onSubscribe(this);
            }
        }
    }

    public ObservableElementAtSingle(ObservableSource<T> observableSource, long j, T t) {
        this.f65311a = observableSource;
        this.f65312b = j;
        this.f65313c = t;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<T> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableElementAt(this.f65311a, this.f65312b, this.f65313c, true));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65311a.subscribe(new C10988a(singleObserver, this.f65312b, this.f65313c));
    }
}