package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes6.dex */
public class RFC6265CookieSpecProvider implements CookieSpecProvider {

    /* renamed from: a */
    public final CompatibilityLevel f74389a;

    /* renamed from: b */
    public final PublicSuffixMatcher f74390b;

    /* renamed from: c */
    public volatile CookieSpec f74391c;

    /* loaded from: classes6.dex */
    public enum CompatibilityLevel {
        STRICT,
        RELAXED,
        IE_MEDIUM_SECURITY
    }

    /* renamed from: org.apache.http.impl.cookie.RFC6265CookieSpecProvider$a */
    /* loaded from: classes6.dex */
    public class C12607a extends BasicPathHandler {
        public C12607a() {
        }

        @Override // org.apache.http.impl.cookie.BasicPathHandler, org.apache.http.cookie.CookieAttributeHandler
        public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        }
    }

    /* renamed from: org.apache.http.impl.cookie.RFC6265CookieSpecProvider$b */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12608b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74393a;

        static {
            int[] iArr = new int[CompatibilityLevel.values().length];
            f74393a = iArr;
            try {
                iArr[CompatibilityLevel.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74393a[CompatibilityLevel.IE_MEDIUM_SECURITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RFC6265CookieSpecProvider(CompatibilityLevel compatibilityLevel, PublicSuffixMatcher publicSuffixMatcher) {
        this.f74389a = compatibilityLevel == null ? CompatibilityLevel.RELAXED : compatibilityLevel;
        this.f74390b = publicSuffixMatcher;
    }

    @Override // org.apache.http.cookie.CookieSpecProvider
    public CookieSpec create(HttpContext httpContext) {
        if (this.f74391c == null) {
            synchronized (this) {
                try {
                    if (this.f74391c == null) {
                        int i = C12608b.f74393a[this.f74389a.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                this.f74391c = new RFC6265LaxSpec(new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new BasicDomainHandler(), this.f74390b), new LaxMaxAgeHandler(), new BasicSecureHandler(), new LaxExpiresHandler());
                            } else {
                                this.f74391c = new RFC6265LaxSpec(new C12607a(), PublicSuffixDomainFilter.decorate(new BasicDomainHandler(), this.f74390b), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicExpiresHandler(RFC6265StrictSpec.f74394g));
                            }
                        } else {
                            this.f74391c = new RFC6265StrictSpec(new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new BasicDomainHandler(), this.f74390b), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicExpiresHandler(RFC6265StrictSpec.f74394g));
                        }
                    }
                } finally {
                }
            }
        }
        return this.f74391c;
    }

    public RFC6265CookieSpecProvider(PublicSuffixMatcher publicSuffixMatcher) {
        this(CompatibilityLevel.RELAXED, publicSuffixMatcher);
    }

    public RFC6265CookieSpecProvider() {
        this(CompatibilityLevel.RELAXED, null);
    }
}
