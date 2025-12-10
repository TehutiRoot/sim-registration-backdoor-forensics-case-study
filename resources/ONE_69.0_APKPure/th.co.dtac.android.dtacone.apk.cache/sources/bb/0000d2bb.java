package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class ParallelFilter<T> extends ParallelFlowable<T> {

    /* renamed from: a */
    public final ParallelFlowable f65818a;

    /* renamed from: b */
    public final Predicate f65819b;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelFilter$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC11082a implements ConditionalSubscriber, Subscription {

        /* renamed from: a */
        public final Predicate f65820a;

        /* renamed from: b */
        public Subscription f65821b;

        /* renamed from: c */
        public boolean f65822c;

        public AbstractC11082a(Predicate predicate) {
            this.f65820a = predicate;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f65821b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (!tryOnNext(obj) && !this.f65822c) {
                this.f65821b.request(1L);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f65821b.request(j);
        }
    }

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelFilter$b */
    /* loaded from: classes5.dex */
    public static final class C11083b extends AbstractC11082a {

        /* renamed from: d */
        public final ConditionalSubscriber f65823d;

        public C11083b(ConditionalSubscriber conditionalSubscriber, Predicate predicate) {
            super(predicate);
            this.f65823d = conditionalSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (!this.f65822c) {
                this.f65822c = true;
                this.f65823d.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65822c) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65822c = true;
            this.f65823d.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65821b, subscription)) {
                this.f65821b = subscription;
                this.f65823d.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(Object obj) {
            if (!this.f65822c) {
                try {
                    if (this.f65820a.test(obj)) {
                        return this.f65823d.tryOnNext(obj);
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    onError(th2);
                }
            }
            return false;
        }
    }

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelFilter$c */
    /* loaded from: classes5.dex */
    public static final class C11084c extends AbstractC11082a {

        /* renamed from: d */
        public final Subscriber f65824d;

        public C11084c(Subscriber subscriber, Predicate predicate) {
            super(predicate);
            this.f65824d = subscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (!this.f65822c) {
                this.f65822c = true;
                this.f65824d.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65822c) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65822c = true;
            this.f65824d.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65821b, subscription)) {
                this.f65821b = subscription;
                this.f65824d.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(Object obj) {
            if (!this.f65822c) {
                try {
                    if (this.f65820a.test(obj)) {
                        this.f65824d.onNext(obj);
                        return true;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    onError(th2);
                }
            }
            return false;
        }
    }

    public ParallelFilter(ParallelFlowable<T> parallelFlowable, Predicate<? super T> predicate) {
        this.f65818a = parallelFlowable;
        this.f65819b = predicate;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f65818a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (!validate(subscriberArr)) {
            return;
        }
        int length = subscriberArr.length;
        Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
        for (int i = 0; i < length; i++) {
            Subscriber<? super T> subscriber = subscriberArr[i];
            if (subscriber instanceof ConditionalSubscriber) {
                subscriberArr2[i] = new C11083b((ConditionalSubscriber) subscriber, this.f65819b);
            } else {
                subscriberArr2[i] = new C11084c(subscriber, this.f65819b);
            }
        }
        this.f65818a.subscribe(subscriberArr2);
    }
}