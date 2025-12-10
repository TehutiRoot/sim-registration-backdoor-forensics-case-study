package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action2;
import p046rx.functions.Func0;

/* renamed from: rx.internal.operators.OnSubscribeCollect */
/* loaded from: classes7.dex */
public final class OnSubscribeCollect<T, R> implements Observable.OnSubscribe<R> {

    /* renamed from: a */
    public final Observable f77874a;

    /* renamed from: b */
    public final Func0 f77875b;

    /* renamed from: c */
    public final Action2 f77876c;

    /* renamed from: rx.internal.operators.OnSubscribeCollect$a */
    /* loaded from: classes7.dex */
    public static final class C13461a extends DeferredScalarSubscriberSafe {

        /* renamed from: b */
        public final Action2 f77877b;

        /* JADX WARN: Multi-variable type inference failed */
        public C13461a(Subscriber subscriber, Object obj, Action2 action2) {
            super(subscriber);
            this.value = obj;
            this.hasValue = true;
            this.f77877b = action2;
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.done) {
                return;
            }
            try {
                this.f77877b.call(this.value, obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                onError(th2);
            }
        }
    }

    public OnSubscribeCollect(Observable<T> observable, Func0<R> func0, Action2<R, ? super T> action2) {
        this.f77874a = observable;
        this.f77875b = func0;
        this.f77876c = action2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super R> subscriber) {
        try {
            new C13461a(subscriber, this.f77875b.call(), this.f77876c).subscribeTo(this.f77874a);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            subscriber.onError(th2);
        }
    }
}
