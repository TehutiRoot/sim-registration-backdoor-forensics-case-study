package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.exceptions.OnErrorThrowable;
import p046rx.functions.Func1;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OnSubscribeMap */
/* loaded from: classes7.dex */
public final class OnSubscribeMap<T, R> implements Observable.OnSubscribe<R> {

    /* renamed from: a */
    public final Observable f78231a;

    /* renamed from: b */
    public final Func1 f78232b;

    /* renamed from: rx.internal.operators.OnSubscribeMap$a */
    /* loaded from: classes7.dex */
    public static final class C13490a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78233a;

        /* renamed from: b */
        public final Func1 f78234b;

        /* renamed from: c */
        public boolean f78235c;

        public C13490a(Subscriber subscriber, Func1 func1) {
            this.f78233a = subscriber;
            this.f78234b = func1;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78235c) {
                return;
            }
            this.f78233a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78235c) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f78235c = true;
            this.f78233a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                this.f78233a.onNext(this.f78234b.call(obj));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th2, obj));
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78233a.setProducer(producer);
        }
    }

    public OnSubscribeMap(Observable<T> observable, Func1<? super T, ? extends R> func1) {
        this.f78231a = observable;
        this.f78232b = func1;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super R> subscriber) {
        C13490a c13490a = new C13490a(subscriber, this.f78232b);
        subscriber.add(c13490a);
        this.f78231a.unsafeSubscribe(c13490a);
    }
}