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
    public final Observable f78003a;

    /* renamed from: b */
    public final int f78004b;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeConcat$CompletableConcatSubscriber */
    /* loaded from: classes7.dex */
    public static final class CompletableConcatSubscriber extends Subscriber {

        /* renamed from: a */
        public final CompletableSubscriber f78005a;

        /* renamed from: b */
        public final SequentialSubscription f78006b;

        /* renamed from: c */
        public final SpscArrayQueue f78007c;

        /* renamed from: d */
        public final ConcatInnerSubscriber f78008d;

        /* renamed from: e */
        public final AtomicBoolean f78009e;

        /* renamed from: f */
        public volatile boolean f78010f;

        /* renamed from: g */
        public volatile boolean f78011g;

        /* renamed from: rx.internal.operators.CompletableOnSubscribeConcat$CompletableConcatSubscriber$ConcatInnerSubscriber */
        /* loaded from: classes7.dex */
        public final class ConcatInnerSubscriber extends AtomicInteger implements CompletableSubscriber {
            private static final long serialVersionUID = 7233503139645205620L;

            public ConcatInnerSubscriber() {
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                CompletableConcatSubscriber.this.m23335c();
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                CompletableConcatSubscriber.this.m23334d(th2);
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                CompletableConcatSubscriber.this.f78006b.set(subscription);
            }
        }

        public CompletableConcatSubscriber(CompletableSubscriber completableSubscriber, int i) {
            this.f78005a = completableSubscriber;
            this.f78007c = new SpscArrayQueue(i);
            SequentialSubscription sequentialSubscription = new SequentialSubscription();
            this.f78006b = sequentialSubscription;
            this.f78008d = new ConcatInnerSubscriber();
            this.f78009e = new AtomicBoolean();
            add(sequentialSubscription);
            request(i);
        }

        /* renamed from: b */
        public void m23336b() {
            boolean z;
            ConcatInnerSubscriber concatInnerSubscriber = this.f78008d;
            if (concatInnerSubscriber.getAndIncrement() != 0) {
                return;
            }
            while (!isUnsubscribed()) {
                if (!this.f78011g) {
                    boolean z2 = this.f78010f;
                    Completable completable = (Completable) this.f78007c.poll();
                    if (completable == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z2 && z) {
                        this.f78005a.onCompleted();
                        return;
                    } else if (!z) {
                        this.f78011g = true;
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
        public void m23335c() {
            this.f78011g = false;
            m23336b();
        }

        /* renamed from: d */
        public void m23334d(Throwable th2) {
            unsubscribe();
            onError(th2);
        }

        @Override // p046rx.Observer
        /* renamed from: e */
        public void onNext(Completable completable) {
            if (!this.f78007c.offer(completable)) {
                onError(new MissingBackpressureException());
            } else {
                m23336b();
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78010f) {
                return;
            }
            this.f78010f = true;
            m23336b();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78009e.compareAndSet(false, true)) {
                this.f78005a.onError(th2);
            } else {
                RxJavaHooks.onError(th2);
            }
        }
    }

    public CompletableOnSubscribeConcat(Observable<? extends Completable> observable, int i) {
        this.f78003a = observable;
        this.f78004b = i;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        CompletableConcatSubscriber completableConcatSubscriber = new CompletableConcatSubscriber(completableSubscriber, this.f78004b);
        completableSubscriber.onSubscribe(completableConcatSubscriber);
        this.f78003a.unsafeSubscribe(completableConcatSubscriber);
    }
}