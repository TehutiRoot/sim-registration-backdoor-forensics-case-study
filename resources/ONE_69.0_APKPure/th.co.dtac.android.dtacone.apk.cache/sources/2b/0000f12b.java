package org.apache.http.config;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes6.dex */
public final class Registry<I> implements Lookup<I> {

    /* renamed from: a */
    public final Map f73865a;

    public Registry(Map map) {
        this.f73865a = new ConcurrentHashMap(map);
    }

    @Override // org.apache.http.config.Lookup
    public I lookup(String str) {
        if (str == null) {
            return null;
        }
        return (I) this.f73865a.get(str.toLowerCase(Locale.ROOT));
    }

    public String toString() {
        return this.f73865a.toString();
    }
}