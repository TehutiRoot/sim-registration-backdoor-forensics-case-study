package p046rx.internal.operators;

import p046rx.Scheduler;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.functions.Action0;

/* renamed from: rx.internal.operators.SingleObserveOn */
/* loaded from: classes7.dex */
public final class SingleObserveOn<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Single.OnSubscribe f79181a;

    /* renamed from: b */
    public final Scheduler f79182b;

    /* renamed from: rx.internal.operators.SingleObserveOn$a */
    /* loaded from: classes7.dex */
    public static final class C13711a extends SingleSubscriber implements Action0 {

        /* renamed from: b */
        public final SingleSubscriber f79183b;

        /* renamed from: c */
        public final Scheduler.Worker f79184c;

        /* renamed from: d */
        public Object f79185d;

        /* renamed from: e */
        public Throwable f79186e;

        public C13711a(SingleSubscriber singleSubscriber, Scheduler.Worker worker) {
            this.f79183b = singleSubscriber;
            this.f79184c = worker;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.functions.Action0
        public void call() {
            try {
                Throwable th2 = this.f79186e;
                if (th2 != null) {
                    this.f79186e = null;
                    this.f79183b.onError(th2);
                } else {
                    Object obj = this.f79185d;
                    this.f79185d = null;
                    this.f79183b.onSuccess(obj);
                }
                this.f79184c.unsubscribe();
            } catch (Throwable th3) {
                this.f79184c.unsubscribe();
                throw th3;
            }
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            this.f79186e = th2;
            this.f79184c.schedule(this);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            this.f79185d = obj;
            this.f79184c.schedule(this);
        }
    }

    public SingleObserveOn(Single.OnSubscribe<T> onSubscribe, Scheduler scheduler) {
        this.f79181a = onSubscribe;
        this.f79182b = scheduler;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        Scheduler.Worker createWorker = this.f79182b.createWorker();
        C13711a c13711a = new C13711a(singleSubscriber, createWorker);
        singleSubscriber.add(createWorker);
        singleSubscriber.add(c13711a);
        this.f79181a.call(c13711a);
    }
}