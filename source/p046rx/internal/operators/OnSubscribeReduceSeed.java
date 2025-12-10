package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func2;

/* renamed from: rx.internal.operators.OnSubscribeReduceSeed */
/* loaded from: classes7.dex */
public final class OnSubscribeReduceSeed<T, R> implements Observable.OnSubscribe<R> {

    /* renamed from: a */
    public final Observable f78091a;

    /* renamed from: b */
    public final Object f78092b;

    /* renamed from: c */
    public final Func2 f78093c;

    /* renamed from: rx.internal.operators.OnSubscribeReduceSeed$a */
    /* loaded from: classes7.dex */
    public static final class C13507a extends DeferredScalarSubscriber {

        /* renamed from: b */
        public final Func2 f78094b;

        /* JADX WARN: Multi-variable type inference failed */
        public C13507a(Subscriber subscriber, Object obj, Func2 func2) {
            super(subscriber);
            this.value = obj;
            this.hasValue = true;
            this.f78094b = func2;
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                this.value = (R) this.f78094b.call(this.value, obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                this.actual.onError(th2);
            }
        }
    }

    public OnSubscribeReduceSeed(Observable<T> observable, R r, Func2<R, ? super T, R> func2) {
        this.f78091a = observable;
        this.f78092b = r;
        this.f78093c = func2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super R> subscriber) {
        new C13507a(subscriber, this.f78092b, this.f78093c).subscribeTo(this.f78091a);
    }
}
