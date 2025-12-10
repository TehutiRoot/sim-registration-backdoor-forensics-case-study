package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableDistinctUntilChanged<T, K> extends AbstractC0558I {

    /* renamed from: b */
    public final Function f64279b;

    /* renamed from: c */
    public final BiPredicate f64280c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged$a */
    /* loaded from: classes5.dex */
    public static final class C10825a extends BasicFuseableConditionalSubscriber {

        /* renamed from: a */
        public final Function f64281a;

        /* renamed from: b */
        public final BiPredicate f64282b;

        /* renamed from: c */
        public Object f64283c;

        /* renamed from: d */
        public boolean f64284d;

        public C10825a(ConditionalSubscriber conditionalSubscriber, Function function, BiPredicate biPredicate) {
            super(conditionalSubscriber);
            this.f64281a = function;
            this.f64282b = biPredicate;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (!tryOnNext(obj)) {
                this.upstream.request(1L);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            while (true) {
                T poll = this.f66169qs.poll();
                if (poll == null) {
                    return null;
                }
                Object apply = this.f64281a.apply(poll);
                if (!this.f64284d) {
                    this.f64284d = true;
                    this.f64283c = apply;
                    return poll;
                } else if (!this.f64282b.test(this.f64283c, apply)) {
                    this.f64283c = apply;
                    return poll;
                } else {
                    this.f64283c = apply;
                    if (this.sourceMode != 1) {
                        this.upstream.request(1L);
                    }
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
                return this.downstream.tryOnNext(obj);
            }
            try {
                Object apply = this.f64281a.apply(obj);
                if (this.f64284d) {
                    boolean test = this.f64282b.test(this.f64283c, apply);
                    this.f64283c = apply;
                    if (test) {
                        return false;
                    }
                } else {
                    this.f64284d = true;
                    this.f64283c = apply;
                }
                this.downstream.onNext(obj);
                return true;
            } catch (Throwable th2) {
                fail(th2);
                return true;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged$b */
    /* loaded from: classes5.dex */
    public static final class C10826b extends BasicFuseableSubscriber implements ConditionalSubscriber {

        /* renamed from: a */
        public final Function f64285a;

        /* renamed from: b */
        public final BiPredicate f64286b;

        /* renamed from: c */
        public Object f64287c;

        /* renamed from: d */
        public boolean f64288d;

        public C10826b(Subscriber subscriber, Function function, BiPredicate biPredicate) {
            super(subscriber);
            this.f64285a = function;
            this.f64286b = biPredicate;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (!tryOnNext(obj)) {
                this.upstream.request(1L);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            while (true) {
                T poll = this.f66170qs.poll();
                if (poll == null) {
                    return null;
                }
                Object apply = this.f64285a.apply(poll);
                if (!this.f64288d) {
                    this.f64288d = true;
                    this.f64287c = apply;
                    return poll;
                } else if (!this.f64286b.test(this.f64287c, apply)) {
                    this.f64287c = apply;
                    return poll;
                } else {
                    this.f64287c = apply;
                    if (this.sourceMode != 1) {
                        this.upstream.request(1L);
                    }
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
                this.downstream.onNext(obj);
                return true;
            }
            try {
                Object apply = this.f64285a.apply(obj);
                if (this.f64288d) {
                    boolean test = this.f64286b.test(this.f64287c, apply);
                    this.f64287c = apply;
                    if (test) {
                        return false;
                    }
                } else {
                    this.f64288d = true;
                    this.f64287c = apply;
                }
                this.downstream.onNext(obj);
                return true;
            } catch (Throwable th2) {
                fail(th2);
                return true;
            }
        }
    }

    public FlowableDistinctUntilChanged(Flowable<T> flowable, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
        super(flowable);
        this.f64279b = function;
        this.f64280c = biPredicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber<? super Object>) new C10825a((ConditionalSubscriber) subscriber, this.f64279b, this.f64280c));
        } else {
            this.source.subscribe((FlowableSubscriber<? super Object>) new C10826b(subscriber, this.f64279b, this.f64280c));
        }
    }
}