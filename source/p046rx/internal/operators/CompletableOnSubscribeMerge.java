package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.CompositeException;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.CompositeSubscription;

/* renamed from: rx.internal.operators.CompletableOnSubscribeMerge */
/* loaded from: classes7.dex */
public final class CompletableOnSubscribeMerge implements Completable.OnSubscribe {

    /* renamed from: a */
    public final Observable f77810a;

    /* renamed from: b */
    public final int f77811b;

    /* renamed from: c */
    public final boolean f77812c;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeMerge$a */
    /* loaded from: classes7.dex */
    public static final class C13446a extends Subscriber {

        /* renamed from: a */
        public final CompletableSubscriber f77813a;

        /* renamed from: c */
        public final boolean f77815c;

        /* renamed from: d */
        public volatile boolean f77816d;

        /* renamed from: b */
        public final CompositeSubscription f77814b = new CompositeSubscription();

        /* renamed from: g */
        public final AtomicInteger f77819g = new AtomicInteger(1);

        /* renamed from: f */
        public final AtomicBoolean f77818f = new AtomicBoolean();

        /* renamed from: e */
        public final AtomicReference f77817e = new AtomicReference();

        /* renamed from: rx.internal.operators.CompletableOnSubscribeMerge$a$a */
        /* loaded from: classes7.dex */
        public class C13447a implements CompletableSubscriber {

            /* renamed from: a */
            public Subscription f77820a;

            /* renamed from: b */
            public boolean f77821b;

            public C13447a() {
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                if (this.f77821b) {
                    return;
                }
                this.f77821b = true;
                C13446a.this.f77814b.remove(this.f77820a);
                C13446a.this.m23140f();
                if (!C13446a.this.f77816d) {
                    C13446a.this.request(1L);
                }
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                if (this.f77821b) {
                    RxJavaHooks.onError(th2);
                    return;
                }
                this.f77821b = true;
                C13446a.this.f77814b.remove(this.f77820a);
                C13446a.this.m23142d().offer(th2);
                C13446a.this.m23140f();
                C13446a c13446a = C13446a.this;
                if (c13446a.f77815c && !c13446a.f77816d) {
                    C13446a.this.request(1L);
                }
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.f77820a = subscription;
                C13446a.this.f77814b.add(subscription);
            }
        }

        public C13446a(CompletableSubscriber completableSubscriber, int i, boolean z) {
            this.f77813a = completableSubscriber;
            this.f77815c = z;
            if (i == Integer.MAX_VALUE) {
                request(Long.MAX_VALUE);
            } else {
                request(i);
            }
        }

        /* renamed from: d */
        public Queue m23142d() {
            Queue queue = (Queue) this.f77817e.get();
            if (queue != null) {
                return queue;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            if (AbstractC17300An1.m69050a(this.f77817e, null, concurrentLinkedQueue)) {
                return concurrentLinkedQueue;
            }
            return (Queue) this.f77817e.get();
        }

        @Override // p046rx.Observer
        /* renamed from: e */
        public void onNext(Completable completable) {
            if (this.f77816d) {
                return;
            }
            this.f77819g.getAndIncrement();
            completable.unsafeSubscribe(new C13447a());
        }

        /* renamed from: f */
        public void m23140f() {
            Queue queue;
            if (this.f77819g.decrementAndGet() == 0) {
                Queue queue2 = (Queue) this.f77817e.get();
                if (queue2 != null && !queue2.isEmpty()) {
                    Throwable collectErrors = CompletableOnSubscribeMerge.collectErrors(queue2);
                    if (this.f77818f.compareAndSet(false, true)) {
                        this.f77813a.onError(collectErrors);
                        return;
                    } else {
                        RxJavaHooks.onError(collectErrors);
                        return;
                    }
                }
                this.f77813a.onCompleted();
            } else if (!this.f77815c && (queue = (Queue) this.f77817e.get()) != null && !queue.isEmpty()) {
                Throwable collectErrors2 = CompletableOnSubscribeMerge.collectErrors(queue);
                if (this.f77818f.compareAndSet(false, true)) {
                    this.f77813a.onError(collectErrors2);
                } else {
                    RxJavaHooks.onError(collectErrors2);
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f77816d) {
                return;
            }
            this.f77816d = true;
            m23140f();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f77816d) {
                RxJavaHooks.onError(th2);
                return;
            }
            m23142d().offer(th2);
            this.f77816d = true;
            m23140f();
        }
    }

    public CompletableOnSubscribeMerge(Observable<? extends Completable> observable, int i, boolean z) {
        this.f77810a = observable;
        this.f77811b = i;
        this.f77812c = z;
    }

    public static Throwable collectErrors(Queue<Throwable> queue) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Throwable poll = queue.poll();
            if (poll == null) {
                break;
            }
            arrayList.add(poll);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (Throwable) arrayList.get(0);
        }
        return new CompositeException(arrayList);
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        C13446a c13446a = new C13446a(completableSubscriber, this.f77811b, this.f77812c);
        completableSubscriber.onSubscribe(c13446a);
        this.f77810a.unsafeSubscribe(c13446a);
    }
}
