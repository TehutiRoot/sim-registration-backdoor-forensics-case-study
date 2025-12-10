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
    public final Completable[] f78035a;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeMergeDelayErrorArray$a */
    /* loaded from: classes7.dex */
    public class C13450a implements CompletableSubscriber {

        /* renamed from: a */
        public final /* synthetic */ CompositeSubscription f78036a;

        /* renamed from: b */
        public final /* synthetic */ Queue f78037b;

        /* renamed from: c */
        public final /* synthetic */ AtomicInteger f78038c;

        /* renamed from: d */
        public final /* synthetic */ CompletableSubscriber f78039d;

        public C13450a(CompositeSubscription compositeSubscription, Queue queue, AtomicInteger atomicInteger, CompletableSubscriber completableSubscriber) {
            this.f78036a = compositeSubscription;
            this.f78037b = queue;
            this.f78038c = atomicInteger;
            this.f78039d = completableSubscriber;
        }

        /* renamed from: a */
        public void m23327a() {
            if (this.f78038c.decrementAndGet() == 0) {
                if (this.f78037b.isEmpty()) {
                    this.f78039d.onCompleted();
                } else {
                    this.f78039d.onError(CompletableOnSubscribeMerge.collectErrors(this.f78037b));
                }
            }
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            m23327a();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.f78037b.offer(th2);
            m23327a();
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f78036a.add(subscription);
        }
    }

    public CompletableOnSubscribeMergeDelayErrorArray(Completable[] completableArr) {
        this.f78035a = completableArr;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        Completable[] completableArr;
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        AtomicInteger atomicInteger = new AtomicInteger(this.f78035a.length + 1);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        completableSubscriber.onSubscribe(compositeSubscription);
        for (Completable completable : this.f78035a) {
            if (compositeSubscription.isUnsubscribed()) {
                return;
            }
            if (completable == null) {
                concurrentLinkedQueue.offer(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                completable.unsafeSubscribe(new C13450a(compositeSubscription, concurrentLinkedQueue, atomicInteger, completableSubscriber));
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