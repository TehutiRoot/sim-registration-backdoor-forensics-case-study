package org.apache.http.impl.auth;

import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes6.dex */
public class NegotiateSchemeFactory implements AuthSchemeFactory {

    /* renamed from: a */
    public final SpnegoTokenGenerator f74073a;

    /* renamed from: b */
    public final boolean f74074b;

    public NegotiateSchemeFactory(SpnegoTokenGenerator spnegoTokenGenerator, boolean z) {
        this.f74073a = spnegoTokenGenerator;
        this.f74074b = z;
    }

    public SpnegoTokenGenerator getSpengoGenerator() {
        return this.f74073a;
    }

    public boolean isStripPort() {
        return this.f74074b;
    }

    @Override // org.apache.http.auth.AuthSchemeFactory
    public AuthScheme newInstance(HttpParams httpParams) {
        return new NegotiateScheme(this.f74073a, this.f74074b);
    }

    public NegotiateSchemeFactory(SpnegoTokenGenerator spnegoTokenGenerator) {
        this(spnegoTokenGenerator, false);
    }

    public NegotiateSchemeFactory() {
        this(null, false);
    }
}