package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableDematerialize<T, R> extends AbstractC0558I {

    /* renamed from: b */
    public final Function f64268b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDematerialize$a */
    /* loaded from: classes5.dex */
    public static final class C10822a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64269a;

        /* renamed from: b */
        public final Function f64270b;

        /* renamed from: c */
        public boolean f64271c;

        /* renamed from: d */
        public Subscription f64272d;

        public C10822a(Subscriber subscriber, Function function) {
            this.f64269a = subscriber;
            this.f64270b = function;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64272d.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64271c) {
                return;
            }
            this.f64271c = true;
            this.f64269a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64271c) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64271c = true;
            this.f64269a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64271c) {
                if (obj instanceof Notification) {
                    Notification notification = (Notification) obj;
                    if (notification.isOnError()) {
                        RxJavaPlugins.onError(notification.getError());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                Notification notification2 = (Notification) ObjectHelper.requireNonNull(this.f64270b.apply(obj), "The selector returned a null Notification");
                if (notification2.isOnError()) {
                    this.f64272d.cancel();
                    onError(notification2.getError());
                } else if (notification2.isOnComplete()) {
                    this.f64272d.cancel();
                    onComplete();
                } else {
                    this.f64269a.onNext(notification2.getValue());
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64272d.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64272d, subscription)) {
                this.f64272d = subscription;
                this.f64269a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64272d.request(j);
        }
    }

    public FlowableDematerialize(Flowable<T> flowable, Function<? super T, ? extends Notification<R>> function) {
        super(flowable);
        this.f64268b = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10822a(subscriber, this.f64268b));
    }
}