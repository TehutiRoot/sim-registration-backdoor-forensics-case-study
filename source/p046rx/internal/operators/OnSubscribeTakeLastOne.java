package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.OnSubscribeTakeLastOne */
/* loaded from: classes7.dex */
public final class OnSubscribeTakeLastOne<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Observable f78130a;

    /* renamed from: rx.internal.operators.OnSubscribeTakeLastOne$a */
    /* loaded from: classes7.dex */
    public static final class C13515a extends DeferredScalarSubscriber {

        /* renamed from: b */
        public static final Object f78131b = new Object();

        /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
        public C13515a(Subscriber subscriber) {
            super(subscriber);
            this.value = f78131b;
        }

        @Override // p046rx.internal.operators.DeferredScalarSubscriber, p046rx.Observer
        public void onCompleted() {
            Object obj = this.value;
            if (obj == f78131b) {
                complete();
            } else {
                complete(obj);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.value = obj;
        }
    }

    public OnSubscribeTakeLastOne(Observable<T> observable) {
        this.f78130a = observable;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        new C13515a(subscriber).subscribeTo(this.f78130a);
    }
}
