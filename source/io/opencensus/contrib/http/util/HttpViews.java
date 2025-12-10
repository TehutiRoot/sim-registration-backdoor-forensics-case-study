package io.opencensus.contrib.http.util;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import io.opencensus.stats.Stats;
import io.opencensus.stats.View;
import io.opencensus.stats.ViewManager;

/* loaded from: classes5.dex */
public final class HttpViews {

    /* renamed from: a */
    public static final ImmutableSet f63515a = ImmutableSet.m40927of(HttpViewConstants.HTTP_SERVER_COMPLETED_COUNT_VIEW, HttpViewConstants.HTTP_SERVER_SENT_BYTES_VIEW, HttpViewConstants.HTTP_SERVER_RECEIVED_BYTES_VIEW, HttpViewConstants.HTTP_SERVER_LATENCY_VIEW);

    /* renamed from: b */
    public static final ImmutableSet f63516b = ImmutableSet.m40927of(HttpViewConstants.HTTP_CLIENT_COMPLETED_COUNT_VIEW, HttpViewConstants.HTTP_CLIENT_RECEIVED_BYTES_VIEW, HttpViewConstants.HTTP_CLIENT_SENT_BYTES_VIEW, HttpViewConstants.HTTP_CLIENT_ROUNDTRIP_LATENCY_VIEW);

    /* renamed from: a */
    public static void m30264a(ViewManager viewManager) {
        UnmodifiableIterator it = f63516b.iterator();
        while (it.hasNext()) {
            viewManager.registerView((View) it.next());
        }
    }

    /* renamed from: b */
    public static void m30263b(ViewManager viewManager) {
        UnmodifiableIterator it = f63515a.iterator();
        while (it.hasNext()) {
            viewManager.registerView((View) it.next());
        }
    }

    /* renamed from: c */
    public static void m30262c(ViewManager viewManager) {
        m30264a(viewManager);
        m30263b(viewManager);
    }

    public static final void registerAllClientViews() {
        m30264a(Stats.getViewManager());
    }

    public static final void registerAllServerViews() {
        m30263b(Stats.getViewManager());
    }

    public static final void registerAllViews() {
        m30262c(Stats.getViewManager());
    }
}
