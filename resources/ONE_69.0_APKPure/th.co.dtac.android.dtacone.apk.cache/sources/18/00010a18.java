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
    public final Observable f78143a;

    /* renamed from: b */
    public final Func1 f78144b;

    /* renamed from: rx.internal.operators.OnSubscribeFilter$a */
    /* loaded from: classes7.dex */
    public static final class C13475a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78145a;

        /* renamed from: b */
        public final Func1 f78146b;

        /* renamed from: c */
        public boolean f78147c;

        public C13475a(Subscriber subscriber, Func1 func1) {
            this.f78145a = subscriber;
            this.f78146b = func1;
            request(0L);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78147c) {
                return;
            }
            this.f78145a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78147c) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f78147c = true;
            this.f78145a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                if (((Boolean) this.f78146b.call(obj)).booleanValue()) {
                    this.f78145a.onNext(obj);
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
            this.f78145a.setProducer(producer);
        }
    }

    public OnSubscribeFilter(Observable<T> observable, Func1<? super T, Boolean> func1) {
        this.f78143a = observable;
        this.f78144b = func1;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        C13475a c13475a = new C13475a(subscriber, this.f78144b);
        subscriber.add(c13475a);
        this.f78143a.unsafeSubscribe(c13475a);
    }
}