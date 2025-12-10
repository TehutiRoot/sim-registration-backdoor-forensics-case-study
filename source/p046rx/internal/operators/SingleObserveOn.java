package p046rx.internal.operators;

import p046rx.Scheduler;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.functions.Action0;

/* renamed from: rx.internal.operators.SingleObserveOn */
/* loaded from: classes7.dex */
public final class SingleObserveOn<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Single.OnSubscribe f78975a;

    /* renamed from: b */
    public final Scheduler f78976b;

    /* renamed from: rx.internal.operators.SingleObserveOn$a */
    /* loaded from: classes7.dex */
    public static final class C13710a extends SingleSubscriber implements Action0 {

        /* renamed from: b */
        public final SingleSubscriber f78977b;

        /* renamed from: c */
        public final Scheduler.Worker f78978c;

        /* renamed from: d */
        public Object f78979d;

        /* renamed from: e */
        public Throwable f78980e;

        public C13710a(SingleSubscriber singleSubscriber, Scheduler.Worker worker) {
            this.f78977b = singleSubscriber;
            this.f78978c = worker;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.functions.Action0
        public void call() {
            try {
                Throwable th2 = this.f78980e;
                if (th2 != null) {
                    this.f78980e = null;
                    this.f78977b.onError(th2);
                } else {
                    Object obj = this.f78979d;
                    this.f78979d = null;
                    this.f78977b.onSuccess(obj);
                }
                this.f78978c.unsubscribe();
            } catch (Throwable th3) {
                this.f78978c.unsubscribe();
                throw th3;
            }
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            this.f78980e = th2;
            this.f78978c.schedule(this);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            this.f78979d = obj;
            this.f78978c.schedule(this);
        }
    }

    public SingleObserveOn(Single.OnSubscribe<T> onSubscribe, Scheduler scheduler) {
        this.f78975a = onSubscribe;
        this.f78976b = scheduler;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        Scheduler.Worker createWorker = this.f78976b.createWorker();
        C13710a c13710a = new C13710a(singleSubscriber, createWorker);
        singleSubscriber.add(createWorker);
        singleSubscriber.add(c13710a);
        this.f78975a.call(c13710a);
    }
}
