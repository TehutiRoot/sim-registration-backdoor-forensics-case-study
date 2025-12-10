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
    public final long f78373a;

    /* renamed from: b */
    public final TimeUnit f78374b;

    /* renamed from: c */
    public final Scheduler f78375c;

    /* renamed from: rx.internal.operators.OnSubscribeTimerOnce$a */
    /* loaded from: classes7.dex */
    public class C13522a implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78376a;

        public C13522a(Subscriber subscriber) {
            this.f78376a = subscriber;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            try {
                this.f78376a.onNext(0L);
                this.f78376a.onCompleted();
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.f78376a);
            }
        }
    }

    public OnSubscribeTimerOnce(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78373a = j;
        this.f78374b = timeUnit;
        this.f78375c = scheduler;
    }

    @Override // p046rx.functions.Action1
    public void call(Subscriber<? super Long> subscriber) {
        Scheduler.Worker createWorker = this.f78375c.createWorker();
        subscriber.add(createWorker);
        createWorker.schedule(new C13522a(subscriber), this.f78373a, this.f78374b);
    }
}