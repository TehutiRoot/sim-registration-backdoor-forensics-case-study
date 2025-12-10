package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableFromObservable<T> extends Flowable<T> {

    /* renamed from: b */
    public final Observable f64307b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableFromObservable$a */
    /* loaded from: classes5.dex */
    public static final class C10849a implements Observer, Subscription {

        /* renamed from: a */
        public final Subscriber f64308a;

        /* renamed from: b */
        public Disposable f64309b;

        public C10849a(Subscriber subscriber) {
            this.f64308a = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64309b.dispose();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f64308a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f64308a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f64308a.onNext(obj);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f64309b = disposable;
            this.f64308a.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
        }
    }

    public FlowableFromObservable(Observable<T> observable) {
        this.f64307b = observable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f64307b.subscribe(new C10849a(subscriber));
    }
}
