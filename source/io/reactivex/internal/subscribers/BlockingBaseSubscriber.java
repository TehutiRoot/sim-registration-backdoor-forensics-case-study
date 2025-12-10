package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public abstract class BlockingBaseSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T> {

    /* renamed from: a */
    public Object f66108a;

    /* renamed from: b */
    public Throwable f66109b;

    /* renamed from: c */
    public Subscription f66110c;

    /* renamed from: d */
    public volatile boolean f66111d;

    public BlockingBaseSubscriber() {
        super(1);
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                Subscription subscription = this.f66110c;
                this.f66110c = SubscriptionHelper.CANCELLED;
                if (subscription != null) {
                    subscription.cancel();
                }
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }
        Throwable th2 = this.f66109b;
        if (th2 == null) {
            return (T) this.f66108a;
        }
        throw ExceptionHelper.wrapOrThrow(th2);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f66110c, subscription)) {
            this.f66110c = subscription;
            if (!this.f66111d) {
                subscription.request(Long.MAX_VALUE);
                if (this.f66111d) {
                    this.f66110c = SubscriptionHelper.CANCELLED;
                    subscription.cancel();
                }
            }
        }
    }
}
