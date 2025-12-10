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
public class RFC2965SpecProvider implements CookieSpecProvider {

    /* renamed from: a */
    public final PublicSuffixMatcher f74380a;

    /* renamed from: b */
    public final boolean f74381b;

    /* renamed from: c */
    public volatile CookieSpec f74382c;

    public RFC2965SpecProvider(PublicSuffixMatcher publicSuffixMatcher, boolean z) {
        this.f74381b = z;
        this.f74380a = publicSuffixMatcher;
    }

    @Override // org.apache.http.cookie.CookieSpecProvider
    public CookieSpec create(HttpContext httpContext) {
        if (this.f74382c == null) {
            synchronized (this) {
                try {
                    if (this.f74382c == null) {
                        this.f74382c = new RFC2965Spec(this.f74381b, new RFC2965VersionAttributeHandler(), new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new RFC2965DomainAttributeHandler(), this.f74380a), new RFC2965PortAttributeHandler(), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicCommentHandler(), new RFC2965CommentUrlAttributeHandler(), new RFC2965DiscardAttributeHandler());
                    }
                } finally {
                }
            }
        }
        return this.f74382c;
    }

    public RFC2965SpecProvider(PublicSuffixMatcher publicSuffixMatcher) {
        this(publicSuffixMatcher, false);
    }

    public RFC2965SpecProvider() {
        this(null, false);
    }
}
