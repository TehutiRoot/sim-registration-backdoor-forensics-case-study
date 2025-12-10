package p046rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;
import p046rx.subscriptions.CompositeSubscription;

/* renamed from: rx.internal.operators.CompletableOnSubscribeMergeDelayErrorArray */
/* loaded from: classes7.dex */
public final class CompletableOnSubscribeMergeDelayErrorArray implements Completable.OnSubscribe {

    /* renamed from: a */
    public final Completable[] f77829a;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeMergeDelayErrorArray$a */
    /* loaded from: classes7.dex */
    public class C13449a implements CompletableSubscriber {

        /* renamed from: a */
        public final /* synthetic */ CompositeSubscription f77830a;

        /* renamed from: b */
        public final /* synthetic */ Queue f77831b;

        /* renamed from: c */
        public final /* synthetic */ AtomicInteger f77832c;

        /* renamed from: d */
        public final /* synthetic */ CompletableSubscriber f77833d;

        public C13449a(CompositeSubscription compositeSubscription, Queue queue, AtomicInteger atomicInteger, CompletableSubscriber completableSubscriber) {
            this.f77830a = compositeSubscription;
            this.f77831b = queue;
            this.f77832c = atomicInteger;
            this.f77833d = completableSubscriber;
        }

        /* renamed from: a */
        public void m23139a() {
            if (this.f77832c.decrementAndGet() == 0) {
                if (this.f77831b.isEmpty()) {
                    this.f77833d.onCompleted();
                } else {
                    this.f77833d.onError(CompletableOnSubscribeMerge.collectErrors(this.f77831b));
                }
            }
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            m23139a();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.f77831b.offer(th2);
            m23139a();
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f77830a.add(subscription);
        }
    }

    public CompletableOnSubscribeMergeDelayErrorArray(Completable[] completableArr) {
        this.f77829a = completableArr;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        Completable[] completableArr;
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        AtomicInteger atomicInteger = new AtomicInteger(this.f77829a.length + 1);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        completableSubscriber.onSubscribe(compositeSubscription);
        for (Completable completable : this.f77829a) {
            if (compositeSubscription.isUnsubscribed()) {
                return;
            }
            if (completable == null) {
                concurrentLinkedQueue.offer(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                completable.unsafeSubscribe(new C13449a(compositeSubscription, concurrentLinkedQueue, atomicInteger, completableSubscriber));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            if (concurrentLinkedQueue.isEmpty()) {
                completableSubscriber.onCompleted();
            } else {
                completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(concurrentLinkedQueue));
            }
        }
    }
}
