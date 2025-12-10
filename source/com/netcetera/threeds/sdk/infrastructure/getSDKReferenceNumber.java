package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public final class getSDKReferenceNumber {

    /* loaded from: classes5.dex */
    public static final class get<T> implements getSDKEphemeralPublicKey<T> {
        private final AbstractC9616ne<T> get;

        public get(final getSDKEphemeralPublicKey<T> getsdkephemeralpublickey) {
            this.get = new AbstractC9616ne<T>() { // from class: com.netcetera.threeds.sdk.infrastructure.getSDKReferenceNumber.get.1
                @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9616ne
                public T ThreeDS2Service() {
                    return (T) getsdkephemeralpublickey.ThreeDS2Service();
                }
            };
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.getSDKEphemeralPublicKey
        public T ThreeDS2Service() {
            return this.get.ThreeDS2ServiceInstance();
        }
    }

    public static <T> getSDKEphemeralPublicKey<T> values(getSDKEphemeralPublicKey<T> getsdkephemeralpublickey) {
        return new get(getsdkephemeralpublickey);
    }
}
