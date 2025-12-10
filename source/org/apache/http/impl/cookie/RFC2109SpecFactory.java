package org.apache.http.impl.cookie;

import java.util.Collection;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.cookie.params.CookieSpecPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: classes6.dex */
public class RFC2109SpecFactory implements CookieSpecFactory, CookieSpecProvider {

    /* renamed from: a */
    public final CookieSpec f74375a;

    public RFC2109SpecFactory(String[] strArr, boolean z) {
        this.f74375a = new RFC2109Spec(strArr, z);
    }

    @Override // org.apache.http.cookie.CookieSpecProvider
    public CookieSpec create(HttpContext httpContext) {
        return this.f74375a;
    }

    @Override // org.apache.http.cookie.CookieSpecFactory
    public CookieSpec newInstance(HttpParams httpParams) {
        String[] strArr;
        if (httpParams != null) {
            Collection collection = (Collection) httpParams.getParameter(CookieSpecPNames.DATE_PATTERNS);
            if (collection != null) {
                strArr = (String[]) collection.toArray(new String[collection.size()]);
            } else {
                strArr = null;
            }
            return new RFC2109Spec(strArr, httpParams.getBooleanParameter(CookieSpecPNames.SINGLE_COOKIE_HEADER, false));
        }
        return new RFC2109Spec();
    }

    public RFC2109SpecFactory() {
        this(null, false);
    }
}
