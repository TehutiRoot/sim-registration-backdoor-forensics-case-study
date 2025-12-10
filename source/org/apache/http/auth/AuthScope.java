package org.apache.http.auth;

import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.message.TokenParser;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class AuthScope {
    public static final AuthScope ANY = new AuthScope(null, -1, null, null);
    public static final String ANY_HOST = null;
    public static final int ANY_PORT = -1;
    public static final String ANY_REALM = null;
    public static final String ANY_SCHEME = null;

    /* renamed from: a */
    public final String f73634a;

    /* renamed from: b */
    public final String f73635b;

    /* renamed from: c */
    public final String f73636c;

    /* renamed from: d */
    public final int f73637d;

    /* renamed from: e */
    public final HttpHost f73638e;

    public AuthScope(String str, int i, String str2, String str3) {
        this.f73636c = str == null ? ANY_HOST : str.toLowerCase(Locale.ROOT);
        this.f73637d = i < 0 ? -1 : i;
        this.f73635b = str2 == null ? ANY_REALM : str2;
        this.f73634a = str3 == null ? ANY_SCHEME : str3.toUpperCase(Locale.ROOT);
        this.f73638e = null;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthScope)) {
            return super.equals(obj);
        }
        AuthScope authScope = (AuthScope) obj;
        if (!LangUtils.equals(this.f73636c, authScope.f73636c) || this.f73637d != authScope.f73637d || !LangUtils.equals(this.f73635b, authScope.f73635b) || !LangUtils.equals(this.f73634a, authScope.f73634a)) {
            return false;
        }
        return true;
    }

    public String getHost() {
        return this.f73636c;
    }

    public HttpHost getOrigin() {
        return this.f73638e;
    }

    public int getPort() {
        return this.f73637d;
    }

    public String getRealm() {
        return this.f73635b;
    }

    public String getScheme() {
        return this.f73634a;
    }

    public int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(17, this.f73636c), this.f73637d), this.f73635b), this.f73634a);
    }

    public int match(AuthScope authScope) {
        int i;
        if (LangUtils.equals(this.f73634a, authScope.f73634a)) {
            i = 1;
        } else {
            String str = this.f73634a;
            String str2 = ANY_SCHEME;
            if (str != str2 && authScope.f73634a != str2) {
                return -1;
            }
            i = 0;
        }
        if (LangUtils.equals(this.f73635b, authScope.f73635b)) {
            i += 2;
        } else {
            String str3 = this.f73635b;
            String str4 = ANY_REALM;
            if (str3 != str4 && authScope.f73635b != str4) {
                return -1;
            }
        }
        int i2 = this.f73637d;
        int i3 = authScope.f73637d;
        if (i2 == i3) {
            i += 4;
        } else if (i2 != -1 && i3 != -1) {
            return -1;
        }
        if (LangUtils.equals(this.f73636c, authScope.f73636c)) {
            return i + 8;
        }
        String str5 = this.f73636c;
        String str6 = ANY_HOST;
        if (str5 != str6 && authScope.f73636c != str6) {
            return -1;
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f73634a;
        if (str != null) {
            sb.append(str.toUpperCase(Locale.ROOT));
            sb.append(TokenParser.f74560SP);
        }
        if (this.f73635b != null) {
            sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
            sb.append(this.f73635b);
            sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        } else {
            sb.append("<any realm>");
        }
        if (this.f73636c != null) {
            sb.append('@');
            sb.append(this.f73636c);
            if (this.f73637d >= 0) {
                sb.append(':');
                sb.append(this.f73637d);
            }
        }
        return sb.toString();
    }

    public AuthScope(HttpHost httpHost, String str, String str2) {
        Args.notNull(httpHost, "Host");
        String hostName = httpHost.getHostName();
        Locale locale = Locale.ROOT;
        this.f73636c = hostName.toLowerCase(locale);
        this.f73637d = httpHost.getPort() < 0 ? -1 : httpHost.getPort();
        this.f73635b = str == null ? ANY_REALM : str;
        this.f73634a = str2 == null ? ANY_SCHEME : str2.toUpperCase(locale);
        this.f73638e = httpHost;
    }

    public AuthScope(HttpHost httpHost) {
        this(httpHost, ANY_REALM, ANY_SCHEME);
    }

    public AuthScope(String str, int i, String str2) {
        this(str, i, str2, ANY_SCHEME);
    }

    public AuthScope(String str, int i) {
        this(str, i, ANY_REALM, ANY_SCHEME);
    }

    public AuthScope(AuthScope authScope) {
        Args.notNull(authScope, "Scope");
        this.f73636c = authScope.getHost();
        this.f73637d = authScope.getPort();
        this.f73635b = authScope.getRealm();
        this.f73634a = authScope.getScheme();
        this.f73638e = authScope.getOrigin();
    }
}
