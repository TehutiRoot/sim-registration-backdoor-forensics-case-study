package p046rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Scheduler;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.CompositeSubscription;

/* renamed from: rx.internal.operators.CompletableOnSubscribeTimeout */
/* loaded from: classes7.dex */
public final class CompletableOnSubscribeTimeout implements Completable.OnSubscribe {

    /* renamed from: a */
    public final Completable f77847a;

    /* renamed from: b */
    public final long f77848b;

    /* renamed from: c */
    public final TimeUnit f77849c;

    /* renamed from: d */
    public final Scheduler f77850d;

    /* renamed from: e */
    public final Completable f77851e;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeTimeout$a */
    /* loaded from: classes7.dex */
    public class C13452a implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f77852a;

        /* renamed from: b */
        public final /* synthetic */ CompositeSubscription f77853b;

        /* renamed from: c */
        public final /* synthetic */ CompletableSubscriber f77854c;

        /* renamed from: rx.internal.operators.CompletableOnSubscribeTimeout$a$a */
        /* loaded from: classes7.dex */
        public class C13453a implements CompletableSubscriber {
            public C13453a() {
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                C13452a.this.f77853b.unsubscribe();
                C13452a.this.f77854c.onCompleted();
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                C13452a.this.f77853b.unsubscribe();
                C13452a.this.f77854c.onError(th2);
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                C13452a.this.f77853b.add(subscription);
            }
        }

        public C13452a(AtomicBoolean atomicBoolean, CompositeSubscription compositeSubscription, CompletableSubscriber completableSubscriber) {
            this.f77852a = atomicBoolean;
            this.f77853b = compositeSubscription;
            this.f77854c = completableSubscriber;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (this.f77852a.compareAndSet(false, true)) {
                this.f77853b.clear();
                Completable completable = CompletableOnSubscribeTimeout.this.f77851e;
                if (completable == null) {
                    this.f77854c.onError(new TimeoutException());
                } else {
                    completable.unsafeSubscribe(new C13453a());
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.CompletableOnSubscribeTimeout$b */
    /* loaded from: classes7.dex */
    public class C13454b implements CompletableSubscriber {

        /* renamed from: a */
        public final /* synthetic */ CompositeSubscription f77857a;

        /* renamed from: b */
        public final /* synthetic */ AtomicBoolean f77858b;

        /* renamed from: c */
        public final /* synthetic */ CompletableSubscriber f77859c;

        public C13454b(CompositeSubscription compositeSubscription, AtomicBoolean atomicBoolean, CompletableSubscriber completableSubscriber) {
            this.f77857a = compositeSubscription;
            this.f77858b = atomicBoolean;
            this.f77859c = completableSubscriber;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            if (this.f77858b.compareAndSet(false, true)) {
                this.f77857a.unsubscribe();
                this.f77859c.onCompleted();
            }
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            if (this.f77858b.compareAndSet(false, true)) {
                this.f77857a.unsubscribe();
                this.f77859c.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f77857a.add(subscription);
        }
    }

    public CompletableOnSubscribeTimeout(Completable completable, long j, TimeUnit timeUnit, Scheduler scheduler, Completable completable2) {
        this.f77847a = completable;
        this.f77848b = j;
        this.f77849c = timeUnit;
        this.f77850d = scheduler;
        this.f77851e = completable2;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        completableSubscriber.onSubscribe(compositeSubscription);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        Scheduler.Worker createWorker = this.f77850d.createWorker();
        compositeSubscription.add(createWorker);
        createWorker.schedule(new C13452a(atomicBoolean, compositeSubscription, completableSubscriber), this.f77848b, this.f77849c);
        this.f77847a.unsafeSubscribe(new C13454b(compositeSubscription, atomicBoolean, completableSubscriber));
    }
}
