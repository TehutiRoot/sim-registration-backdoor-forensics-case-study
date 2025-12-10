package p046rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;
import p046rx.observers.SerializedSubscriber;
import p046rx.subscriptions.SerialSubscription;

/* renamed from: rx.internal.operators.OperatorDebounceWithTime */
/* loaded from: classes7.dex */
public final class OperatorDebounceWithTime<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final long f78286a;

    /* renamed from: b */
    public final TimeUnit f78287b;

    /* renamed from: c */
    public final Scheduler f78288c;

    /* renamed from: rx.internal.operators.OperatorDebounceWithTime$a */
    /* loaded from: classes7.dex */
    public class C13547a extends Subscriber {

        /* renamed from: a */
        public final C13549b f78289a;

        /* renamed from: b */
        public final Subscriber f78290b;

        /* renamed from: c */
        public final /* synthetic */ SerialSubscription f78291c;

        /* renamed from: d */
        public final /* synthetic */ Scheduler.Worker f78292d;

        /* renamed from: e */
        public final /* synthetic */ SerializedSubscriber f78293e;

        /* renamed from: rx.internal.operators.OperatorDebounceWithTime$a$a */
        /* loaded from: classes7.dex */
        public class C13548a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ int f78295a;

            public C13548a(int i) {
                this.f78295a = i;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13547a c13547a = C13547a.this;
                c13547a.f78289a.m23070b(this.f78295a, c13547a.f78293e, c13547a.f78290b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13547a(Subscriber subscriber, SerialSubscription serialSubscription, Scheduler.Worker worker, SerializedSubscriber serializedSubscriber) {
            super(subscriber);
            this.f78291c = serialSubscription;
            this.f78292d = worker;
            this.f78293e = serializedSubscriber;
            this.f78289a = new C13549b();
            this.f78290b = this;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78289a.m23069c(this.f78293e, this);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78293e.onError(th2);
            unsubscribe();
            this.f78289a.m23071a();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            int m23068d = this.f78289a.m23068d(obj);
            SerialSubscription serialSubscription = this.f78291c;
            Scheduler.Worker worker = this.f78292d;
            C13548a c13548a = new C13548a(m23068d);
            OperatorDebounceWithTime operatorDebounceWithTime = OperatorDebounceWithTime.this;
            serialSubscription.set(worker.schedule(c13548a, operatorDebounceWithTime.f78286a, operatorDebounceWithTime.f78287b));
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: rx.internal.operators.OperatorDebounceWithTime$b */
    /* loaded from: classes7.dex */
    public static final class C13549b {

        /* renamed from: a */
        public int f78297a;

        /* renamed from: b */
        public Object f78298b;

        /* renamed from: c */
        public boolean f78299c;

        /* renamed from: d */
        public boolean f78300d;

        /* renamed from: e */
        public boolean f78301e;

        /* renamed from: a */
        public synchronized void m23071a() {
            this.f78297a++;
            this.f78298b = null;
            this.f78299c = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m23070b(int i, Subscriber subscriber, Subscriber subscriber2) {
            synchronized (this) {
                if (!this.f78301e && this.f78299c && i == this.f78297a) {
                    Object obj = this.f78298b;
                    this.f78298b = null;
                    this.f78299c = false;
                    this.f78301e = true;
                    try {
                        subscriber.onNext(obj);
                        synchronized (this) {
                            try {
                                if (!this.f78300d) {
                                    this.f78301e = false;
                                } else {
                                    subscriber.onCompleted();
                                }
                            } finally {
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwOrReport(th2, subscriber2, obj);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public void m23069c(Subscriber subscriber, Subscriber subscriber2) {
            synchronized (this) {
                try {
                    if (this.f78301e) {
                        this.f78300d = true;
                        return;
                    }
                    Object obj = this.f78298b;
                    boolean z = this.f78299c;
                    this.f78298b = null;
                    this.f78299c = false;
                    this.f78301e = true;
                    if (z) {
                        try {
                            subscriber.onNext(obj);
                        } catch (Throwable th2) {
                            Exceptions.throwOrReport(th2, subscriber2, obj);
                            return;
                        }
                    }
                    subscriber.onCompleted();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* renamed from: d */
        public synchronized int m23068d(Object obj) {
            int i;
            this.f78298b = obj;
            this.f78299c = true;
            i = this.f78297a + 1;
            this.f78297a = i;
            return i;
        }
    }

    public OperatorDebounceWithTime(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78286a = j;
        this.f78287b = timeUnit;
        this.f78288c = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.f78288c.createWorker();
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        SerialSubscription serialSubscription = new SerialSubscription();
        serializedSubscriber.add(createWorker);
        serializedSubscriber.add(serialSubscription);
        return new C13547a(subscriber, serialSubscription, createWorker, serializedSubscriber);
    }
}
