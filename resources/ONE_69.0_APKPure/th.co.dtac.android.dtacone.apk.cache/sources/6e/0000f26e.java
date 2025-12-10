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
    public final CookieAttributeHandler f74451a;

    /* renamed from: b */
    public Collection f74452b;

    /* renamed from: c */
    public Collection f74453c;

    /* renamed from: d */
    public PublicSuffixMatcher f74454d;

    public PublicSuffixFilter(CookieAttributeHandler cookieAttributeHandler) {
        this.f74451a = cookieAttributeHandler;
    }

    /* renamed from: a */
    public final boolean m24795a(Cookie cookie) {
        if (this.f74454d == null) {
            this.f74454d = new PublicSuffixMatcher(this.f74453c, this.f74452b);
        }
        return this.f74454d.matches(cookie.getDomain());
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (m24795a(cookie)) {
            return false;
        }
        return this.f74451a.match(cookie, cookieOrigin);
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        this.f74451a.parse(setCookie, str);
    }

    public void setExceptions(Collection<String> collection) {
        this.f74452b = collection;
        this.f74454d = null;
    }

    public void setPublicSuffixes(Collection<String> collection) {
        this.f74453c = collection;
        this.f74454d = null;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        this.f74451a.validate(cookie, cookieOrigin);
    }
}