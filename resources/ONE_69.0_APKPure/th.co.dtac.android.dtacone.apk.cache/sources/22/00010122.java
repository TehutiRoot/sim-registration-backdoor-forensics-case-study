package org.bouncycastle.x509;

import java.security.cert.CertificateEncodingException;

/* loaded from: classes6.dex */
class ExtCertificateEncodingException extends CertificateEncodingException {
    Throwable cause;

    public ExtCertificateEncodingException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}