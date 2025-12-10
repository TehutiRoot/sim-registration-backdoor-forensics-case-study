package org.apache.http.conn.ssl;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: classes6.dex */
public final class PrivateKeyDetails {

    /* renamed from: a */
    public final String f73830a;

    /* renamed from: b */
    public final X509Certificate[] f73831b;

    public PrivateKeyDetails(String str, X509Certificate[] x509CertificateArr) {
        this.f73830a = (String) Args.notNull(str, "Private key type");
        this.f73831b = x509CertificateArr;
    }

    public X509Certificate[] getCertChain() {
        return this.f73831b;
    }

    public String getType() {
        return this.f73830a;
    }

    public String toString() {
        return this.f73830a + ':' + Arrays.toString(this.f73831b);
    }
}
