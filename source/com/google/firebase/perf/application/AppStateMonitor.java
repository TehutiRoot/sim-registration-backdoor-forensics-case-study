package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.p016v1.ApplicationProcessState;
import com.google.firebase.perf.p016v1.TraceMetric;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.ScreenTraceUtil;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class AppStateMonitor implements Application.ActivityLifecycleCallbacks {

    /* renamed from: r */
    public static final AndroidLogger f56062r = AndroidLogger.getInstance();

    /* renamed from: s */
    public static volatile AppStateMonitor f56063s;

    /* renamed from: a */
    public final WeakHashMap f56064a;

    /* renamed from: b */
    public final WeakHashMap f56065b;

    /* renamed from: c */
    public final WeakHashMap f56066c;

    /* renamed from: d */
    public final WeakHashMap f56067d;

    /* renamed from: e */
    public final Map f56068e;

    /* renamed from: f */
    public final Set f56069f;

    /* renamed from: g */
    public Set f56070g;

    /* renamed from: h */
    public final AtomicInteger f56071h;

    /* renamed from: i */
    public final TransportManager f56072i;

    /* renamed from: j */
    public final ConfigResolver f56073j;

    /* renamed from: k */
    public final Clock f56074k;

    /* renamed from: l */
    public final boolean f56075l;

    /* renamed from: m */
    public Timer f56076m;

    /* renamed from: n */
    public Timer f56077n;

    /* renamed from: o */
    public ApplicationProcessState f56078o;

    /* renamed from: p */
    public boolean f56079p;

    /* renamed from: q */
    public boolean f56080q;

    /* loaded from: classes4.dex */
    public interface AppColdStartCallback {
        void onAppColdStart();
    }

    /* loaded from: classes4.dex */
    public interface AppStateCallback {
        void onUpdateAppState(ApplicationProcessState applicationProcessState);
    }

    public AppStateMonitor(TransportManager transportManager, Clock clock) {
        this(transportManager, clock, ConfigResolver.getInstance(), m38312a());
    }

    /* renamed from: a */
    public static boolean m38312a() {
        return FrameMetricsRecorder.m38306a();
    }

    public static AppStateMonitor getInstance() {
        if (f56063s == null) {
            synchronized (AppStateMonitor.class) {
                try {
                    if (f56063s == null) {
                        f56063s = new AppStateMonitor(TransportManager.getInstance(), new Clock());
                    }
                } finally {
                }
            }
        }
        return f56063s;
    }

    public static String getScreenTraceName(Activity activity) {
        return Constants.SCREEN_TRACE_PREFIX + activity.getClass().getSimpleName();
    }

    /* renamed from: b */
    public final void m38311b() {
        synchronized (this.f56070g) {
            try {
                for (AppColdStartCallback appColdStartCallback : this.f56070g) {
                    if (appColdStartCallback != null) {
                        appColdStartCallback.onAppColdStart();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final void m38310c(Activity activity) {
        Trace trace = (Trace) this.f56067d.get(activity);
        if (trace == null) {
            return;
        }
        this.f56067d.remove(activity);
        Optional<FrameMetricsCalculator.PerfFrameMetrics> stop = ((FrameMetricsRecorder) this.f56065b.get(activity)).stop();
        if (!stop.isAvailable()) {
            f56062r.warn("Failed to record frame data for %s.", activity.getClass().getSimpleName());
            return;
        }
        ScreenTraceUtil.addFrameCounters(trace, stop.get());
        trace.stop();
    }

    /* renamed from: d */
    public final void m38309d(String str, Timer timer, Timer timer2) {
        if (!this.f56073j.isPerformanceMonitoringEnabled()) {
            return;
        }
        TraceMetric.Builder addPerfSessions = TraceMetric.newBuilder().setName(str).setClientStartTimeUs(timer.getMicros()).setDurationUs(timer.getDurationMicros(timer2)).addPerfSessions(SessionManager.getInstance().perfSession().build());
        int andSet = this.f56071h.getAndSet(0);
        synchronized (this.f56068e) {
            try {
                addPerfSessions.putAllCounters(this.f56068e);
                if (andSet != 0) {
                    addPerfSessions.putCounters(Constants.CounterNames.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                }
                this.f56068e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f56072i.log(addPerfSessions.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
    }

    /* renamed from: e */
    public final void m38308e(Activity activity) {
        if (isScreenTraceSupported() && this.f56073j.isPerformanceMonitoringEnabled()) {
            FrameMetricsRecorder frameMetricsRecorder = new FrameMetricsRecorder(activity);
            this.f56065b.put(activity, frameMetricsRecorder);
            if (activity instanceof FragmentActivity) {
                FragmentStateMonitor fragmentStateMonitor = new FragmentStateMonitor(this.f56074k, this.f56072i, this, frameMetricsRecorder);
                this.f56066c.put(activity, fragmentStateMonitor);
                ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(fragmentStateMonitor, true);
            }
        }
    }

    /* renamed from: f */
    public final void m38307f(ApplicationProcessState applicationProcessState) {
        this.f56078o = applicationProcessState;
        synchronized (this.f56069f) {
            try {
                Iterator it = this.f56069f.iterator();
                while (it.hasNext()) {
                    AppStateCallback appStateCallback = (AppStateCallback) ((WeakReference) it.next()).get();
                    if (appStateCallback != null) {
                        appStateCallback.onUpdateAppState(this.f56078o);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ApplicationProcessState getAppState() {
        return this.f56078o;
    }

    public void incrementCount(@NonNull String str, long j) {
        synchronized (this.f56068e) {
            try {
                Long l = (Long) this.f56068e.get(str);
                if (l == null) {
                    this.f56068e.put(str, Long.valueOf(j));
                } else {
                    this.f56068e.put(str, Long.valueOf(l.longValue() + j));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void incrementTsnsCount(int i) {
        this.f56071h.addAndGet(i);
    }

    public boolean isColdStart() {
        return this.f56080q;
    }

    public boolean isForeground() {
        if (this.f56078o == ApplicationProcessState.FOREGROUND) {
            return true;
        }
        return false;
    }

    public boolean isScreenTraceSupported() {
        return this.f56075l;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        m38308e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f56065b.remove(activity);
        if (this.f56066c.containsKey(activity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks((FragmentManager.FragmentLifecycleCallbacks) this.f56066c.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f56064a.isEmpty()) {
                this.f56076m = this.f56074k.getTime();
                this.f56064a.put(activity, Boolean.TRUE);
                if (this.f56080q) {
                    m38307f(ApplicationProcessState.FOREGROUND);
                    m38311b();
                    this.f56080q = false;
                } else {
                    m38309d(Constants.TraceNames.BACKGROUND_TRACE_NAME.toString(), this.f56077n, this.f56076m);
                    m38307f(ApplicationProcessState.FOREGROUND);
                }
            } else {
                this.f56064a.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (isScreenTraceSupported() && this.f56073j.isPerformanceMonitoringEnabled()) {
                if (!this.f56065b.containsKey(activity)) {
                    m38308e(activity);
                }
                ((FrameMetricsRecorder) this.f56065b.get(activity)).start();
                Trace trace = new Trace(getScreenTraceName(activity), this.f56072i, this.f56074k, this);
                trace.start();
                this.f56067d.put(activity, trace);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        try {
            if (isScreenTraceSupported()) {
                m38310c(activity);
            }
            if (this.f56064a.containsKey(activity)) {
                this.f56064a.remove(activity);
                if (this.f56064a.isEmpty()) {
                    this.f56077n = this.f56074k.getTime();
                    m38309d(Constants.TraceNames.FOREGROUND_TRACE_NAME.toString(), this.f56076m, this.f56077n);
                    m38307f(ApplicationProcessState.BACKGROUND);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void registerActivityLifecycleCallbacks(Context context) {
        if (this.f56079p) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f56079p = true;
        }
    }

    public void registerForAppColdStart(AppColdStartCallback appColdStartCallback) {
        synchronized (this.f56070g) {
            this.f56070g.add(appColdStartCallback);
        }
    }

    public void registerForAppState(WeakReference<AppStateCallback> weakReference) {
        synchronized (this.f56069f) {
            this.f56069f.add(weakReference);
        }
    }

    @VisibleForTesting
    public void setIsColdStart(boolean z) {
        this.f56080q = z;
    }

    public synchronized void unregisterActivityLifecycleCallbacks(Context context) {
        if (!this.f56079p) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
            this.f56079p = false;
        }
    }

    public void unregisterForAppState(WeakReference<AppStateCallback> weakReference) {
        synchronized (this.f56069f) {
            this.f56069f.remove(weakReference);
        }
    }

    public AppStateMonitor(TransportManager transportManager, Clock clock, ConfigResolver configResolver, boolean z) {
        this.f56064a = new WeakHashMap();
        this.f56065b = new WeakHashMap();
        this.f56066c = new WeakHashMap();
        this.f56067d = new WeakHashMap();
        this.f56068e = new HashMap();
        this.f56069f = new HashSet();
        this.f56070g = new HashSet();
        this.f56071h = new AtomicInteger(0);
        this.f56078o = ApplicationProcessState.BACKGROUND;
        this.f56079p = false;
        this.f56080q = true;
        this.f56072i = transportManager;
        this.f56074k = clock;
        this.f56073j = configResolver;
        this.f56075l = z;
    }
}
