package com.mixpanel.android.java_websocket.exceptions;

/* loaded from: classes5.dex */
public class NotSendableException extends RuntimeException {
    private static final long serialVersionUID = -6468967874576651628L;

    public NotSendableException() {
    }

    public NotSendableException(String str) {
        super(str);
    }

    public NotSendableException(Throwable th2) {
        super(th2);
    }

    public NotSendableException(String str, Throwable th2) {
        super(str, th2);
    }
}