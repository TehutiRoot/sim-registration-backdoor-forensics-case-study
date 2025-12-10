package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableElementAtMaybe<T> extends Maybe<T> implements FuseToObservable<T> {

    /* renamed from: a */
    public final ObservableSource f65304a;

    /* renamed from: b */
    public final long f65305b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableElementAtMaybe$a */
    /* loaded from: classes5.dex */
    public static final class C10987a implements Observer, Disposable {

        /* renamed from: a */
        public final MaybeObserver f65306a;

        /* renamed from: b */
        public final long f65307b;

        /* renamed from: c */
        public Disposable f65308c;

        /* renamed from: d */
        public long f65309d;

        /* renamed from: e */
        public boolean f65310e;

        public C10987a(MaybeObserver maybeObserver, long j) {
            this.f65306a = maybeObserver;
            this.f65307b = j;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65308c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65308c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.f65310e) {
                this.f65310e = true;
                this.f65306a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65310e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65310e = true;
            this.f65306a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65310e) {
                return;
            }
            long j = this.f65309d;
            if (j == this.f65307b) {
                this.f65310e = true;
                this.f65308c.dispose();
                this.f65306a.onSuccess(obj);
                return;
            }
            this.f65309d = j + 1;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65308c, disposable)) {
                this.f65308c = disposable;
                this.f65306a.onSubscribe(this);
            }
        }
    }

    public ObservableElementAtMaybe(ObservableSource<T> observableSource, long j) {
        this.f65304a = observableSource;
        this.f65305b = j;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<T> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableElementAt(this.f65304a, this.f65305b, null, false));
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f65304a.subscribe(new C10987a(maybeObserver, this.f65305b));
    }
}