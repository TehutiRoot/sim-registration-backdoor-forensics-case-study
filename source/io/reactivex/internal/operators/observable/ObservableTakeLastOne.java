package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class ObservableTakeLastOne<T> extends AbstractC11091a {

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTakeLastOne$a */
    /* loaded from: classes5.dex */
    public static final class C11064a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65573a;

        /* renamed from: b */
        public Disposable f65574b;

        /* renamed from: c */
        public Object f65575c;

        public C11064a(Observer observer) {
            this.f65573a = observer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m29949a() {
            Object obj = this.f65575c;
            if (obj != null) {
                this.f65575c = null;
                this.f65573a.onNext(obj);
            }
            this.f65573a.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65575c = null;
            this.f65574b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65574b.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            m29949a();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65575c = null;
            this.f65573a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65575c = obj;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65574b, disposable)) {
                this.f65574b = disposable;
                this.f65573a.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLastOne(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11064a(observer));
    }
}
