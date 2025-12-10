package org.apache.http.impl.cookie;

import java.util.Collection;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

@Deprecated
/* loaded from: classes6.dex */
public class PublicSuffixFilter implements CookieAttributeHandler {

    /* renamed from: a */
    public final CookieAttributeHandler f74367a;

    /* renamed from: b */
    public Collection f74368b;

    /* renamed from: c */
    public Collection f74369c;

    /* renamed from: d */
    public PublicSuffixMatcher f74370d;

    public PublicSuffixFilter(CookieAttributeHandler cookieAttributeHandler) {
        this.f74367a = cookieAttributeHandler;
    }

    /* renamed from: a */
    public final boolean m24605a(Cookie cookie) {
        if (this.f74370d == null) {
            this.f74370d = new PublicSuffixMatcher(this.f74369c, this.f74368b);
        }
        return this.f74370d.matches(cookie.getDomain());
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (m24605a(cookie)) {
            return false;
        }
        return this.f74367a.match(cookie, cookieOrigin);
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        this.f74367a.parse(setCookie, str);
    }

    public void setExceptions(Collection<String> collection) {
        this.f74368b = collection;
        this.f74370d = null;
    }

    public void setPublicSuffixes(Collection<String> collection) {
        this.f74369c = collection;
        this.f74370d = null;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        this.f74367a.validate(cookie, cookieOrigin);
    }
}
