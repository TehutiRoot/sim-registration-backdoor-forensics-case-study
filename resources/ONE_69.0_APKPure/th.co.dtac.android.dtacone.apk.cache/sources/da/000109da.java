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
    public final Observable f78016a;

    /* renamed from: b */
    public final int f78017b;

    /* renamed from: c */
    public final boolean f78018c;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeMerge$a */
    /* loaded from: classes7.dex */
    public static final class C13447a extends Subscriber {

        /* renamed from: a */
        public final CompletableSubscriber f78019a;

        /* renamed from: c */
        public final boolean f78021c;

        /* renamed from: d */
        public volatile boolean f78022d;

        /* renamed from: b */
        public final CompositeSubscription f78020b = new CompositeSubscription();

        /* renamed from: g */
        public final AtomicInteger f78025g = new AtomicInteger(1);

        /* renamed from: f */
        public final AtomicBoolean f78024f = new AtomicBoolean();

        /* renamed from: e */
        public final AtomicReference f78023e = new AtomicReference();

        /* renamed from: rx.internal.operators.CompletableOnSubscribeMerge$a$a */
        /* loaded from: classes7.dex */
        public class C13448a implements CompletableSubscriber {

            /* renamed from: a */
            public Subscription f78026a;

            /* renamed from: b */
            public boolean f78027b;

            public C13448a() {
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                if (this.f78027b) {
                    return;
                }
                this.f78027b = true;
                C13447a.this.f78020b.remove(this.f78026a);
                C13447a.this.m23328f();
                if (!C13447a.this.f78022d) {
                    C13447a.this.request(1L);
                }
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                if (this.f78027b) {
                    RxJavaHooks.onError(th2);
                    return;
                }
                this.f78027b = true;
                C13447a.this.f78020b.remove(this.f78026a);
                C13447a.this.m23330d().offer(th2);
                C13447a.this.m23328f();
                C13447a c13447a = C13447a.this;
                if (c13447a.f78021c && !c13447a.f78022d) {
                    C13447a.this.request(1L);
                }
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.f78026a = subscription;
                C13447a.this.f78020b.add(subscription);
            }
        }

        public C13447a(CompletableSubscriber completableSubscriber, int i, boolean z) {
            this.f78019a = completableSubscriber;
            this.f78021c = z;
            if (i == Integer.MAX_VALUE) {
                request(Long.MAX_VALUE);
            } else {
                request(i);
            }
        }

        /* renamed from: d */
        public Queue m23330d() {
            Queue queue = (Queue) this.f78023e.get();
            if (queue != null) {
                return queue;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            if (AbstractC23094xo1.m479a(this.f78023e, null, concurrentLinkedQueue)) {
                return concurrentLinkedQueue;
            }
            return (Queue) this.f78023e.get();
        }

        @Override // p046rx.Observer
        /* renamed from: e */
        public void onNext(Completable completable) {
            if (this.f78022d) {
                return;
            }
            this.f78025g.getAndIncrement();
            completable.unsafeSubscribe(new C13448a());
        }

        /* renamed from: f */
        public void m23328f() {
            Queue queue;
            if (this.f78025g.decrementAndGet() == 0) {
                Queue queue2 = (Queue) this.f78023e.get();
                if (queue2 != null && !queue2.isEmpty()) {
                    Throwable collectErrors = CompletableOnSubscribeMerge.collectErrors(queue2);
                    if (this.f78024f.compareAndSet(false, true)) {
                        this.f78019a.onError(collectErrors);
                        return;
                    } else {
                        RxJavaHooks.onError(collectErrors);
                        return;
                    }
                }
                this.f78019a.onCompleted();
            } else if (!this.f78021c && (queue = (Queue) this.f78023e.get()) != null && !queue.isEmpty()) {
                Throwable collectErrors2 = CompletableOnSubscribeMerge.collectErrors(queue);
                if (this.f78024f.compareAndSet(false, true)) {
                    this.f78019a.onError(collectErrors2);
                } else {
                    RxJavaHooks.onError(collectErrors2);
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78022d) {
                return;
            }
            this.f78022d = true;
            m23328f();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78022d) {
                RxJavaHooks.onError(th2);
                return;
            }
            m23330d().offer(th2);
            this.f78022d = true;
            m23328f();
        }
    }

    public CompletableOnSubscribeMerge(Observable<? extends Completable> observable, int i, boolean z) {
        this.f78016a = observable;
        this.f78017b = i;
        this.f78018c = z;
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
        C13447a c13447a = new C13447a(completableSubscriber, this.f78017b, this.f78018c);
        completableSubscriber.onSubscribe(c13447a);
        this.f78016a.unsafeSubscribe(c13447a);
    }
}