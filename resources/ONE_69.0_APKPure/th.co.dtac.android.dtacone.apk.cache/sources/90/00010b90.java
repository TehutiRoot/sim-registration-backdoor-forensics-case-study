package p046rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p046rx.Scheduler;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.functions.Action0;

/* renamed from: rx.internal.operators.SingleDelay */
/* loaded from: classes7.dex */
public final class SingleDelay<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Single.OnSubscribe f79145a;

    /* renamed from: b */
    public final long f79146b;

    /* renamed from: c */
    public final TimeUnit f79147c;

    /* renamed from: d */
    public final Scheduler f79148d;

    /* renamed from: rx.internal.operators.SingleDelay$a */
    /* loaded from: classes7.dex */
    public static final class C13706a extends SingleSubscriber implements Action0 {

        /* renamed from: b */
        public final SingleSubscriber f79149b;

        /* renamed from: c */
        public final Scheduler.Worker f79150c;

        /* renamed from: d */
        public final long f79151d;

        /* renamed from: e */
        public final TimeUnit f79152e;

        /* renamed from: f */
        public Object f79153f;

        /* renamed from: g */
        public Throwable f79154g;

        public C13706a(SingleSubscriber singleSubscriber, Scheduler.Worker worker, long j, TimeUnit timeUnit) {
            this.f79149b = singleSubscriber;
            this.f79150c = worker;
            this.f79151d = j;
            this.f79152e = timeUnit;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.functions.Action0
        public void call() {
            try {
                Throwable th2 = this.f79154g;
                if (th2 != null) {
                    this.f79154g = null;
                    this.f79149b.onError(th2);
                } else {
                    Object obj = this.f79153f;
                    this.f79153f = null;
                    this.f79149b.onSuccess(obj);
                }
                this.f79150c.unsubscribe();
            } catch (Throwable th3) {
                this.f79150c.unsubscribe();
                throw th3;
            }
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            this.f79154g = th2;
            this.f79150c.schedule(this, this.f79151d, this.f79152e);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            this.f79153f = obj;
            this.f79150c.schedule(this, this.f79151d, this.f79152e);
        }
    }

    public SingleDelay(Single.OnSubscribe<T> onSubscribe, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f79145a = onSubscribe;
        this.f79148d = scheduler;
        this.f79146b = j;
        this.f79147c = timeUnit;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        Scheduler.Worker createWorker = this.f79148d.createWorker();
        C13706a c13706a = new C13706a(singleSubscriber, createWorker, this.f79146b, this.f79147c);
        singleSubscriber.add(createWorker);
        singleSubscriber.add(c13706a);
        this.f79145a.call(c13706a);
    }
}