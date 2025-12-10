package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.Obsolete;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
@Obsolete
/* loaded from: classes6.dex */
public class RFC2109SpecProvider implements CookieSpecProvider {

    /* renamed from: a */
    public final PublicSuffixMatcher f74460a;

    /* renamed from: b */
    public final boolean f74461b;

    /* renamed from: c */
    public volatile CookieSpec f74462c;

    public RFC2109SpecProvider(PublicSuffixMatcher publicSuffixMatcher, boolean z) {
        this.f74461b = z;
        this.f74460a = publicSuffixMatcher;
    }

    @Override // org.apache.http.cookie.CookieSpecProvider
    public CookieSpec create(HttpContext httpContext) {
        if (this.f74462c == null) {
            synchronized (this) {
                try {
                    if (this.f74462c == null) {
                        this.f74462c = new RFC2109Spec(this.f74461b, new RFC2109VersionHandler(), new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new RFC2109DomainHandler(), this.f74460a), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicCommentHandler());
                    }
                } finally {
                }
            }
        }
        return this.f74462c;
    }

    public RFC2109SpecProvider(PublicSuffixMatcher publicSuffixMatcher) {
        this(publicSuffixMatcher, false);
    }

    public RFC2109SpecProvider() {
        this(null, false);
    }
}