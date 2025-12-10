package org.apache.http.impl.auth;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class KerberosSchemeFactory implements AuthSchemeFactory, AuthSchemeProvider {

    /* renamed from: a */
    public final boolean f73943a;

    /* renamed from: b */
    public final boolean f73944b;

    public KerberosSchemeFactory(boolean z, boolean z2) {
        this.f73943a = z;
        this.f73944b = z2;
    }

    @Override // org.apache.http.auth.AuthSchemeProvider
    public AuthScheme create(HttpContext httpContext) {
        return new KerberosScheme(this.f73943a, this.f73944b);
    }

    public boolean isStripPort() {
        return this.f73943a;
    }

    public boolean isUseCanonicalHostname() {
        return this.f73944b;
    }

    @Override // org.apache.http.auth.AuthSchemeFactory
    public AuthScheme newInstance(HttpParams httpParams) {
        return new KerberosScheme(this.f73943a, this.f73944b);
    }

    public KerberosSchemeFactory(boolean z) {
        this.f73943a = z;
        this.f73944b = true;
    }

    public KerberosSchemeFactory() {
        this(true, true);
    }
}
