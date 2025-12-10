package p046rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.schedulers.Timestamped;

/* renamed from: rx.internal.operators.OperatorSkipLastTimed */
/* loaded from: classes7.dex */
public class OperatorSkipLastTimed<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final long f78880a;

    /* renamed from: b */
    public final Scheduler f78881b;

    /* renamed from: rx.internal.operators.OperatorSkipLastTimed$a */
    /* loaded from: classes7.dex */
    public class C13643a extends Subscriber {

        /* renamed from: a */
        public Deque f78882a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78883b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13643a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78883b = subscriber2;
            this.f78882a = new ArrayDeque();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public final void m23178b(long j) {
            long j2 = j - OperatorSkipLastTimed.this.f78880a;
            while (!this.f78882a.isEmpty()) {
                Timestamped timestamped = (Timestamped) this.f78882a.getFirst();
                if (timestamped.getTimestampMillis() < j2) {
                    this.f78882a.removeFirst();
                    this.f78883b.onNext(timestamped.getValue());
                } else {
                    return;
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            m23178b(OperatorSkipLastTimed.this.f78881b.now());
            this.f78883b.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78883b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            long now = OperatorSkipLastTimed.this.f78881b.now();
            m23178b(now);
            this.f78882a.offerLast(new Timestamped(now, obj));
        }
    }

    public OperatorSkipLastTimed(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78880a = timeUnit.toMillis(j);
        this.f78881b = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new C13643a(subscriber, subscriber);
    }
}