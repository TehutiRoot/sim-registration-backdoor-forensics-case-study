package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.MissingBackpressureException;
import p046rx.internal.subscriptions.SequentialSubscription;
import p046rx.internal.util.unsafe.SpscArrayQueue;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.CompletableOnSubscribeConcat */
/* loaded from: classes7.dex */
public final class CompletableOnSubscribeConcat implements Completable.OnSubscribe {

    /* renamed from: a */
    public final Observable f77797a;

    /* renamed from: b */
    public final int f77798b;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeConcat$CompletableConcatSubscriber */
    /* loaded from: classes7.dex */
    public static final class CompletableConcatSubscriber extends Subscriber {

        /* renamed from: a */
        public final CompletableSubscriber f77799a;

        /* renamed from: b */
        public final SequentialSubscription f77800b;

        /* renamed from: c */
        public final SpscArrayQueue f77801c;

        /* renamed from: d */
        public final ConcatInnerSubscriber f77802d;

        /* renamed from: e */
        public final AtomicBoolean f77803e;

        /* renamed from: f */
        public volatile boolean f77804f;

        /* renamed from: g */
        public volatile boolean f77805g;

        /* renamed from: rx.internal.operators.CompletableOnSubscribeConcat$CompletableConcatSubscriber$ConcatInnerSubscriber */
        /* loaded from: classes7.dex */
        public final class ConcatInnerSubscriber extends AtomicInteger implements CompletableSubscriber {
            private static final long serialVersionUID = 7233503139645205620L;

            public ConcatInnerSubscriber() {
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                CompletableConcatSubscriber.this.m23147c();
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                CompletableConcatSubscriber.this.m23146d(th2);
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                CompletableConcatSubscriber.this.f77800b.set(subscription);
            }
        }

        public CompletableConcatSubscriber(CompletableSubscriber completableSubscriber, int i) {
            this.f77799a = completableSubscriber;
            this.f77801c = new SpscArrayQueue(i);
            SequentialSubscription sequentialSubscription = new SequentialSubscription();
            this.f77800b = sequentialSubscription;
            this.f77802d = new ConcatInnerSubscriber();
            this.f77803e = new AtomicBoolean();
            add(sequentialSubscription);
            request(i);
        }

        /* renamed from: b */
        public void m23148b() {
            boolean z;
            ConcatInnerSubscriber concatInnerSubscriber = this.f77802d;
            if (concatInnerSubscriber.getAndIncrement() != 0) {
                return;
            }
            while (!isUnsubscribed()) {
                if (!this.f77805g) {
                    boolean z2 = this.f77804f;
                    Completable completable = (Completable) this.f77801c.poll();
                    if (completable == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z2 && z) {
                        this.f77799a.onCompleted();
                        return;
                    } else if (!z) {
                        this.f77805g = true;
                        completable.subscribe(concatInnerSubscriber);
                        request(1L);
                    }
                }
                if (concatInnerSubscriber.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        /* renamed from: c */
        public void m23147c() {
            this.f77805g = false;
            m23148b();
        }

        /* renamed from: d */
        public void m23146d(Throwable th2) {
            unsubscribe();
            onError(th2);
        }

        @Override // p046rx.Observer
        /* renamed from: e */
        public void onNext(Completable completable) {
            if (!this.f77801c.offer(completable)) {
                onError(new MissingBackpressureException());
            } else {
                m23148b();
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f77804f) {
                return;
            }
            this.f77804f = true;
            m23148b();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f77803e.compareAndSet(false, true)) {
                this.f77799a.onError(th2);
            } else {
                RxJavaHooks.onError(th2);
            }
        }
    }

    public CompletableOnSubscribeConcat(Observable<? extends Completable> observable, int i) {
        this.f77797a = observable;
        this.f77798b = i;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        CompletableConcatSubscriber completableConcatSubscriber = new CompletableConcatSubscriber(completableSubscriber, this.f77798b);
        completableSubscriber.onSubscribe(completableConcatSubscriber);
        this.f77797a.unsafeSubscribe(completableConcatSubscriber);
    }
}
