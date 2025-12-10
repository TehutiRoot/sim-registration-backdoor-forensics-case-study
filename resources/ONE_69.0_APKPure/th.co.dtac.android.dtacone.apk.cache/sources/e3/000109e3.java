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
    public final Iterable f78047a;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeMergeIterable$a */
    /* loaded from: classes7.dex */
    public class C13452a implements CompletableSubscriber {

        /* renamed from: a */
        public final /* synthetic */ CompositeSubscription f78048a;

        /* renamed from: b */
        public final /* synthetic */ AtomicBoolean f78049b;

        /* renamed from: c */
        public final /* synthetic */ CompletableSubscriber f78050c;

        /* renamed from: d */
        public final /* synthetic */ AtomicInteger f78051d;

        public C13452a(CompositeSubscription compositeSubscription, AtomicBoolean atomicBoolean, CompletableSubscriber completableSubscriber, AtomicInteger atomicInteger) {
            this.f78048a = compositeSubscription;
            this.f78049b = atomicBoolean;
            this.f78050c = completableSubscriber;
            this.f78051d = atomicInteger;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            if (this.f78051d.decrementAndGet() == 0 && this.f78049b.compareAndSet(false, true)) {
                this.f78050c.onCompleted();
            }
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.f78048a.unsubscribe();
            if (this.f78049b.compareAndSet(false, true)) {
                this.f78050c.onError(th2);
            } else {
                RxJavaHooks.onError(th2);
            }
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f78048a.add(subscription);
        }
    }

    public CompletableOnSubscribeMergeIterable(Iterable<? extends Completable> iterable) {
        this.f78047a = iterable;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        completableSubscriber.onSubscribe(compositeSubscription);
        try {
            Iterator it = this.f78047a.iterator();
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
                            completable.unsafeSubscribe(new C13452a(compositeSubscription, atomicBoolean, completableSubscriber, atomicInteger));
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