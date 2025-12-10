package p046rx.internal.operators;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;
import p046rx.internal.util.atomic.MpscLinkedAtomicQueue;
import p046rx.internal.util.unsafe.MpscLinkedQueue;
import p046rx.internal.util.unsafe.UnsafeAccess;
import p046rx.subscriptions.CompositeSubscription;

/* renamed from: rx.internal.operators.CompletableOnSubscribeMergeDelayErrorIterable */
/* loaded from: classes7.dex */
public final class CompletableOnSubscribeMergeDelayErrorIterable implements Completable.OnSubscribe {

    /* renamed from: a */
    public final Iterable f78041a;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeMergeDelayErrorIterable$a */
    /* loaded from: classes7.dex */
    public class C13451a implements CompletableSubscriber {

        /* renamed from: a */
        public final /* synthetic */ CompositeSubscription f78042a;

        /* renamed from: b */
        public final /* synthetic */ Queue f78043b;

        /* renamed from: c */
        public final /* synthetic */ AtomicInteger f78044c;

        /* renamed from: d */
        public final /* synthetic */ CompletableSubscriber f78045d;

        public C13451a(CompositeSubscription compositeSubscription, Queue queue, AtomicInteger atomicInteger, CompletableSubscriber completableSubscriber) {
            this.f78042a = compositeSubscription;
            this.f78043b = queue;
            this.f78044c = atomicInteger;
            this.f78045d = completableSubscriber;
        }

        /* renamed from: a */
        public void m23326a() {
            if (this.f78044c.decrementAndGet() == 0) {
                if (this.f78043b.isEmpty()) {
                    this.f78045d.onCompleted();
                } else {
                    this.f78045d.onError(CompletableOnSubscribeMerge.collectErrors(this.f78043b));
                }
            }
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            m23326a();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.f78043b.offer(th2);
            m23326a();
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f78042a.add(subscription);
        }
    }

    public CompletableOnSubscribeMergeDelayErrorIterable(Iterable<? extends Completable> iterable) {
        this.f78041a = iterable;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        Queue mpscLinkedAtomicQueue;
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        completableSubscriber.onSubscribe(compositeSubscription);
        try {
            Iterator it = this.f78041a.iterator();
            if (it == null) {
                completableSubscriber.onError(new NullPointerException("The source iterator returned is null"));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(1);
            if (UnsafeAccess.isUnsafeAvailable()) {
                mpscLinkedAtomicQueue = new MpscLinkedQueue();
            } else {
                mpscLinkedAtomicQueue = new MpscLinkedAtomicQueue();
            }
            Queue queue = mpscLinkedAtomicQueue;
            while (!compositeSubscription.isUnsubscribed()) {
                try {
                    if (!it.hasNext()) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (queue.isEmpty()) {
                                completableSubscriber.onCompleted();
                                return;
                            } else {
                                completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(queue));
                                return;
                            }
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
                                queue.offer(new NullPointerException("A completable source is null"));
                                if (atomicInteger.decrementAndGet() == 0) {
                                    if (queue.isEmpty()) {
                                        completableSubscriber.onCompleted();
                                        return;
                                    } else {
                                        completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(queue));
                                        return;
                                    }
                                }
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            completable.unsafeSubscribe(new C13451a(compositeSubscription, queue, atomicInteger, completableSubscriber));
                        } catch (Throwable th2) {
                            queue.offer(th2);
                            if (atomicInteger.decrementAndGet() == 0) {
                                if (queue.isEmpty()) {
                                    completableSubscriber.onCompleted();
                                    return;
                                } else {
                                    completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(queue));
                                    return;
                                }
                            }
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    queue.offer(th3);
                    if (atomicInteger.decrementAndGet() == 0) {
                        if (queue.isEmpty()) {
                            completableSubscriber.onCompleted();
                            return;
                        } else {
                            completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(queue));
                            return;
                        }
                    }
                    return;
                }
            }
        } catch (Throwable th4) {
            completableSubscriber.onError(th4);
        }
    }
}