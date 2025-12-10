package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.schedulers.TimeInterval;

/* renamed from: rx.internal.operators.OperatorTimeInterval */
/* loaded from: classes7.dex */
public final class OperatorTimeInterval<T> implements Observable.Operator<TimeInterval<T>, T> {

    /* renamed from: a */
    public final Scheduler f78777a;

    /* renamed from: rx.internal.operators.OperatorTimeInterval$a */
    /* loaded from: classes7.dex */
    public class C13670a extends Subscriber {

        /* renamed from: a */
        public long f78778a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78779b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13670a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78779b = subscriber2;
            this.f78778a = OperatorTimeInterval.this.f78777a.now();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78779b.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78779b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            long now = OperatorTimeInterval.this.f78777a.now();
            this.f78779b.onNext(new TimeInterval(now - this.f78778a, obj));
            this.f78778a = now;
        }
    }

    public OperatorTimeInterval(Scheduler scheduler) {
        this.f78777a = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super TimeInterval<T>> subscriber) {
        return new C13670a(subscriber, subscriber);
    }
}
