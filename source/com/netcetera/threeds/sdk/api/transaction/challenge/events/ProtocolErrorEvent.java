package com.netcetera.threeds.sdk.api.transaction.challenge.events;

import ch.qos.logback.core.CoreConstants;
import com.netcetera.threeds.sdk.api.transaction.challenge.ErrorMessage;

/* loaded from: classes5.dex */
public class ProtocolErrorEvent {
    private static int ThreeDS2Service = 0;
    private static int get = 1;
    private ErrorMessage ThreeDS2ServiceInstance;
    private String valueOf;

    public ProtocolErrorEvent(String str, ErrorMessage errorMessage) {
        this.valueOf = str;
        this.ThreeDS2ServiceInstance = errorMessage;
    }

    public ErrorMessage getErrorMessage() {
        int i = (ThreeDS2Service + 79) % 128;
        get = i;
        ErrorMessage errorMessage = this.ThreeDS2ServiceInstance;
        ThreeDS2Service = (i + 117) % 128;
        return errorMessage;
    }

    public String getSDKTransactionID() {
        int i = ThreeDS2Service;
        int i2 = i + 19;
        get = i2 % 128;
        if (i2 % 2 != 0) {
            String str = this.valueOf;
            get = (i + 63) % 128;
            return str;
        }
        throw null;
    }

    public String toString() {
        String str = "ProtocolErrorEvent{sdkTransactionID='" + this.valueOf + CoreConstants.SINGLE_QUOTE_CHAR + ", errorMessage=" + this.ThreeDS2ServiceInstance + '}';
        ThreeDS2Service = (get + 59) % 128;
        return str;
    }
}
