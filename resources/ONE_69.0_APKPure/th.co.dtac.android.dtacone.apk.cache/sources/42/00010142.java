package org.bouncycastle.x509.util;

/* loaded from: classes6.dex */
public class StreamParsingException extends Exception {

    /* renamed from: _e */
    Throwable f75687_e;

    public StreamParsingException(String str, Throwable th2) {
        super(str);
        this.f75687_e = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f75687_e;
    }
}