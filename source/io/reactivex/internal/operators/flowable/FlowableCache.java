package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableCache<T> extends AbstractC0567I implements FlowableSubscriber<T> {

    /* renamed from: k */
    public static final CacheSubscription[] f64116k = new CacheSubscription[0];

    /* renamed from: l */
    public static final CacheSubscription[] f64117l = new CacheSubscription[0];

    /* renamed from: b */
    public final AtomicBoolean f64118b;

    /* renamed from: c */
    public final int f64119c;

    /* renamed from: d */
    public final AtomicReference f64120d;

    /* renamed from: e */
    public volatile long f64121e;

    /* renamed from: f */
    public final C10822a f64122f;

    /* renamed from: g */
    public C10822a f64123g;

    /* renamed from: h */
    public int f64124h;

    /* renamed from: i */
    public Throwable f64125i;

    /* renamed from: j */
    public volatile boolean f64126j;

    /* loaded from: classes5.dex */
    public static final class CacheSubscription<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 6770240836423125754L;
        final Subscriber<? super T> downstream;
        long index;
        C10822a node;
        int offset;
        final FlowableCache<T> parent;
        final AtomicLong requested = new AtomicLong();

        public CacheSubscription(Subscriber<? super T> subscriber, FlowableCache<T> flowableCache) {
            this.downstream = subscriber;
            this.parent = flowableCache;
            this.node = flowableCache.f64122f;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.requested.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.m30051f(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.addCancel(this.requested, j);
                this.parent.m30050g(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCache$a */
    /* loaded from: classes5.dex */
    public static final class C10822a {

        /* renamed from: a */
        public final Object[] f64127a;

        /* renamed from: b */
        public volatile C10822a f64128b;

        public C10822a(int i) {
            this.f64127a = new Object[i];
        }
    }

    public FlowableCache(Flowable<T> flowable, int i) {
        super(flowable);
        this.f64119c = i;
        this.f64118b = new AtomicBoolean();
        C10822a c10822a = new C10822a(i);
        this.f64122f = c10822a;
        this.f64123g = c10822a;
        this.f64120d = new AtomicReference(f64116k);
    }

    /* renamed from: e */
    public void m30052e(CacheSubscription cacheSubscription) {
        CacheSubscription[] cacheSubscriptionArr;
        CacheSubscription[] cacheSubscriptionArr2;
        do {
            cacheSubscriptionArr = (CacheSubscription[]) this.f64120d.get();
            if (cacheSubscriptionArr == f64117l) {
                return;
            }
            int length = cacheSubscriptionArr.length;
            cacheSubscriptionArr2 = new CacheSubscription[length + 1];
            System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr2, 0, length);
            cacheSubscriptionArr2[length] = cacheSubscription;
        } while (!AbstractC17300An1.m69050a(this.f64120d, cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    /* renamed from: f */
    public void m30051f(CacheSubscription cacheSubscription) {
        CacheSubscription[] cacheSubscriptionArr;
        CacheSubscription[] cacheSubscriptionArr2;
        do {
            cacheSubscriptionArr = (CacheSubscription[]) this.f64120d.get();
            int length = cacheSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (cacheSubscriptionArr[i] == cacheSubscription) {
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
                cacheSubscriptionArr2 = f64116k;
            } else {
                CacheSubscription[] cacheSubscriptionArr3 = new CacheSubscription[length - 1];
                System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr3, 0, i);
                System.arraycopy(cacheSubscriptionArr, i + 1, cacheSubscriptionArr3, i, (length - i) - 1);
                cacheSubscriptionArr2 = cacheSubscriptionArr3;
            }
        } while (!AbstractC17300An1.m69050a(this.f64120d, cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    /* renamed from: g */
    public void m30050g(CacheSubscription cacheSubscription) {
        boolean z;
        if (cacheSubscription.getAndIncrement() != 0) {
            return;
        }
        long j = cacheSubscription.index;
        int i = cacheSubscription.offset;
        C10822a c10822a = cacheSubscription.node;
        AtomicLong atomicLong = cacheSubscription.requested;
        Subscriber<? super T> subscriber = cacheSubscription.downstream;
        int i2 = this.f64119c;
        int i3 = 1;
        while (true) {
            boolean z2 = this.f64126j;
            if (this.f64121e == j) {
                z = true;
            } else {
                z = false;
            }
            if (z2 && z) {
                cacheSubscription.node = null;
                Throwable th2 = this.f64125i;
                if (th2 != null) {
                    subscriber.onError(th2);
                    return;
                } else {
                    subscriber.onComplete();
                    return;
                }
            }
            if (!z) {
                long j2 = atomicLong.get();
                if (j2 == Long.MIN_VALUE) {
                    cacheSubscription.node = null;
                    return;
                } else if (j2 != j) {
                    if (i == i2) {
                        c10822a = c10822a.f64128b;
                        i = 0;
                    }
                    subscriber.onNext(c10822a.f64127a[i]);
                    i++;
                    j++;
                }
            }
            cacheSubscription.index = j;
            cacheSubscription.offset = i;
            cacheSubscription.node = c10822a;
            i3 = cacheSubscription.addAndGet(-i3);
            if (i3 == 0) {
                return;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f64126j = true;
        for (CacheSubscription cacheSubscription : (CacheSubscription[]) this.f64120d.getAndSet(f64117l)) {
            m30050g(cacheSubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        if (this.f64126j) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f64125i = th2;
        this.f64126j = true;
        for (CacheSubscription cacheSubscription : (CacheSubscription[]) this.f64120d.getAndSet(f64117l)) {
            m30050g(cacheSubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        int i = this.f64124h;
        if (i == this.f64119c) {
            C10822a c10822a = new C10822a(i);
            c10822a.f64127a[0] = t;
            this.f64124h = 1;
            this.f64123g.f64128b = c10822a;
            this.f64123g = c10822a;
        } else {
            this.f64123g.f64127a[i] = t;
            this.f64124h = i + 1;
        }
        this.f64121e++;
        for (CacheSubscription cacheSubscription : (CacheSubscription[]) this.f64120d.get()) {
            m30050g(cacheSubscription);
        }
    }

    @Override // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription) {
        subscription.request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        CacheSubscription cacheSubscription = new CacheSubscription(subscriber, this);
        subscriber.onSubscribe(cacheSubscription);
        m30052e(cacheSubscription);
        if (!this.f64118b.get() && this.f64118b.compareAndSet(false, true)) {
            this.source.subscribe((FlowableSubscriber<? super Object>) this);
        } else {
            m30050g(cacheSubscription);
        }
    }
}
