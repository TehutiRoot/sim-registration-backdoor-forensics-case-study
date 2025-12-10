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
    public final long f78945a;

    /* renamed from: b */
    public final Scheduler f78946b;

    /* renamed from: c */
    public final int f78947c;

    /* renamed from: rx.internal.operators.OperatorTakeLastTimed$a */
    /* loaded from: classes7.dex */
    public class C13661a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13662b f78948a;

        public C13661a(C13662b c13662b) {
            this.f78948a = c13662b;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f78948a.requestMore(j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorTakeLastTimed$b */
    /* loaded from: classes7.dex */
    public static final class C13662b extends Subscriber implements Func1 {

        /* renamed from: a */
        public final Subscriber f78950a;

        /* renamed from: b */
        public final long f78951b;

        /* renamed from: c */
        public final Scheduler f78952c;

        /* renamed from: d */
        public final int f78953d;

        /* renamed from: e */
        public final AtomicLong f78954e = new AtomicLong();

        /* renamed from: f */
        public final ArrayDeque f78955f = new ArrayDeque();

        /* renamed from: g */
        public final ArrayDeque f78956g = new ArrayDeque();

        public C13662b(Subscriber subscriber, int i, long j, Scheduler scheduler) {
            this.f78950a = subscriber;
            this.f78953d = i;
            this.f78951b = j;
            this.f78952c = scheduler;
        }

        /* renamed from: b */
        public void m23163b(long j) {
            long j2 = j - this.f78951b;
            while (true) {
                Long l = (Long) this.f78956g.peek();
                if (l != null && l.longValue() < j2) {
                    this.f78955f.poll();
                    this.f78956g.poll();
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
            m23163b(this.f78952c.now());
            this.f78956g.clear();
            BackpressureUtils.postCompleteDone(this.f78954e, this.f78955f, this.f78950a, this);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78955f.clear();
            this.f78956g.clear();
            this.f78950a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78953d != 0) {
                long now = this.f78952c.now();
                if (this.f78955f.size() == this.f78953d) {
                    this.f78955f.poll();
                    this.f78956g.poll();
                }
                m23163b(now);
                this.f78955f.offer(NotificationLite.next(obj));
                this.f78956g.offer(Long.valueOf(now));
            }
        }

        public void requestMore(long j) {
            BackpressureUtils.postCompleteRequest(this.f78954e, j, this.f78955f, this.f78950a, this);
        }
    }

    public OperatorTakeLastTimed(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78945a = timeUnit.toMillis(j);
        this.f78946b = scheduler;
        this.f78947c = -1;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13662b c13662b = new C13662b(subscriber, this.f78947c, this.f78945a, this.f78946b);
        subscriber.add(c13662b);
        subscriber.setProducer(new C13661a(c13662b));
        return c13662b;
    }

    public OperatorTakeLastTimed(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        if (i >= 0) {
            this.f78945a = timeUnit.toMillis(j);
            this.f78946b = scheduler;
            this.f78947c = i;
            return;
        }
        throw new IndexOutOfBoundsException("count could not be negative");
    }
}