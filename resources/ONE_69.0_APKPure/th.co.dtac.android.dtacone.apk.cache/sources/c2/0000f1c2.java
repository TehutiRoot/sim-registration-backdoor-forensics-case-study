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
    public final boolean f74027a;

    /* renamed from: b */
    public final boolean f74028b;

    public KerberosSchemeFactory(boolean z, boolean z2) {
        this.f74027a = z;
        this.f74028b = z2;
    }

    @Override // org.apache.http.auth.AuthSchemeProvider
    public AuthScheme create(HttpContext httpContext) {
        return new KerberosScheme(this.f74027a, this.f74028b);
    }

    public boolean isStripPort() {
        return this.f74027a;
    }

    public boolean isUseCanonicalHostname() {
        return this.f74028b;
    }

    @Override // org.apache.http.auth.AuthSchemeFactory
    public AuthScheme newInstance(HttpParams httpParams) {
        return new KerberosScheme(this.f74027a, this.f74028b);
    }

    public KerberosSchemeFactory(boolean z) {
        this.f74027a = z;
        this.f74028b = true;
    }

    public KerberosSchemeFactory() {
        this(true, true);
    }
}