package io.realm.mongodb.sync;

/* loaded from: classes5.dex */
public enum SubscriptionSet$State {
    UNCOMMITTED((byte) 0),
    PENDING((byte) 1),
    BOOTSTRAPPING((byte) 2),
    COMPLETE((byte) 3),
    ERROR((byte) 4),
    SUPERSEDED((byte) 5),
    AWAITING_MARK((byte) 6);
    
    private final byte value;

    SubscriptionSet$State(byte b) {
        this.value = b;
    }

    public static SubscriptionSet$State fromNativeValue(long j) {
        SubscriptionSet$State[] values;
        for (SubscriptionSet$State subscriptionSet$State : values()) {
            if (subscriptionSet$State.value == j) {
                return subscriptionSet$State;
            }
        }
        throw new IllegalArgumentException("Unknown SubscriptionSetState code: " + j);
    }
}
