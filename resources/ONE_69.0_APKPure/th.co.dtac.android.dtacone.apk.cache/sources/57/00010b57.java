package p046rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.OperatorThrottleFirst */
/* loaded from: classes7.dex */
public final class OperatorThrottleFirst<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final long f78978a;

    /* renamed from: b */
    public final Scheduler f78979b;

    /* renamed from: rx.internal.operators.OperatorThrottleFirst$a */
    /* loaded from: classes7.dex */
    public class C13670a extends Subscriber {

        /* renamed from: a */
        public long f78980a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78981b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13670a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78981b = subscriber2;
            this.f78980a = -1L;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78981b.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78981b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            long now = OperatorThrottleFirst.this.f78979b.now();
            long j = this.f78980a;
            if (j == -1 || now < j || now - j >= OperatorThrottleFirst.this.f78978a) {
                this.f78980a = now;
                this.f78981b.onNext(obj);
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OperatorThrottleFirst(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78978a = timeUnit.toMillis(j);
        this.f78979b = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new C13670a(subscriber, subscriber);
    }
}