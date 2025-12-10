package com.netcetera.threeds.sdk.api.transaction.challenge.events;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public class RuntimeErrorEvent {
    private static int ThreeDS2ServiceInstance = 1;
    private static int valueOf;
    private String ThreeDS2Service;
    private String get;

    public RuntimeErrorEvent(String str, String str2) {
        this.get = str;
        this.ThreeDS2Service = str2;
    }

    public String getErrorCode() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i + 51;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            String str = this.get;
            int i3 = i + 7;
            valueOf = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }

    public String getErrorMessage() {
        int i = valueOf + 21;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            int i2 = 7 / 0;
            return this.ThreeDS2Service;
        }
        return this.ThreeDS2Service;
    }

    public String toString() {
        String str = "RuntimeErrorEvent{errorCode='" + this.get + CoreConstants.SINGLE_QUOTE_CHAR + ", errorMessage='" + this.ThreeDS2Service + CoreConstants.SINGLE_QUOTE_CHAR + '}';
        int i = valueOf + 67;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            return str;
        }
        throw null;
    }
}