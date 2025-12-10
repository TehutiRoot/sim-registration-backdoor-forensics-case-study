package p046rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.Subscription;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.SingleTakeUntilCompletable */
/* loaded from: classes7.dex */
public final class SingleTakeUntilCompletable<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Single.OnSubscribe f79019a;

    /* renamed from: b */
    public final Completable f79020b;

    /* renamed from: rx.internal.operators.SingleTakeUntilCompletable$a */
    /* loaded from: classes7.dex */
    public static final class C13720a extends SingleSubscriber implements CompletableSubscriber {

        /* renamed from: b */
        public final SingleSubscriber f79021b;

        /* renamed from: c */
        public final AtomicBoolean f79022c = new AtomicBoolean();

        public C13720a(SingleSubscriber singleSubscriber) {
            this.f79021b = singleSubscriber;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            onError(new CancellationException("Single::takeUntil(Completable) - Stream was canceled before emitting a terminal event."));
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            if (this.f79022c.compareAndSet(false, true)) {
                unsubscribe();
                this.f79021b.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            add(subscription);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            if (this.f79022c.compareAndSet(false, true)) {
                unsubscribe();
                this.f79021b.onSuccess(obj);
            }
        }
    }

    public SingleTakeUntilCompletable(Single.OnSubscribe<T> onSubscribe, Completable completable) {
        this.f79019a = onSubscribe;
        this.f79020b = completable;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13720a c13720a = new C13720a(singleSubscriber);
        singleSubscriber.add(c13720a);
        this.f79020b.subscribe(c13720a);
        this.f79019a.call(c13720a);
    }
}
