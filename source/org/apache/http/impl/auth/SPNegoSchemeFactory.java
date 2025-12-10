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
    public final boolean f73991a;

    /* renamed from: b */
    public final boolean f73992b;

    public SPNegoSchemeFactory(boolean z, boolean z2) {
        this.f73991a = z;
        this.f73992b = z2;
    }

    @Override // org.apache.http.auth.AuthSchemeProvider
    public AuthScheme create(HttpContext httpContext) {
        return new SPNegoScheme(this.f73991a, this.f73992b);
    }

    public boolean isStripPort() {
        return this.f73991a;
    }

    public boolean isUseCanonicalHostname() {
        return this.f73992b;
    }

    @Override // org.apache.http.auth.AuthSchemeFactory
    public AuthScheme newInstance(HttpParams httpParams) {
        return new SPNegoScheme(this.f73991a, this.f73992b);
    }

    public SPNegoSchemeFactory(boolean z) {
        this.f73991a = z;
        this.f73992b = true;
    }

    public SPNegoSchemeFactory() {
        this(true, true);
    }
}
