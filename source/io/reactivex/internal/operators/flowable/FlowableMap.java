package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableMap<T, U> extends AbstractC0567I {

    /* renamed from: b */
    public final Function f64385b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableMap$a */
    /* loaded from: classes5.dex */
    public static final class C10873a extends BasicFuseableConditionalSubscriber {

        /* renamed from: a */
        public final Function f64386a;

        public C10873a(ConditionalSubscriber conditionalSubscriber, Function function) {
            super(conditionalSubscriber);
            this.f64386a = function;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                this.downstream.onNext(ObjectHelper.requireNonNull(this.f64386a.apply(obj), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            T poll = this.f66106qs.poll();
            if (poll != null) {
                return ObjectHelper.requireNonNull(this.f64386a.apply(poll), "The mapper function returned a null value.");
            }
            return null;
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
            try {
                return this.downstream.tryOnNext(ObjectHelper.requireNonNull(this.f64386a.apply(obj), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                fail(th2);
                return true;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableMap$b */
    /* loaded from: classes5.dex */
    public static final class C10874b extends BasicFuseableSubscriber {

        /* renamed from: a */
        public final Function f64387a;

        public C10874b(Subscriber subscriber, Function function) {
            super(subscriber);
            this.f64387a = function;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                this.downstream.onNext(ObjectHelper.requireNonNull(this.f64387a.apply(obj), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            T poll = this.f66107qs.poll();
            if (poll != null) {
                return ObjectHelper.requireNonNull(this.f64387a.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }
    }

    public FlowableMap(Flowable<T> flowable, Function<? super T, ? extends U> function) {
        super(flowable);
        this.f64385b = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber<? super Object>) new C10873a((ConditionalSubscriber) subscriber, this.f64385b));
        } else {
            this.source.subscribe((FlowableSubscriber<? super Object>) new C10874b(subscriber, this.f64385b));
        }
    }
}
