package io.realm.mongodb.sync;

import io.realm.internal.Keep;

@Keep
/* loaded from: classes5.dex */
public interface SubscriptionSet$StateChangeCallback {
    void onError(Throwable th2);

    void onStateChange(SubscriptionSet subscriptionSet);
}
