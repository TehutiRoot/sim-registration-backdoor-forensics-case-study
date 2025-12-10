package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableReduceMaybe<T> extends Maybe<T> {

    /* renamed from: a */
    public final ObservableSource f65426a;

    /* renamed from: b */
    public final BiFunction f65427b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReduceMaybe$a */
    /* loaded from: classes5.dex */
    public static final class C11038a implements Observer, Disposable {

        /* renamed from: a */
        public final MaybeObserver f65428a;

        /* renamed from: b */
        public final BiFunction f65429b;

        /* renamed from: c */
        public boolean f65430c;

        /* renamed from: d */
        public Object f65431d;

        /* renamed from: e */
        public Disposable f65432e;

        public C11038a(MaybeObserver maybeObserver, BiFunction biFunction) {
            this.f65428a = maybeObserver;
            this.f65429b = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65432e.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65432e.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65430c) {
                return;
            }
            this.f65430c = true;
            Object obj = this.f65431d;
            this.f65431d = null;
            if (obj != null) {
                this.f65428a.onSuccess(obj);
            } else {
                this.f65428a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65430c) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65430c = true;
            this.f65431d = null;
            this.f65428a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (!this.f65430c) {
                Object obj2 = this.f65431d;
                if (obj2 == null) {
                    this.f65431d = obj;
                    return;
                }
                try {
                    this.f65431d = ObjectHelper.requireNonNull(this.f65429b.apply(obj2, obj), "The reducer returned a null value");
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f65432e.dispose();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65432e, disposable)) {
                this.f65432e = disposable;
                this.f65428a.onSubscribe(this);
            }
        }
    }

    public ObservableReduceMaybe(ObservableSource<T> observableSource, BiFunction<T, T, T> biFunction) {
        this.f65426a = observableSource;
        this.f65427b = biFunction;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f65426a.subscribe(new C11038a(maybeObserver, this.f65427b));
    }
}
