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
    public final PublicSuffixMatcher f74376a;

    /* renamed from: b */
    public final boolean f74377b;

    /* renamed from: c */
    public volatile CookieSpec f74378c;

    public RFC2109SpecProvider(PublicSuffixMatcher publicSuffixMatcher, boolean z) {
        this.f74377b = z;
        this.f74376a = publicSuffixMatcher;
    }

    @Override // org.apache.http.cookie.CookieSpecProvider
    public CookieSpec create(HttpContext httpContext) {
        if (this.f74378c == null) {
            synchronized (this) {
                try {
                    if (this.f74378c == null) {
                        this.f74378c = new RFC2109Spec(this.f74377b, new RFC2109VersionHandler(), new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new RFC2109DomainHandler(), this.f74376a), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicCommentHandler());
                    }
                } finally {
                }
            }
        }
        return this.f74378c;
    }

    public RFC2109SpecProvider(PublicSuffixMatcher publicSuffixMatcher) {
        this(publicSuffixMatcher, false);
    }

    public RFC2109SpecProvider() {
        this(null, false);
    }
}
