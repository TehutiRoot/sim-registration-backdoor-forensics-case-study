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
    public final Single.OnSubscribe f79178a;

    /* renamed from: b */
    public final Observable.Operator f79179b;

    /* renamed from: rx.internal.operators.SingleLiftObservableOperator$a */
    /* loaded from: classes7.dex */
    public static final class C13710a extends SingleSubscriber {

        /* renamed from: b */
        public final Subscriber f79180b;

        public C13710a(Subscriber subscriber) {
            this.f79180b = subscriber;
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            this.f79180b.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            this.f79180b.setProducer(new SingleProducer(this.f79180b, obj));
        }
    }

    public SingleLiftObservableOperator(Single.OnSubscribe<T> onSubscribe, Observable.Operator<? extends R, ? super T> operator) {
        this.f79178a = onSubscribe;
        this.f79179b = operator;
    }

    public static <T> SingleSubscriber<T> wrap(Subscriber<T> subscriber) {
        C13710a c13710a = new C13710a(subscriber);
        subscriber.add(c13710a);
        return c13710a;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super R> singleSubscriber) {
        SingleFromObservable.C13709a c13709a = new SingleFromObservable.C13709a(singleSubscriber);
        singleSubscriber.add(c13709a);
        try {
            Subscriber<? super T> call = RxJavaHooks.onSingleLift(this.f79179b).call(c13709a);
            SingleSubscriber wrap = wrap(call);
            call.onStart();
            this.f79178a.call(wrap);
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, singleSubscriber);
        }
    }
}