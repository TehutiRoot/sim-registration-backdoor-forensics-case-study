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
    public final ObservableSource f65248a;

    /* renamed from: b */
    public final long f65249b;

    /* renamed from: c */
    public final Object f65250c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableElementAtSingle$a */
    /* loaded from: classes5.dex */
    public static final class C11001a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65251a;

        /* renamed from: b */
        public final long f65252b;

        /* renamed from: c */
        public final Object f65253c;

        /* renamed from: d */
        public Disposable f65254d;

        /* renamed from: e */
        public long f65255e;

        /* renamed from: f */
        public boolean f65256f;

        public C11001a(SingleObserver singleObserver, long j, Object obj) {
            this.f65251a = singleObserver;
            this.f65252b = j;
            this.f65253c = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65254d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65254d.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.f65256f) {
                this.f65256f = true;
                Object obj = this.f65253c;
                if (obj != null) {
                    this.f65251a.onSuccess(obj);
                } else {
                    this.f65251a.onError(new NoSuchElementException());
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65256f) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65256f = true;
            this.f65251a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65256f) {
                return;
            }
            long j = this.f65255e;
            if (j == this.f65252b) {
                this.f65256f = true;
                this.f65254d.dispose();
                this.f65251a.onSuccess(obj);
                return;
            }
            this.f65255e = j + 1;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65254d, disposable)) {
                this.f65254d = disposable;
                this.f65251a.onSubscribe(this);
            }
        }
    }

    public ObservableElementAtSingle(ObservableSource<T> observableSource, long j, T t) {
        this.f65248a = observableSource;
        this.f65249b = j;
        this.f65250c = t;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<T> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableElementAt(this.f65248a, this.f65249b, this.f65250c, true));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65248a.subscribe(new C11001a(singleObserver, this.f65249b, this.f65250c));
    }
}
