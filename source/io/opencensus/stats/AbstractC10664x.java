package io.opencensus.stats;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.opencensus.common.Functions;
import io.opencensus.common.Timestamp;
import io.opencensus.internal.Utils;
import io.opencensus.stats.Measure;
import io.opencensus.stats.View;
import io.opencensus.stats.ViewData;
import io.opencensus.tags.TagContext;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.opencensus.stats.x */
/* loaded from: classes5.dex */
public abstract class AbstractC10664x {

    /* renamed from: io.opencensus.stats.x$b */
    /* loaded from: classes5.dex */
    public static final class C10666b extends MeasureMap {

        /* renamed from: b */
        public static final Logger f63645b = Logger.getLogger(C10666b.class.getName());

        /* renamed from: a */
        public boolean f63646a;

        public C10666b() {
        }

        @Override // io.opencensus.stats.MeasureMap
        public MeasureMap put(Measure.MeasureDouble measureDouble, double d) {
            if (d < 0.0d) {
                this.f63646a = true;
            }
            return this;
        }

        @Override // io.opencensus.stats.MeasureMap
        public void record() {
        }

        @Override // io.opencensus.stats.MeasureMap
        public MeasureMap put(Measure.MeasureLong measureLong, long j) {
            if (j < 0) {
                this.f63646a = true;
            }
            return this;
        }

        @Override // io.opencensus.stats.MeasureMap
        public void record(TagContext tagContext) {
            Utils.checkNotNull(tagContext, "tags");
            if (this.f63646a) {
                f63645b.log(Level.WARNING, "Dropping values, value to record must be non-negative.");
            }
        }
    }

    /* renamed from: io.opencensus.stats.x$c */
    /* loaded from: classes5.dex */
    public static final class C10667c extends StatsComponent {

        /* renamed from: a */
        public final ViewManager f63647a;

        /* renamed from: b */
        public volatile boolean f63648b;

        public C10667c() {
            this.f63647a = AbstractC10664x.m30173d();
        }

        @Override // io.opencensus.stats.StatsComponent
        public StatsCollectionState getState() {
            this.f63648b = true;
            return StatsCollectionState.DISABLED;
        }

        @Override // io.opencensus.stats.StatsComponent
        public StatsRecorder getStatsRecorder() {
            return AbstractC10664x.m30176a();
        }

        @Override // io.opencensus.stats.StatsComponent
        public ViewManager getViewManager() {
            return this.f63647a;
        }

        @Override // io.opencensus.stats.StatsComponent
        public void setState(StatsCollectionState statsCollectionState) {
            Utils.checkNotNull(statsCollectionState, RemoteConfigConstants.ResponseFieldKey.STATE);
            Utils.checkState(!this.f63648b, "State was already read, cannot set state.");
        }
    }

    /* renamed from: io.opencensus.stats.x$d */
    /* loaded from: classes5.dex */
    public static final class C10668d extends StatsRecorder {

        /* renamed from: a */
        public static final StatsRecorder f63649a = new C10668d();

        @Override // io.opencensus.stats.StatsRecorder
        public MeasureMap newMeasureMap() {
            return AbstractC10664x.m30175b();
        }
    }

    /* renamed from: io.opencensus.stats.x$e */
    /* loaded from: classes5.dex */
    public static final class C10669e extends ViewManager {

        /* renamed from: c */
        public static final Timestamp f63650c = Timestamp.create(0, 0);

        /* renamed from: a */
        public final Map f63651a;

        /* renamed from: b */
        public volatile Set f63652b;

        public C10669e() {
            this.f63651a = new HashMap();
        }

        /* renamed from: a */
        public static Set m30172a(Collection collection) {
            HashSet hashSet = new HashSet();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (!(view.getWindow() instanceof View.AggregationWindow.Interval)) {
                    hashSet.add(view);
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }

        @Override // io.opencensus.stats.ViewManager
        public Set getAllExportedViews() {
            Set set = this.f63652b;
            if (set == null) {
                synchronized (this.f63651a) {
                    set = m30172a(this.f63651a.values());
                    this.f63652b = set;
                }
            }
            return set;
        }

        @Override // io.opencensus.stats.ViewManager
        public ViewData getView(View.Name name) {
            Utils.checkNotNull(name, "name");
            synchronized (this.f63651a) {
                try {
                    View view = (View) this.f63651a.get(name);
                    if (view == null) {
                        return null;
                    }
                    Map emptyMap = Collections.emptyMap();
                    View.AggregationWindow window = view.getWindow();
                    Timestamp timestamp = f63650c;
                    return ViewData.create(view, emptyMap, (ViewData.AggregationWindowData) window.match(Functions.returnConstant(ViewData.AggregationWindowData.CumulativeData.create(timestamp, timestamp)), Functions.returnConstant(ViewData.AggregationWindowData.IntervalData.create(timestamp)), Functions.throwAssertionError()));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:5:0x0009, B:7:0x0019, B:14:0x0025, B:16:0x002c, B:17:0x0035), top: B:21:0x0009 }] */
        @Override // io.opencensus.stats.ViewManager
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void registerView(io.opencensus.stats.View r5) {
            /*
                r4 = this;
                java.lang.String r0 = "newView"
                io.opencensus.internal.Utils.checkNotNull(r5, r0)
                java.util.Map r0 = r4.f63651a
                monitor-enter(r0)
                r1 = 0
                r4.f63652b = r1     // Catch: java.lang.Throwable -> L22
                java.util.Map r1 = r4.f63651a     // Catch: java.lang.Throwable -> L22
                io.opencensus.stats.View$Name r2 = r5.getName()     // Catch: java.lang.Throwable -> L22
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L22
                io.opencensus.stats.View r1 = (io.opencensus.stats.View) r1     // Catch: java.lang.Throwable -> L22
                if (r1 == 0) goto L24
                boolean r2 = r5.equals(r1)     // Catch: java.lang.Throwable -> L22
                if (r2 == 0) goto L20
                goto L24
            L20:
                r2 = 0
                goto L25
            L22:
                r5 = move-exception
                goto L37
            L24:
                r2 = 1
            L25:
                java.lang.String r3 = "A different view with the same name already exists."
                io.opencensus.internal.Utils.checkArgument(r2, r3)     // Catch: java.lang.Throwable -> L22
                if (r1 != 0) goto L35
                java.util.Map r1 = r4.f63651a     // Catch: java.lang.Throwable -> L22
                io.opencensus.stats.View$Name r2 = r5.getName()     // Catch: java.lang.Throwable -> L22
                r1.put(r2, r5)     // Catch: java.lang.Throwable -> L22
            L35:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                return
            L37:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: io.opencensus.stats.AbstractC10664x.C10669e.registerView(io.opencensus.stats.View):void");
        }
    }

    /* renamed from: a */
    public static StatsRecorder m30176a() {
        return C10668d.f63649a;
    }

    /* renamed from: b */
    public static MeasureMap m30175b() {
        return new C10666b();
    }

    /* renamed from: c */
    public static StatsComponent m30174c() {
        return new C10667c();
    }

    /* renamed from: d */
    public static ViewManager m30173d() {
        return new C10669e();
    }
}
