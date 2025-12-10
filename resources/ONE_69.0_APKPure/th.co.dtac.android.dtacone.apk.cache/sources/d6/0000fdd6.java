package org.bouncycastle.jce.provider;

import org.bouncycastle.jce.exception.ExtException;

/* loaded from: classes6.dex */
public class AnnotatedException extends Exception implements ExtException {
    private Throwable _underlyingException;

    public AnnotatedException(String str) {
        this(str, null);
    }

    @Override // java.lang.Throwable, org.bouncycastle.jce.exception.ExtException
    public Throwable getCause() {
        return this._underlyingException;
    }

    public Throwable getUnderlyingException() {
        return this._underlyingException;
    }

    public AnnotatedException(String str, Throwable th2) {
        super(str);
        this._underlyingException = th2;
    }
}