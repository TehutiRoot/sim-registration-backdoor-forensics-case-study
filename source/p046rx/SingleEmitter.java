package p046rx;

import p046rx.functions.Cancellable;

/* renamed from: rx.SingleEmitter */
/* loaded from: classes5.dex */
public interface SingleEmitter<T> {
    void onError(Throwable th2);

    void onSuccess(T t);

    void setCancellation(Cancellable cancellable);

    void setSubscription(Subscription subscription);
}
