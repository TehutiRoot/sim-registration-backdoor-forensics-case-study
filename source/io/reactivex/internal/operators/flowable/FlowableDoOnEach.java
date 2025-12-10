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
public final class FlowableDoOnEach<T> extends AbstractC0567I {

    /* renamed from: b */
    public final Consumer f64232b;

    /* renamed from: c */
    public final Consumer f64233c;

    /* renamed from: d */
    public final Action f64234d;

    /* renamed from: e */
    public final Action f64235e;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDoOnEach$a */
    /* loaded from: classes5.dex */
    public static final class C10842a extends BasicFuseableConditionalSubscriber {

        /* renamed from: a */
        public final Consumer f64236a;

        /* renamed from: b */
        public final Consumer f64237b;

        /* renamed from: c */
        public final Action f64238c;

        /* renamed from: d */
        public final Action f64239d;

        public C10842a(ConditionalSubscriber conditionalSubscriber, Consumer consumer, Consumer consumer2, Action action, Action action2) {
            super(conditionalSubscriber);
            this.f64236a = consumer;
            this.f64237b = consumer2;
            this.f64238c = action;
            this.f64239d = action2;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            try {
                this.f64238c.run();
                this.done = true;
                this.downstream.onComplete();
                try {
                    this.f64239d.run();
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
                this.f64237b.accept(th2);
                this.downstream.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
            try {
                this.f64239d.run();
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
                this.f64236a.accept(obj);
                this.downstream.onNext(obj);
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            try {
                T poll = this.f66106qs.poll();
                if (poll != null) {
                    try {
                        this.f64236a.accept(poll);
                        this.f64239d.run();
                    } catch (Throwable th2) {
                        try {
                            Exceptions.throwIfFatal(th2);
                            this.f64237b.accept(th2);
                            throw ExceptionHelper.throwIfThrowable(th2);
                        } catch (Throwable th3) {
                            this.f64239d.run();
                            throw th3;
                        }
                    }
                } else if (this.sourceMode == 1) {
                    this.f64238c.run();
                    this.f64239d.run();
                }
                return poll;
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                try {
                    this.f64237b.accept(th4);
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
                this.f64236a.accept(obj);
                return this.downstream.tryOnNext(obj);
            } catch (Throwable th2) {
                fail(th2);
                return false;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDoOnEach$b */
    /* loaded from: classes5.dex */
    public static final class C10843b extends BasicFuseableSubscriber {

        /* renamed from: a */
        public final Consumer f64240a;

        /* renamed from: b */
        public final Consumer f64241b;

        /* renamed from: c */
        public final Action f64242c;

        /* renamed from: d */
        public final Action f64243d;

        public C10843b(Subscriber subscriber, Consumer consumer, Consumer consumer2, Action action, Action action2) {
            super(subscriber);
            this.f64240a = consumer;
            this.f64241b = consumer2;
            this.f64242c = action;
            this.f64243d = action2;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            try {
                this.f64242c.run();
                this.done = true;
                this.downstream.onComplete();
                try {
                    this.f64243d.run();
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
                this.f64241b.accept(th2);
                this.downstream.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
            try {
                this.f64243d.run();
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
                this.f64240a.accept(obj);
                this.downstream.onNext(obj);
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            try {
                T poll = this.f66107qs.poll();
                if (poll != null) {
                    try {
                        this.f64240a.accept(poll);
                        this.f64243d.run();
                    } catch (Throwable th2) {
                        try {
                            Exceptions.throwIfFatal(th2);
                            this.f64241b.accept(th2);
                            throw ExceptionHelper.throwIfThrowable(th2);
                        } catch (Throwable th3) {
                            this.f64243d.run();
                            throw th3;
                        }
                    }
                } else if (this.sourceMode == 1) {
                    this.f64242c.run();
                    this.f64243d.run();
                }
                return poll;
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                try {
                    this.f64241b.accept(th4);
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
        this.f64232b = consumer;
        this.f64233c = consumer2;
        this.f64234d = action;
        this.f64235e = action2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber<? super Object>) new C10842a((ConditionalSubscriber) subscriber, this.f64232b, this.f64233c, this.f64234d, this.f64235e));
        } else {
            this.source.subscribe((FlowableSubscriber<? super Object>) new C10843b(subscriber, this.f64232b, this.f64233c, this.f64234d, this.f64235e));
        }
    }
}
