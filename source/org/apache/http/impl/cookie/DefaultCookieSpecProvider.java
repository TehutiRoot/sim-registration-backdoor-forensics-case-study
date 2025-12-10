package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class DefaultCookieSpecProvider implements CookieSpecProvider {

    /* renamed from: a */
    public final CompatibilityLevel f74343a;

    /* renamed from: b */
    public final PublicSuffixMatcher f74344b;

    /* renamed from: c */
    public final String[] f74345c;

    /* renamed from: d */
    public final boolean f74346d;

    /* renamed from: e */
    public volatile CookieSpec f74347e;

    /* loaded from: classes6.dex */
    public enum CompatibilityLevel {
        DEFAULT,
        IE_MEDIUM_SECURITY
    }

    /* renamed from: org.apache.http.impl.cookie.DefaultCookieSpecProvider$a */
    /* loaded from: classes6.dex */
    public class C12604a extends BasicPathHandler {
        public C12604a() {
        }

        @Override // org.apache.http.impl.cookie.BasicPathHandler, org.apache.http.cookie.CookieAttributeHandler
        public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        }
    }

    public DefaultCookieSpecProvider(CompatibilityLevel compatibilityLevel, PublicSuffixMatcher publicSuffixMatcher, String[] strArr, boolean z) {
        this.f74343a = compatibilityLevel == null ? CompatibilityLevel.DEFAULT : compatibilityLevel;
        this.f74344b = publicSuffixMatcher;
        this.f74345c = strArr;
        this.f74346d = z;
    }

    @Override // org.apache.http.cookie.CookieSpecProvider
    public CookieSpec create(HttpContext httpContext) {
        CommonCookieAttributeHandler basicPathHandler;
        String[] strArr;
        if (this.f74347e == null) {
            synchronized (this) {
                try {
                    if (this.f74347e == null) {
                        RFC2965Spec rFC2965Spec = new RFC2965Spec(this.f74346d, new RFC2965VersionAttributeHandler(), new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new RFC2965DomainAttributeHandler(), this.f74344b), new RFC2965PortAttributeHandler(), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicCommentHandler(), new RFC2965CommentUrlAttributeHandler(), new RFC2965DiscardAttributeHandler());
                        RFC2109Spec rFC2109Spec = new RFC2109Spec(this.f74346d, new RFC2109VersionHandler(), new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new RFC2109DomainHandler(), this.f74344b), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicCommentHandler());
                        CommonCookieAttributeHandler decorate = PublicSuffixDomainFilter.decorate(new BasicDomainHandler(), this.f74344b);
                        if (this.f74343a == CompatibilityLevel.IE_MEDIUM_SECURITY) {
                            basicPathHandler = new C12604a();
                        } else {
                            basicPathHandler = new BasicPathHandler();
                        }
                        BasicSecureHandler basicSecureHandler = new BasicSecureHandler();
                        BasicCommentHandler basicCommentHandler = new BasicCommentHandler();
                        String[] strArr2 = this.f74345c;
                        if (strArr2 != null) {
                            strArr = (String[]) strArr2.clone();
                        } else {
                            strArr = new String[]{"EEE, dd-MMM-yy HH:mm:ss z"};
                        }
                        this.f74347e = new DefaultCookieSpec(rFC2965Spec, rFC2109Spec, new NetscapeDraftSpec(decorate, basicPathHandler, basicSecureHandler, basicCommentHandler, new BasicExpiresHandler(strArr)));
                    }
                } finally {
                }
            }
        }
        return this.f74347e;
    }

    public DefaultCookieSpecProvider(CompatibilityLevel compatibilityLevel, PublicSuffixMatcher publicSuffixMatcher) {
        this(compatibilityLevel, publicSuffixMatcher, null, false);
    }

    public DefaultCookieSpecProvider(PublicSuffixMatcher publicSuffixMatcher) {
        this(CompatibilityLevel.DEFAULT, publicSuffixMatcher, null, false);
    }

    public DefaultCookieSpecProvider() {
        this(CompatibilityLevel.DEFAULT, null, null, false);
    }
}
