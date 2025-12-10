package org.apache.http.ssl;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public final class PrivateKeyDetails {

    /* renamed from: a */
    public final String f74630a;

    /* renamed from: b */
    public final X509Certificate[] f74631b;

    public PrivateKeyDetails(String str, X509Certificate[] x509CertificateArr) {
        this.f74630a = (String) Args.notNull(str, "Private key type");
        this.f74631b = x509CertificateArr;
    }

    public X509Certificate[] getCertChain() {
        return this.f74631b;
    }

    public String getType() {
        return this.f74630a;
    }

    public String toString() {
        return this.f74630a + ':' + Arrays.toString(this.f74631b);
    }
}
