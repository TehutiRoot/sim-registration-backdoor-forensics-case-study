package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {

    /* renamed from: a */
    public final AtomicReference f66451a = new AtomicReference();

    public final void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.cancel(this.f66451a);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        if (this.f66451a.get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    public void onStart() {
        ((Subscription) this.f66451a.get()).request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription) {
        if (EndConsumerHelper.setOnce(this.f66451a, subscription, getClass())) {
            onStart();
        }
    }

    public final void request(long j) {
        ((Subscription) this.f66451a.get()).request(j);
    }
}
