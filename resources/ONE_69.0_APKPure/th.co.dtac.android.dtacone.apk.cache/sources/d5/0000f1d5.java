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
public class SPNegoSchemeFactory implements AuthSchemeFactory, AuthSchemeProvider {

    /* renamed from: a */
    public final boolean f74075a;

    /* renamed from: b */
    public final boolean f74076b;

    public SPNegoSchemeFactory(boolean z, boolean z2) {
        this.f74075a = z;
        this.f74076b = z2;
    }

    @Override // org.apache.http.auth.AuthSchemeProvider
    public AuthScheme create(HttpContext httpContext) {
        return new SPNegoScheme(this.f74075a, this.f74076b);
    }

    public boolean isStripPort() {
        return this.f74075a;
    }

    public boolean isUseCanonicalHostname() {
        return this.f74076b;
    }

    @Override // org.apache.http.auth.AuthSchemeFactory
    public AuthScheme newInstance(HttpParams httpParams) {
        return new SPNegoScheme(this.f74075a, this.f74076b);
    }

    public SPNegoSchemeFactory(boolean z) {
        this.f74075a = z;
        this.f74076b = true;
    }

    public SPNegoSchemeFactory() {
        this(true, true);
    }
}