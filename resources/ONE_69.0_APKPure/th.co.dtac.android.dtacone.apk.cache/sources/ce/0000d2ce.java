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
    public final ParallelFlowable f65850a;

    /* renamed from: b */
    public final Function f65851b;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelMap$a */
    /* loaded from: classes5.dex */
    public static final class C11090a implements ConditionalSubscriber, Subscription {

        /* renamed from: a */
        public final ConditionalSubscriber f65852a;

        /* renamed from: b */
        public final Function f65853b;

        /* renamed from: c */
        public Subscription f65854c;

        /* renamed from: d */
        public boolean f65855d;

        public C11090a(ConditionalSubscriber conditionalSubscriber, Function function) {
            this.f65852a = conditionalSubscriber;
            this.f65853b = function;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f65854c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f65855d) {
                return;
            }
            this.f65855d = true;
            this.f65852a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65855d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65855d = true;
            this.f65852a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f65855d) {
                return;
            }
            try {
                this.f65852a.onNext(ObjectHelper.requireNonNull(this.f65853b.apply(obj), "The mapper returned a null value"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65854c, subscription)) {
                this.f65854c = subscription;
                this.f65852a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f65854c.request(j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(Object obj) {
            if (this.f65855d) {
                return false;
            }
            try {
                return this.f65852a.tryOnNext(ObjectHelper.requireNonNull(this.f65853b.apply(obj), "The mapper returned a null value"));
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
    public static final class C11091b implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f65856a;

        /* renamed from: b */
        public final Function f65857b;

        /* renamed from: c */
        public Subscription f65858c;

        /* renamed from: d */
        public boolean f65859d;

        public C11091b(Subscriber subscriber, Function function) {
            this.f65856a = subscriber;
            this.f65857b = function;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f65858c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f65859d) {
                return;
            }
            this.f65859d = true;
            this.f65856a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65859d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65859d = true;
            this.f65856a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f65859d) {
                return;
            }
            try {
                this.f65856a.onNext(ObjectHelper.requireNonNull(this.f65857b.apply(obj), "The mapper returned a null value"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65858c, subscription)) {
                this.f65858c = subscription;
                this.f65856a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f65858c.request(j);
        }
    }

    public ParallelMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends R> function) {
        this.f65850a = parallelFlowable;
        this.f65851b = function;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f65850a.parallelism();
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
                subscriberArr2[i] = new C11090a((ConditionalSubscriber) subscriber, this.f65851b);
            } else {
                subscriberArr2[i] = new C11091b(subscriber, this.f65851b);
            }
        }
        this.f65850a.subscribe(subscriberArr2);
    }
}