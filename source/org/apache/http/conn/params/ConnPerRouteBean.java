package org.apache.http.conn.params;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: classes6.dex */
public final class ConnPerRouteBean implements ConnPerRoute {
    public static final int DEFAULT_MAX_CONNECTIONS_PER_ROUTE = 2;

    /* renamed from: a */
    public final ConcurrentHashMap f73803a;

    /* renamed from: b */
    public volatile int f73804b;

    public ConnPerRouteBean(int i) {
        this.f73803a = new ConcurrentHashMap();
        setDefaultMaxPerRoute(i);
    }

    public int getDefaultMax() {
        return this.f73804b;
    }

    public int getDefaultMaxPerRoute() {
        return this.f73804b;
    }

    @Override // org.apache.http.conn.params.ConnPerRoute
    public int getMaxForRoute(HttpRoute httpRoute) {
        Args.notNull(httpRoute, "HTTP route");
        Integer num = (Integer) this.f73803a.get(httpRoute);
        if (num != null) {
            return num.intValue();
        }
        return this.f73804b;
    }

    public void setDefaultMaxPerRoute(int i) {
        Args.positive(i, "Default max per route");
        this.f73804b = i;
    }

    public void setMaxForRoute(HttpRoute httpRoute, int i) {
        Args.notNull(httpRoute, "HTTP route");
        Args.positive(i, "Max per route");
        this.f73803a.put(httpRoute, Integer.valueOf(i));
    }

    public void setMaxForRoutes(Map<HttpRoute, Integer> map) {
        if (map == null) {
            return;
        }
        this.f73803a.clear();
        this.f73803a.putAll(map);
    }

    public String toString() {
        return this.f73803a.toString();
    }

    public ConnPerRouteBean() {
        this(2);
    }
}
