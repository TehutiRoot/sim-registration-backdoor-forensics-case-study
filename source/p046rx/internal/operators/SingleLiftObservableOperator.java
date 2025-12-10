package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.internal.operators.SingleFromObservable;
import p046rx.internal.producers.SingleProducer;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.SingleLiftObservableOperator */
/* loaded from: classes7.dex */
public final class SingleLiftObservableOperator<T, R> implements Single.OnSubscribe<R> {

    /* renamed from: a */
    public final Single.OnSubscribe f78972a;

    /* renamed from: b */
    public final Observable.Operator f78973b;

    /* renamed from: rx.internal.operators.SingleLiftObservableOperator$a */
    /* loaded from: classes7.dex */
    public static final class C13709a extends SingleSubscriber {

        /* renamed from: b */
        public final Subscriber f78974b;

        public C13709a(Subscriber subscriber) {
            this.f78974b = subscriber;
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            this.f78974b.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            this.f78974b.setProducer(new SingleProducer(this.f78974b, obj));
        }
    }

    public SingleLiftObservableOperator(Single.OnSubscribe<T> onSubscribe, Observable.Operator<? extends R, ? super T> operator) {
        this.f78972a = onSubscribe;
        this.f78973b = operator;
    }

    public static <T> SingleSubscriber<T> wrap(Subscriber<T> subscriber) {
        C13709a c13709a = new C13709a(subscriber);
        subscriber.add(c13709a);
        return c13709a;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super R> singleSubscriber) {
        SingleFromObservable.C13708a c13708a = new SingleFromObservable.C13708a(singleSubscriber);
        singleSubscriber.add(c13708a);
        try {
            Subscriber<? super T> call = RxJavaHooks.onSingleLift(this.f78973b).call(c13708a);
            SingleSubscriber wrap = wrap(call);
            call.onStart();
            this.f78972a.call(wrap);
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, singleSubscriber);
        }
    }
}
