package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class ParallelMap<T, R> extends ParallelFlowable<R> {

    /* renamed from: a */
    public final ParallelFlowable f65787a;

    /* renamed from: b */
    public final Function f65788b;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelMap$a */
    /* loaded from: classes5.dex */
    public static final class C11103a implements ConditionalSubscriber, Subscription {

        /* renamed from: a */
        public final ConditionalSubscriber f65789a;

        /* renamed from: b */
        public final Function f65790b;

        /* renamed from: c */
        public Subscription f65791c;

        /* renamed from: d */
        public boolean f65792d;

        public C11103a(ConditionalSubscriber conditionalSubscriber, Function function) {
            this.f65789a = conditionalSubscriber;
            this.f65790b = function;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f65791c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f65792d) {
                return;
            }
            this.f65792d = true;
            this.f65789a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65792d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65792d = true;
            this.f65789a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f65792d) {
                return;
            }
            try {
                this.f65789a.onNext(ObjectHelper.requireNonNull(this.f65790b.apply(obj), "The mapper returned a null value"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65791c, subscription)) {
                this.f65791c = subscription;
                this.f65789a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f65791c.request(j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(Object obj) {
            if (this.f65792d) {
                return false;
            }
            try {
                return this.f65789a.tryOnNext(ObjectHelper.requireNonNull(this.f65790b.apply(obj), "The mapper returned a null value"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
                return false;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelMap$b */
    /* loaded from: classes5.dex */
    public static final class C11104b implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f65793a;

        /* renamed from: b */
        public final Function f65794b;

        /* renamed from: c */
        public Subscription f65795c;

        /* renamed from: d */
        public boolean f65796d;

        public C11104b(Subscriber subscriber, Function function) {
            this.f65793a = subscriber;
            this.f65794b = function;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f65795c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f65796d) {
                return;
            }
            this.f65796d = true;
            this.f65793a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65796d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65796d = true;
            this.f65793a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f65796d) {
                return;
            }
            try {
                this.f65793a.onNext(ObjectHelper.requireNonNull(this.f65794b.apply(obj), "The mapper returned a null value"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65795c, subscription)) {
                this.f65795c = subscription;
                this.f65793a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f65795c.request(j);
        }
    }

    public ParallelMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends R> function) {
        this.f65787a = parallelFlowable;
        this.f65788b = function;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f65787a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (!validate(subscriberArr)) {
            return;
        }
        int length = subscriberArr.length;
        Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
        for (int i = 0; i < length; i++) {
            Subscriber<? super R> subscriber = subscriberArr[i];
            if (subscriber instanceof ConditionalSubscriber) {
                subscriberArr2[i] = new C11103a((ConditionalSubscriber) subscriber, this.f65788b);
            } else {
                subscriberArr2[i] = new C11104b(subscriber, this.f65788b);
            }
        }
        this.f65787a.subscribe(subscriberArr2);
    }
}
