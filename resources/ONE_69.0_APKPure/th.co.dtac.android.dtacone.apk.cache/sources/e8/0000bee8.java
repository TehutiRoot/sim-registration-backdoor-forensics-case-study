package com.netcetera.threeds.sdk.infrastructure;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class setPointerIcon {
    private static int ThreeDS2Service = 1;
    private static final Map<setForegroundGravity, entrySet> ThreeDS2ServiceInstance;
    private static int get;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(setForegroundGravity.getSDKTransactionID, entrySet.ThreeDS2ServiceInstance);
        hashMap.put(setForegroundGravity.getSDKReferenceNumber, entrySet.values);
        hashMap.put(setForegroundGravity.getMessageVersion, entrySet.get);
        hashMap.put(setForegroundGravity.getAuthenticationRequestParameters, entrySet.valueOf);
        hashMap.put(setForegroundGravity.useBridgingExtension, entrySet.cleanup);
        hashMap.put(setForegroundGravity.doChallenge, entrySet.getSDKVersion);
        hashMap.put(setForegroundGravity.Transaction, entrySet.getSDKInfo);
        hashMap.put(setForegroundGravity.Transaction$BridgingMessageExtensionVersion, entrySet.initialize);
        hashMap.put(setForegroundGravity.set3DSServerTransactionID, entrySet.ThreeDS2Service$InitializationCallback);
        ThreeDS2ServiceInstance = Collections.unmodifiableMap(hashMap);
        int i = ThreeDS2Service;
        int i2 = i & 103;
        int i3 = (i | 103) & (~i2);
        int i4 = i2 << 1;
        get = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
    }

    public entrySet valueOf(setForegroundGravity setforegroundgravity) {
        int i = get;
        int i2 = i & 87;
        int i3 = -(-((i ^ 87) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        ThreeDS2Service = i4 % 128;
        int i5 = i4 % 2;
        entrySet entryset = ThreeDS2ServiceInstance.get(setforegroundgravity);
        if (i5 != 0) {
            return entryset;
        }
        throw null;
    }
}