package p046rx.internal.util;

import p046rx.Scheduler;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.functions.Action0;
import p046rx.functions.Func1;
import p046rx.internal.schedulers.EventLoopsScheduler;

/* renamed from: rx.internal.util.ScalarSynchronousSingle */
/* loaded from: classes7.dex */
public final class ScalarSynchronousSingle<T> extends Single<T> {

    /* renamed from: b */
    public final Object f79231b;

    /* renamed from: rx.internal.util.ScalarSynchronousSingle$a */
    /* loaded from: classes7.dex */
    public class C13782a implements Single.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Object f79232a;

        public C13782a(Object obj) {
            this.f79232a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber singleSubscriber) {
            singleSubscriber.onSuccess(this.f79232a);
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousSingle$b */
    /* loaded from: classes7.dex */
    public class C13783b implements Single.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Func1 f79233a;

        /* renamed from: rx.internal.util.ScalarSynchronousSingle$b$a */
        /* loaded from: classes7.dex */
        public class C13784a extends SingleSubscriber {

            /* renamed from: b */
            public final /* synthetic */ SingleSubscriber f79235b;

            public C13784a(SingleSubscriber singleSubscriber) {
                this.f79235b = singleSubscriber;
            }

            @Override // p046rx.SingleSubscriber
            public void onError(Throwable th2) {
                this.f79235b.onError(th2);
            }

            @Override // p046rx.SingleSubscriber
            public void onSuccess(Object obj) {
                this.f79235b.onSuccess(obj);
            }
        }

        public C13783b(Func1 func1) {
            this.f79233a = func1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber singleSubscriber) {
            Single single = (Single) this.f79233a.call(ScalarSynchronousSingle.this.f79231b);
            if (single instanceof ScalarSynchronousSingle) {
                singleSubscriber.onSuccess(((ScalarSynchronousSingle) single).f79231b);
                return;
            }
            C13784a c13784a = new C13784a(singleSubscriber);
            singleSubscriber.add(c13784a);
            single.subscribe(c13784a);
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousSingle$c */
    /* loaded from: classes7.dex */
    public static final class C13785c implements Single.OnSubscribe {

        /* renamed from: a */
        public final EventLoopsScheduler f79237a;

        /* renamed from: b */
        public final Object f79238b;

        public C13785c(EventLoopsScheduler eventLoopsScheduler, Object obj) {
            this.f79237a = eventLoopsScheduler;
            this.f79238b = obj;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber singleSubscriber) {
            singleSubscriber.add(this.f79237a.scheduleDirect(new C13787e(singleSubscriber, this.f79238b)));
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousSingle$d */
    /* loaded from: classes7.dex */
    public static final class C13786d implements Single.OnSubscribe {

        /* renamed from: a */
        public final Scheduler f79239a;

        /* renamed from: b */
        public final Object f79240b;

        public C13786d(Scheduler scheduler, Object obj) {
            this.f79239a = scheduler;
            this.f79240b = obj;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber singleSubscriber) {
            Scheduler.Worker createWorker = this.f79239a.createWorker();
            singleSubscriber.add(createWorker);
            createWorker.schedule(new C13787e(singleSubscriber, this.f79240b));
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousSingle$e */
    /* loaded from: classes7.dex */
    public static final class C13787e implements Action0 {

        /* renamed from: a */
        public final SingleSubscriber f79241a;

        /* renamed from: b */
        public final Object f79242b;

        public C13787e(SingleSubscriber singleSubscriber, Object obj) {
            this.f79241a = singleSubscriber;
            this.f79242b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.functions.Action0
        public void call() {
            try {
                this.f79241a.onSuccess(this.f79242b);
            } catch (Throwable th2) {
                this.f79241a.onError(th2);
            }
        }
    }

    public ScalarSynchronousSingle(T t) {
        super(new C13782a(t));
        this.f79231b = t;
    }

    public static <T> ScalarSynchronousSingle<T> create(T t) {
        return new ScalarSynchronousSingle<>(t);
    }

    public T get() {
        return (T) this.f79231b;
    }

    public <R> Single<R> scalarFlatMap(Func1<? super T, ? extends Single<? extends R>> func1) {
        return Single.create(new C13783b(func1));
    }

    public Single<T> scalarScheduleOn(Scheduler scheduler) {
        if (scheduler instanceof EventLoopsScheduler) {
            return Single.create(new C13785c((EventLoopsScheduler) scheduler, this.f79231b));
        }
        return Single.create(new C13786d(scheduler, this.f79231b));
    }
}
