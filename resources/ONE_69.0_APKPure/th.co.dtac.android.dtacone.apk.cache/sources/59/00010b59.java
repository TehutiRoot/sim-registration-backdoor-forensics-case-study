package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.schedulers.TimeInterval;

/* renamed from: rx.internal.operators.OperatorTimeInterval */
/* loaded from: classes7.dex */
public final class OperatorTimeInterval<T> implements Observable.Operator<TimeInterval<T>, T> {

    /* renamed from: a */
    public final Scheduler f78983a;

    /* renamed from: rx.internal.operators.OperatorTimeInterval$a */
    /* loaded from: classes7.dex */
    public class C13671a extends Subscriber {

        /* renamed from: a */
        public long f78984a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78985b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13671a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78985b = subscriber2;
            this.f78984a = OperatorTimeInterval.this.f78983a.now();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78985b.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78985b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            long now = OperatorTimeInterval.this.f78983a.now();
            this.f78985b.onNext(new TimeInterval(now - this.f78984a, obj));
            this.f78984a = now;
        }
    }

    public OperatorTimeInterval(Scheduler scheduler) {
        this.f78983a = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super TimeInterval<T>> subscriber) {
        return new C13671a(subscriber, subscriber);
    }
}