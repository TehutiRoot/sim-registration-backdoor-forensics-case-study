package p046rx;

import p046rx.functions.Cancellable;

/* renamed from: rx.CompletableEmitter */
/* loaded from: classes5.dex */
public interface CompletableEmitter {
    void onCompleted();

    void onError(Throwable th2);

    void setCancellation(Cancellable cancellable);

    void setSubscription(Subscription subscription);
}