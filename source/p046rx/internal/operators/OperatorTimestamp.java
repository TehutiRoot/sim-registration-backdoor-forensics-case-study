package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.schedulers.Timestamped;

/* renamed from: rx.internal.operators.OperatorTimestamp */
/* loaded from: classes7.dex */
public final class OperatorTimestamp<T> implements Observable.Operator<Timestamped<T>, T> {

    /* renamed from: a */
    public final Scheduler f78781a;

    /* renamed from: rx.internal.operators.OperatorTimestamp$a */
    /* loaded from: classes7.dex */
    public class C13671a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78782a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13671a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78782a = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78782a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78782a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78782a.onNext(new Timestamped(OperatorTimestamp.this.f78781a.now(), obj));
        }
    }

    public OperatorTimestamp(Scheduler scheduler) {
        this.f78781a = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super Timestamped<T>> subscriber) {
        return new C13671a(subscriber, subscriber);
    }
}
