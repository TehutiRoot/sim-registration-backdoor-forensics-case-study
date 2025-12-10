package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class IgnoreSpecProvider implements CookieSpecProvider {

    /* renamed from: a */
    public volatile CookieSpec f74349a;

    @Override // org.apache.http.cookie.CookieSpecProvider
    public CookieSpec create(HttpContext httpContext) {
        if (this.f74349a == null) {
            synchronized (this) {
                try {
                    if (this.f74349a == null) {
                        this.f74349a = new IgnoreSpec();
                    }
                } finally {
                }
            }
        }
        return this.f74349a;
    }
}
