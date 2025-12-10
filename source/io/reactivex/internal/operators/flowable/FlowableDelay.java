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
public final class FlowableDelay<T> extends AbstractC0567I {

    /* renamed from: b */
    public final long f64188b;

    /* renamed from: c */
    public final TimeUnit f64189c;

    /* renamed from: d */
    public final Scheduler f64190d;

    /* renamed from: e */
    public final boolean f64191e;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDelay$a */
    /* loaded from: classes5.dex */
    public static final class C10831a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64192a;

        /* renamed from: b */
        public final long f64193b;

        /* renamed from: c */
        public final TimeUnit f64194c;

        /* renamed from: d */
        public final Scheduler.Worker f64195d;

        /* renamed from: e */
        public final boolean f64196e;

        /* renamed from: f */
        public Subscription f64197f;

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableDelay$a$a */
        /* loaded from: classes5.dex */
        public final class RunnableC10832a implements Runnable {
            public RunnableC10832a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C10831a.this.f64192a.onComplete();
                } finally {
                    C10831a.this.f64195d.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableDelay$a$b */
        /* loaded from: classes5.dex */
        public final class RunnableC10833b implements Runnable {

            /* renamed from: a */
            public final Throwable f64199a;

            public RunnableC10833b(Throwable th2) {
                this.f64199a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C10831a.this.f64192a.onError(this.f64199a);
                } finally {
                    C10831a.this.f64195d.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableDelay$a$c */
        /* loaded from: classes5.dex */
        public final class RunnableC10834c implements Runnable {

            /* renamed from: a */
            public final Object f64201a;

            public RunnableC10834c(Object obj) {
                this.f64201a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                C10831a.this.f64192a.onNext(this.f64201a);
            }
        }

        public C10831a(Subscriber subscriber, long j, TimeUnit timeUnit, Scheduler.Worker worker, boolean z) {
            this.f64192a = subscriber;
            this.f64193b = j;
            this.f64194c = timeUnit;
            this.f64195d = worker;
            this.f64196e = z;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64197f.cancel();
            this.f64195d.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64195d.schedule(new RunnableC10832a(), this.f64193b, this.f64194c);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            long j;
            Scheduler.Worker worker = this.f64195d;
            RunnableC10833b runnableC10833b = new RunnableC10833b(th2);
            if (this.f64196e) {
                j = this.f64193b;
            } else {
                j = 0;
            }
            worker.schedule(runnableC10833b, j, this.f64194c);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64195d.schedule(new RunnableC10834c(obj), this.f64193b, this.f64194c);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64197f, subscription)) {
                this.f64197f = subscription;
                this.f64192a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64197f.request(j);
        }
    }

    public FlowableDelay(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(flowable);
        this.f64188b = j;
        this.f64189c = timeUnit;
        this.f64190d = scheduler;
        this.f64191e = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber;
        if (this.f64191e) {
            serializedSubscriber = subscriber;
        } else {
            serializedSubscriber = new SerializedSubscriber(subscriber);
        }
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10831a(serializedSubscriber, this.f64188b, this.f64189c, this.f64190d.createWorker(), this.f64191e));
    }
}
