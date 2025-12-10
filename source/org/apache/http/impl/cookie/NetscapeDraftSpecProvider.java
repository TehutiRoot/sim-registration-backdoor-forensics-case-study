package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.Obsolete;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Obsolete
/* loaded from: classes6.dex */
public class NetscapeDraftSpecProvider implements CookieSpecProvider {

    /* renamed from: a */
    public final String[] f74362a;

    /* renamed from: b */
    public volatile CookieSpec f74363b;

    public NetscapeDraftSpecProvider(String[] strArr) {
        this.f74362a = strArr;
    }

    @Override // org.apache.http.cookie.CookieSpecProvider
    public CookieSpec create(HttpContext httpContext) {
        if (this.f74363b == null) {
            synchronized (this) {
                try {
                    if (this.f74363b == null) {
                        this.f74363b = new NetscapeDraftSpec(this.f74362a);
                    }
                } finally {
                }
            }
        }
        return this.f74363b;
    }

    public NetscapeDraftSpecProvider() {
        this(null);
    }
}
