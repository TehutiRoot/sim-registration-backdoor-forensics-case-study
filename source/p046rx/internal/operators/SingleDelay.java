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
    public final Single.OnSubscribe f78939a;

    /* renamed from: b */
    public final long f78940b;

    /* renamed from: c */
    public final TimeUnit f78941c;

    /* renamed from: d */
    public final Scheduler f78942d;

    /* renamed from: rx.internal.operators.SingleDelay$a */
    /* loaded from: classes7.dex */
    public static final class C13705a extends SingleSubscriber implements Action0 {

        /* renamed from: b */
        public final SingleSubscriber f78943b;

        /* renamed from: c */
        public final Scheduler.Worker f78944c;

        /* renamed from: d */
        public final long f78945d;

        /* renamed from: e */
        public final TimeUnit f78946e;

        /* renamed from: f */
        public Object f78947f;

        /* renamed from: g */
        public Throwable f78948g;

        public C13705a(SingleSubscriber singleSubscriber, Scheduler.Worker worker, long j, TimeUnit timeUnit) {
            this.f78943b = singleSubscriber;
            this.f78944c = worker;
            this.f78945d = j;
            this.f78946e = timeUnit;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.functions.Action0
        public void call() {
            try {
                Throwable th2 = this.f78948g;
                if (th2 != null) {
                    this.f78948g = null;
                    this.f78943b.onError(th2);
                } else {
                    Object obj = this.f78947f;
                    this.f78947f = null;
                    this.f78943b.onSuccess(obj);
                }
                this.f78944c.unsubscribe();
            } catch (Throwable th3) {
                this.f78944c.unsubscribe();
                throw th3;
            }
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            this.f78948g = th2;
            this.f78944c.schedule(this, this.f78945d, this.f78946e);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            this.f78947f = obj;
            this.f78944c.schedule(this, this.f78945d, this.f78946e);
        }
    }

    public SingleDelay(Single.OnSubscribe<T> onSubscribe, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78939a = onSubscribe;
        this.f78942d = scheduler;
        this.f78940b = j;
        this.f78941c = timeUnit;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        Scheduler.Worker createWorker = this.f78942d.createWorker();
        C13705a c13705a = new C13705a(singleSubscriber, createWorker, this.f78940b, this.f78941c);
        singleSubscriber.add(createWorker);
        singleSubscriber.add(c13705a);
        this.f78939a.call(c13705a);
    }
}
