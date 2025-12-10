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
    public final long f78378a;

    /* renamed from: b */
    public final long f78379b;

    /* renamed from: c */
    public final TimeUnit f78380c;

    /* renamed from: d */
    public final Scheduler f78381d;

    /* renamed from: rx.internal.operators.OnSubscribeTimerPeriodically$a */
    /* loaded from: classes7.dex */
    public class C13523a implements Action0 {

        /* renamed from: a */
        public long f78382a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78383b;

        /* renamed from: c */
        public final /* synthetic */ Scheduler.Worker f78384c;

        public C13523a(Subscriber subscriber, Scheduler.Worker worker) {
            this.f78383b = subscriber;
            this.f78384c = worker;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            try {
                Subscriber subscriber = this.f78383b;
                long j = this.f78382a;
                this.f78382a = 1 + j;
                subscriber.onNext(Long.valueOf(j));
            } catch (Throwable th2) {
                try {
                    this.f78384c.unsubscribe();
                } finally {
                    Exceptions.throwOrReport(th2, this.f78383b);
                }
            }
        }
    }

    public OnSubscribeTimerPeriodically(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78378a = j;
        this.f78379b = j2;
        this.f78380c = timeUnit;
        this.f78381d = scheduler;
    }

    @Override // p046rx.functions.Action1
    public void call(Subscriber<? super Long> subscriber) {
        Scheduler.Worker createWorker = this.f78381d.createWorker();
        subscriber.add(createWorker);
        createWorker.schedulePeriodically(new C13523a(subscriber, createWorker), this.f78378a, this.f78379b, this.f78380c);
    }
}