package com.mixpanel.android.java_websocket.exceptions;

/* loaded from: classes5.dex */
public class InvalidDataException extends Exception {
    private static final long serialVersionUID = 3731842424390998726L;
    private int closecode;

    public InvalidDataException(int i) {
        this.closecode = i;
    }

    public int getCloseCode() {
        return this.closecode;
    }

    public InvalidDataException(int i, String str) {
        super(str);
        this.closecode = i;
    }

    public InvalidDataException(int i, Throwable th2) {
        super(th2);
        this.closecode = i;
    }

    public InvalidDataException(int i, String str, Throwable th2) {
        super(str, th2);
        this.closecode = i;
    }
}
