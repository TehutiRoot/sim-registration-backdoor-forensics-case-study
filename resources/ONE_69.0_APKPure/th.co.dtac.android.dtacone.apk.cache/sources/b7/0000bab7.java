package com.netcetera.threeds.sdk.api.exceptions;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public class SDKRuntimeException extends RuntimeException {
    private static int ThreeDS2Service = 1;
    private static int values;
    private final String get;

    public SDKRuntimeException(String str, String str2) {
        this(str, str2, null);
    }

    public String getErrorCode() {
        int i = values;
        String str = this.get;
        ThreeDS2Service = (i + 41) % 128;
        return str;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str = "SDKRuntimeException{" + super.toString() + "message='" + getMessage() + CoreConstants.SINGLE_QUOTE_CHAR + "errorCode='" + this.get + CoreConstants.SINGLE_QUOTE_CHAR + '}';
        int i = ThreeDS2Service + 13;
        values = i % 128;
        if (i % 2 == 0) {
            return str;
        }
        throw null;
    }

    public SDKRuntimeException(String str, String str2, Throwable th2) {
        super(str, th2);
        this.get = str2;
    }
}