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
    public final Single.OnSubscribe f79241a;

    /* renamed from: b */
    public final long f79242b;

    /* renamed from: c */
    public final TimeUnit f79243c;

    /* renamed from: d */
    public final Scheduler f79244d;

    /* renamed from: e */
    public final Single.OnSubscribe f79245e;

    /* renamed from: rx.internal.operators.SingleTimeout$a */
    /* loaded from: classes7.dex */
    public static final class C13726a extends SingleSubscriber implements Action0 {

        /* renamed from: b */
        public final SingleSubscriber f79246b;

        /* renamed from: c */
        public final AtomicBoolean f79247c = new AtomicBoolean();

        /* renamed from: d */
        public final Single.OnSubscribe f79248d;

        /* renamed from: rx.internal.operators.SingleTimeout$a$a */
        /* loaded from: classes7.dex */
        public static final class C13727a extends SingleSubscriber {

            /* renamed from: b */
            public final SingleSubscriber f79249b;

            public C13727a(SingleSubscriber singleSubscriber) {
                this.f79249b = singleSubscriber;
            }

            @Override // p046rx.SingleSubscriber
            public void onError(Throwable th2) {
                this.f79249b.onError(th2);
            }

            @Override // p046rx.SingleSubscriber
            public void onSuccess(Object obj) {
                this.f79249b.onSuccess(obj);
            }
        }

        public C13726a(SingleSubscriber singleSubscriber, Single.OnSubscribe onSubscribe) {
            this.f79246b = singleSubscriber;
            this.f79248d = onSubscribe;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (this.f79247c.compareAndSet(false, true)) {
                try {
                    Single.OnSubscribe onSubscribe = this.f79248d;
                    if (onSubscribe == null) {
                        this.f79246b.onError(new TimeoutException());
                    } else {
                        C13727a c13727a = new C13727a(this.f79246b);
                        this.f79246b.add(c13727a);
                        onSubscribe.call(c13727a);
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
            if (this.f79247c.compareAndSet(false, true)) {
                try {
                    this.f79246b.onError(th2);
                    return;
                } finally {
                    unsubscribe();
                }
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            if (this.f79247c.compareAndSet(false, true)) {
                try {
                    this.f79246b.onSuccess(obj);
                } finally {
                    unsubscribe();
                }
            }
        }
    }

    public SingleTimeout(Single.OnSubscribe<T> onSubscribe, long j, TimeUnit timeUnit, Scheduler scheduler, Single.OnSubscribe<? extends T> onSubscribe2) {
        this.f79241a = onSubscribe;
        this.f79242b = j;
        this.f79243c = timeUnit;
        this.f79244d = scheduler;
        this.f79245e = onSubscribe2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13726a c13726a = new C13726a(singleSubscriber, this.f79245e);
        Scheduler.Worker createWorker = this.f79244d.createWorker();
        c13726a.add(createWorker);
        singleSubscriber.add(c13726a);
        createWorker.schedule(c13726a, this.f79242b, this.f79243c);
        this.f79241a.call(c13726a);
    }
}