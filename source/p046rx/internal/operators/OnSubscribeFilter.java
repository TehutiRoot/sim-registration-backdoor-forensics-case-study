package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.exceptions.OnErrorThrowable;
import p046rx.functions.Func1;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OnSubscribeFilter */
/* loaded from: classes7.dex */
public final class OnSubscribeFilter<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Observable f77937a;

    /* renamed from: b */
    public final Func1 f77938b;

    /* renamed from: rx.internal.operators.OnSubscribeFilter$a */
    /* loaded from: classes7.dex */
    public static final class C13474a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f77939a;

        /* renamed from: b */
        public final Func1 f77940b;

        /* renamed from: c */
        public boolean f77941c;

        public C13474a(Subscriber subscriber, Func1 func1) {
            this.f77939a = subscriber;
            this.f77940b = func1;
            request(0L);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f77941c) {
                return;
            }
            this.f77939a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f77941c) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f77941c = true;
            this.f77939a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                if (((Boolean) this.f77940b.call(obj)).booleanValue()) {
                    this.f77939a.onNext(obj);
                } else {
                    request(1L);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th2, obj));
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            super.setProducer(producer);
            this.f77939a.setProducer(producer);
        }
    }

    public OnSubscribeFilter(Observable<T> observable, Func1<? super T, Boolean> func1) {
        this.f77937a = observable;
        this.f77938b = func1;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        C13474a c13474a = new C13474a(subscriber, this.f77938b);
        subscriber.add(c13474a);
        this.f77937a.unsafeSubscribe(c13474a);
    }
}
