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
public final class FlowablePublishMulticast<T, R> extends AbstractC0567I {

    /* renamed from: b */
    public final Function f64420b;

    /* renamed from: c */
    public final int f64421c;

    /* renamed from: d */
    public final boolean f64422d;

    /* loaded from: classes5.dex */
    public static final class MulticastSubscription<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = 8664815189257569791L;
        final Subscriber<? super T> downstream;
        long emitted;
        final C10877a parent;

        public MulticastSubscription(Subscriber<? super T> subscriber, C10877a c10877a) {
            this.downstream = subscriber;
            this.parent = c10877a;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.m30030i(this);
                this.parent.m30032g();
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
                this.parent.m30032g();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowablePublishMulticast$a */
    /* loaded from: classes5.dex */
    public static final class C10877a extends Flowable implements FlowableSubscriber, Disposable {

        /* renamed from: m */
        public static final MulticastSubscription[] f64423m = new MulticastSubscription[0];

        /* renamed from: n */
        public static final MulticastSubscription[] f64424n = new MulticastSubscription[0];

        /* renamed from: d */
        public final int f64427d;

        /* renamed from: e */
        public final int f64428e;

        /* renamed from: f */
        public final boolean f64429f;

        /* renamed from: h */
        public volatile SimpleQueue f64431h;

        /* renamed from: i */
        public int f64432i;

        /* renamed from: j */
        public volatile boolean f64433j;

        /* renamed from: k */
        public Throwable f64434k;

        /* renamed from: l */
        public int f64435l;

        /* renamed from: b */
        public final AtomicInteger f64425b = new AtomicInteger();

        /* renamed from: g */
        public final AtomicReference f64430g = new AtomicReference();

        /* renamed from: c */
        public final AtomicReference f64426c = new AtomicReference(f64423m);

        public C10877a(int i, boolean z) {
            this.f64427d = i;
            this.f64428e = i - (i >> 2);
            this.f64429f = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SimpleQueue simpleQueue;
            SubscriptionHelper.cancel(this.f64430g);
            if (this.f64425b.getAndIncrement() == 0 && (simpleQueue = this.f64431h) != null) {
                simpleQueue.clear();
            }
        }

        /* renamed from: e */
        public boolean m30034e(MulticastSubscription multicastSubscription) {
            MulticastSubscription[] multicastSubscriptionArr;
            MulticastSubscription[] multicastSubscriptionArr2;
            do {
                multicastSubscriptionArr = (MulticastSubscription[]) this.f64426c.get();
                if (multicastSubscriptionArr == f64424n) {
                    return false;
                }
                int length = multicastSubscriptionArr.length;
                multicastSubscriptionArr2 = new MulticastSubscription[length + 1];
                System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
                multicastSubscriptionArr2[length] = multicastSubscription;
            } while (!AbstractC17300An1.m69050a(this.f64426c, multicastSubscriptionArr, multicastSubscriptionArr2));
            return true;
        }

        /* renamed from: f */
        public void m30033f() {
            MulticastSubscription[] multicastSubscriptionArr;
            for (MulticastSubscription multicastSubscription : (MulticastSubscription[]) this.f64426c.getAndSet(f64424n)) {
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
            r5 = r24.f64433j;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x010b, code lost:
            if (r5 == false) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x010f, code lost:
            if (r24.f64429f != false) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0111, code lost:
            r6 = r24.f64434k;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0113, code lost:
            if (r6 == null) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x0115, code lost:
            m30031h(r6);
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
            r0 = r24.f64434k;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0123, code lost:
            if (r0 == null) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0125, code lost:
            m30031h(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0129, code lost:
            m30033f();
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x012c, code lost:
            return;
         */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m30032g() {
            /*
                Method dump skipped, instructions count: 327
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowablePublishMulticast.C10877a.m30032g():void");
        }

        /* renamed from: h */
        public void m30031h(Throwable th2) {
            MulticastSubscription[] multicastSubscriptionArr;
            for (MulticastSubscription multicastSubscription : (MulticastSubscription[]) this.f64426c.getAndSet(f64424n)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.downstream.onError(th2);
                }
            }
        }

        /* renamed from: i */
        public void m30030i(MulticastSubscription multicastSubscription) {
            MulticastSubscription[] multicastSubscriptionArr;
            MulticastSubscription[] multicastSubscriptionArr2;
            do {
                multicastSubscriptionArr = (MulticastSubscription[]) this.f64426c.get();
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
                    multicastSubscriptionArr2 = f64423m;
                } else {
                    MulticastSubscription[] multicastSubscriptionArr3 = new MulticastSubscription[length - 1];
                    System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr3, 0, i);
                    System.arraycopy(multicastSubscriptionArr, i + 1, multicastSubscriptionArr3, i, (length - i) - 1);
                    multicastSubscriptionArr2 = multicastSubscriptionArr3;
                }
            } while (!AbstractC17300An1.m69050a(this.f64426c, multicastSubscriptionArr, multicastSubscriptionArr2));
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64430g.get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (!this.f64433j) {
                this.f64433j = true;
                m30032g();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64433j) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64434k = th2;
            this.f64433j = true;
            m30032g();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64433j) {
                return;
            }
            if (this.f64432i == 0 && !this.f64431h.offer(obj)) {
                ((Subscription) this.f64430g.get()).cancel();
                onError(new MissingBackpressureException());
                return;
            }
            m30032g();
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this.f64430g, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f64432i = requestFusion;
                        this.f64431h = queueSubscription;
                        this.f64433j = true;
                        m30032g();
                        return;
                    } else if (requestFusion == 2) {
                        this.f64432i = requestFusion;
                        this.f64431h = queueSubscription;
                        QueueDrainHelper.request(subscription, this.f64427d);
                        return;
                    }
                }
                this.f64431h = QueueDrainHelper.createQueue(this.f64427d);
                QueueDrainHelper.request(subscription, this.f64427d);
            }
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(Subscriber subscriber) {
            MulticastSubscription multicastSubscription = new MulticastSubscription(subscriber, this);
            subscriber.onSubscribe(multicastSubscription);
            if (m30034e(multicastSubscription)) {
                if (multicastSubscription.isCancelled()) {
                    m30030i(multicastSubscription);
                    return;
                } else {
                    m30032g();
                    return;
                }
            }
            Throwable th2 = this.f64434k;
            if (th2 != null) {
                subscriber.onError(th2);
            } else {
                subscriber.onComplete();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowablePublishMulticast$b */
    /* loaded from: classes5.dex */
    public static final class C10878b implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64436a;

        /* renamed from: b */
        public final C10877a f64437b;

        /* renamed from: c */
        public Subscription f64438c;

        public C10878b(Subscriber subscriber, C10877a c10877a) {
            this.f64436a = subscriber;
            this.f64437b = c10877a;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64438c.cancel();
            this.f64437b.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64436a.onComplete();
            this.f64437b.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64436a.onError(th2);
            this.f64437b.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64436a.onNext(obj);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64438c, subscription)) {
                this.f64438c = subscription;
                this.f64436a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64438c.request(j);
        }
    }

    public FlowablePublishMulticast(Flowable<T> flowable, Function<? super Flowable<T>, ? extends Publisher<? extends R>> function, int i, boolean z) {
        super(flowable);
        this.f64420b = function;
        this.f64421c = i;
        this.f64422d = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        C10877a c10877a = new C10877a(this.f64421c, this.f64422d);
        try {
            ((Publisher) ObjectHelper.requireNonNull(this.f64420b.apply(c10877a), "selector returned a null Publisher")).subscribe(new C10878b(subscriber, c10877a));
            this.source.subscribe((FlowableSubscriber<? super Object>) c10877a);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
