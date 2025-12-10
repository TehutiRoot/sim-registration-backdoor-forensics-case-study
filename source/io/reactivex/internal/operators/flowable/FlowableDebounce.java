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
public final class FlowableDebounce<T, U> extends AbstractC0567I {

    /* renamed from: b */
    public final Function f64178b;

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
        public static final class C10830a extends DisposableSubscriber {

            /* renamed from: b */
            public final DebounceSubscriber f64179b;

            /* renamed from: c */
            public final long f64180c;

            /* renamed from: d */
            public final Object f64181d;

            /* renamed from: e */
            public boolean f64182e;

            /* renamed from: f */
            public final AtomicBoolean f64183f = new AtomicBoolean();

            public C10830a(DebounceSubscriber debounceSubscriber, long j, Object obj) {
                this.f64179b = debounceSubscriber;
                this.f64180c = j;
                this.f64181d = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: a */
            public void m30049a() {
                if (this.f64183f.compareAndSet(false, true)) {
                    this.f64179b.emit(this.f64180c, this.f64181d);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                if (this.f64182e) {
                    return;
                }
                this.f64182e = true;
                m30049a();
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(Throwable th2) {
                if (this.f64182e) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
                this.f64182e = true;
                this.f64179b.onError(th2);
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(Object obj) {
                if (this.f64182e) {
                    return;
                }
                this.f64182e = true;
                cancel();
                m30049a();
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
                ((C10830a) disposable).m30049a();
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
                C10830a c10830a = new C10830a(this, j, t);
                if (AbstractC17300An1.m69050a(this.debouncer, disposable, c10830a)) {
                    publisher.subscribe(c10830a);
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
        this.f64178b = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new DebounceSubscriber(new SerializedSubscriber(subscriber), this.f64178b));
    }
}
