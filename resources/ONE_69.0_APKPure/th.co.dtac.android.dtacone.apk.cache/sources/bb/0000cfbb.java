package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowablePublishMulticast<T, R> extends AbstractC0558I {

    /* renamed from: b */
    public final Function f64483b;

    /* renamed from: c */
    public final int f64484c;

    /* renamed from: d */
    public final boolean f64485d;

    /* loaded from: classes5.dex */
    public static final class MulticastSubscription<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = 8664815189257569791L;
        final Subscriber<? super T> downstream;
        long emitted;
        final C10864a parent;

        public MulticastSubscription(Subscriber<? super T> subscriber, C10864a c10864a) {
            this.downstream = subscriber;
            this.parent = c10864a;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.m30370i(this);
                this.parent.m30372g();
            }
        }

        public boolean isCancelled() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.addCancel(this, j);
                this.parent.m30372g();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowablePublishMulticast$a */
    /* loaded from: classes5.dex */
    public static final class C10864a extends Flowable implements FlowableSubscriber, Disposable {

        /* renamed from: m */
        public static final MulticastSubscription[] f64486m = new MulticastSubscription[0];

        /* renamed from: n */
        public static final MulticastSubscription[] f64487n = new MulticastSubscription[0];

        /* renamed from: d */
        public final int f64490d;

        /* renamed from: e */
        public final int f64491e;

        /* renamed from: f */
        public final boolean f64492f;

        /* renamed from: h */
        public volatile SimpleQueue f64494h;

        /* renamed from: i */
        public int f64495i;

        /* renamed from: j */
        public volatile boolean f64496j;

        /* renamed from: k */
        public Throwable f64497k;

        /* renamed from: l */
        public int f64498l;

        /* renamed from: b */
        public final AtomicInteger f64488b = new AtomicInteger();

        /* renamed from: g */
        public final AtomicReference f64493g = new AtomicReference();

        /* renamed from: c */
        public final AtomicReference f64489c = new AtomicReference(f64486m);

        public C10864a(int i, boolean z) {
            this.f64490d = i;
            this.f64491e = i - (i >> 2);
            this.f64492f = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SimpleQueue simpleQueue;
            SubscriptionHelper.cancel(this.f64493g);
            if (this.f64488b.getAndIncrement() == 0 && (simpleQueue = this.f64494h) != null) {
                simpleQueue.clear();
            }
        }

        /* renamed from: e */
        public boolean m30374e(MulticastSubscription multicastSubscription) {
            MulticastSubscription[] multicastSubscriptionArr;
            MulticastSubscription[] multicastSubscriptionArr2;
            do {
                multicastSubscriptionArr = (MulticastSubscription[]) this.f64489c.get();
                if (multicastSubscriptionArr == f64487n) {
                    return false;
                }
                int length = multicastSubscriptionArr.length;
                multicastSubscriptionArr2 = new MulticastSubscription[length + 1];
                System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
                multicastSubscriptionArr2[length] = multicastSubscription;
            } while (!AbstractC23094xo1.m479a(this.f64489c, multicastSubscriptionArr, multicastSubscriptionArr2));
            return true;
        }

        /* renamed from: f */
        public void m30373f() {
            MulticastSubscription[] multicastSubscriptionArr;
            for (MulticastSubscription multicastSubscription : (MulticastSubscription[]) this.f64489c.getAndSet(f64487n)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.downstream.onComplete();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:131:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x00e9, code lost:
            r8 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x00fd, code lost:
            if (r7 != 0) goto L111;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0103, code lost:
            if (isDisposed() == false) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0105, code lost:
            r0.clear();
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0108, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0109, code lost:
            r5 = r24.f64496j;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x010b, code lost:
            if (r5 == false) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x010f, code lost:
            if (r24.f64492f != false) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0111, code lost:
            r6 = r24.f64497k;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0113, code lost:
            if (r6 == null) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x0115, code lost:
            m30371h(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0118, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0119, code lost:
            if (r5 == false) goto L111;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x011f, code lost:
            if (r0.isEmpty() == false) goto L111;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x0121, code lost:
            r0 = r24.f64497k;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0123, code lost:
            if (r0 == null) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0125, code lost:
            m30371h(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0129, code lost:
            m30373f();
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x012c, code lost:
            return;
         */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m30372g() {
            /*
                Method dump skipped, instructions count: 327
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowablePublishMulticast.C10864a.m30372g():void");
        }

        /* renamed from: h */
        public void m30371h(Throwable th2) {
            MulticastSubscription[] multicastSubscriptionArr;
            for (MulticastSubscription multicastSubscription : (MulticastSubscription[]) this.f64489c.getAndSet(f64487n)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.downstream.onError(th2);
                }
            }
        }

        /* renamed from: i */
        public void m30370i(MulticastSubscription multicastSubscription) {
            MulticastSubscription[] multicastSubscriptionArr;
            MulticastSubscription[] multicastSubscriptionArr2;
            do {
                multicastSubscriptionArr = (MulticastSubscription[]) this.f64489c.get();
                int length = multicastSubscriptionArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (multicastSubscriptionArr[i] == multicastSubscription) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    multicastSubscriptionArr2 = f64486m;
                } else {
                    MulticastSubscription[] multicastSubscriptionArr3 = new MulticastSubscription[length - 1];
                    System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr3, 0, i);
                    System.arraycopy(multicastSubscriptionArr, i + 1, multicastSubscriptionArr3, i, (length - i) - 1);
                    multicastSubscriptionArr2 = multicastSubscriptionArr3;
                }
            } while (!AbstractC23094xo1.m479a(this.f64489c, multicastSubscriptionArr, multicastSubscriptionArr2));
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64493g.get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (!this.f64496j) {
                this.f64496j = true;
                m30372g();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64496j) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64497k = th2;
            this.f64496j = true;
            m30372g();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64496j) {
                return;
            }
            if (this.f64495i == 0 && !this.f64494h.offer(obj)) {
                ((Subscription) this.f64493g.get()).cancel();
                onError(new MissingBackpressureException());
                return;
            }
            m30372g();
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this.f64493g, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f64495i = requestFusion;
                        this.f64494h = queueSubscription;
                        this.f64496j = true;
                        m30372g();
                        return;
                    } else if (requestFusion == 2) {
                        this.f64495i = requestFusion;
                        this.f64494h = queueSubscription;
                        QueueDrainHelper.request(subscription, this.f64490d);
                        return;
                    }
                }
                this.f64494h = QueueDrainHelper.createQueue(this.f64490d);
                QueueDrainHelper.request(subscription, this.f64490d);
            }
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(Subscriber subscriber) {
            MulticastSubscription multicastSubscription = new MulticastSubscription(subscriber, this);
            subscriber.onSubscribe(multicastSubscription);
            if (m30374e(multicastSubscription)) {
                if (multicastSubscription.isCancelled()) {
                    m30370i(multicastSubscription);
                    return;
                } else {
                    m30372g();
                    return;
                }
            }
            Throwable th2 = this.f64497k;
            if (th2 != null) {
                subscriber.onError(th2);
            } else {
                subscriber.onComplete();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowablePublishMulticast$b */
    /* loaded from: classes5.dex */
    public static final class C10865b implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64499a;

        /* renamed from: b */
        public final C10864a f64500b;

        /* renamed from: c */
        public Subscription f64501c;

        public C10865b(Subscriber subscriber, C10864a c10864a) {
            this.f64499a = subscriber;
            this.f64500b = c10864a;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64501c.cancel();
            this.f64500b.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64499a.onComplete();
            this.f64500b.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64499a.onError(th2);
            this.f64500b.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64499a.onNext(obj);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64501c, subscription)) {
                this.f64501c = subscription;
                this.f64499a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64501c.request(j);
        }
    }

    public FlowablePublishMulticast(Flowable<T> flowable, Function<? super Flowable<T>, ? extends Publisher<? extends R>> function, int i, boolean z) {
        super(flowable);
        this.f64483b = function;
        this.f64484c = i;
        this.f64485d = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        C10864a c10864a = new C10864a(this.f64484c, this.f64485d);
        try {
            ((Publisher) ObjectHelper.requireNonNull(this.f64483b.apply(c10864a), "selector returned a null Publisher")).subscribe(new C10865b(subscriber, c10864a));
            this.source.subscribe((FlowableSubscriber<? super Object>) c10864a);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}