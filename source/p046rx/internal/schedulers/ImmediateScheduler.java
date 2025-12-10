package p046rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import p046rx.Scheduler;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.subscriptions.BooleanSubscription;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.schedulers.ImmediateScheduler */
/* loaded from: classes7.dex */
public final class ImmediateScheduler extends Scheduler {
    public static final ImmediateScheduler INSTANCE = new ImmediateScheduler();

    @Override // p046rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new C13743a();
    }

    /* renamed from: rx.internal.schedulers.ImmediateScheduler$a */
    /* loaded from: classes7.dex */
    public final class C13743a extends Scheduler.Worker implements Subscription {

        /* renamed from: a */
        public final BooleanSubscription f79116a = new BooleanSubscription();

        public C13743a() {
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79116a.isUnsubscribed();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            return schedule(new MJ1(action0, this, ImmediateScheduler.this.now() + timeUnit.toMillis(j)));
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.f79116a.unsubscribe();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            action0.call();
            return Subscriptions.unsubscribed();
        }
    }
}
