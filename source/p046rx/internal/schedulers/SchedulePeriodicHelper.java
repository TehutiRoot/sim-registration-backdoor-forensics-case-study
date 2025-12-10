package p046rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import p046rx.Scheduler;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.internal.subscriptions.SequentialSubscription;

/* renamed from: rx.internal.schedulers.SchedulePeriodicHelper */
/* loaded from: classes7.dex */
public final class SchedulePeriodicHelper {
    public static final long CLOCK_DRIFT_TOLERANCE_NANOS = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: rx.internal.schedulers.SchedulePeriodicHelper$NowNanoSupplier */
    /* loaded from: classes7.dex */
    public interface NowNanoSupplier {
        long nowNanos();
    }

    /* renamed from: rx.internal.schedulers.SchedulePeriodicHelper$a */
    /* loaded from: classes7.dex */
    public static class C13745a implements Action0 {

        /* renamed from: a */
        public long f79126a;

        /* renamed from: b */
        public long f79127b;

        /* renamed from: c */
        public long f79128c;

        /* renamed from: d */
        public final /* synthetic */ long f79129d;

        /* renamed from: e */
        public final /* synthetic */ long f79130e;

        /* renamed from: f */
        public final /* synthetic */ Action0 f79131f;

        /* renamed from: g */
        public final /* synthetic */ SequentialSubscription f79132g;

        /* renamed from: h */
        public final /* synthetic */ NowNanoSupplier f79133h;

        /* renamed from: i */
        public final /* synthetic */ Scheduler.Worker f79134i;

        /* renamed from: j */
        public final /* synthetic */ long f79135j;

        public C13745a(long j, long j2, Action0 action0, SequentialSubscription sequentialSubscription, NowNanoSupplier nowNanoSupplier, Scheduler.Worker worker, long j3) {
            this.f79129d = j;
            this.f79130e = j2;
            this.f79131f = action0;
            this.f79132g = sequentialSubscription;
            this.f79133h = nowNanoSupplier;
            this.f79134i = worker;
            this.f79135j = j3;
            this.f79127b = j;
            this.f79128c = j2;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            long nanos;
            long j;
            this.f79131f.call();
            if (!this.f79132g.isUnsubscribed()) {
                NowNanoSupplier nowNanoSupplier = this.f79133h;
                if (nowNanoSupplier != null) {
                    nanos = nowNanoSupplier.nowNanos();
                } else {
                    nanos = TimeUnit.MILLISECONDS.toNanos(this.f79134i.now());
                }
                long j2 = SchedulePeriodicHelper.CLOCK_DRIFT_TOLERANCE_NANOS;
                long j3 = this.f79127b;
                if (nanos + j2 >= j3) {
                    long j4 = this.f79135j;
                    if (nanos < j3 + j4 + j2) {
                        long j5 = this.f79128c;
                        long j6 = this.f79126a + 1;
                        this.f79126a = j6;
                        j = j5 + (j6 * j4);
                        this.f79127b = nanos;
                        this.f79132g.replace(this.f79134i.schedule(this, j - nanos, TimeUnit.NANOSECONDS));
                    }
                }
                long j7 = this.f79135j;
                long j8 = nanos + j7;
                long j9 = this.f79126a + 1;
                this.f79126a = j9;
                this.f79128c = j8 - (j7 * j9);
                j = j8;
                this.f79127b = nanos;
                this.f79132g.replace(this.f79134i.schedule(this, j - nanos, TimeUnit.NANOSECONDS));
            }
        }
    }

    public static Subscription schedulePeriodically(Scheduler.Worker worker, Action0 action0, long j, long j2, TimeUnit timeUnit, NowNanoSupplier nowNanoSupplier) {
        long nanos;
        long nanos2 = timeUnit.toNanos(j2);
        if (nowNanoSupplier != null) {
            nanos = nowNanoSupplier.nowNanos();
        } else {
            nanos = TimeUnit.MILLISECONDS.toNanos(worker.now());
        }
        long j3 = nanos;
        SequentialSubscription sequentialSubscription = new SequentialSubscription();
        SequentialSubscription sequentialSubscription2 = new SequentialSubscription(sequentialSubscription);
        sequentialSubscription.replace(worker.schedule(new C13745a(j3, timeUnit.toNanos(j) + j3, action0, sequentialSubscription2, nowNanoSupplier, worker, nanos2), j, timeUnit));
        return sequentialSubscription2;
    }
}
