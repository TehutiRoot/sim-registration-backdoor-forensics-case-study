package org.apache.http.impl.auth;

import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes6.dex */
public class NegotiateSchemeFactory implements AuthSchemeFactory {

    /* renamed from: a */
    public final SpnegoTokenGenerator f73989a;

    /* renamed from: b */
    public final boolean f73990b;

    public NegotiateSchemeFactory(SpnegoTokenGenerator spnegoTokenGenerator, boolean z) {
        this.f73989a = spnegoTokenGenerator;
        this.f73990b = z;
    }

    public SpnegoTokenGenerator getSpengoGenerator() {
        return this.f73989a;
    }

    public boolean isStripPort() {
        return this.f73990b;
    }

    @Override // org.apache.http.auth.AuthSchemeFactory
    public AuthScheme newInstance(HttpParams httpParams) {
        return new NegotiateScheme(this.f73989a, this.f73990b);
    }

    public NegotiateSchemeFactory(SpnegoTokenGenerator spnegoTokenGenerator) {
        this(spnegoTokenGenerator, false);
    }

    public NegotiateSchemeFactory() {
        this(null, false);
    }
}
