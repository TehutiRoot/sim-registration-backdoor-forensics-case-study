package org.bouncycastle.util;

/* loaded from: classes6.dex */
public class StreamParsingException extends Exception {

    /* renamed from: _e */
    Throwable f75685_e;

    public StreamParsingException(String str, Throwable th2) {
        super(str);
        this.f75685_e = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f75685_e;
    }
}