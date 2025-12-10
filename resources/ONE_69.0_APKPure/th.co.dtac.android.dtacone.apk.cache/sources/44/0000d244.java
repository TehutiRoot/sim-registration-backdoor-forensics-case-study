package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableScan<T> extends AbstractC11078a {

    /* renamed from: a */
    public final BiFunction f65546a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableScan$a */
    /* loaded from: classes5.dex */
    public static final class C11038a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65547a;

        /* renamed from: b */
        public final BiFunction f65548b;

        /* renamed from: c */
        public Disposable f65549c;

        /* renamed from: d */
        public Object f65550d;

        /* renamed from: e */
        public boolean f65551e;

        public C11038a(Observer observer, BiFunction biFunction) {
            this.f65547a = observer;
            this.f65548b = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65549c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65549c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65551e) {
                return;
            }
            this.f65551e = true;
            this.f65547a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65551e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65551e = true;
            this.f65547a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65551e) {
                return;
            }
            Observer observer = this.f65547a;
            Object obj2 = this.f65550d;
            if (obj2 == null) {
                this.f65550d = obj;
                observer.onNext(obj);
                return;
            }
            try {
                Object requireNonNull = ObjectHelper.requireNonNull(this.f65548b.apply(obj2, obj), "The value returned by the accumulator is null");
                this.f65550d = requireNonNull;
                observer.onNext(requireNonNull);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65549c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65549c, disposable)) {
                this.f65549c = disposable;
                this.f65547a.onSubscribe(this);
            }
        }
    }

    public ObservableScan(ObservableSource<T> observableSource, BiFunction<T, T, T> biFunction) {
        super(observableSource);
        this.f65546a = biFunction;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11038a(observer, this.f65546a));
    }
}