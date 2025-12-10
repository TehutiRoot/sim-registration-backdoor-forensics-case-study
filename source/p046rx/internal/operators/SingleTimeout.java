package p046rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Scheduler;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.functions.Action0;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.SingleTimeout */
/* loaded from: classes7.dex */
public final class SingleTimeout<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Single.OnSubscribe f79035a;

    /* renamed from: b */
    public final long f79036b;

    /* renamed from: c */
    public final TimeUnit f79037c;

    /* renamed from: d */
    public final Scheduler f79038d;

    /* renamed from: e */
    public final Single.OnSubscribe f79039e;

    /* renamed from: rx.internal.operators.SingleTimeout$a */
    /* loaded from: classes7.dex */
    public static final class C13725a extends SingleSubscriber implements Action0 {

        /* renamed from: b */
        public final SingleSubscriber f79040b;

        /* renamed from: c */
        public final AtomicBoolean f79041c = new AtomicBoolean();

        /* renamed from: d */
        public final Single.OnSubscribe f79042d;

        /* renamed from: rx.internal.operators.SingleTimeout$a$a */
        /* loaded from: classes7.dex */
        public static final class C13726a extends SingleSubscriber {

            /* renamed from: b */
            public final SingleSubscriber f79043b;

            public C13726a(SingleSubscriber singleSubscriber) {
                this.f79043b = singleSubscriber;
            }

            @Override // p046rx.SingleSubscriber
            public void onError(Throwable th2) {
                this.f79043b.onError(th2);
            }

            @Override // p046rx.SingleSubscriber
            public void onSuccess(Object obj) {
                this.f79043b.onSuccess(obj);
            }
        }

        public C13725a(SingleSubscriber singleSubscriber, Single.OnSubscribe onSubscribe) {
            this.f79040b = singleSubscriber;
            this.f79042d = onSubscribe;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (this.f79041c.compareAndSet(false, true)) {
                try {
                    Single.OnSubscribe onSubscribe = this.f79042d;
                    if (onSubscribe == null) {
                        this.f79040b.onError(new TimeoutException());
                    } else {
                        C13726a c13726a = new C13726a(this.f79040b);
                        this.f79040b.add(c13726a);
                        onSubscribe.call(c13726a);
                    }
                    unsubscribe();
                } catch (Throwable th2) {
                    unsubscribe();
                    throw th2;
                }
            }
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            if (this.f79041c.compareAndSet(false, true)) {
                try {
                    this.f79040b.onError(th2);
                    return;
                } finally {
                    unsubscribe();
                }
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            if (this.f79041c.compareAndSet(false, true)) {
                try {
                    this.f79040b.onSuccess(obj);
                } finally {
                    unsubscribe();
                }
            }
        }
    }

    public SingleTimeout(Single.OnSubscribe<T> onSubscribe, long j, TimeUnit timeUnit, Scheduler scheduler, Single.OnSubscribe<? extends T> onSubscribe2) {
        this.f79035a = onSubscribe;
        this.f79036b = j;
        this.f79037c = timeUnit;
        this.f79038d = scheduler;
        this.f79039e = onSubscribe2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13725a c13725a = new C13725a(singleSubscriber, this.f79039e);
        Scheduler.Worker createWorker = this.f79038d.createWorker();
        c13725a.add(createWorker);
        singleSubscriber.add(c13725a);
        createWorker.schedule(c13725a, this.f79036b, this.f79037c);
        this.f79035a.call(c13725a);
    }
}
