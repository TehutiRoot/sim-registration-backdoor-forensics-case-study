package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.CompositeSubscription;

/* renamed from: rx.internal.operators.CompletableOnSubscribeMergeArray */
/* loaded from: classes7.dex */
public final class CompletableOnSubscribeMergeArray implements Completable.OnSubscribe {

    /* renamed from: a */
    public final Completable[] f77823a;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeMergeArray$a */
    /* loaded from: classes7.dex */
    public class C13448a implements CompletableSubscriber {

        /* renamed from: a */
        public final /* synthetic */ CompositeSubscription f77824a;

        /* renamed from: b */
        public final /* synthetic */ AtomicBoolean f77825b;

        /* renamed from: c */
        public final /* synthetic */ CompletableSubscriber f77826c;

        /* renamed from: d */
        public final /* synthetic */ AtomicInteger f77827d;

        public C13448a(CompositeSubscription compositeSubscription, AtomicBoolean atomicBoolean, CompletableSubscriber completableSubscriber, AtomicInteger atomicInteger) {
            this.f77824a = compositeSubscription;
            this.f77825b = atomicBoolean;
            this.f77826c = completableSubscriber;
            this.f77827d = atomicInteger;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            if (this.f77827d.decrementAndGet() == 0 && this.f77825b.compareAndSet(false, true)) {
                this.f77826c.onCompleted();
            }
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.f77824a.unsubscribe();
            if (this.f77825b.compareAndSet(false, true)) {
                this.f77826c.onError(th2);
            } else {
                RxJavaHooks.onError(th2);
            }
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f77824a.add(subscription);
        }
    }

    public CompletableOnSubscribeMergeArray(Completable[] completableArr) {
        this.f77823a = completableArr;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        boolean z = true;
        AtomicInteger atomicInteger = new AtomicInteger(this.f77823a.length + 1);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        completableSubscriber.onSubscribe(compositeSubscription);
        Completable[] completableArr = this.f77823a;
        int length = completableArr.length;
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            Completable completable = completableArr[i];
            if (compositeSubscription.isUnsubscribed()) {
                return;
            }
            if (completable == null) {
                compositeSubscription.unsubscribe();
                Throwable nullPointerException = new NullPointerException("A completable source is null");
                if (atomicBoolean.compareAndSet(z2, z)) {
                    completableSubscriber.onError(nullPointerException);
                    return;
                }
                RxJavaHooks.onError(nullPointerException);
            }
            completable.unsafeSubscribe(new C13448a(compositeSubscription, atomicBoolean, completableSubscriber, atomicInteger));
            i++;
            z = true;
            z2 = false;
        }
        if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
            completableSubscriber.onCompleted();
        }
    }
}
