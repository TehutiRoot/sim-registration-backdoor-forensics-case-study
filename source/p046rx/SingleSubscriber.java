package p046rx;

import p046rx.internal.util.SubscriptionList;

/* renamed from: rx.SingleSubscriber */
/* loaded from: classes5.dex */
public abstract class SingleSubscriber<T> implements Subscription {

    /* renamed from: a */
    public final SubscriptionList f77698a = new SubscriptionList();

    public final void add(Subscription subscription) {
        this.f77698a.add(subscription);
    }

    @Override // p046rx.Subscription
    public final boolean isUnsubscribed() {
        return this.f77698a.isUnsubscribed();
    }

    public abstract void onError(Throwable th2);

    public abstract void onSuccess(T t);

    @Override // p046rx.Subscription
    public final void unsubscribe() {
        this.f77698a.unsubscribe();
    }
}
