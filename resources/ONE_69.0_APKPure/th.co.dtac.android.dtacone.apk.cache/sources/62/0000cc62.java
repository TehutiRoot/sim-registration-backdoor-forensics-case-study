package io.opencensus.contrib.http.util;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import io.opencensus.stats.Stats;
import io.opencensus.stats.View;
import io.opencensus.stats.ViewManager;

/* loaded from: classes5.dex */
public final class HttpViews {

    /* renamed from: a */
    public static final ImmutableSet f63578a = ImmutableSet.m40916of(HttpViewConstants.HTTP_SERVER_COMPLETED_COUNT_VIEW, HttpViewConstants.HTTP_SERVER_SENT_BYTES_VIEW, HttpViewConstants.HTTP_SERVER_RECEIVED_BYTES_VIEW, HttpViewConstants.HTTP_SERVER_LATENCY_VIEW);

    /* renamed from: b */
    public static final ImmutableSet f63579b = ImmutableSet.m40916of(HttpViewConstants.HTTP_CLIENT_COMPLETED_COUNT_VIEW, HttpViewConstants.HTTP_CLIENT_RECEIVED_BYTES_VIEW, HttpViewConstants.HTTP_CLIENT_SENT_BYTES_VIEW, HttpViewConstants.HTTP_CLIENT_ROUNDTRIP_LATENCY_VIEW);

    /* renamed from: a */
    public static void m30604a(ViewManager viewManager) {
        UnmodifiableIterator it = f63579b.iterator();
        while (it.hasNext()) {
            viewManager.registerView((View) it.next());
        }
    }

    /* renamed from: b */
    public static void m30603b(ViewManager viewManager) {
        UnmodifiableIterator it = f63578a.iterator();
        while (it.hasNext()) {
            viewManager.registerView((View) it.next());
        }
    }

    /* renamed from: c */
    public static void m30602c(ViewManager viewManager) {
        m30604a(viewManager);
        m30603b(viewManager);
    }

    public static final void registerAllClientViews() {
        m30604a(Stats.getViewManager());
    }

    public static final void registerAllServerViews() {
        m30603b(Stats.getViewManager());
    }

    public static final void registerAllViews() {
        m30602c(Stats.getViewManager());
    }
}