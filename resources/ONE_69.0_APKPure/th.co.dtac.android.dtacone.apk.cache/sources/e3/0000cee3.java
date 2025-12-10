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
public final class FlowableCache<T> extends AbstractC0558I implements FlowableSubscriber<T> {

    /* renamed from: k */
    public static final CacheSubscription[] f64179k = new CacheSubscription[0];

    /* renamed from: l */
    public static final CacheSubscription[] f64180l = new CacheSubscription[0];

    /* renamed from: b */
    public final AtomicBoolean f64181b;

    /* renamed from: c */
    public final int f64182c;

    /* renamed from: d */
    public final AtomicReference f64183d;

    /* renamed from: e */
    public volatile long f64184e;

    /* renamed from: f */
    public final C10809a f64185f;

    /* renamed from: g */
    public C10809a f64186g;

    /* renamed from: h */
    public int f64187h;

    /* renamed from: i */
    public Throwable f64188i;

    /* renamed from: j */
    public volatile boolean f64189j;

    /* loaded from: classes5.dex */
    public static final class CacheSubscription<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 6770240836423125754L;
        final Subscriber<? super T> downstream;
        long index;
        C10809a node;
        int offset;
        final FlowableCache<T> parent;
        final AtomicLong requested = new AtomicLong();

        public CacheSubscription(Subscriber<? super T> subscriber, FlowableCache<T> flowableCache) {
            this.downstream = subscriber;
            this.parent = flowableCache;
            this.node = flowableCache.f64185f;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.requested.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.m30391f(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.addCancel(this.requested, j);
                this.parent.m30390g(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCache$a */
    /* loaded from: classes5.dex */
    public static final class C10809a {

        /* renamed from: a */
        public final Object[] f64190a;

        /* renamed from: b */
        public volatile C10809a f64191b;

        public C10809a(int i) {
            this.f64190a = new Object[i];
        }
    }

    public FlowableCache(Flowable<T> flowable, int i) {
        super(flowable);
        this.f64182c = i;
        this.f64181b = new AtomicBoolean();
        C10809a c10809a = new C10809a(i);
        this.f64185f = c10809a;
        this.f64186g = c10809a;
        this.f64183d = new AtomicReference(f64179k);
    }

    /* renamed from: e */
    public void m30392e(CacheSubscription cacheSubscription) {
        CacheSubscription[] cacheSubscriptionArr;
        CacheSubscription[] cacheSubscriptionArr2;
        do {
            cacheSubscriptionArr = (CacheSubscription[]) this.f64183d.get();
            if (cacheSubscriptionArr == f64180l) {
                return;
            }
            int length = cacheSubscriptionArr.length;
            cacheSubscriptionArr2 = new CacheSubscription[length + 1];
            System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr2, 0, length);
            cacheSubscriptionArr2[length] = cacheSubscription;
        } while (!AbstractC23094xo1.m479a(this.f64183d, cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    /* renamed from: f */
    public void m30391f(CacheSubscription cacheSubscription) {
        CacheSubscription[] cacheSubscriptionArr;
        CacheSubscription[] cacheSubscriptionArr2;
        do {
            cacheSubscriptionArr = (CacheSubscription[]) this.f64183d.get();
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
                cacheSubscriptionArr2 = f64179k;
            } else {
                CacheSubscription[] cacheSubscriptionArr3 = new CacheSubscription[length - 1];
                System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr3, 0, i);
                System.arraycopy(cacheSubscriptionArr, i + 1, cacheSubscriptionArr3, i, (length - i) - 1);
                cacheSubscriptionArr2 = cacheSubscriptionArr3;
            }
        } while (!AbstractC23094xo1.m479a(this.f64183d, cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    /* renamed from: g */
    public void m30390g(CacheSubscription cacheSubscription) {
        boolean z;
        if (cacheSubscription.getAndIncrement() != 0) {
            return;
        }
        long j = cacheSubscription.index;
        int i = cacheSubscription.offset;
        C10809a c10809a = cacheSubscription.node;
        AtomicLong atomicLong = cacheSubscription.requested;
        Subscriber<? super T> subscriber = cacheSubscription.downstream;
        int i2 = this.f64182c;
        int i3 = 1;
        while (true) {
            boolean z2 = this.f64189j;
            if (this.f64184e == j) {
                z = true;
            } else {
                z = false;
            }
            if (z2 && z) {
                cacheSubscription.node = null;
                Throwable th2 = this.f64188i;
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
                        c10809a = c10809a.f64191b;
                        i = 0;
                    }
                    subscriber.onNext(c10809a.f64190a[i]);
                    i++;
                    j++;
                }
            }
            cacheSubscription.index = j;
            cacheSubscription.offset = i;
            cacheSubscription.node = c10809a;
            i3 = cacheSubscription.addAndGet(-i3);
            if (i3 == 0) {
                return;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f64189j = true;
        for (CacheSubscription cacheSubscription : (CacheSubscription[]) this.f64183d.getAndSet(f64180l)) {
            m30390g(cacheSubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        if (this.f64189j) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f64188i = th2;
        this.f64189j = true;
        for (CacheSubscription cacheSubscription : (CacheSubscription[]) this.f64183d.getAndSet(f64180l)) {
            m30390g(cacheSubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        int i = this.f64187h;
        if (i == this.f64182c) {
            C10809a c10809a = new C10809a(i);
            c10809a.f64190a[0] = t;
            this.f64187h = 1;
            this.f64186g.f64191b = c10809a;
            this.f64186g = c10809a;
        } else {
            this.f64186g.f64190a[i] = t;
            this.f64187h = i + 1;
        }
        this.f64184e++;
        for (CacheSubscription cacheSubscription : (CacheSubscription[]) this.f64183d.get()) {
            m30390g(cacheSubscription);
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
        m30392e(cacheSubscription);
        if (!this.f64181b.get() && this.f64181b.compareAndSet(false, true)) {
            this.source.subscribe((FlowableSubscriber<? super Object>) this);
        } else {
            m30390g(cacheSubscription);
        }
    }
}