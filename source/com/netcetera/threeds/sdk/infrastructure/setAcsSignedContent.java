package com.netcetera.threeds.sdk.infrastructure;

import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class setAcsSignedContent implements ChallengeParameters {
    private static int valueOf = 1;
    private static int values;
    private final Map<String, getTransactionStatus> ThreeDS2Service;

    public setAcsSignedContent(Map<String, getTransactionStatus> map) {
        this.ThreeDS2Service = map;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ChallengeParameters
    public getTransactionStatus ThreeDS2Service(String str, String str2) throws setId {
        valueOf = ((-2) - (~(values + 58))) % 128;
        getTransactionStatus gettransactionstatus = this.ThreeDS2Service.get(str);
        if (gettransactionstatus == null) {
            int i = valueOf;
            int i2 = i & 19;
            int i3 = (i ^ 19) | i2;
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            values = i4 % 128;
            if (i4 % 2 != 0) {
                setForegroundGravity setforegroundgravity = setForegroundGravity.SDKNotInitializedException;
                Object[] objArr = new Object[1];
                objArr[1] = str;
                throw setforegroundgravity.valueOf(objArr);
            }
            throw setForegroundGravity.SDKNotInitializedException.valueOf(str);
        }
        int i5 = values;
        int i6 = i5 & 109;
        int i7 = -(-((i5 ^ 109) | i6));
        valueOf = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
        return gettransactionstatus;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ChallengeParameters
    public Set<String> ThreeDS2ServiceInstance(String str) {
        int i = valueOf;
        int i2 = i | 97;
        values = (((i2 << 1) - (~(-((~(i & 97)) & i2)))) - 1) % 128;
        Set<String> keySet = this.ThreeDS2Service.keySet();
        int i3 = values;
        int i4 = i3 | 77;
        int i5 = (i4 << 1) - ((~(i3 & 77)) & i4);
        valueOf = i5 % 128;
        if (i5 % 2 != 0) {
            return keySet;
        }
        throw null;
    }
}
