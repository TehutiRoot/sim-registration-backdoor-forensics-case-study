package p046rx.internal.operators;

import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.functions.Func1;

/* renamed from: rx.internal.operators.OperatorTakeLastTimed */
/* loaded from: classes7.dex */
public final class OperatorTakeLastTimed<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final long f78739a;

    /* renamed from: b */
    public final Scheduler f78740b;

    /* renamed from: c */
    public final int f78741c;

    /* renamed from: rx.internal.operators.OperatorTakeLastTimed$a */
    /* loaded from: classes7.dex */
    public class C13660a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13661b f78742a;

        public C13660a(C13661b c13661b) {
            this.f78742a = c13661b;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f78742a.requestMore(j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorTakeLastTimed$b */
    /* loaded from: classes7.dex */
    public static final class C13661b extends Subscriber implements Func1 {

        /* renamed from: a */
        public final Subscriber f78744a;

        /* renamed from: b */
        public final long f78745b;

        /* renamed from: c */
        public final Scheduler f78746c;

        /* renamed from: d */
        public final int f78747d;

        /* renamed from: e */
        public final AtomicLong f78748e = new AtomicLong();

        /* renamed from: f */
        public final ArrayDeque f78749f = new ArrayDeque();

        /* renamed from: g */
        public final ArrayDeque f78750g = new ArrayDeque();

        public C13661b(Subscriber subscriber, int i, long j, Scheduler scheduler) {
            this.f78744a = subscriber;
            this.f78747d = i;
            this.f78745b = j;
            this.f78746c = scheduler;
        }

        /* renamed from: b */
        public void m22975b(long j) {
            long j2 = j - this.f78745b;
            while (true) {
                Long l = (Long) this.f78750g.peek();
                if (l != null && l.longValue() < j2) {
                    this.f78749f.poll();
                    this.f78750g.poll();
                } else {
                    return;
                }
            }
        }

        @Override // p046rx.functions.Func1
        public Object call(Object obj) {
            return NotificationLite.getValue(obj);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            m22975b(this.f78746c.now());
            this.f78750g.clear();
            BackpressureUtils.postCompleteDone(this.f78748e, this.f78749f, this.f78744a, this);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78749f.clear();
            this.f78750g.clear();
            this.f78744a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78747d != 0) {
                long now = this.f78746c.now();
                if (this.f78749f.size() == this.f78747d) {
                    this.f78749f.poll();
                    this.f78750g.poll();
                }
                m22975b(now);
                this.f78749f.offer(NotificationLite.next(obj));
                this.f78750g.offer(Long.valueOf(now));
            }
        }

        public void requestMore(long j) {
            BackpressureUtils.postCompleteRequest(this.f78748e, j, this.f78749f, this.f78744a, this);
        }
    }

    public OperatorTakeLastTimed(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78739a = timeUnit.toMillis(j);
        this.f78740b = scheduler;
        this.f78741c = -1;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13661b c13661b = new C13661b(subscriber, this.f78741c, this.f78739a, this.f78740b);
        subscriber.add(c13661b);
        subscriber.setProducer(new C13660a(c13661b));
        return c13661b;
    }

    public OperatorTakeLastTimed(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        if (i >= 0) {
            this.f78739a = timeUnit.toMillis(j);
            this.f78740b = scheduler;
            this.f78741c = i;
            return;
        }
        throw new IndexOutOfBoundsException("count could not be negative");
    }
}
