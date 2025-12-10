package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class ParallelPeek<T> extends ParallelFlowable<T> {

    /* renamed from: a */
    public final ParallelFlowable f65874a;

    /* renamed from: b */
    public final Consumer f65875b;

    /* renamed from: c */
    public final Consumer f65876c;

    /* renamed from: d */
    public final Consumer f65877d;

    /* renamed from: e */
    public final Action f65878e;

    /* renamed from: f */
    public final Action f65879f;

    /* renamed from: g */
    public final Consumer f65880g;

    /* renamed from: h */
    public final LongConsumer f65881h;

    /* renamed from: i */
    public final Action f65882i;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelPeek$a */
    /* loaded from: classes5.dex */
    public static final class C11095a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f65883a;

        /* renamed from: b */
        public final ParallelPeek f65884b;

        /* renamed from: c */
        public Subscription f65885c;

        /* renamed from: d */
        public boolean f65886d;

        public C11095a(Subscriber subscriber, ParallelPeek parallelPeek) {
            this.f65883a = subscriber;
            this.f65884b = parallelPeek;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            try {
                this.f65884b.f65882i.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f65885c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (!this.f65886d) {
                this.f65886d = true;
                try {
                    this.f65884b.f65878e.run();
                    this.f65883a.onComplete();
                    try {
                        this.f65884b.f65879f.run();
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        RxJavaPlugins.onError(th2);
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.f65883a.onError(th3);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65886d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65886d = true;
            try {
                this.f65884b.f65877d.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f65883a.onError(th2);
            try {
                this.f65884b.f65879f.run();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (!this.f65886d) {
                try {
                    this.f65884b.f65875b.accept(obj);
                    this.f65883a.onNext(obj);
                    try {
                        this.f65884b.f65876c.accept(obj);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        onError(th2);
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    onError(th3);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65885c, subscription)) {
                this.f65885c = subscription;
                try {
                    this.f65884b.f65880g.accept(subscription);
                    this.f65883a.onSubscribe(this);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    subscription.cancel();
                    this.f65883a.onSubscribe(EmptySubscription.INSTANCE);
                    onError(th2);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            try {
                this.f65884b.f65881h.accept(j);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f65885c.request(j);
        }
    }

    public ParallelPeek(ParallelFlowable<T> parallelFlowable, Consumer<? super T> consumer, Consumer<? super T> consumer2, Consumer<? super Throwable> consumer3, Action action, Action action2, Consumer<? super Subscription> consumer4, LongConsumer longConsumer, Action action3) {
        this.f65874a = parallelFlowable;
        this.f65875b = (Consumer) ObjectHelper.requireNonNull(consumer, "onNext is null");
        this.f65876c = (Consumer) ObjectHelper.requireNonNull(consumer2, "onAfterNext is null");
        this.f65877d = (Consumer) ObjectHelper.requireNonNull(consumer3, "onError is null");
        this.f65878e = (Action) ObjectHelper.requireNonNull(action, "onComplete is null");
        this.f65879f = (Action) ObjectHelper.requireNonNull(action2, "onAfterTerminated is null");
        this.f65880g = (Consumer) ObjectHelper.requireNonNull(consumer4, "onSubscribe is null");
        this.f65881h = (LongConsumer) ObjectHelper.requireNonNull(longConsumer, "onRequest is null");
        this.f65882i = (Action) ObjectHelper.requireNonNull(action3, "onCancel is null");
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f65874a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (!validate(subscriberArr)) {
            return;
        }
        int length = subscriberArr.length;
        Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
        for (int i = 0; i < length; i++) {
            subscriberArr2[i] = new C11095a(subscriberArr[i], this);
        }
        this.f65874a.subscribe(subscriberArr2);
    }
}