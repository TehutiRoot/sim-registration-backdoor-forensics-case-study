package io.reactivex.processors;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class PublishProcessor<T> extends FlowableProcessor<T> {

    /* renamed from: d */
    public static final PublishSubscription[] f66213d = new PublishSubscription[0];

    /* renamed from: e */
    public static final PublishSubscription[] f66214e = new PublishSubscription[0];

    /* renamed from: b */
    public final AtomicReference f66215b = new AtomicReference(f66214e);

    /* renamed from: c */
    public Throwable f66216c;

    /* loaded from: classes5.dex */
    public static final class PublishSubscription<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = 3562861878281475070L;
        final Subscriber<? super T> downstream;
        final PublishProcessor<T> parent;

        public PublishSubscription(Subscriber<? super T> subscriber, PublishProcessor<T> publishProcessor) {
            this.downstream = subscriber;
            this.parent = publishProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.m29859f(this);
            }
        }

        public boolean isCancelled() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        public boolean isFull() {
            if (get() == 0) {
                return true;
            }
            return false;
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th2) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        public void onNext(T t) {
            long j = get();
            if (j == Long.MIN_VALUE) {
                return;
            }
            if (j != 0) {
                this.downstream.onNext(t);
                BackpressureHelper.producedCancel(this, 1L);
                return;
            }
            cancel();
            this.downstream.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.addCancel(this, j);
            }
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> PublishProcessor<T> create() {
        return new PublishProcessor<>();
    }

    /* renamed from: e */
    public boolean m29860e(PublishSubscription publishSubscription) {
        PublishSubscription[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = (PublishSubscription[]) this.f66215b.get();
            if (publishSubscriptionArr == f66213d) {
                return false;
            }
            int length = publishSubscriptionArr.length;
            publishSubscriptionArr2 = new PublishSubscription[length + 1];
            System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = publishSubscription;
        } while (!AbstractC17300An1.m69050a(this.f66215b, publishSubscriptionArr, publishSubscriptionArr2));
        return true;
    }

    /* renamed from: f */
    public void m29859f(PublishSubscription publishSubscription) {
        PublishSubscription[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = (PublishSubscription[]) this.f66215b.get();
            if (publishSubscriptionArr != f66213d && publishSubscriptionArr != f66214e) {
                int length = publishSubscriptionArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (publishSubscriptionArr[i] == publishSubscription) {
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
                    publishSubscriptionArr2 = f66214e;
                } else {
                    PublishSubscription[] publishSubscriptionArr3 = new PublishSubscription[length - 1];
                    System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr3, 0, i);
                    System.arraycopy(publishSubscriptionArr, i + 1, publishSubscriptionArr3, i, (length - i) - 1);
                    publishSubscriptionArr2 = publishSubscriptionArr3;
                }
            } else {
                return;
            }
        } while (!AbstractC17300An1.m69050a(this.f66215b, publishSubscriptionArr, publishSubscriptionArr2));
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        if (this.f66215b.get() == f66213d) {
            return this.f66216c;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        if (this.f66215b.get() == f66213d && this.f66216c == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        if (((PublishSubscription[]) this.f66215b.get()).length != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        if (this.f66215b.get() == f66213d && this.f66216c != null) {
            return true;
        }
        return false;
    }

    public boolean offer(T t) {
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        PublishSubscription[] publishSubscriptionArr = (PublishSubscription[]) this.f66215b.get();
        for (PublishSubscription publishSubscription : publishSubscriptionArr) {
            if (publishSubscription.isFull()) {
                return false;
            }
        }
        for (PublishSubscription publishSubscription2 : publishSubscriptionArr) {
            publishSubscription2.onNext(t);
        }
        return true;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        Object obj = this.f66215b.get();
        Object obj2 = f66213d;
        if (obj == obj2) {
            return;
        }
        for (PublishSubscription publishSubscription : (PublishSubscription[]) this.f66215b.getAndSet(obj2)) {
            publishSubscription.onComplete();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.f66215b.get();
        Object obj2 = f66213d;
        if (obj == obj2) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f66216c = th2;
        for (PublishSubscription publishSubscription : (PublishSubscription[]) this.f66215b.getAndSet(obj2)) {
            publishSubscription.onError(th2);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishSubscription publishSubscription : (PublishSubscription[]) this.f66215b.get()) {
            publishSubscription.onNext(t);
        }
    }

    @Override // org.reactivestreams.Subscriber, io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription) {
        if (this.f66215b.get() == f66213d) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        PublishSubscription publishSubscription = new PublishSubscription(subscriber, this);
        subscriber.onSubscribe(publishSubscription);
        if (m29860e(publishSubscription)) {
            if (publishSubscription.isCancelled()) {
                m29859f(publishSubscription);
                return;
            }
            return;
        }
        Throwable th2 = this.f66216c;
        if (th2 != null) {
            subscriber.onError(th2);
        } else {
            subscriber.onComplete();
        }
    }
}
