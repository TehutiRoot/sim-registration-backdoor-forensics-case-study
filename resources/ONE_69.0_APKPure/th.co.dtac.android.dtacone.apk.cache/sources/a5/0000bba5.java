package com.netcetera.threeds.sdk.infrastructure;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class encryptionPublicKeyFromAssetCertificate implements getMessageVersion {
    private final InterfaceC9641ns values = C9642nt.ThreeDS2ServiceInstance(encryptionPublicKeyFromAssetCertificate.class);
    private Map<Class, getSDKEphemeralPublicKey> ThreeDS2ServiceInstance = new HashMap();

    public final <T> void get(Class<T> cls, getSDKEphemeralPublicKey<? extends T> getsdkephemeralpublickey) {
        this.ThreeDS2ServiceInstance.put(cls, getsdkephemeralpublickey);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getMessageVersion
    public final <T> T values(Class<T> cls) {
        getSDKEphemeralPublicKey getsdkephemeralpublickey = this.ThreeDS2ServiceInstance.get(cls);
        if (getsdkephemeralpublickey != null) {
            return (T) getsdkephemeralpublickey.ThreeDS2Service();
        }
        cls.getSimpleName();
        return null;
    }
}