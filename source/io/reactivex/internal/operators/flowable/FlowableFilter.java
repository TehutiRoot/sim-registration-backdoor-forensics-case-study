package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableFilter<T> extends AbstractC0567I {

    /* renamed from: b */
    public final Predicate f64272b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableFilter$a */
    /* loaded from: classes5.dex */
    public static final class C10847a extends BasicFuseableConditionalSubscriber {

        /* renamed from: a */
        public final Predicate f64273a;

        public C10847a(ConditionalSubscriber conditionalSubscriber, Predicate predicate) {
            super(conditionalSubscriber);
            this.f64273a = predicate;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (!tryOnNext(obj)) {
                this.upstream.request(1L);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            QueueSubscription<T> queueSubscription = this.f66106qs;
            Predicate predicate = this.f64273a;
            while (true) {
                T poll = queueSubscription.poll();
                if (poll == null) {
                    return null;
                }
                if (predicate.test(poll)) {
                    return poll;
                }
                if (this.sourceMode == 2) {
                    queueSubscription.request(1L);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(Object obj) {
            if (this.done) {
                return false;
            }
            if (this.sourceMode != 0) {
                return this.downstream.tryOnNext(null);
            }
            try {
                if (!this.f64273a.test(obj) || !this.downstream.tryOnNext(obj)) {
                    return false;
                }
                return true;
            } catch (Throwable th2) {
                fail(th2);
                return true;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableFilter$b */
    /* loaded from: classes5.dex */
    public static final class C10848b extends BasicFuseableSubscriber implements ConditionalSubscriber {

        /* renamed from: a */
        public final Predicate f64274a;

        public C10848b(Subscriber subscriber, Predicate predicate) {
            super(subscriber);
            this.f64274a = predicate;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (!tryOnNext(obj)) {
                this.upstream.request(1L);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            QueueSubscription<T> queueSubscription = this.f66107qs;
            Predicate predicate = this.f64274a;
            while (true) {
                T poll = queueSubscription.poll();
                if (poll == null) {
                    return null;
                }
                if (predicate.test(poll)) {
                    return poll;
                }
                if (this.sourceMode == 2) {
                    queueSubscription.request(1L);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(Object obj) {
            if (this.done) {
                return false;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return true;
            }
            try {
                boolean test = this.f64274a.test(obj);
                if (test) {
                    this.downstream.onNext(obj);
                }
                return test;
            } catch (Throwable th2) {
                fail(th2);
                return true;
            }
        }
    }

    public FlowableFilter(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.f64272b = predicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber<? super Object>) new C10847a((ConditionalSubscriber) subscriber, this.f64272b));
        } else {
            this.source.subscribe((FlowableSubscriber<? super Object>) new C10848b(subscriber, this.f64272b));
        }
    }
}
