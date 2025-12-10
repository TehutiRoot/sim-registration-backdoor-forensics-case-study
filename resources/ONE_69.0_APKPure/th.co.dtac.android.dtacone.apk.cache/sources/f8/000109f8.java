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
    public final Observable f78080a;

    /* renamed from: b */
    public final Func0 f78081b;

    /* renamed from: c */
    public final Action2 f78082c;

    /* renamed from: rx.internal.operators.OnSubscribeCollect$a */
    /* loaded from: classes7.dex */
    public static final class C13462a extends DeferredScalarSubscriberSafe {

        /* renamed from: b */
        public final Action2 f78083b;

        /* JADX WARN: Multi-variable type inference failed */
        public C13462a(Subscriber subscriber, Object obj, Action2 action2) {
            super(subscriber);
            this.value = obj;
            this.hasValue = true;
            this.f78083b = action2;
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.done) {
                return;
            }
            try {
                this.f78083b.call(this.value, obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                onError(th2);
            }
        }
    }

    public OnSubscribeCollect(Observable<T> observable, Func0<R> func0, Action2<R, ? super T> action2) {
        this.f78080a = observable;
        this.f78081b = func0;
        this.f78082c = action2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super R> subscriber) {
        try {
            new C13462a(subscriber, this.f78081b.call(), this.f78082c).subscribeTo(this.f78080a);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            subscriber.onError(th2);
        }
    }
}