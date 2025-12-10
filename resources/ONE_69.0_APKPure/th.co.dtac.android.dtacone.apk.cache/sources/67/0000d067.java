package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableZip<T, R> extends Flowable<R> {

    /* renamed from: b */
    public final Publisher[] f64772b;

    /* renamed from: c */
    public final Iterable f64773c;

    /* renamed from: d */
    public final Function f64774d;

    /* renamed from: e */
    public final int f64775e;

    /* renamed from: f */
    public final boolean f64776f;

    /* loaded from: classes5.dex */
    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = -2434867452883857743L;
        volatile boolean cancelled;
        final Object[] current;
        final boolean delayErrors;
        final Subscriber<? super R> downstream;
        final AtomicThrowable errors;
        final AtomicLong requested;
        final ZipSubscriber<T, R>[] subscribers;
        final Function<? super Object[], ? extends R> zipper;

        public ZipCoordinator(Subscriber<? super R> subscriber, Function<? super Object[], ? extends R> function, int i, int i2, boolean z) {
            this.downstream = subscriber;
            this.zipper = function;
            this.delayErrors = z;
            ZipSubscriber<T, R>[] zipSubscriberArr = new ZipSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                zipSubscriberArr[i3] = new ZipSubscriber<>(this, i2);
            }
            this.current = new Object[i];
            this.subscribers = zipSubscriberArr;
            this.requested = new AtomicLong();
            this.errors = new AtomicThrowable();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelAll();
            }
        }

        public void cancelAll() {
            for (ZipSubscriber<T, R> zipSubscriber : this.subscribers) {
                zipSubscriber.cancel();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x016b, code lost:
            r7 = addAndGet(-r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
            if (r16 != 0) goto L111;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00d2, code lost:
            if (r18.cancelled == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00d4, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00d7, code lost:
            if (r18.delayErrors != false) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00df, code lost:
            if (r18.errors.get() == null) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00e1, code lost:
            cancelAll();
            r2.onError(r18.errors.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00ed, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00ee, code lost:
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00ef, code lost:
            if (r6 >= r4) goto L108;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00f1, code lost:
            r0 = r3[r6];
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00f5, code lost:
            if (r5[r6] != null) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00f7, code lost:
            r10 = r0.done;
            r0 = r0.queue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00fb, code lost:
            if (r0 == null) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00fd, code lost:
            r0 = r0.poll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0102, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0104, code lost:
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0105, code lost:
            if (r0 != null) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0109, code lost:
            r11 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x010a, code lost:
            if (r10 == false) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x010c, code lost:
            if (r11 == false) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x010e, code lost:
            cancelAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0119, code lost:
            if (r18.errors.get() == null) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x011b, code lost:
            r2.onError(r18.errors.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0125, code lost:
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0128, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0129, code lost:
            if (r11 != false) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x012b, code lost:
            r5[r6] = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x012e, code lost:
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0);
            r18.errors.addThrowable(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0138, code lost:
            if (r18.delayErrors == false) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x013a, code lost:
            cancelAll();
            r2.onError(r18.errors.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x0146, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0147, code lost:
            r6 = r6 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x014e, code lost:
            if (r12 == 0) goto L120;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0150, code lost:
            r0 = r3.length;
            r15 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x0152, code lost:
            if (r15 >= r0) goto L116;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0154, code lost:
            r3[r15].request(r12);
            r15 = r15 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0163, code lost:
            if (r8 == Long.MAX_VALUE) goto L120;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0165, code lost:
            r18.requested.addAndGet(-r12);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drain() {
            /*
                Method dump skipped, instructions count: 371
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableZip.ZipCoordinator.drain():void");
        }

        public void error(ZipSubscriber<T, R> zipSubscriber, Throwable th2) {
            if (this.errors.addThrowable(th2)) {
                zipSubscriber.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        public void subscribe(Publisher<? extends T>[] publisherArr, int i) {
            ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
            for (int i2 = 0; i2 < i && !this.cancelled; i2++) {
                if (this.delayErrors || this.errors.get() == null) {
                    publisherArr[i2].subscribe(zipSubscriberArr[i2]);
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class ZipSubscriber<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int limit;
        final ZipCoordinator<T, R> parent;
        final int prefetch;
        long produced;
        SimpleQueue<T> queue;
        int sourceMode;

        public ZipSubscriber(ZipCoordinator<T, R> zipCoordinator, int i) {
            this.parent = zipCoordinator;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.parent.error(this, th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.sourceMode != 2) {
                this.queue.offer(t);
            }
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        subscription.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                subscription.request(this.prefetch);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (this.sourceMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= this.limit) {
                    this.produced = 0L;
                    get().request(j2);
                    return;
                }
                this.produced = j2;
            }
        }
    }

    public FlowableZip(Publisher<? extends T>[] publisherArr, Iterable<? extends Publisher<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.f64772b = publisherArr;
        this.f64773c = iterable;
        this.f64774d = function;
        this.f64775e = i;
        this.f64776f = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        int length;
        Publisher<? extends T>[] publisherArr = this.f64772b;
        if (publisherArr == null) {
            publisherArr = new Publisher[8];
            length = 0;
            for (Publisher<? extends T> publisher : this.f64773c) {
                if (length == publisherArr.length) {
                    Publisher<? extends T>[] publisherArr2 = new Publisher[(length >> 2) + length];
                    System.arraycopy(publisherArr, 0, publisherArr2, 0, length);
                    publisherArr = publisherArr2;
                }
                publisherArr[length] = publisher;
                length++;
            }
        } else {
            length = publisherArr.length;
        }
        int i = length;
        if (i == 0) {
            EmptySubscription.complete(subscriber);
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(subscriber, this.f64774d, i, this.f64775e, this.f64776f);
        subscriber.onSubscribe(zipCoordinator);
        zipCoordinator.subscribe(publisherArr, i);
    }
}