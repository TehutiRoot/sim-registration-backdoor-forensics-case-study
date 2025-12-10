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
    public final ParallelFlowable f65811a;

    /* renamed from: b */
    public final Consumer f65812b;

    /* renamed from: c */
    public final Consumer f65813c;

    /* renamed from: d */
    public final Consumer f65814d;

    /* renamed from: e */
    public final Action f65815e;

    /* renamed from: f */
    public final Action f65816f;

    /* renamed from: g */
    public final Consumer f65817g;

    /* renamed from: h */
    public final LongConsumer f65818h;

    /* renamed from: i */
    public final Action f65819i;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelPeek$a */
    /* loaded from: classes5.dex */
    public static final class C11108a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f65820a;

        /* renamed from: b */
        public final ParallelPeek f65821b;

        /* renamed from: c */
        public Subscription f65822c;

        /* renamed from: d */
        public boolean f65823d;

        public C11108a(Subscriber subscriber, ParallelPeek parallelPeek) {
            this.f65820a = subscriber;
            this.f65821b = parallelPeek;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            try {
                this.f65821b.f65819i.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f65822c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (!this.f65823d) {
                this.f65823d = true;
                try {
                    this.f65821b.f65815e.run();
                    this.f65820a.onComplete();
                    try {
                        this.f65821b.f65816f.run();
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        RxJavaPlugins.onError(th2);
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.f65820a.onError(th3);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65823d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65823d = true;
            try {
                this.f65821b.f65814d.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f65820a.onError(th2);
            try {
                this.f65821b.f65816f.run();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (!this.f65823d) {
                try {
                    this.f65821b.f65812b.accept(obj);
                    this.f65820a.onNext(obj);
                    try {
                        this.f65821b.f65813c.accept(obj);
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
            if (SubscriptionHelper.validate(this.f65822c, subscription)) {
                this.f65822c = subscription;
                try {
                    this.f65821b.f65817g.accept(subscription);
                    this.f65820a.onSubscribe(this);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    subscription.cancel();
                    this.f65820a.onSubscribe(EmptySubscription.INSTANCE);
                    onError(th2);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            try {
                this.f65821b.f65818h.accept(j);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f65822c.request(j);
        }
    }

    public ParallelPeek(ParallelFlowable<T> parallelFlowable, Consumer<? super T> consumer, Consumer<? super T> consumer2, Consumer<? super Throwable> consumer3, Action action, Action action2, Consumer<? super Subscription> consumer4, LongConsumer longConsumer, Action action3) {
        this.f65811a = parallelFlowable;
        this.f65812b = (Consumer) ObjectHelper.requireNonNull(consumer, "onNext is null");
        this.f65813c = (Consumer) ObjectHelper.requireNonNull(consumer2, "onAfterNext is null");
        this.f65814d = (Consumer) ObjectHelper.requireNonNull(consumer3, "onError is null");
        this.f65815e = (Action) ObjectHelper.requireNonNull(action, "onComplete is null");
        this.f65816f = (Action) ObjectHelper.requireNonNull(action2, "onAfterTerminated is null");
        this.f65817g = (Consumer) ObjectHelper.requireNonNull(consumer4, "onSubscribe is null");
        this.f65818h = (LongConsumer) ObjectHelper.requireNonNull(longConsumer, "onRequest is null");
        this.f65819i = (Action) ObjectHelper.requireNonNull(action3, "onCancel is null");
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f65811a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (!validate(subscriberArr)) {
            return;
        }
        int length = subscriberArr.length;
        Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
        for (int i = 0; i < length; i++) {
            subscriberArr2[i] = new C11108a(subscriberArr[i], this);
        }
        this.f65811a.subscribe(subscriberArr2);
    }
}
