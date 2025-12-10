package org.bouncycastle.crypto.p036io;

import java.io.IOException;

/* renamed from: org.bouncycastle.crypto.io.CipherIOException */
/* loaded from: classes6.dex */
public class CipherIOException extends IOException {
    private static final long serialVersionUID = 1;
    private final Throwable cause;

    public CipherIOException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
