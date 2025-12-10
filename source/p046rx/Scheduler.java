package p046rx;

import java.util.concurrent.TimeUnit;
import p046rx.functions.Action0;
import p046rx.functions.Func1;
import p046rx.internal.schedulers.SchedulePeriodicHelper;
import p046rx.internal.schedulers.SchedulerWhen;

/* renamed from: rx.Scheduler */
/* loaded from: classes5.dex */
public abstract class Scheduler {

    /* renamed from: rx.Scheduler$Worker */
    /* loaded from: classes5.dex */
    public static abstract class Worker implements Subscription {
        public long now() {
            return System.currentTimeMillis();
        }

        public abstract Subscription schedule(Action0 action0);

        public abstract Subscription schedule(Action0 action0, long j, TimeUnit timeUnit);

        public Subscription schedulePeriodically(Action0 action0, long j, long j2, TimeUnit timeUnit) {
            return SchedulePeriodicHelper.schedulePeriodically(this, action0, j, j2, timeUnit, null);
        }
    }

    public abstract Worker createWorker();

    public long now() {
        return System.currentTimeMillis();
    }

    public <S extends Scheduler & Subscription> S when(Func1<Observable<Observable<Completable>>, Completable> func1) {
        return new SchedulerWhen(func1, this);
    }
}
