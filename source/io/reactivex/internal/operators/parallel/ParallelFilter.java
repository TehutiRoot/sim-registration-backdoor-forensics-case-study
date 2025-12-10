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
    public final ParallelFlowable f65755a;

    /* renamed from: b */
    public final Predicate f65756b;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelFilter$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC11095a implements ConditionalSubscriber, Subscription {

        /* renamed from: a */
        public final Predicate f65757a;

        /* renamed from: b */
        public Subscription f65758b;

        /* renamed from: c */
        public boolean f65759c;

        public AbstractC11095a(Predicate predicate) {
            this.f65757a = predicate;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f65758b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (!tryOnNext(obj) && !this.f65759c) {
                this.f65758b.request(1L);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f65758b.request(j);
        }
    }

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelFilter$b */
    /* loaded from: classes5.dex */
    public static final class C11096b extends AbstractC11095a {

        /* renamed from: d */
        public final ConditionalSubscriber f65760d;

        public C11096b(ConditionalSubscriber conditionalSubscriber, Predicate predicate) {
            super(predicate);
            this.f65760d = conditionalSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (!this.f65759c) {
                this.f65759c = true;
                this.f65760d.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65759c) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65759c = true;
            this.f65760d.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65758b, subscription)) {
                this.f65758b = subscription;
                this.f65760d.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(Object obj) {
            if (!this.f65759c) {
                try {
                    if (this.f65757a.test(obj)) {
                        return this.f65760d.tryOnNext(obj);
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
    public static final class C11097c extends AbstractC11095a {

        /* renamed from: d */
        public final Subscriber f65761d;

        public C11097c(Subscriber subscriber, Predicate predicate) {
            super(predicate);
            this.f65761d = subscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (!this.f65759c) {
                this.f65759c = true;
                this.f65761d.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65759c) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65759c = true;
            this.f65761d.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65758b, subscription)) {
                this.f65758b = subscription;
                this.f65761d.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(Object obj) {
            if (!this.f65759c) {
                try {
                    if (this.f65757a.test(obj)) {
                        this.f65761d.onNext(obj);
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
        this.f65755a = parallelFlowable;
        this.f65756b = predicate;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f65755a.parallelism();
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
                subscriberArr2[i] = new C11096b((ConditionalSubscriber) subscriber, this.f65756b);
            } else {
                subscriberArr2[i] = new C11097c(subscriber, this.f65756b);
            }
        }
        this.f65755a.subscribe(subscriberArr2);
    }
}
