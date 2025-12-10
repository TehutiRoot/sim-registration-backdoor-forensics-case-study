package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.p016v1.ApplicationProcessState;
import com.google.firebase.perf.p016v1.TraceMetric;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.FirstDrawDoneListener;
import com.google.firebase.perf.util.PreDrawListener;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, LifecycleObserver {

    /* renamed from: A */
    public static volatile AppStartTrace f56145A;

    /* renamed from: B */
    public static ExecutorService f56146B;

    /* renamed from: y */
    public static final Timer f56147y = new Clock().getTime();

    /* renamed from: z */
    public static final long f56148z = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: b */
    public final TransportManager f56150b;

    /* renamed from: c */
    public final Clock f56151c;

    /* renamed from: d */
    public final ConfigResolver f56152d;

    /* renamed from: e */
    public final TraceMetric.Builder f56153e;

    /* renamed from: f */
    public Context f56154f;

    /* renamed from: g */
    public WeakReference f56155g;

    /* renamed from: h */
    public WeakReference f56156h;

    /* renamed from: j */
    public final Timer f56158j;

    /* renamed from: k */
    public final Timer f56159k;

    /* renamed from: t */
    public PerfSession f56168t;

    /* renamed from: a */
    public boolean f56149a = false;

    /* renamed from: i */
    public boolean f56157i = false;

    /* renamed from: l */
    public Timer f56160l = null;

    /* renamed from: m */
    public Timer f56161m = null;

    /* renamed from: n */
    public Timer f56162n = null;

    /* renamed from: o */
    public Timer f56163o = null;

    /* renamed from: p */
    public Timer f56164p = null;

    /* renamed from: q */
    public Timer f56165q = null;

    /* renamed from: r */
    public Timer f56166r = null;

    /* renamed from: s */
    public Timer f56167s = null;

    /* renamed from: u */
    public boolean f56169u = false;

    /* renamed from: v */
    public int f56170v = 0;

    /* renamed from: w */
    public final ViewTreeObserver$OnDrawListenerC8574b f56171w = new ViewTreeObserver$OnDrawListenerC8574b();

    /* renamed from: x */
    public boolean f56172x = false;

    /* loaded from: classes4.dex */
    public static class StartFromBackgroundRunnable implements Runnable {

        /* renamed from: a */
        public final AppStartTrace f56173a;

        public StartFromBackgroundRunnable(AppStartTrace appStartTrace) {
            this.f56173a = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f56173a.f56160l == null) {
                this.f56173a.f56169u = true;
            }
        }
    }

    /* renamed from: com.google.firebase.perf.metrics.AppStartTrace$b */
    /* loaded from: classes4.dex */
    public final class ViewTreeObserver$OnDrawListenerC8574b implements ViewTreeObserver.OnDrawListener {
        public ViewTreeObserver$OnDrawListenerC8574b() {
            AppStartTrace.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.m38262h(AppStartTrace.this);
        }
    }

    public AppStartTrace(TransportManager transportManager, Clock clock, ConfigResolver configResolver, ExecutorService executorService) {
        Timer timer;
        long startElapsedRealtime;
        this.f56150b = transportManager;
        this.f56151c = clock;
        this.f56152d = configResolver;
        f56146B = executorService;
        this.f56153e = TraceMetric.newBuilder().setName("_experiment_app_start_ttid");
        if (Build.VERSION.SDK_INT >= 24) {
            startElapsedRealtime = Process.getStartElapsedRealtime();
            timer = Timer.ofElapsedRealtime(startElapsedRealtime);
        } else {
            timer = null;
        }
        this.f56158j = timer;
        StartupTime startupTime = (StartupTime) FirebaseApp.getInstance().get(StartupTime.class);
        this.f56159k = startupTime != null ? Timer.ofElapsedRealtime(startupTime.getElapsedRealtime()) : null;
    }

    /* renamed from: b */
    public static /* synthetic */ void m38268b(AppStartTrace appStartTrace) {
        appStartTrace.m38257m();
    }

    /* renamed from: c */
    public static /* synthetic */ void m38267c(AppStartTrace appStartTrace) {
        appStartTrace.m38254p();
    }

    /* renamed from: d */
    public static /* synthetic */ void m38266d(AppStartTrace appStartTrace) {
        appStartTrace.m38253q();
    }

    /* renamed from: e */
    public static /* synthetic */ void m38265e(AppStartTrace appStartTrace) {
        appStartTrace.m38255o();
    }

    public static AppStartTrace getInstance() {
        if (f56145A != null) {
            return f56145A;
        }
        return m38260j(TransportManager.getInstance(), new Clock());
    }

    /* renamed from: h */
    public static /* synthetic */ int m38262h(AppStartTrace appStartTrace) {
        int i = appStartTrace.f56170v;
        appStartTrace.f56170v = i + 1;
        return i;
    }

    public static boolean isAnyAppProcessInForeground(Context context) {
        boolean z;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            String packageName = context.getPackageName();
            String str = packageName + ":";
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(str))) {
                    if (Build.VERSION.SDK_INT < 23) {
                        z = isScreenOn(context);
                    } else {
                        z = true;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static boolean isScreenOn(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return true;
        }
        return powerManager.isInteractive();
    }

    /* renamed from: j */
    public static AppStartTrace m38260j(TransportManager transportManager, Clock clock) {
        if (f56145A == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (f56145A == null) {
                        f56145A = new AppStartTrace(transportManager, clock, ConfigResolver.getInstance(), new ThreadPoolExecutor(0, 1, f56148z + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } finally {
                }
            }
        }
        return f56145A;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    /* renamed from: i */
    public final Timer m38261i() {
        Timer timer = this.f56159k;
        if (timer != null) {
            return timer;
        }
        return f56147y;
    }

    /* renamed from: k */
    public final Timer m38259k() {
        Timer timer = this.f56158j;
        if (timer != null) {
            return timer;
        }
        return m38261i();
    }

    /* renamed from: l */
    public final /* synthetic */ void m38258l(TraceMetric.Builder builder) {
        this.f56150b.log(builder.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
    }

    /* renamed from: m */
    public final void m38257m() {
        TraceMetric.Builder durationUs = TraceMetric.newBuilder().setName(Constants.TraceNames.APP_START_TRACE_NAME.toString()).setClientStartTimeUs(m38261i().getMicros()).setDurationUs(m38261i().getDurationMicros(this.f56162n));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(TraceMetric.newBuilder().setName(Constants.TraceNames.ON_CREATE_TRACE_NAME.toString()).setClientStartTimeUs(m38261i().getMicros()).setDurationUs(m38261i().getDurationMicros(this.f56160l)).build());
        if (this.f56161m != null) {
            TraceMetric.Builder newBuilder = TraceMetric.newBuilder();
            newBuilder.setName(Constants.TraceNames.ON_START_TRACE_NAME.toString()).setClientStartTimeUs(this.f56160l.getMicros()).setDurationUs(this.f56160l.getDurationMicros(this.f56161m));
            arrayList.add(newBuilder.build());
            TraceMetric.Builder newBuilder2 = TraceMetric.newBuilder();
            newBuilder2.setName(Constants.TraceNames.ON_RESUME_TRACE_NAME.toString()).setClientStartTimeUs(this.f56161m.getMicros()).setDurationUs(this.f56161m.getDurationMicros(this.f56162n));
            arrayList.add(newBuilder2.build());
        }
        durationUs.addAllSubtraces(arrayList).addPerfSessions(this.f56168t.build());
        this.f56150b.log(durationUs.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
    }

    /* renamed from: n */
    public final void m38256n(final TraceMetric.Builder builder) {
        if (this.f56165q != null && this.f56166r != null && this.f56167s != null) {
            f56146B.execute(new Runnable() { // from class: h6
                @Override // java.lang.Runnable
                public final void run() {
                    AppStartTrace.this.m38258l(builder);
                }
            });
            unregisterActivityLifecycleCallbacks();
        }
    }

    /* renamed from: o */
    public final void m38255o() {
        String str;
        if (this.f56167s != null) {
            return;
        }
        this.f56167s = this.f56151c.getTime();
        this.f56153e.addSubtraces(TraceMetric.newBuilder().setName("_experiment_onDrawFoQ").setClientStartTimeUs(m38259k().getMicros()).setDurationUs(m38259k().getDurationMicros(this.f56167s)).build());
        if (this.f56158j != null) {
            this.f56153e.addSubtraces(TraceMetric.newBuilder().setName("_experiment_procStart_to_classLoad").setClientStartTimeUs(m38259k().getMicros()).setDurationUs(m38259k().getDurationMicros(m38261i())).build());
        }
        TraceMetric.Builder builder = this.f56153e;
        if (this.f56172x) {
            str = "true";
        } else {
            str = "false";
        }
        builder.putCustomAttributes("systemDeterminedForeground", str);
        this.f56153e.putCounters("onDrawCount", this.f56170v);
        this.f56153e.addPerfSessions(this.f56168t.build());
        m38256n(this.f56153e);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x003e A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:31:0x0001, B:33:0x0005, B:36:0x000a, B:38:0x000f, B:45:0x001d, B:47:0x003e), top: B:54:0x0001 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void onActivityCreated(android.app.Activity r5, android.os.Bundle r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r6 = r4.f56169u     // Catch: java.lang.Throwable -> L1a
            if (r6 != 0) goto L42
            com.google.firebase.perf.util.Timer r6 = r4.f56160l     // Catch: java.lang.Throwable -> L1a
            if (r6 == 0) goto La
            goto L42
        La:
            boolean r6 = r4.f56172x     // Catch: java.lang.Throwable -> L1a
            r0 = 1
            if (r6 != 0) goto L1c
            android.content.Context r6 = r4.f56154f     // Catch: java.lang.Throwable -> L1a
            boolean r6 = isAnyAppProcessInForeground(r6)     // Catch: java.lang.Throwable -> L1a
            if (r6 == 0) goto L18
            goto L1c
        L18:
            r6 = 0
            goto L1d
        L1a:
            r5 = move-exception
            goto L44
        L1c:
            r6 = 1
        L1d:
            r4.f56172x = r6     // Catch: java.lang.Throwable -> L1a
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L1a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            r4.f56155g = r6     // Catch: java.lang.Throwable -> L1a
            com.google.firebase.perf.util.Clock r5 = r4.f56151c     // Catch: java.lang.Throwable -> L1a
            com.google.firebase.perf.util.Timer r5 = r5.getTime()     // Catch: java.lang.Throwable -> L1a
            r4.f56160l = r5     // Catch: java.lang.Throwable -> L1a
            com.google.firebase.perf.util.Timer r5 = r4.m38259k()     // Catch: java.lang.Throwable -> L1a
            com.google.firebase.perf.util.Timer r6 = r4.f56160l     // Catch: java.lang.Throwable -> L1a
            long r5 = r5.getDurationMicros(r6)     // Catch: java.lang.Throwable -> L1a
            long r1 = com.google.firebase.perf.metrics.AppStartTrace.f56148z     // Catch: java.lang.Throwable -> L1a
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L40
            r4.f56157i = r0     // Catch: java.lang.Throwable -> L1a
        L40:
            monitor-exit(r4)
            return
        L42:
            monitor-exit(r4)
            return
        L44:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (!this.f56169u && !this.f56157i && this.f56152d.getIsExperimentTTIDEnabled()) {
            activity.findViewById(16908290).getViewTreeObserver().removeOnDrawListener(this.f56171w);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (!this.f56169u && !this.f56157i) {
                boolean isExperimentTTIDEnabled = this.f56152d.getIsExperimentTTIDEnabled();
                if (isExperimentTTIDEnabled) {
                    View findViewById = activity.findViewById(16908290);
                    findViewById.getViewTreeObserver().addOnDrawListener(this.f56171w);
                    FirstDrawDoneListener.registerForNextDraw(findViewById, new Runnable() { // from class: d6
                        {
                            AppStartTrace.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace.m38265e(AppStartTrace.this);
                        }
                    });
                    PreDrawListener.registerForNextDraw(findViewById, new Runnable() { // from class: e6
                        {
                            AppStartTrace.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace.m38267c(AppStartTrace.this);
                        }
                    }, new Runnable() { // from class: f6
                        {
                            AppStartTrace.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace.m38266d(AppStartTrace.this);
                        }
                    });
                }
                if (this.f56162n != null) {
                    return;
                }
                this.f56156h = new WeakReference(activity);
                this.f56162n = this.f56151c.getTime();
                this.f56168t = SessionManager.getInstance().perfSession();
                AndroidLogger androidLogger = AndroidLogger.getInstance();
                androidLogger.debug("onResume(): " + activity.getClass().getName() + ": " + m38261i().getDurationMicros(this.f56162n) + " microseconds");
                f56146B.execute(new Runnable() { // from class: g6
                    {
                        AppStartTrace.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.m38268b(AppStartTrace.this);
                    }
                });
                if (!isExperimentTTIDEnabled) {
                    unregisterActivityLifecycleCallbacks();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.f56169u && this.f56161m == null && !this.f56157i) {
            this.f56161m = this.f56151c.getTime();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Keep
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onAppEnteredBackground() {
        if (!this.f56169u && !this.f56157i && this.f56164p == null) {
            this.f56164p = this.f56151c.getTime();
            this.f56153e.addSubtraces(TraceMetric.newBuilder().setName("_experiment_firstBackgrounding").setClientStartTimeUs(m38259k().getMicros()).setDurationUs(m38259k().getDurationMicros(this.f56164p)).build());
        }
    }

    @Keep
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onAppEnteredForeground() {
        if (!this.f56169u && !this.f56157i && this.f56163o == null) {
            this.f56163o = this.f56151c.getTime();
            this.f56153e.addSubtraces(TraceMetric.newBuilder().setName("_experiment_firstForegrounding").setClientStartTimeUs(m38259k().getMicros()).setDurationUs(m38259k().getDurationMicros(this.f56163o)).build());
        }
    }

    /* renamed from: p */
    public final void m38254p() {
        if (this.f56165q != null) {
            return;
        }
        this.f56165q = this.f56151c.getTime();
        this.f56153e.setClientStartTimeUs(m38259k().getMicros()).setDurationUs(m38259k().getDurationMicros(this.f56165q));
        m38256n(this.f56153e);
    }

    /* renamed from: q */
    public final void m38253q() {
        if (this.f56166r != null) {
            return;
        }
        this.f56166r = this.f56151c.getTime();
        this.f56153e.addSubtraces(TraceMetric.newBuilder().setName("_experiment_preDrawFoQ").setClientStartTimeUs(m38259k().getMicros()).setDurationUs(m38259k().getDurationMicros(this.f56166r)).build());
        m38256n(this.f56153e);
    }

    public synchronized void registerActivityLifecycleCallbacks(@NonNull Context context) {
        boolean z;
        try {
            if (this.f56149a) {
                return;
            }
            ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                if (!this.f56172x && !isAnyAppProcessInForeground(applicationContext)) {
                    z = false;
                    this.f56172x = z;
                    this.f56149a = true;
                    this.f56154f = applicationContext;
                }
                z = true;
                this.f56172x = z;
                this.f56149a = true;
                this.f56154f = applicationContext;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void unregisterActivityLifecycleCallbacks() {
        if (!this.f56149a) {
            return;
        }
        ProcessLifecycleOwner.get().getLifecycle().removeObserver(this);
        ((Application) this.f56154f).unregisterActivityLifecycleCallbacks(this);
        this.f56149a = false;
    }
}
