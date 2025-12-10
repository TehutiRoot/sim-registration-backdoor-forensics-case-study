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
public final class FlowableDistinctUntilChanged<T, K> extends AbstractC0567I {

    /* renamed from: b */
    public final Function f64216b;

    /* renamed from: c */
    public final BiPredicate f64217c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged$a */
    /* loaded from: classes5.dex */
    public static final class C10838a extends BasicFuseableConditionalSubscriber {

        /* renamed from: a */
        public final Function f64218a;

        /* renamed from: b */
        public final BiPredicate f64219b;

        /* renamed from: c */
        public Object f64220c;

        /* renamed from: d */
        public boolean f64221d;

        public C10838a(ConditionalSubscriber conditionalSubscriber, Function function, BiPredicate biPredicate) {
            super(conditionalSubscriber);
            this.f64218a = function;
            this.f64219b = biPredicate;
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
                T poll = this.f66106qs.poll();
                if (poll == null) {
                    return null;
                }
                Object apply = this.f64218a.apply(poll);
                if (!this.f64221d) {
                    this.f64221d = true;
                    this.f64220c = apply;
                    return poll;
                } else if (!this.f64219b.test(this.f64220c, apply)) {
                    this.f64220c = apply;
                    return poll;
                } else {
                    this.f64220c = apply;
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
                Object apply = this.f64218a.apply(obj);
                if (this.f64221d) {
                    boolean test = this.f64219b.test(this.f64220c, apply);
                    this.f64220c = apply;
                    if (test) {
                        return false;
                    }
                } else {
                    this.f64221d = true;
                    this.f64220c = apply;
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
    public static final class C10839b extends BasicFuseableSubscriber implements ConditionalSubscriber {

        /* renamed from: a */
        public final Function f64222a;

        /* renamed from: b */
        public final BiPredicate f64223b;

        /* renamed from: c */
        public Object f64224c;

        /* renamed from: d */
        public boolean f64225d;

        public C10839b(Subscriber subscriber, Function function, BiPredicate biPredicate) {
            super(subscriber);
            this.f64222a = function;
            this.f64223b = biPredicate;
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
                T poll = this.f66107qs.poll();
                if (poll == null) {
                    return null;
                }
                Object apply = this.f64222a.apply(poll);
                if (!this.f64225d) {
                    this.f64225d = true;
                    this.f64224c = apply;
                    return poll;
                } else if (!this.f64223b.test(this.f64224c, apply)) {
                    this.f64224c = apply;
                    return poll;
                } else {
                    this.f64224c = apply;
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
                Object apply = this.f64222a.apply(obj);
                if (this.f64225d) {
                    boolean test = this.f64223b.test(this.f64224c, apply);
                    this.f64224c = apply;
                    if (test) {
                        return false;
                    }
                } else {
                    this.f64225d = true;
                    this.f64224c = apply;
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
        this.f64216b = function;
        this.f64217c = biPredicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber<? super Object>) new C10838a((ConditionalSubscriber) subscriber, this.f64216b, this.f64217c));
        } else {
            this.source.subscribe((FlowableSubscriber<? super Object>) new C10839b(subscriber, this.f64216b, this.f64217c));
        }
    }
}
