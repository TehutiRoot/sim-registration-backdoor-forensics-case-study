package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableDoOnEach<T> extends AbstractC0558I {

    /* renamed from: b */
    public final Consumer f64295b;

    /* renamed from: c */
    public final Consumer f64296c;

    /* renamed from: d */
    public final Action f64297d;

    /* renamed from: e */
    public final Action f64298e;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDoOnEach$a */
    /* loaded from: classes5.dex */
    public static final class C10829a extends BasicFuseableConditionalSubscriber {

        /* renamed from: a */
        public final Consumer f64299a;

        /* renamed from: b */
        public final Consumer f64300b;

        /* renamed from: c */
        public final Action f64301c;

        /* renamed from: d */
        public final Action f64302d;

        public C10829a(ConditionalSubscriber conditionalSubscriber, Consumer consumer, Consumer consumer2, Action action, Action action2) {
            super(conditionalSubscriber);
            this.f64299a = consumer;
            this.f64300b = consumer2;
            this.f64301c = action;
            this.f64302d = action2;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            try {
                this.f64301c.run();
                this.done = true;
                this.downstream.onComplete();
                try {
                    this.f64302d.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            } catch (Throwable th3) {
                fail(th3);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            try {
                this.f64300b.accept(th2);
                this.downstream.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
            try {
                this.f64302d.run();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
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
                this.f64299a.accept(obj);
                this.downstream.onNext(obj);
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            try {
                T poll = this.f66169qs.poll();
                if (poll != null) {
                    try {
                        this.f64299a.accept(poll);
                        this.f64302d.run();
                    } catch (Throwable th2) {
                        try {
                            Exceptions.throwIfFatal(th2);
                            this.f64300b.accept(th2);
                            throw ExceptionHelper.throwIfThrowable(th2);
                        } catch (Throwable th3) {
                            this.f64302d.run();
                            throw th3;
                        }
                    }
                } else if (this.sourceMode == 1) {
                    this.f64301c.run();
                    this.f64302d.run();
                }
                return poll;
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                try {
                    this.f64300b.accept(th4);
                    throw ExceptionHelper.throwIfThrowable(th4);
                } catch (Throwable th5) {
                    throw new CompositeException(th4, th5);
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
            try {
                this.f64299a.accept(obj);
                return this.downstream.tryOnNext(obj);
            } catch (Throwable th2) {
                fail(th2);
                return false;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDoOnEach$b */
    /* loaded from: classes5.dex */
    public static final class C10830b extends BasicFuseableSubscriber {

        /* renamed from: a */
        public final Consumer f64303a;

        /* renamed from: b */
        public final Consumer f64304b;

        /* renamed from: c */
        public final Action f64305c;

        /* renamed from: d */
        public final Action f64306d;

        public C10830b(Subscriber subscriber, Consumer consumer, Consumer consumer2, Action action, Action action2) {
            super(subscriber);
            this.f64303a = consumer;
            this.f64304b = consumer2;
            this.f64305c = action;
            this.f64306d = action2;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            try {
                this.f64305c.run();
                this.done = true;
                this.downstream.onComplete();
                try {
                    this.f64306d.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            } catch (Throwable th3) {
                fail(th3);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            try {
                this.f64304b.accept(th2);
                this.downstream.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
            try {
                this.f64306d.run();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
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
                this.f64303a.accept(obj);
                this.downstream.onNext(obj);
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            try {
                T poll = this.f66170qs.poll();
                if (poll != null) {
                    try {
                        this.f64303a.accept(poll);
                        this.f64306d.run();
                    } catch (Throwable th2) {
                        try {
                            Exceptions.throwIfFatal(th2);
                            this.f64304b.accept(th2);
                            throw ExceptionHelper.throwIfThrowable(th2);
                        } catch (Throwable th3) {
                            this.f64306d.run();
                            throw th3;
                        }
                    }
                } else if (this.sourceMode == 1) {
                    this.f64305c.run();
                    this.f64306d.run();
                }
                return poll;
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                try {
                    this.f64304b.accept(th4);
                    throw ExceptionHelper.throwIfThrowable(th4);
                } catch (Throwable th5) {
                    throw new CompositeException(th4, th5);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }
    }

    public FlowableDoOnEach(Flowable<T> flowable, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        super(flowable);
        this.f64295b = consumer;
        this.f64296c = consumer2;
        this.f64297d = action;
        this.f64298e = action2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber<? super Object>) new C10829a((ConditionalSubscriber) subscriber, this.f64295b, this.f64296c, this.f64297d, this.f64298e));
        } else {
            this.source.subscribe((FlowableSubscriber<? super Object>) new C10830b(subscriber, this.f64295b, this.f64296c, this.f64297d, this.f64298e));
        }
    }
}