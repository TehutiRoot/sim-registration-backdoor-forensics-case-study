package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.BuildConfig;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public class CrashlyticsCore {

    /* renamed from: a */
    public final Context f54780a;

    /* renamed from: b */
    public final FirebaseApp f54781b;
    @VisibleForTesting
    public final BreadcrumbSource breadcrumbSource;

    /* renamed from: c */
    public final DataCollectionArbiter f54782c;

    /* renamed from: f */
    public C12186kz f54785f;

    /* renamed from: g */
    public C12186kz f54786g;

    /* renamed from: h */
    public boolean f54787h;

    /* renamed from: i */
    public C8360b f54788i;

    /* renamed from: j */
    public final IdManager f54789j;

    /* renamed from: k */
    public final FileStore f54790k;

    /* renamed from: l */
    public final AnalyticsEventLogger f54791l;

    /* renamed from: m */
    public final CrashlyticsAppQualitySessionsSubscriber f54792m;

    /* renamed from: n */
    public final CrashlyticsNativeComponent f54793n;

    /* renamed from: o */
    public final RemoteConfigDeferredProxy f54794o;

    /* renamed from: p */
    public final CrashlyticsWorkers f54795p;

    /* renamed from: e */
    public final long f54784e = System.currentTimeMillis();

    /* renamed from: d */
    public final OnDemandCounter f54783d = new OnDemandCounter();

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, FileStore fileStore, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, RemoteConfigDeferredProxy remoteConfigDeferredProxy, CrashlyticsWorkers crashlyticsWorkers) {
        this.f54781b = firebaseApp;
        this.f54782c = dataCollectionArbiter;
        this.f54780a = firebaseApp.getApplicationContext();
        this.f54789j = idManager;
        this.f54793n = crashlyticsNativeComponent;
        this.breadcrumbSource = breadcrumbSource;
        this.f54791l = analyticsEventLogger;
        this.f54790k = fileStore;
        this.f54792m = crashlyticsAppQualitySessionsSubscriber;
        this.f54794o = remoteConfigDeferredProxy;
        this.f54795p = crashlyticsWorkers;
    }

    /* renamed from: a */
    public static /* synthetic */ void m39120a(CrashlyticsCore crashlyticsCore, long j, String str) {
        crashlyticsCore.m39100u(j, str);
    }

    /* renamed from: b */
    public static /* synthetic */ Boolean m39119b(CrashlyticsCore crashlyticsCore) {
        return crashlyticsCore.m39104q();
    }

    /* renamed from: c */
    public static /* synthetic */ void m39118c(CrashlyticsCore crashlyticsCore, Throwable th2) {
        crashlyticsCore.m39098w(th2);
    }

    /* renamed from: d */
    public static /* synthetic */ void m39117d(CrashlyticsCore crashlyticsCore, String str) {
        crashlyticsCore.m39123A(str);
    }

    /* renamed from: e */
    public static /* synthetic */ void m39116e(CrashlyticsCore crashlyticsCore, long j, String str) {
        crashlyticsCore.m39101t(j, str);
    }

    /* renamed from: f */
    public static /* synthetic */ void m39115f(CrashlyticsCore crashlyticsCore, SettingsProvider settingsProvider) {
        crashlyticsCore.m39102s(settingsProvider);
    }

    /* renamed from: g */
    public static /* synthetic */ void m39114g(CrashlyticsCore crashlyticsCore, String str, String str2) {
        crashlyticsCore.m39097x(str, str2);
    }

    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    /* renamed from: h */
    public static /* synthetic */ void m39113h(CrashlyticsCore crashlyticsCore, Map map) {
        crashlyticsCore.m39096y(map);
    }

    /* renamed from: i */
    public static /* synthetic */ void m39112i(CrashlyticsCore crashlyticsCore, Throwable th2, Map map) {
        crashlyticsCore.m39099v(th2, map);
    }

    /* renamed from: j */
    public static /* synthetic */ void m39111j(CrashlyticsCore crashlyticsCore, SettingsProvider settingsProvider) {
        crashlyticsCore.m39103r(settingsProvider);
    }

    /* renamed from: k */
    public static /* synthetic */ void m39110k(CrashlyticsCore crashlyticsCore, String str, String str2) {
        crashlyticsCore.m39095z(str, str2);
    }

    /* renamed from: p */
    public static boolean m39105p(String str, boolean z) {
        if (!z) {
            Logger.getLogger().m39134v("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: A */
    public final /* synthetic */ void m39123A(String str) {
        this.f54788i.m39009a0(str);
    }

    /* renamed from: B */
    public void m39122B() {
        CrashlyticsWorkers.checkBackgroundThread();
        try {
            if (!this.f54785f.m26576d()) {
                Logger.getLogger().m39132w("Initialization marker file was not properly removed.");
            }
        } catch (Exception e) {
            Logger.getLogger().m39137e("Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }

    /* renamed from: C */
    public void m39121C() {
        CrashlyticsWorkers.checkBackgroundThread();
        this.f54785f.m26579a();
        Logger.getLogger().m39134v("Initialization marker file was created.");
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        return this.f54788i.m38991n();
    }

    public Task<Void> deleteUnsentReports() {
        return this.f54788i.m38986s();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f54787h;
    }

    @CanIgnoreReturnValue
    public Task<Void> doBackgroundInitializationAsync(final SettingsProvider settingsProvider) {
        return this.f54795p.common.submit(new Runnable() { // from class: Yy
            {
                CrashlyticsCore.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsCore.m39111j(CrashlyticsCore.this, settingsProvider);
            }
        });
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.f54782c.isAutomaticDataCollectionEnabled();
    }

    /* renamed from: l */
    public final void m39109l() {
        try {
            this.f54787h = Boolean.TRUE.equals((Boolean) this.f54795p.common.getExecutor().submit(new Callable() { // from class: gz
                {
                    CrashlyticsCore.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return CrashlyticsCore.m39119b(CrashlyticsCore.this);
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f54787h = false;
        }
    }

    public void log(final String str) {
        final long currentTimeMillis = System.currentTimeMillis() - this.f54784e;
        this.f54795p.common.submit(new Runnable() { // from class: hz
            {
                CrashlyticsCore.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsCore.m39120a(CrashlyticsCore.this, currentTimeMillis, str);
            }
        });
    }

    public void logException(@NonNull final Throwable th2, @NonNull final Map<String, String> map) {
        this.f54795p.common.submit(new Runnable() { // from class: fz
            {
                CrashlyticsCore.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsCore.m39112i(CrashlyticsCore.this, th2, map);
            }
        });
    }

    public void logFatalException(final Throwable th2) {
        Logger logger = Logger.getLogger();
        logger.m39140d("Recorded on-demand fatal events: " + this.f54783d.getRecordedOnDemandExceptions());
        Logger logger2 = Logger.getLogger();
        logger2.m39140d("Dropped on-demand fatal events: " + this.f54783d.getDroppedOnDemandExceptions());
        this.f54795p.common.submit(new Runnable() { // from class: bz
            {
                CrashlyticsCore.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsCore.m39118c(CrashlyticsCore.this, th2);
            }
        });
    }

    /* renamed from: m */
    public boolean m39108m() {
        return this.f54785f.m26577c();
    }

    /* renamed from: n */
    public final void m39102s(SettingsProvider settingsProvider) {
        CrashlyticsWorkers.checkBackgroundThread();
        m39121C();
        try {
            try {
                this.breadcrumbSource.registerBreadcrumbHandler(new BreadcrumbHandler() { // from class: Zy
                    {
                        CrashlyticsCore.this = this;
                    }

                    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler
                    public final void handleBreadcrumb(String str) {
                        CrashlyticsCore.this.log(str);
                    }
                });
                this.f54788i.m39015V();
            } catch (Exception e) {
                Logger.getLogger().m39137e("Crashlytics encountered a problem during asynchronous initialization.", e);
            }
            if (settingsProvider.getSettingsSync().featureFlagData.collectReports) {
                if (!this.f54788i.m39036A(settingsProvider)) {
                    Logger.getLogger().m39132w("Previous sessions could not be finalized.");
                }
                this.f54788i.m39007b0(settingsProvider.getSettingsAsync());
                m39122B();
                return;
            }
            Logger.getLogger().m39140d("Collection of crash reports disabled in Crashlytics settings.");
            throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
        } catch (Throwable th2) {
            m39122B();
            throw th2;
        }
    }

    /* renamed from: o */
    public final void m39106o(final SettingsProvider settingsProvider) {
        Future<?> submit = this.f54795p.common.getExecutor().submit(new Runnable() { // from class: jz
            {
                CrashlyticsCore.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsCore.m39115f(CrashlyticsCore.this, settingsProvider);
            }
        });
        Logger.getLogger().m39140d("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Logger.getLogger().m39137e("Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Logger.getLogger().m39137e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Logger.getLogger().m39137e("Crashlytics timed out during initialization.", e3);
        }
    }

    public boolean onPreExecute(AppData appData, SettingsProvider settingsProvider) {
        if (m39105p(appData.buildId, CommonUtils.getBooleanResourceValue(this.f54780a, "com.crashlytics.RequireBuildId", true))) {
            String m31071c = new C10318gg().m31071c();
            try {
                this.f54786g = new C12186kz("crash_marker", this.f54790k);
                this.f54785f = new C12186kz("initialization_marker", this.f54790k);
                UserMetadata userMetadata = new UserMetadata(m31071c, this.f54790k, this.f54795p);
                LogFileManager logFileManager = new LogFileManager(this.f54790k);
                MiddleOutFallbackStrategy middleOutFallbackStrategy = new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10));
                this.f54794o.setupListener(userMetadata);
                this.f54788i = new C8360b(this.f54780a, this.f54789j, this.f54782c, this.f54790k, this.f54786g, appData, userMetadata, logFileManager, SessionReportingCoordinator.create(this.f54780a, this.f54789j, this.f54790k, appData, logFileManager, userMetadata, middleOutFallbackStrategy, settingsProvider, this.f54783d, this.f54792m, this.f54795p), this.f54793n, this.f54791l, this.f54792m, this.f54795p);
                boolean m39108m = m39108m();
                m39109l();
                this.f54788i.m38980y(m31071c, Thread.getDefaultUncaughtExceptionHandler(), settingsProvider);
                if (m39108m && CommonUtils.canTryConnection(this.f54780a)) {
                    Logger.getLogger().m39140d("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    m39106o(settingsProvider);
                    return false;
                }
                Logger.getLogger().m39140d("Successfully configured exception handler.");
                return true;
            } catch (Exception e) {
                Logger.getLogger().m39137e("Crashlytics was not started due to an exception during initialization", e);
                this.f54788i = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
    }

    /* renamed from: q */
    public final /* synthetic */ Boolean m39104q() {
        return Boolean.valueOf(this.f54788i.m38985t());
    }

    public Task<Void> sendUnsentReports() {
        return this.f54788i.m39014W();
    }

    public void setCrashlyticsCollectionEnabled(@Nullable Boolean bool) {
        this.f54782c.setCrashlyticsDataCollectionEnabled(bool);
    }

    public void setCustomKey(final String str, final String str2) {
        this.f54795p.common.submit(new Runnable() { // from class: dz
            {
                CrashlyticsCore.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsCore.m39114g(CrashlyticsCore.this, str, str2);
            }
        });
    }

    public void setCustomKeys(final Map<String, String> map) {
        if (!map.isEmpty()) {
            this.f54795p.common.submit(new Runnable() { // from class: iz
                {
                    CrashlyticsCore.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CrashlyticsCore.m39113h(CrashlyticsCore.this, map);
                }
            });
        }
    }

    public void setInternalKey(final String str, final String str2) {
        this.f54795p.common.submit(new Runnable() { // from class: ez
            {
                CrashlyticsCore.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsCore.m39110k(CrashlyticsCore.this, str, str2);
            }
        });
    }

    public void setUserId(final String str) {
        this.f54795p.common.submit(new Runnable() { // from class: cz
            {
                CrashlyticsCore.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsCore.m39117d(CrashlyticsCore.this, str);
            }
        });
    }

    /* renamed from: t */
    public final /* synthetic */ void m39101t(long j, String str) {
        this.f54788i.m38999f0(j, str);
    }

    /* renamed from: u */
    public final /* synthetic */ void m39100u(final long j, final String str) {
        this.f54795p.diskWrite.submit(new Runnable() { // from class: az
            {
                CrashlyticsCore.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsCore.m39116e(CrashlyticsCore.this, j, str);
            }
        });
    }

    /* renamed from: v */
    public final /* synthetic */ void m39099v(Throwable th2, Map map) {
        this.f54788i.m39001e0(Thread.currentThread(), th2, map);
    }

    /* renamed from: w */
    public final /* synthetic */ void m39098w(Throwable th2) {
        this.f54788i.m39011Z("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(this.f54783d.getRecordedOnDemandExceptions()));
        this.f54788i.m39011Z("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(this.f54783d.getDroppedOnDemandExceptions()));
        this.f54788i.m39020Q(Thread.currentThread(), th2);
    }

    /* renamed from: x */
    public final /* synthetic */ void m39097x(String str, String str2) {
        this.f54788i.m39013X(str, str2);
    }

    /* renamed from: y */
    public final /* synthetic */ void m39096y(Map map) {
        this.f54788i.m39012Y(map);
    }

    /* renamed from: z */
    public final /* synthetic */ void m39095z(String str, String str2) {
        this.f54788i.m39011Z(str, str2);
    }
}
