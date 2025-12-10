package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableScan<T> extends AbstractC0567I {

    /* renamed from: b */
    public final BiFunction f64506b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableScan$a */
    /* loaded from: classes5.dex */
    public static final class C10891a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64507a;

        /* renamed from: b */
        public final BiFunction f64508b;

        /* renamed from: c */
        public Subscription f64509c;

        /* renamed from: d */
        public Object f64510d;

        /* renamed from: e */
        public boolean f64511e;

        public C10891a(Subscriber subscriber, BiFunction biFunction) {
            this.f64507a = subscriber;
            this.f64508b = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64509c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64511e) {
                return;
            }
            this.f64511e = true;
            this.f64507a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64511e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64511e = true;
            this.f64507a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64511e) {
                return;
            }
            Subscriber subscriber = this.f64507a;
            Object obj2 = this.f64510d;
            if (obj2 == null) {
                this.f64510d = obj;
                subscriber.onNext(obj);
                return;
            }
            try {
                Object requireNonNull = ObjectHelper.requireNonNull(this.f64508b.apply(obj2, obj), "The value returned by the accumulator is null");
                this.f64510d = requireNonNull;
                subscriber.onNext(requireNonNull);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64509c.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64509c, subscription)) {
                this.f64509c = subscription;
                this.f64507a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64509c.request(j);
        }
    }

    public FlowableScan(Flowable<T> flowable, BiFunction<T, T, T> biFunction) {
        super(flowable);
        this.f64506b = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10891a(subscriber, this.f64506b));
    }
}
