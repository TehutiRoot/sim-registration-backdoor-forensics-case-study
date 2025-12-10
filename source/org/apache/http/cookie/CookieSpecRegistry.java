package org.apache.http.cookie;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.config.Lookup;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: classes6.dex */
public final class CookieSpecRegistry implements Lookup<CookieSpecProvider> {

    /* renamed from: a */
    public final ConcurrentHashMap f73865a = new ConcurrentHashMap();

    /* renamed from: org.apache.http.cookie.CookieSpecRegistry$a */
    /* loaded from: classes6.dex */
    public class C12571a implements CookieSpecProvider {

        /* renamed from: a */
        public final /* synthetic */ String f73866a;

        public C12571a(String str) {
            this.f73866a = str;
        }

        @Override // org.apache.http.cookie.CookieSpecProvider
        public CookieSpec create(HttpContext httpContext) {
            return CookieSpecRegistry.this.getCookieSpec(this.f73866a, ((HttpRequest) httpContext.getAttribute("http.request")).getParams());
        }
    }

    public CookieSpec getCookieSpec(String str, HttpParams httpParams) throws IllegalStateException {
        Args.notNull(str, "Name");
        CookieSpecFactory cookieSpecFactory = (CookieSpecFactory) this.f73865a.get(str.toLowerCase(Locale.ENGLISH));
        if (cookieSpecFactory != null) {
            return cookieSpecFactory.newInstance(httpParams);
        }
        throw new IllegalStateException("Unsupported cookie spec: " + str);
    }

    public List<String> getSpecNames() {
        return new ArrayList(this.f73865a.keySet());
    }

    public void register(String str, CookieSpecFactory cookieSpecFactory) {
        Args.notNull(str, "Name");
        Args.notNull(cookieSpecFactory, "Cookie spec factory");
        this.f73865a.put(str.toLowerCase(Locale.ENGLISH), cookieSpecFactory);
    }

    public void setItems(Map<String, CookieSpecFactory> map) {
        if (map == null) {
            return;
        }
        this.f73865a.clear();
        this.f73865a.putAll(map);
    }

    public void unregister(String str) {
        Args.notNull(str, "Id");
        this.f73865a.remove(str.toLowerCase(Locale.ENGLISH));
    }

    @Override // org.apache.http.config.Lookup
    public CookieSpecProvider lookup(String str) {
        return new C12571a(str);
    }

    public CookieSpec getCookieSpec(String str) throws IllegalStateException {
        return getCookieSpec(str, null);
    }
}
