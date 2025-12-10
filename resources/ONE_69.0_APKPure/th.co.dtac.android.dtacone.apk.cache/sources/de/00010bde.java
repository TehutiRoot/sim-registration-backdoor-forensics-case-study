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
    public static class C13746a implements Action0 {

        /* renamed from: a */
        public long f79332a;

        /* renamed from: b */
        public long f79333b;

        /* renamed from: c */
        public long f79334c;

        /* renamed from: d */
        public final /* synthetic */ long f79335d;

        /* renamed from: e */
        public final /* synthetic */ long f79336e;

        /* renamed from: f */
        public final /* synthetic */ Action0 f79337f;

        /* renamed from: g */
        public final /* synthetic */ SequentialSubscription f79338g;

        /* renamed from: h */
        public final /* synthetic */ NowNanoSupplier f79339h;

        /* renamed from: i */
        public final /* synthetic */ Scheduler.Worker f79340i;

        /* renamed from: j */
        public final /* synthetic */ long f79341j;

        public C13746a(long j, long j2, Action0 action0, SequentialSubscription sequentialSubscription, NowNanoSupplier nowNanoSupplier, Scheduler.Worker worker, long j3) {
            this.f79335d = j;
            this.f79336e = j2;
            this.f79337f = action0;
            this.f79338g = sequentialSubscription;
            this.f79339h = nowNanoSupplier;
            this.f79340i = worker;
            this.f79341j = j3;
            this.f79333b = j;
            this.f79334c = j2;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            long nanos;
            long j;
            this.f79337f.call();
            if (!this.f79338g.isUnsubscribed()) {
                NowNanoSupplier nowNanoSupplier = this.f79339h;
                if (nowNanoSupplier != null) {
                    nanos = nowNanoSupplier.nowNanos();
                } else {
                    nanos = TimeUnit.MILLISECONDS.toNanos(this.f79340i.now());
                }
                long j2 = SchedulePeriodicHelper.CLOCK_DRIFT_TOLERANCE_NANOS;
                long j3 = this.f79333b;
                if (nanos + j2 >= j3) {
                    long j4 = this.f79341j;
                    if (nanos < j3 + j4 + j2) {
                        long j5 = this.f79334c;
                        long j6 = this.f79332a + 1;
                        this.f79332a = j6;
                        j = j5 + (j6 * j4);
                        this.f79333b = nanos;
                        this.f79338g.replace(this.f79340i.schedule(this, j - nanos, TimeUnit.NANOSECONDS));
                    }
                }
                long j7 = this.f79341j;
                long j8 = nanos + j7;
                long j9 = this.f79332a + 1;
                this.f79332a = j9;
                this.f79334c = j8 - (j7 * j9);
                j = j8;
                this.f79333b = nanos;
                this.f79338g.replace(this.f79340i.schedule(this, j - nanos, TimeUnit.NANOSECONDS));
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
        sequentialSubscription.replace(worker.schedule(new C13746a(j3, timeUnit.toNanos(j) + j3, action0, sequentialSubscription2, nowNanoSupplier, worker, nanos2), j, timeUnit));
        return sequentialSubscription2;
    }
}