package com.mixpanel.android.java_websocket.exceptions;

/* loaded from: classes5.dex */
public class InvalidFrameException extends InvalidDataException {
    private static final long serialVersionUID = -9016496369828887591L;

    public InvalidFrameException() {
        super(1002);
    }

    public InvalidFrameException(String str) {
        super(1002, str);
    }

    public InvalidFrameException(Throwable th2) {
        super(1002, th2);
    }

    public InvalidFrameException(String str, Throwable th2) {
        super(1002, str, th2);
    }
}
