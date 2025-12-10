package com.google.firebase.perf.transport;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.logging.ConsoleUrlGenerator;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.p016v1.AndroidApplicationInfo;
import com.google.firebase.perf.p016v1.ApplicationInfo;
import com.google.firebase.perf.p016v1.ApplicationProcessState;
import com.google.firebase.perf.p016v1.GaugeMetric;
import com.google.firebase.perf.p016v1.NetworkRequestMetric;
import com.google.firebase.perf.p016v1.PerfMetric;
import com.google.firebase.perf.p016v1.PerfMetricOrBuilder;
import com.google.firebase.perf.p016v1.TraceMetric;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Rate;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class TransportManager implements AppStateMonitor.AppStateCallback {

    /* renamed from: r */
    public static final AndroidLogger f56249r = AndroidLogger.getInstance();

    /* renamed from: s */
    public static final TransportManager f56250s = new TransportManager();

    /* renamed from: a */
    public final Map f56251a;

    /* renamed from: d */
    public FirebaseApp f56254d;

    /* renamed from: e */
    public FirebasePerformance f56255e;

    /* renamed from: f */
    public FirebaseInstallationsApi f56256f;

    /* renamed from: g */
    public Provider f56257g;

    /* renamed from: h */
    public O20 f56258h;

    /* renamed from: j */
    public Context f56260j;

    /* renamed from: k */
    public ConfigResolver f56261k;

    /* renamed from: l */
    public C18076Mr1 f56262l;

    /* renamed from: m */
    public AppStateMonitor f56263m;

    /* renamed from: n */
    public ApplicationInfo.Builder f56264n;

    /* renamed from: o */
    public String f56265o;

    /* renamed from: p */
    public String f56266p;

    /* renamed from: b */
    public final ConcurrentLinkedQueue f56252b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public final AtomicBoolean f56253c = new AtomicBoolean(false);

    /* renamed from: q */
    public boolean f56267q = false;

    /* renamed from: i */
    public ExecutorService f56259i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public TransportManager() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f56251a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    /* renamed from: a */
    public static /* synthetic */ void m38187a(TransportManager transportManager) {
        transportManager.m38163y();
    }

    /* renamed from: b */
    public static /* synthetic */ void m38186b(TransportManager transportManager, C17929Kj1 c17929Kj1) {
        transportManager.m38169s(c17929Kj1);
    }

    /* renamed from: e */
    public static /* synthetic */ void m38183e(TransportManager transportManager) {
        transportManager.m38165w();
    }

    public static TransportManager getInstance() {
        return f56250s;
    }

    /* renamed from: k */
    public static String m38177k(GaugeMetric gaugeMetric) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(gaugeMetric.hasGaugeMetadata()), Integer.valueOf(gaugeMetric.getCpuMetricReadingsCount()), Integer.valueOf(gaugeMetric.getAndroidMemoryReadingsCount()));
    }

    /* renamed from: l */
    public static String m38176l(NetworkRequestMetric networkRequestMetric) {
        long j;
        String str;
        if (networkRequestMetric.hasTimeToResponseCompletedUs()) {
            j = networkRequestMetric.getTimeToResponseCompletedUs();
        } else {
            j = 0;
        }
        if (networkRequestMetric.hasHttpResponseCode()) {
            str = String.valueOf(networkRequestMetric.getHttpResponseCode());
        } else {
            str = "UNKNOWN";
        }
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", networkRequestMetric.getUrl(), str, new DecimalFormat("#.####").format(j / 1000.0d));
    }

    /* renamed from: m */
    public static String m38175m(PerfMetricOrBuilder perfMetricOrBuilder) {
        if (perfMetricOrBuilder.hasTraceMetric()) {
            return m38174n(perfMetricOrBuilder.getTraceMetric());
        }
        if (perfMetricOrBuilder.hasNetworkRequestMetric()) {
            return m38176l(perfMetricOrBuilder.getNetworkRequestMetric());
        }
        if (perfMetricOrBuilder.hasGaugeMetric()) {
            return m38177k(perfMetricOrBuilder.getGaugeMetric());
        }
        return "log";
    }

    /* renamed from: n */
    public static String m38174n(TraceMetric traceMetric) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", traceMetric.getName(), new DecimalFormat("#.####").format(traceMetric.getDurationUs() / 1000.0d));
    }

    /* renamed from: o */
    public static String m38173o(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str == null) {
                return "";
            }
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006b  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m38189A() {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            com.google.firebase.perf.config.ConfigResolver r2 = r6.f56261k
            boolean r2 = r2.isPerformanceMonitoringEnabled()
            if (r2 == 0) goto L72
            com.google.firebase.perf.v1.ApplicationInfo$Builder r2 = r6.f56264n
            boolean r2 = r2.hasAppInstanceId()
            if (r2 == 0) goto L17
            boolean r2 = r6.f56267q
            if (r2 != 0) goto L17
            return
        L17:
            com.google.firebase.installations.FirebaseInstallationsApi r2 = r6.f56256f     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
            com.google.android.gms.tasks.Task r2 = r2.getId()     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
            r4 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r2 = com.google.android.gms.tasks.Tasks.await(r2, r4, r3)     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
            goto L5f
        L29:
            r2 = move-exception
            goto L2f
        L2b:
            r2 = move-exception
            goto L3f
        L2d:
            r2 = move-exception
            goto L4f
        L2f:
            com.google.firebase.perf.logging.AndroidLogger r3 = com.google.firebase.perf.transport.TransportManager.f56249r
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is timed out: %s"
            r3.error(r0, r1)
            goto L5e
        L3f:
            com.google.firebase.perf.logging.AndroidLogger r3 = com.google.firebase.perf.transport.TransportManager.f56249r
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is interrupted: %s"
            r3.error(r0, r1)
            goto L5e
        L4f:
            com.google.firebase.perf.logging.AndroidLogger r3 = com.google.firebase.perf.transport.TransportManager.f56249r
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r2
            java.lang.String r0 = "Unable to retrieve Installation Id: %s"
            r3.error(r0, r1)
        L5e:
            r2 = 0
        L5f:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L6b
            com.google.firebase.perf.v1.ApplicationInfo$Builder r0 = r6.f56264n
            r0.setAppInstanceId(r2)
            goto L72
        L6b:
            com.google.firebase.perf.logging.AndroidLogger r0 = com.google.firebase.perf.transport.TransportManager.f56249r
            java.lang.String r1 = "Firebase Installation Id is empty, contact Firebase Support for debugging."
            r0.warn(r1)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.transport.TransportManager.m38189A():void");
    }

    /* renamed from: B */
    public final void m38188B() {
        if (this.f56255e == null && isInitialized()) {
            this.f56255e = FirebasePerformance.getInstance();
        }
    }

    @VisibleForTesting
    public void clearAppInstanceId() {
        this.f56264n.clearAppInstanceId();
    }

    /* renamed from: g */
    public final void m38181g(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            f56249r.info("Logging %s. In a minute, visit the Firebase console to view your data: %s", m38175m(perfMetric), m38179i(perfMetric.getTraceMetric()));
        } else {
            f56249r.info("Logging %s", m38175m(perfMetric));
        }
        this.f56258h.m67137b(perfMetric);
    }

    @VisibleForTesting
    public ConcurrentLinkedQueue<C17929Kj1> getPendingEventsQueue() {
        return new ConcurrentLinkedQueue<>(this.f56252b);
    }

    /* renamed from: h */
    public final void m38180h() {
        this.f56263m.registerForAppState(new WeakReference<>(f56250s));
        ApplicationInfo.Builder newBuilder = ApplicationInfo.newBuilder();
        this.f56264n = newBuilder;
        newBuilder.setGoogleAppId(this.f56254d.getOptions().getApplicationId()).setAndroidAppInfo(AndroidApplicationInfo.newBuilder().setPackageName(this.f56265o).setSdkVersion(BuildConfig.FIREPERF_VERSION_NAME).setVersionName(m38173o(this.f56260j)));
        this.f56253c.set(true);
        while (!this.f56252b.isEmpty()) {
            final C17929Kj1 c17929Kj1 = (C17929Kj1) this.f56252b.poll();
            if (c17929Kj1 != null) {
                this.f56259i.execute(new Runnable() { // from class: AV1
                    {
                        TransportManager.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        TransportManager.m38186b(TransportManager.this, c17929Kj1);
                    }
                });
            }
        }
    }

    /* renamed from: i */
    public final String m38179i(TraceMetric traceMetric) {
        String name = traceMetric.getName();
        if (name.startsWith(Constants.SCREEN_TRACE_PREFIX)) {
            return ConsoleUrlGenerator.generateScreenTraceUrl(this.f56266p, this.f56265o, name);
        }
        return ConsoleUrlGenerator.generateCustomTraceUrl(this.f56266p, this.f56265o, name);
    }

    public void initialize(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseInstallationsApi firebaseInstallationsApi, @NonNull Provider<TransportFactory> provider) {
        this.f56254d = firebaseApp;
        this.f56266p = firebaseApp.getOptions().getProjectId();
        this.f56256f = firebaseInstallationsApi;
        this.f56257g = provider;
        this.f56259i.execute(new Runnable() { // from class: zV1
            {
                TransportManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TransportManager.m38187a(TransportManager.this);
            }
        });
    }

    public boolean isInitialized() {
        return this.f56253c.get();
    }

    /* renamed from: j */
    public final Map m38178j() {
        m38188B();
        FirebasePerformance firebasePerformance = this.f56255e;
        if (firebasePerformance != null) {
            return firebasePerformance.getAttributes();
        }
        return Collections.emptyMap();
    }

    public void log(TraceMetric traceMetric) {
        log(traceMetric, ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN);
    }

    @Override // com.google.firebase.perf.application.AppStateMonitor.AppStateCallback
    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        boolean z;
        if (applicationProcessState == ApplicationProcessState.FOREGROUND) {
            z = true;
        } else {
            z = false;
        }
        this.f56267q = z;
        if (isInitialized()) {
            this.f56259i.execute(new Runnable() { // from class: vV1
                {
                    TransportManager.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TransportManager.m38183e(TransportManager.this);
                }
            });
        }
    }

    /* renamed from: p */
    public final void m38172p(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            this.f56263m.incrementCount(Constants.CounterNames.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (perfMetric.hasNetworkRequestMetric()) {
            this.f56263m.incrementCount(Constants.CounterNames.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    /* renamed from: q */
    public final boolean m38171q(PerfMetricOrBuilder perfMetricOrBuilder) {
        Integer num = (Integer) this.f56251a.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
        int intValue = num.intValue();
        Integer num2 = (Integer) this.f56251a.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
        int intValue2 = num2.intValue();
        Integer num3 = (Integer) this.f56251a.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
        int intValue3 = num3.intValue();
        if (perfMetricOrBuilder.hasTraceMetric() && intValue > 0) {
            this.f56251a.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        } else if (perfMetricOrBuilder.hasNetworkRequestMetric() && intValue2 > 0) {
            this.f56251a.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        } else if (perfMetricOrBuilder.hasGaugeMetric() && intValue3 > 0) {
            this.f56251a.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            return true;
        } else {
            f56249r.debug("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", m38175m(perfMetricOrBuilder), num, num2, num3);
            return false;
        }
    }

    /* renamed from: r */
    public final boolean m38170r(PerfMetric perfMetric) {
        if (!this.f56261k.isPerformanceMonitoringEnabled()) {
            f56249r.info("Performance collection is not enabled, dropping %s", m38175m(perfMetric));
            return false;
        } else if (!perfMetric.getApplicationInfo().hasAppInstanceId()) {
            f56249r.warn("App Instance ID is null or empty, dropping %s", m38175m(perfMetric));
            return false;
        } else if (!PerfMetricValidator.isValid(perfMetric, this.f56260j)) {
            f56249r.warn("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", m38175m(perfMetric));
            return false;
        } else if (!this.f56262l.m67274h(perfMetric)) {
            m38172p(perfMetric);
            f56249r.info("Event dropped due to device sampling - %s", m38175m(perfMetric));
            return false;
        } else if (!this.f56262l.m67275g(perfMetric)) {
            return true;
        } else {
            m38172p(perfMetric);
            f56249r.info("Rate limited (per device) - %s", m38175m(perfMetric));
            return false;
        }
    }

    /* renamed from: s */
    public final /* synthetic */ void m38169s(C17929Kj1 c17929Kj1) {
        m38162z(c17929Kj1.f3263a, c17929Kj1.f3264b);
    }

    @VisibleForTesting
    public void setInitialized(boolean z) {
        this.f56253c.set(z);
    }

    /* renamed from: t */
    public final /* synthetic */ void m38168t(TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
        m38162z(PerfMetric.newBuilder().setTraceMetric(traceMetric), applicationProcessState);
    }

    /* renamed from: u */
    public final /* synthetic */ void m38167u(NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
        m38162z(PerfMetric.newBuilder().setNetworkRequestMetric(networkRequestMetric), applicationProcessState);
    }

    /* renamed from: v */
    public final /* synthetic */ void m38166v(GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
        m38162z(PerfMetric.newBuilder().setGaugeMetric(gaugeMetric), applicationProcessState);
    }

    /* renamed from: w */
    public final /* synthetic */ void m38165w() {
        this.f56262l.m67281a(this.f56267q);
    }

    /* renamed from: x */
    public final PerfMetric m38164x(PerfMetric.Builder builder, ApplicationProcessState applicationProcessState) {
        m38189A();
        ApplicationInfo.Builder applicationProcessState2 = this.f56264n.setApplicationProcessState(applicationProcessState);
        if (builder.hasTraceMetric() || builder.hasNetworkRequestMetric()) {
            applicationProcessState2 = applicationProcessState2.clone().putAllCustomAttributes(m38178j());
        }
        return builder.setApplicationInfo(applicationProcessState2).build();
    }

    /* renamed from: y */
    public final void m38163y() {
        Context applicationContext = this.f56254d.getApplicationContext();
        this.f56260j = applicationContext;
        this.f56265o = applicationContext.getPackageName();
        this.f56261k = ConfigResolver.getInstance();
        this.f56262l = new C18076Mr1(this.f56260j, new Rate(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f56263m = AppStateMonitor.getInstance();
        this.f56258h = new O20(this.f56257g, this.f56261k.getAndCacheLogSourceName());
        m38180h();
    }

    /* renamed from: z */
    public final void m38162z(PerfMetric.Builder builder, ApplicationProcessState applicationProcessState) {
        if (!isInitialized()) {
            if (m38171q(builder)) {
                f56249r.debug("Transport is not initialized yet, %s will be queued for to be dispatched later", m38175m(builder));
                this.f56252b.add(new C17929Kj1(builder, applicationProcessState));
                return;
            }
            return;
        }
        PerfMetric m38164x = m38164x(builder, applicationProcessState);
        if (m38170r(m38164x)) {
            m38181g(m38164x);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    public void log(final TraceMetric traceMetric, final ApplicationProcessState applicationProcessState) {
        this.f56259i.execute(new Runnable() { // from class: xV1
            @Override // java.lang.Runnable
            public final void run() {
                TransportManager.this.m38168t(traceMetric, applicationProcessState);
            }
        });
    }

    public void log(NetworkRequestMetric networkRequestMetric) {
        log(networkRequestMetric, ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN);
    }

    public void log(final NetworkRequestMetric networkRequestMetric, final ApplicationProcessState applicationProcessState) {
        this.f56259i.execute(new Runnable() { // from class: yV1
            @Override // java.lang.Runnable
            public final void run() {
                TransportManager.this.m38167u(networkRequestMetric, applicationProcessState);
            }
        });
    }

    public void log(GaugeMetric gaugeMetric) {
        log(gaugeMetric, ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN);
    }

    public void log(final GaugeMetric gaugeMetric, final ApplicationProcessState applicationProcessState) {
        this.f56259i.execute(new Runnable() { // from class: wV1
            @Override // java.lang.Runnable
            public final void run() {
                TransportManager.this.m38166v(gaugeMetric, applicationProcessState);
            }
        });
    }
}
