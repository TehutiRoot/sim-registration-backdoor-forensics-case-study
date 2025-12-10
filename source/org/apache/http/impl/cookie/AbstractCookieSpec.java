package org.apache.http.impl.cookie;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes6.dex */
public abstract class AbstractCookieSpec implements CookieSpec {

    /* renamed from: a */
    public final Map f74334a;

    public AbstractCookieSpec() {
        this.f74334a = new ConcurrentHashMap(10);
    }

    public CookieAttributeHandler findAttribHandler(String str) {
        return (CookieAttributeHandler) this.f74334a.get(str);
    }

    public CookieAttributeHandler getAttribHandler(String str) {
        boolean z;
        CookieAttributeHandler findAttribHandler = findAttribHandler(str);
        if (findAttribHandler != null) {
            z = true;
        } else {
            z = false;
        }
        Asserts.check(z, "Handler not registered for " + str + " attribute");
        return findAttribHandler;
    }

    public Collection<CookieAttributeHandler> getAttribHandlers() {
        return this.f74334a.values();
    }

    @Deprecated
    public void registerAttribHandler(String str, CookieAttributeHandler cookieAttributeHandler) {
        Args.notNull(str, "Attribute name");
        Args.notNull(cookieAttributeHandler, "Attribute handler");
        this.f74334a.put(str, cookieAttributeHandler);
    }

    public AbstractCookieSpec(HashMap<String, CookieAttributeHandler> hashMap) {
        Asserts.notNull(hashMap, "Attribute handler map");
        this.f74334a = new ConcurrentHashMap(hashMap);
    }

    public AbstractCookieSpec(CommonCookieAttributeHandler... commonCookieAttributeHandlerArr) {
        this.f74334a = new ConcurrentHashMap(commonCookieAttributeHandlerArr.length);
        for (CommonCookieAttributeHandler commonCookieAttributeHandler : commonCookieAttributeHandlerArr) {
            this.f74334a.put(commonCookieAttributeHandler.getAttributeName(), commonCookieAttributeHandler);
        }
    }
}
