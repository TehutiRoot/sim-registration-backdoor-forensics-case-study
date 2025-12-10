package io.reactivex.processors;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class AsyncProcessor<T> extends FlowableProcessor<T> {

    /* renamed from: e */
    public static final AsyncSubscription[] f66184e = new AsyncSubscription[0];

    /* renamed from: f */
    public static final AsyncSubscription[] f66185f = new AsyncSubscription[0];

    /* renamed from: b */
    public final AtomicReference f66186b = new AtomicReference(f66184e);

    /* renamed from: c */
    public Throwable f66187c;

    /* renamed from: d */
    public Object f66188d;

    /* loaded from: classes5.dex */
    public static final class AsyncSubscription<T> extends DeferredScalarSubscription<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final AsyncProcessor<T> parent;

        public AsyncSubscription(Subscriber<? super T> subscriber, AsyncProcessor<T> asyncProcessor) {
            super(subscriber);
            this.parent = asyncProcessor;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            if (super.tryCancel()) {
                this.parent.m29868f(this);
            }
        }

        public void onComplete() {
            if (!isCancelled()) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th2) {
            if (isCancelled()) {
                RxJavaPlugins.onError(th2);
            } else {
                this.downstream.onError(th2);
            }
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> AsyncProcessor<T> create() {
        return new AsyncProcessor<>();
    }

    /* renamed from: e */
    public boolean m29869e(AsyncSubscription asyncSubscription) {
        AsyncSubscription[] asyncSubscriptionArr;
        AsyncSubscription[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = (AsyncSubscription[]) this.f66186b.get();
            if (asyncSubscriptionArr == f66185f) {
                return false;
            }
            int length = asyncSubscriptionArr.length;
            asyncSubscriptionArr2 = new AsyncSubscription[length + 1];
            System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr2, 0, length);
            asyncSubscriptionArr2[length] = asyncSubscription;
        } while (!AbstractC17300An1.m69050a(this.f66186b, asyncSubscriptionArr, asyncSubscriptionArr2));
        return true;
    }

    /* renamed from: f */
    public void m29868f(AsyncSubscription asyncSubscription) {
        AsyncSubscription[] asyncSubscriptionArr;
        AsyncSubscription[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = (AsyncSubscription[]) this.f66186b.get();
            int length = asyncSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (asyncSubscriptionArr[i] == asyncSubscription) {
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
                asyncSubscriptionArr2 = f66184e;
            } else {
                AsyncSubscription[] asyncSubscriptionArr3 = new AsyncSubscription[length - 1];
                System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr3, 0, i);
                System.arraycopy(asyncSubscriptionArr, i + 1, asyncSubscriptionArr3, i, (length - i) - 1);
                asyncSubscriptionArr2 = asyncSubscriptionArr3;
            }
        } while (!AbstractC17300An1.m69050a(this.f66186b, asyncSubscriptionArr, asyncSubscriptionArr2));
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        if (this.f66186b.get() == f66185f) {
            return this.f66187c;
        }
        return null;
    }

    @Nullable
    public T getValue() {
        if (this.f66186b.get() == f66185f) {
            return (T) this.f66188d;
        }
        return null;
    }

    @Deprecated
    public Object[] getValues() {
        T value = getValue();
        return value != null ? new Object[]{value} : new Object[0];
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        if (this.f66186b.get() == f66185f && this.f66187c == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        if (((AsyncSubscription[]) this.f66186b.get()).length != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        if (this.f66186b.get() == f66185f && this.f66187c != null) {
            return true;
        }
        return false;
    }

    public boolean hasValue() {
        if (this.f66186b.get() == f66185f && this.f66188d != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        Object obj = this.f66186b.get();
        Object obj2 = f66185f;
        if (obj == obj2) {
            return;
        }
        Object obj3 = this.f66188d;
        AsyncSubscription[] asyncSubscriptionArr = (AsyncSubscription[]) this.f66186b.getAndSet(obj2);
        int i = 0;
        if (obj3 == null) {
            int length = asyncSubscriptionArr.length;
            while (i < length) {
                asyncSubscriptionArr[i].onComplete();
                i++;
            }
            return;
        }
        int length2 = asyncSubscriptionArr.length;
        while (i < length2) {
            asyncSubscriptionArr[i].complete(obj3);
            i++;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.f66186b.get();
        Object obj2 = f66185f;
        if (obj == obj2) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f66188d = null;
        this.f66187c = th2;
        for (AsyncSubscription asyncSubscription : (AsyncSubscription[]) this.f66186b.getAndSet(obj2)) {
            asyncSubscription.onError(th2);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f66186b.get() == f66185f) {
            return;
        }
        this.f66188d = t;
    }

    @Override // org.reactivestreams.Subscriber, io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription) {
        if (this.f66186b.get() == f66185f) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        AsyncSubscription asyncSubscription = new AsyncSubscription(subscriber, this);
        subscriber.onSubscribe(asyncSubscription);
        if (m29869e(asyncSubscription)) {
            if (asyncSubscription.isCancelled()) {
                m29868f(asyncSubscription);
                return;
            }
            return;
        }
        Throwable th2 = this.f66187c;
        if (th2 != null) {
            subscriber.onError(th2);
            return;
        }
        Object obj = this.f66188d;
        if (obj != null) {
            asyncSubscription.complete(obj);
        } else {
            asyncSubscription.onComplete();
        }
    }

    @Deprecated
    public T[] getValues(T[] tArr) {
        T value = getValue();
        if (value == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 1);
        }
        tArr[0] = value;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }
}
