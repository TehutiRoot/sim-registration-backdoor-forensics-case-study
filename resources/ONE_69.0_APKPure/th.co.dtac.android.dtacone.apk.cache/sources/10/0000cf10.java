package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableDebounce<T, U> extends AbstractC0558I {

    /* renamed from: b */
    public final Function f64241b;

    /* loaded from: classes5.dex */
    public static final class DebounceSubscriber<T, U> extends AtomicLong implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = 6725975399620862591L;
        final Function<? super T, ? extends Publisher<U>> debounceSelector;
        final AtomicReference<Disposable> debouncer = new AtomicReference<>();
        boolean done;
        final Subscriber<? super T> downstream;
        volatile long index;
        Subscription upstream;

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableDebounce$DebounceSubscriber$a */
        /* loaded from: classes5.dex */
        public static final class C10817a extends DisposableSubscriber {

            /* renamed from: b */
            public final DebounceSubscriber f64242b;

            /* renamed from: c */
            public final long f64243c;

            /* renamed from: d */
            public final Object f64244d;

            /* renamed from: e */
            public boolean f64245e;

            /* renamed from: f */
            public final AtomicBoolean f64246f = new AtomicBoolean();

            public C10817a(DebounceSubscriber debounceSubscriber, long j, Object obj) {
                this.f64242b = debounceSubscriber;
                this.f64243c = j;
                this.f64244d = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: a */
            public void m30389a() {
                if (this.f64246f.compareAndSet(false, true)) {
                    this.f64242b.emit(this.f64243c, this.f64244d);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                if (this.f64245e) {
                    return;
                }
                this.f64245e = true;
                m30389a();
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(Throwable th2) {
                if (this.f64245e) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
                this.f64245e = true;
                this.f64242b.onError(th2);
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(Object obj) {
                if (this.f64245e) {
                    return;
                }
                this.f64245e = true;
                cancel();
                m30389a();
            }
        }

        public DebounceSubscriber(Subscriber<? super T> subscriber, Function<? super T, ? extends Publisher<U>> function) {
            this.downstream = subscriber;
            this.debounceSelector = function;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.cancel();
            DisposableHelper.dispose(this.debouncer);
        }

        public void emit(long j, T t) {
            if (j == this.index) {
                if (get() != 0) {
                    this.downstream.onNext(t);
                    BackpressureHelper.produced(this, 1L);
                    return;
                }
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            Disposable disposable = this.debouncer.get();
            if (!DisposableHelper.isDisposed(disposable)) {
                ((C10817a) disposable).m30389a();
                DisposableHelper.dispose(this.debouncer);
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.debouncer);
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            long j = this.index + 1;
            this.index = j;
            Disposable disposable = this.debouncer.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.debounceSelector.apply(t), "The publisher supplied is null");
                C10817a c10817a = new C10817a(this, j, t);
                if (AbstractC23094xo1.m479a(this.debouncer, disposable, c10817a)) {
                    publisher.subscribe(c10817a);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this, j);
            }
        }
    }

    public FlowableDebounce(Flowable<T> flowable, Function<? super T, ? extends Publisher<U>> function) {
        super(flowable);
        this.f64241b = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new DebounceSubscriber(new SerializedSubscriber(subscriber), this.f64241b));
    }
}