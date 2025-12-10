package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableDoAfterNext<T> extends AbstractC0558I {

    /* renamed from: b */
    public final Consumer f64289b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDoAfterNext$a */
    /* loaded from: classes5.dex */
    public static final class C10827a extends BasicFuseableConditionalSubscriber {

        /* renamed from: a */
        public final Consumer f64290a;

        public C10827a(ConditionalSubscriber conditionalSubscriber, Consumer consumer) {
            super(conditionalSubscriber);
            this.f64290a = consumer;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.downstream.onNext(obj);
            if (this.sourceMode == 0) {
                try {
                    this.f64290a.accept(obj);
                } catch (Throwable th2) {
                    fail(th2);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            T poll = this.f66169qs.poll();
            if (poll != null) {
                this.f64290a.accept(poll);
            }
            return poll;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(Object obj) {
            boolean tryOnNext = this.downstream.tryOnNext(obj);
            try {
                this.f64290a.accept(obj);
            } catch (Throwable th2) {
                fail(th2);
            }
            return tryOnNext;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDoAfterNext$b */
    /* loaded from: classes5.dex */
    public static final class C10828b extends BasicFuseableSubscriber {

        /* renamed from: a */
        public final Consumer f64291a;

        public C10828b(Subscriber subscriber, Consumer consumer) {
            super(subscriber);
            this.f64291a = consumer;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.done) {
                return;
            }
            this.downstream.onNext(obj);
            if (this.sourceMode == 0) {
                try {
                    this.f64291a.accept(obj);
                } catch (Throwable th2) {
                    fail(th2);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            T poll = this.f66170qs.poll();
            if (poll != null) {
                this.f64291a.accept(poll);
            }
            return poll;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }
    }

    public FlowableDoAfterNext(Flowable<T> flowable, Consumer<? super T> consumer) {
        super(flowable);
        this.f64289b = consumer;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber<? super Object>) new C10827a((ConditionalSubscriber) subscriber, this.f64289b));
        } else {
            this.source.subscribe((FlowableSubscriber<? super Object>) new C10828b(subscriber, this.f64289b));
        }
    }
}