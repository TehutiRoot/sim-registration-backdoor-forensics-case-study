package p046rx.internal.subscriptions;

import p046rx.Subscription;

/* renamed from: rx.internal.subscriptions.Unsubscribed */
/* loaded from: classes7.dex */
public enum Unsubscribed implements Subscription {
    INSTANCE;

    @Override // p046rx.Subscription
    public boolean isUnsubscribed() {
        return true;
    }

    @Override // p046rx.Subscription
    public void unsubscribe() {
    }
}
