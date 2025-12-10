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
    public final Iterable f77835a;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeMergeDelayErrorIterable$a */
    /* loaded from: classes7.dex */
    public class C13450a implements CompletableSubscriber {

        /* renamed from: a */
        public final /* synthetic */ CompositeSubscription f77836a;

        /* renamed from: b */
        public final /* synthetic */ Queue f77837b;

        /* renamed from: c */
        public final /* synthetic */ AtomicInteger f77838c;

        /* renamed from: d */
        public final /* synthetic */ CompletableSubscriber f77839d;

        public C13450a(CompositeSubscription compositeSubscription, Queue queue, AtomicInteger atomicInteger, CompletableSubscriber completableSubscriber) {
            this.f77836a = compositeSubscription;
            this.f77837b = queue;
            this.f77838c = atomicInteger;
            this.f77839d = completableSubscriber;
        }

        /* renamed from: a */
        public void m23138a() {
            if (this.f77838c.decrementAndGet() == 0) {
                if (this.f77837b.isEmpty()) {
                    this.f77839d.onCompleted();
                } else {
                    this.f77839d.onError(CompletableOnSubscribeMerge.collectErrors(this.f77837b));
                }
            }
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            m23138a();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.f77837b.offer(th2);
            m23138a();
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f77836a.add(subscription);
        }
    }

    public CompletableOnSubscribeMergeDelayErrorIterable(Iterable<? extends Completable> iterable) {
        this.f77835a = iterable;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        Queue mpscLinkedAtomicQueue;
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        completableSubscriber.onSubscribe(compositeSubscription);
        try {
            Iterator it = this.f77835a.iterator();
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
                            completable.unsafeSubscribe(new C13450a(compositeSubscription, queue, atomicInteger, completableSubscriber));
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
