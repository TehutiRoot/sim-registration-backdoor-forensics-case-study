package io.opencensus.stats;

import io.opencensus.internal.Provider;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class Stats {

    /* renamed from: a */
    public static final Logger f63579a = Logger.getLogger(Stats.class.getName());

    /* renamed from: b */
    public static final StatsComponent f63580b = m30201a(StatsComponent.class.getClassLoader());

    /* renamed from: a */
    public static StatsComponent m30201a(ClassLoader classLoader) {
        try {
            return (StatsComponent) Provider.createInstance(Class.forName("io.opencensus.impl.stats.StatsComponentImpl", true, classLoader), StatsComponent.class);
        } catch (ClassNotFoundException e) {
            f63579a.log(Level.FINE, "Couldn't load full implementation for StatsComponent, now trying to load lite implementation.", (Throwable) e);
            try {
                return (StatsComponent) Provider.createInstance(Class.forName("io.opencensus.impllite.stats.StatsComponentImplLite", true, classLoader), StatsComponent.class);
            } catch (ClassNotFoundException e2) {
                f63579a.log(Level.FINE, "Couldn't load lite implementation for StatsComponent, now using default implementation for StatsComponent.", (Throwable) e2);
                return AbstractC10664x.m30174c();
            }
        }
    }

    public static StatsCollectionState getState() {
        return f63580b.getState();
    }

    public static StatsRecorder getStatsRecorder() {
        return f63580b.getStatsRecorder();
    }

    public static ViewManager getViewManager() {
        return f63580b.getViewManager();
    }

    @Deprecated
    public static void setState(StatsCollectionState statsCollectionState) {
        f63580b.setState(statsCollectionState);
    }
}
