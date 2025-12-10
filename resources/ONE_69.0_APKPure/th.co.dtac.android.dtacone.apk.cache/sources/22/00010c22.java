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
    public final Object f79437b;

    /* renamed from: rx.internal.util.ScalarSynchronousSingle$a */
    /* loaded from: classes7.dex */
    public class C13783a implements Single.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Object f79438a;

        public C13783a(Object obj) {
            this.f79438a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber singleSubscriber) {
            singleSubscriber.onSuccess(this.f79438a);
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousSingle$b */
    /* loaded from: classes7.dex */
    public class C13784b implements Single.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Func1 f79439a;

        /* renamed from: rx.internal.util.ScalarSynchronousSingle$b$a */
        /* loaded from: classes7.dex */
        public class C13785a extends SingleSubscriber {

            /* renamed from: b */
            public final /* synthetic */ SingleSubscriber f79441b;

            public C13785a(SingleSubscriber singleSubscriber) {
                this.f79441b = singleSubscriber;
            }

            @Override // p046rx.SingleSubscriber
            public void onError(Throwable th2) {
                this.f79441b.onError(th2);
            }

            @Override // p046rx.SingleSubscriber
            public void onSuccess(Object obj) {
                this.f79441b.onSuccess(obj);
            }
        }

        public C13784b(Func1 func1) {
            this.f79439a = func1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber singleSubscriber) {
            Single single = (Single) this.f79439a.call(ScalarSynchronousSingle.this.f79437b);
            if (single instanceof ScalarSynchronousSingle) {
                singleSubscriber.onSuccess(((ScalarSynchronousSingle) single).f79437b);
                return;
            }
            C13785a c13785a = new C13785a(singleSubscriber);
            singleSubscriber.add(c13785a);
            single.subscribe(c13785a);
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousSingle$c */
    /* loaded from: classes7.dex */
    public static final class C13786c implements Single.OnSubscribe {

        /* renamed from: a */
        public final EventLoopsScheduler f79443a;

        /* renamed from: b */
        public final Object f79444b;

        public C13786c(EventLoopsScheduler eventLoopsScheduler, Object obj) {
            this.f79443a = eventLoopsScheduler;
            this.f79444b = obj;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber singleSubscriber) {
            singleSubscriber.add(this.f79443a.scheduleDirect(new C13788e(singleSubscriber, this.f79444b)));
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousSingle$d */
    /* loaded from: classes7.dex */
    public static final class C13787d implements Single.OnSubscribe {

        /* renamed from: a */
        public final Scheduler f79445a;

        /* renamed from: b */
        public final Object f79446b;

        public C13787d(Scheduler scheduler, Object obj) {
            this.f79445a = scheduler;
            this.f79446b = obj;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber singleSubscriber) {
            Scheduler.Worker createWorker = this.f79445a.createWorker();
            singleSubscriber.add(createWorker);
            createWorker.schedule(new C13788e(singleSubscriber, this.f79446b));
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousSingle$e */
    /* loaded from: classes7.dex */
    public static final class C13788e implements Action0 {

        /* renamed from: a */
        public final SingleSubscriber f79447a;

        /* renamed from: b */
        public final Object f79448b;

        public C13788e(SingleSubscriber singleSubscriber, Object obj) {
            this.f79447a = singleSubscriber;
            this.f79448b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.functions.Action0
        public void call() {
            try {
                this.f79447a.onSuccess(this.f79448b);
            } catch (Throwable th2) {
                this.f79447a.onError(th2);
            }
        }
    }

    public ScalarSynchronousSingle(T t) {
        super(new C13783a(t));
        this.f79437b = t;
    }

    public static <T> ScalarSynchronousSingle<T> create(T t) {
        return new ScalarSynchronousSingle<>(t);
    }

    public T get() {
        return (T) this.f79437b;
    }

    public <R> Single<R> scalarFlatMap(Func1<? super T, ? extends Single<? extends R>> func1) {
        return Single.create(new C13784b(func1));
    }

    public Single<T> scalarScheduleOn(Scheduler scheduler) {
        if (scheduler instanceof EventLoopsScheduler) {
            return Single.create(new C13786c((EventLoopsScheduler) scheduler, this.f79437b));
        }
        return Single.create(new C13787d(scheduler, this.f79437b));
    }
}