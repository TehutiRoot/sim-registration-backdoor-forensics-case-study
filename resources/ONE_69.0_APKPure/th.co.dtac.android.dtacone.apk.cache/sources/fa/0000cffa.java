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
public final class FlowableScan<T> extends AbstractC0558I {

    /* renamed from: b */
    public final BiFunction f64569b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableScan$a */
    /* loaded from: classes5.dex */
    public static final class C10878a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64570a;

        /* renamed from: b */
        public final BiFunction f64571b;

        /* renamed from: c */
        public Subscription f64572c;

        /* renamed from: d */
        public Object f64573d;

        /* renamed from: e */
        public boolean f64574e;

        public C10878a(Subscriber subscriber, BiFunction biFunction) {
            this.f64570a = subscriber;
            this.f64571b = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64572c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64574e) {
                return;
            }
            this.f64574e = true;
            this.f64570a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64574e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64574e = true;
            this.f64570a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64574e) {
                return;
            }
            Subscriber subscriber = this.f64570a;
            Object obj2 = this.f64573d;
            if (obj2 == null) {
                this.f64573d = obj;
                subscriber.onNext(obj);
                return;
            }
            try {
                Object requireNonNull = ObjectHelper.requireNonNull(this.f64571b.apply(obj2, obj), "The value returned by the accumulator is null");
                this.f64573d = requireNonNull;
                subscriber.onNext(requireNonNull);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64572c.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64572c, subscription)) {
                this.f64572c = subscription;
                this.f64570a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64572c.request(j);
        }
    }

    public FlowableScan(Flowable<T> flowable, BiFunction<T, T, T> biFunction) {
        super(flowable);
        this.f64569b = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10878a(subscriber, this.f64569b));
    }
}