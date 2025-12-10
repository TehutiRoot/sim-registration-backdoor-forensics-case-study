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
    public final Completable f78053a;

    /* renamed from: b */
    public final long f78054b;

    /* renamed from: c */
    public final TimeUnit f78055c;

    /* renamed from: d */
    public final Scheduler f78056d;

    /* renamed from: e */
    public final Completable f78057e;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeTimeout$a */
    /* loaded from: classes7.dex */
    public class C13453a implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f78058a;

        /* renamed from: b */
        public final /* synthetic */ CompositeSubscription f78059b;

        /* renamed from: c */
        public final /* synthetic */ CompletableSubscriber f78060c;

        /* renamed from: rx.internal.operators.CompletableOnSubscribeTimeout$a$a */
        /* loaded from: classes7.dex */
        public class C13454a implements CompletableSubscriber {
            public C13454a() {
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                C13453a.this.f78059b.unsubscribe();
                C13453a.this.f78060c.onCompleted();
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                C13453a.this.f78059b.unsubscribe();
                C13453a.this.f78060c.onError(th2);
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                C13453a.this.f78059b.add(subscription);
            }
        }

        public C13453a(AtomicBoolean atomicBoolean, CompositeSubscription compositeSubscription, CompletableSubscriber completableSubscriber) {
            this.f78058a = atomicBoolean;
            this.f78059b = compositeSubscription;
            this.f78060c = completableSubscriber;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (this.f78058a.compareAndSet(false, true)) {
                this.f78059b.clear();
                Completable completable = CompletableOnSubscribeTimeout.this.f78057e;
                if (completable == null) {
                    this.f78060c.onError(new TimeoutException());
                } else {
                    completable.unsafeSubscribe(new C13454a());
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.CompletableOnSubscribeTimeout$b */
    /* loaded from: classes7.dex */
    public class C13455b implements CompletableSubscriber {

        /* renamed from: a */
        public final /* synthetic */ CompositeSubscription f78063a;

        /* renamed from: b */
        public final /* synthetic */ AtomicBoolean f78064b;

        /* renamed from: c */
        public final /* synthetic */ CompletableSubscriber f78065c;

        public C13455b(CompositeSubscription compositeSubscription, AtomicBoolean atomicBoolean, CompletableSubscriber completableSubscriber) {
            this.f78063a = compositeSubscription;
            this.f78064b = atomicBoolean;
            this.f78065c = completableSubscriber;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            if (this.f78064b.compareAndSet(false, true)) {
                this.f78063a.unsubscribe();
                this.f78065c.onCompleted();
            }
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            if (this.f78064b.compareAndSet(false, true)) {
                this.f78063a.unsubscribe();
                this.f78065c.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f78063a.add(subscription);
        }
    }

    public CompletableOnSubscribeTimeout(Completable completable, long j, TimeUnit timeUnit, Scheduler scheduler, Completable completable2) {
        this.f78053a = completable;
        this.f78054b = j;
        this.f78055c = timeUnit;
        this.f78056d = scheduler;
        this.f78057e = completable2;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        completableSubscriber.onSubscribe(compositeSubscription);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        Scheduler.Worker createWorker = this.f78056d.createWorker();
        compositeSubscription.add(createWorker);
        createWorker.schedule(new C13453a(atomicBoolean, compositeSubscription, completableSubscriber), this.f78054b, this.f78055c);
        this.f78053a.unsafeSubscribe(new C13455b(compositeSubscription, atomicBoolean, completableSubscriber));
    }
}