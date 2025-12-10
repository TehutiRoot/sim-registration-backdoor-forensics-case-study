package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class AnalyticsDeferredProxy {

    /* renamed from: a */
    public final Deferred f54741a;

    /* renamed from: b */
    public volatile AnalyticsEventLogger f54742b;

    /* renamed from: c */
    public volatile BreadcrumbSource f54743c;

    /* renamed from: d */
    public final List f54744d;

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred) {
        this(deferred, new DisabledBreadcrumbSource(), new UnavailableAnalyticsEventLogger());
    }

    /* renamed from: a */
    public static /* synthetic */ void m39165a(AnalyticsDeferredProxy analyticsDeferredProxy, Provider provider) {
        analyticsDeferredProxy.m39159g(provider);
    }

    /* renamed from: b */
    public static /* synthetic */ void m39164b(AnalyticsDeferredProxy analyticsDeferredProxy, String str, Bundle bundle) {
        analyticsDeferredProxy.m39161e(str, bundle);
    }

    /* renamed from: c */
    public static /* synthetic */ void m39163c(AnalyticsDeferredProxy analyticsDeferredProxy, BreadcrumbHandler breadcrumbHandler) {
        analyticsDeferredProxy.m39160f(breadcrumbHandler);
    }

    /* renamed from: h */
    public static AnalyticsConnector.AnalyticsConnectorHandle m39158h(AnalyticsConnector analyticsConnector, C1350Sy c1350Sy) {
        AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener = analyticsConnector.registerAnalyticsConnectorListener("clx", c1350Sy);
        if (registerAnalyticsConnectorListener == null) {
            Logger.getLogger().m39140d("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            registerAnalyticsConnectorListener = analyticsConnector.registerAnalyticsConnectorListener(AppMeasurement.CRASH_ORIGIN, c1350Sy);
            if (registerAnalyticsConnectorListener != null) {
                Logger.getLogger().m39132w("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return registerAnalyticsConnectorListener;
    }

    /* renamed from: d */
    public final void m39162d() {
        this.f54741a.whenAvailable(new Deferred.DeferredHandler() { // from class: K2
            {
                AnalyticsDeferredProxy.this = this;
            }

            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                AnalyticsDeferredProxy.m39165a(AnalyticsDeferredProxy.this, provider);
            }
        });
    }

    /* renamed from: e */
    public final /* synthetic */ void m39161e(String str, Bundle bundle) {
        this.f54742b.logEvent(str, bundle);
    }

    /* renamed from: f */
    public final /* synthetic */ void m39160f(BreadcrumbHandler breadcrumbHandler) {
        synchronized (this) {
            try {
                if (this.f54743c instanceof DisabledBreadcrumbSource) {
                    this.f54744d.add(breadcrumbHandler);
                }
                this.f54743c.registerBreadcrumbHandler(breadcrumbHandler);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void m39159g(Provider provider) {
        Logger.getLogger().m39140d("AnalyticsConnector now available.");
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) provider.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(analyticsConnector);
        C1350Sy c1350Sy = new C1350Sy();
        if (m39158h(analyticsConnector, c1350Sy) != null) {
            Logger.getLogger().m39140d("Registered Firebase Analytics listener.");
            BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
            BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                try {
                    for (BreadcrumbHandler breadcrumbHandler : this.f54744d) {
                        breadcrumbAnalyticsEventReceiver.registerBreadcrumbHandler(breadcrumbHandler);
                    }
                    c1350Sy.m66254c(breadcrumbAnalyticsEventReceiver);
                    c1350Sy.m66253d(blockingAnalyticsEventLogger);
                    this.f54743c = breadcrumbAnalyticsEventReceiver;
                    this.f54742b = blockingAnalyticsEventLogger;
                } finally {
                }
            }
            return;
        }
        Logger.getLogger().m39132w("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    public AnalyticsEventLogger getAnalyticsEventLogger() {
        return new AnalyticsEventLogger() { // from class: J2
            {
                AnalyticsDeferredProxy.this = this;
            }

            @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
            public final void logEvent(String str, Bundle bundle) {
                AnalyticsDeferredProxy.m39164b(AnalyticsDeferredProxy.this, str, bundle);
            }
        };
    }

    public BreadcrumbSource getDeferredBreadcrumbSource() {
        return new BreadcrumbSource() { // from class: I2
            {
                AnalyticsDeferredProxy.this = this;
            }

            @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
            public final void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
                AnalyticsDeferredProxy.m39163c(AnalyticsDeferredProxy.this, breadcrumbHandler);
            }
        };
    }

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred, @NonNull BreadcrumbSource breadcrumbSource, @NonNull AnalyticsEventLogger analyticsEventLogger) {
        this.f54741a = deferred;
        this.f54743c = breadcrumbSource;
        this.f54744d = new ArrayList();
        this.f54742b = analyticsEventLogger;
        m39162d();
    }
}
