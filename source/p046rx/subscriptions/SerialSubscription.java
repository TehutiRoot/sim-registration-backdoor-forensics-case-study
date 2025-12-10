package p046rx.subscriptions;

import p046rx.Subscription;
import p046rx.internal.subscriptions.SequentialSubscription;

/* renamed from: rx.subscriptions.SerialSubscription */
/* loaded from: classes7.dex */
public final class SerialSubscription implements Subscription {

    /* renamed from: a */
    public final SequentialSubscription f79519a = new SequentialSubscription();

    public Subscription get() {
        return this.f79519a.current();
    }

    @Override // p046rx.Subscription
    public boolean isUnsubscribed() {
        return this.f79519a.isUnsubscribed();
    }

    public void set(Subscription subscription) {
        if (subscription != null) {
            this.f79519a.update(subscription);
            return;
        }
        throw new IllegalArgumentException("Subscription can not be null");
    }

    @Override // p046rx.Subscription
    public void unsubscribe() {
        this.f79519a.unsubscribe();
    }
}
