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
public class NetscapeDraftSpecFactory implements CookieSpecFactory, CookieSpecProvider {

    /* renamed from: a */
    public final CookieSpec f74361a;

    public NetscapeDraftSpecFactory(String[] strArr) {
        this.f74361a = new NetscapeDraftSpec(strArr);
    }

    @Override // org.apache.http.cookie.CookieSpecProvider
    public CookieSpec create(HttpContext httpContext) {
        return this.f74361a;
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
            return new NetscapeDraftSpec(strArr);
        }
        return new NetscapeDraftSpec();
    }

    public NetscapeDraftSpecFactory() {
        this(null);
    }
}
