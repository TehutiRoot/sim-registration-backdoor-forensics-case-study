package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class ObservableTakeLastOne<T> extends AbstractC11078a {

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTakeLastOne$a */
    /* loaded from: classes5.dex */
    public static final class C11051a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65636a;

        /* renamed from: b */
        public Disposable f65637b;

        /* renamed from: c */
        public Object f65638c;

        public C11051a(Observer observer) {
            this.f65636a = observer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m30289a() {
            Object obj = this.f65638c;
            if (obj != null) {
                this.f65638c = null;
                this.f65636a.onNext(obj);
            }
            this.f65636a.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65638c = null;
            this.f65637b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65637b.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            m30289a();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65638c = null;
            this.f65636a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65638c = obj;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65637b, disposable)) {
                this.f65637b = disposable;
                this.f65636a.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLastOne(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11051a(observer));
    }
}