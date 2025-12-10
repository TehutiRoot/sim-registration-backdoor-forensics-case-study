package p046rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.CompositeSubscription;

/* renamed from: rx.internal.operators.CompletableOnSubscribeMergeIterable */
/* loaded from: classes7.dex */
public final class CompletableOnSubscribeMergeIterable implements Completable.OnSubscribe {

    /* renamed from: a */
    public final Iterable f77841a;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeMergeIterable$a */
    /* loaded from: classes7.dex */
    public class C13451a implements CompletableSubscriber {

        /* renamed from: a */
        public final /* synthetic */ CompositeSubscription f77842a;

        /* renamed from: b */
        public final /* synthetic */ AtomicBoolean f77843b;

        /* renamed from: c */
        public final /* synthetic */ CompletableSubscriber f77844c;

        /* renamed from: d */
        public final /* synthetic */ AtomicInteger f77845d;

        public C13451a(CompositeSubscription compositeSubscription, AtomicBoolean atomicBoolean, CompletableSubscriber completableSubscriber, AtomicInteger atomicInteger) {
            this.f77842a = compositeSubscription;
            this.f77843b = atomicBoolean;
            this.f77844c = completableSubscriber;
            this.f77845d = atomicInteger;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            if (this.f77845d.decrementAndGet() == 0 && this.f77843b.compareAndSet(false, true)) {
                this.f77844c.onCompleted();
            }
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.f77842a.unsubscribe();
            if (this.f77843b.compareAndSet(false, true)) {
                this.f77844c.onError(th2);
            } else {
                RxJavaHooks.onError(th2);
            }
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f77842a.add(subscription);
        }
    }

    public CompletableOnSubscribeMergeIterable(Iterable<? extends Completable> iterable) {
        this.f77841a = iterable;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        completableSubscriber.onSubscribe(compositeSubscription);
        try {
            Iterator it = this.f77841a.iterator();
            if (it == null) {
                completableSubscriber.onError(new NullPointerException("The source iterator returned is null"));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(1);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            while (!compositeSubscription.isUnsubscribed()) {
                try {
                    if (!it.hasNext()) {
                        if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
                            completableSubscriber.onCompleted();
                            return;
                        }
                        return;
                    } else if (compositeSubscription.isUnsubscribed()) {
                        return;
                    } else {
                        try {
                            Completable completable = (Completable) it.next();
                            if (compositeSubscription.isUnsubscribed()) {
                                return;
                            }
                            if (completable == null) {
                                compositeSubscription.unsubscribe();
                                Throwable nullPointerException = new NullPointerException("A completable source is null");
                                if (atomicBoolean.compareAndSet(false, true)) {
                                    completableSubscriber.onError(nullPointerException);
                                    return;
                                } else {
                                    RxJavaHooks.onError(nullPointerException);
                                    return;
                                }
                            }
                            atomicInteger.getAndIncrement();
                            completable.unsafeSubscribe(new C13451a(compositeSubscription, atomicBoolean, completableSubscriber, atomicInteger));
                        } catch (Throwable th2) {
                            compositeSubscription.unsubscribe();
                            if (atomicBoolean.compareAndSet(false, true)) {
                                completableSubscriber.onError(th2);
                                return;
                            } else {
                                RxJavaHooks.onError(th2);
                                return;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    compositeSubscription.unsubscribe();
                    if (atomicBoolean.compareAndSet(false, true)) {
                        completableSubscriber.onError(th3);
                        return;
                    } else {
                        RxJavaHooks.onError(th3);
                        return;
                    }
                }
            }
        } catch (Throwable th4) {
            completableSubscriber.onError(th4);
        }
    }
}
