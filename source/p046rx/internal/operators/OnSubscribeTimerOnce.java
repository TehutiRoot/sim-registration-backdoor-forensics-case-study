package p046rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;

/* renamed from: rx.internal.operators.OnSubscribeTimerOnce */
/* loaded from: classes7.dex */
public final class OnSubscribeTimerOnce implements Observable.OnSubscribe<Long> {

    /* renamed from: a */
    public final long f78167a;

    /* renamed from: b */
    public final TimeUnit f78168b;

    /* renamed from: c */
    public final Scheduler f78169c;

    /* renamed from: rx.internal.operators.OnSubscribeTimerOnce$a */
    /* loaded from: classes7.dex */
    public class C13521a implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78170a;

        public C13521a(Subscriber subscriber) {
            this.f78170a = subscriber;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            try {
                this.f78170a.onNext(0L);
                this.f78170a.onCompleted();
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.f78170a);
            }
        }
    }

    public OnSubscribeTimerOnce(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78167a = j;
        this.f78168b = timeUnit;
        this.f78169c = scheduler;
    }

    @Override // p046rx.functions.Action1
    public void call(Subscriber<? super Long> subscriber) {
        Scheduler.Worker createWorker = this.f78169c.createWorker();
        subscriber.add(createWorker);
        createWorker.schedule(new C13521a(subscriber), this.f78167a, this.f78168b);
    }
}
