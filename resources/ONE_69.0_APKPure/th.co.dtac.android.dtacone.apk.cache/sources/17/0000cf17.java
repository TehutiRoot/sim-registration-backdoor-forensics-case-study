package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableDelay<T> extends AbstractC0558I {

    /* renamed from: b */
    public final long f64251b;

    /* renamed from: c */
    public final TimeUnit f64252c;

    /* renamed from: d */
    public final Scheduler f64253d;

    /* renamed from: e */
    public final boolean f64254e;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDelay$a */
    /* loaded from: classes5.dex */
    public static final class C10818a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64255a;

        /* renamed from: b */
        public final long f64256b;

        /* renamed from: c */
        public final TimeUnit f64257c;

        /* renamed from: d */
        public final Scheduler.Worker f64258d;

        /* renamed from: e */
        public final boolean f64259e;

        /* renamed from: f */
        public Subscription f64260f;

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableDelay$a$a */
        /* loaded from: classes5.dex */
        public final class RunnableC10819a implements Runnable {
            public RunnableC10819a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C10818a.this.f64255a.onComplete();
                } finally {
                    C10818a.this.f64258d.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableDelay$a$b */
        /* loaded from: classes5.dex */
        public final class RunnableC10820b implements Runnable {

            /* renamed from: a */
            public final Throwable f64262a;

            public RunnableC10820b(Throwable th2) {
                this.f64262a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C10818a.this.f64255a.onError(this.f64262a);
                } finally {
                    C10818a.this.f64258d.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableDelay$a$c */
        /* loaded from: classes5.dex */
        public final class RunnableC10821c implements Runnable {

            /* renamed from: a */
            public final Object f64264a;

            public RunnableC10821c(Object obj) {
                this.f64264a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                C10818a.this.f64255a.onNext(this.f64264a);
            }
        }

        public C10818a(Subscriber subscriber, long j, TimeUnit timeUnit, Scheduler.Worker worker, boolean z) {
            this.f64255a = subscriber;
            this.f64256b = j;
            this.f64257c = timeUnit;
            this.f64258d = worker;
            this.f64259e = z;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64260f.cancel();
            this.f64258d.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64258d.schedule(new RunnableC10819a(), this.f64256b, this.f64257c);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            long j;
            Scheduler.Worker worker = this.f64258d;
            RunnableC10820b runnableC10820b = new RunnableC10820b(th2);
            if (this.f64259e) {
                j = this.f64256b;
            } else {
                j = 0;
            }
            worker.schedule(runnableC10820b, j, this.f64257c);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64258d.schedule(new RunnableC10821c(obj), this.f64256b, this.f64257c);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64260f, subscription)) {
                this.f64260f = subscription;
                this.f64255a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64260f.request(j);
        }
    }

    public FlowableDelay(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(flowable);
        this.f64251b = j;
        this.f64252c = timeUnit;
        this.f64253d = scheduler;
        this.f64254e = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber;
        if (this.f64254e) {
            serializedSubscriber = subscriber;
        } else {
            serializedSubscriber = new SerializedSubscriber(subscriber);
        }
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10818a(serializedSubscriber, this.f64251b, this.f64252c, this.f64253d.createWorker(), this.f64254e));
    }
}