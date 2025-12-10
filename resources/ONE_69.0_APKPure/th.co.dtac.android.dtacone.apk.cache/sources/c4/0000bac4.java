package com.netcetera.threeds.sdk.api.transaction.challenge.events;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public class CompletionEvent {
    private static int ThreeDS2Service = 1;
    private static int valueOf;
    private String ThreeDS2ServiceInstance;
    private String values;

    public CompletionEvent(String str, String str2) {
        this.values = str;
        this.ThreeDS2ServiceInstance = str2;
    }

    public String getSDKTransactionID() {
        int i = (valueOf + 45) % 128;
        ThreeDS2Service = i;
        String str = this.values;
        valueOf = (i + 121) % 128;
        return str;
    }

    public String getTransactionStatus() {
        int i = valueOf;
        String str = this.ThreeDS2ServiceInstance;
        int i2 = i + 15;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String toString() {
        String str = "CompletionEvent{sdkTransactionID='" + this.values + CoreConstants.SINGLE_QUOTE_CHAR + "\n, transactionStatus='" + this.ThreeDS2ServiceInstance + CoreConstants.SINGLE_QUOTE_CHAR + '}';
        valueOf = (ThreeDS2Service + 101) % 128;
        return str;
    }
}