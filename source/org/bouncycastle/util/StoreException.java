package org.bouncycastle.util;

/* loaded from: classes6.dex */
public class StoreException extends RuntimeException {

    /* renamed from: _e */
    private Throwable f75600_e;

    public StoreException(String str, Throwable th2) {
        super(str);
        this.f75600_e = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f75600_e;
    }
}
