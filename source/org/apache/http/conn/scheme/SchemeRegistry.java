package org.apache.http.conn.scheme;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: classes6.dex */
public final class SchemeRegistry {

    /* renamed from: a */
    public final ConcurrentHashMap f73824a = new ConcurrentHashMap();

    public Scheme get(String str) {
        Args.notNull(str, "Scheme name");
        return (Scheme) this.f73824a.get(str);
    }

    public Scheme getScheme(String str) {
        Scheme scheme = get(str);
        if (scheme != null) {
            return scheme;
        }
        throw new IllegalStateException("Scheme '" + str + "' not registered.");
    }

    public List<String> getSchemeNames() {
        return new ArrayList(this.f73824a.keySet());
    }

    public Scheme register(Scheme scheme) {
        Args.notNull(scheme, "Scheme");
        return (Scheme) this.f73824a.put(scheme.getName(), scheme);
    }

    public void setItems(Map<String, Scheme> map) {
        if (map == null) {
            return;
        }
        this.f73824a.clear();
        this.f73824a.putAll(map);
    }

    public Scheme unregister(String str) {
        Args.notNull(str, "Scheme name");
        return (Scheme) this.f73824a.remove(str);
    }

    public Scheme getScheme(HttpHost httpHost) {
        Args.notNull(httpHost, "Host");
        return getScheme(httpHost.getSchemeName());
    }
}
