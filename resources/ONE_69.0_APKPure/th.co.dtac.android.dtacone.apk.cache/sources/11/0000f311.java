package org.apache.http.protocol;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.slf4j.Marker;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes6.dex */
public class UriPatternMatcher<T> {

    /* renamed from: a */
    public final Map f74713a = new LinkedHashMap();

    public synchronized Set<Map.Entry<String, T>> entrySet() {
        return new HashSet(this.f74713a.entrySet());
    }

    @Deprecated
    public synchronized Map<String, T> getObjects() {
        return this.f74713a;
    }

    public synchronized T lookup(String str) {
        T t;
        try {
            Args.notNull(str, "Request path");
            t = (T) this.f74713a.get(str);
            if (t == null) {
                String str2 = null;
                for (String str3 : this.f74713a.keySet()) {
                    if (matchUriRequestPattern(str3, str)) {
                        if (str2 != null) {
                            if (str2.length() >= str3.length()) {
                                if (str2.length() == str3.length() && str3.endsWith(Marker.ANY_MARKER)) {
                                }
                            }
                        }
                        t = (T) this.f74713a.get(str3);
                        str2 = str3;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return t;
    }

    public boolean matchUriRequestPattern(String str, String str2) {
        if (str.equals(Marker.ANY_MARKER)) {
            return true;
        }
        if (str.endsWith(Marker.ANY_MARKER) && str2.startsWith(str.substring(0, str.length() - 1))) {
            return true;
        }
        if (str.startsWith(Marker.ANY_MARKER) && str2.endsWith(str.substring(1, str.length()))) {
            return true;
        }
        return false;
    }

    public synchronized void register(String str, T t) {
        Args.notNull(str, "URI request pattern");
        this.f74713a.put(str, t);
    }

    @Deprecated
    public synchronized void setHandlers(Map<String, T> map) {
        Args.notNull(map, "Map of handlers");
        this.f74713a.clear();
        this.f74713a.putAll(map);
    }

    @Deprecated
    public synchronized void setObjects(Map<String, T> map) {
        Args.notNull(map, "Map of handlers");
        this.f74713a.clear();
        this.f74713a.putAll(map);
    }

    public String toString() {
        return this.f74713a.toString();
    }

    public synchronized void unregister(String str) {
        if (str == null) {
            return;
        }
        this.f74713a.remove(str);
    }
}