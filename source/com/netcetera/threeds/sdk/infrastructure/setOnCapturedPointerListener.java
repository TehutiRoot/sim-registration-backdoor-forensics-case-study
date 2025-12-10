package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setOnCapturedPointerListener {
    private static int ThreeDS2Service = 1;
    private static int values;
    private final setPaddingRelative ThreeDS2ServiceInstance;

    public setOnCapturedPointerListener(setPaddingRelative setpaddingrelative) {
        this.ThreeDS2ServiceInstance = setpaddingrelative;
    }

    public com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent values(setId setid) {
        com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent = new com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent(Integer.toString(setid.ThreeDS2Service().get()), this.ThreeDS2ServiceInstance.get(setid));
        int i = values;
        int i2 = i & 45;
        int i3 = -(-((i ^ 45) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return runtimeErrorEvent;
    }
}
