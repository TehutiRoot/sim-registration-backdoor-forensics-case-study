package p046rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;

/* renamed from: rx.internal.operators.OnSubscribeTimerPeriodically */
/* loaded from: classes7.dex */
public final class OnSubscribeTimerPeriodically implements Observable.OnSubscribe<Long> {

    /* renamed from: a */
    public final long f78172a;

    /* renamed from: b */
    public final long f78173b;

    /* renamed from: c */
    public final TimeUnit f78174c;

    /* renamed from: d */
    public final Scheduler f78175d;

    /* renamed from: rx.internal.operators.OnSubscribeTimerPeriodically$a */
    /* loaded from: classes7.dex */
    public class C13522a implements Action0 {

        /* renamed from: a */
        public long f78176a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78177b;

        /* renamed from: c */
        public final /* synthetic */ Scheduler.Worker f78178c;

        public C13522a(Subscriber subscriber, Scheduler.Worker worker) {
            this.f78177b = subscriber;
            this.f78178c = worker;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            try {
                Subscriber subscriber = this.f78177b;
                long j = this.f78176a;
                this.f78176a = 1 + j;
                subscriber.onNext(Long.valueOf(j));
            } catch (Throwable th2) {
                try {
                    this.f78178c.unsubscribe();
                } finally {
                    Exceptions.throwOrReport(th2, this.f78177b);
                }
            }
        }
    }

    public OnSubscribeTimerPeriodically(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78172a = j;
        this.f78173b = j2;
        this.f78174c = timeUnit;
        this.f78175d = scheduler;
    }

    @Override // p046rx.functions.Action1
    public void call(Subscriber<? super Long> subscriber) {
        Scheduler.Worker createWorker = this.f78175d.createWorker();
        subscriber.add(createWorker);
        createWorker.schedulePeriodically(new C13522a(subscriber, createWorker), this.f78172a, this.f78173b, this.f78174c);
    }
}
