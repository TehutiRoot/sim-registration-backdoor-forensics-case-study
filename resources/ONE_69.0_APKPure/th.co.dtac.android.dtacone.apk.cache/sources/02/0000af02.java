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
    public final Deferred f54753a;

    /* renamed from: b */
    public volatile AnalyticsEventLogger f54754b;

    /* renamed from: c */
    public volatile BreadcrumbSource f54755c;

    /* renamed from: d */
    public final List f54756d;

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred) {
        this(deferred, new DisabledBreadcrumbSource(), new UnavailableAnalyticsEventLogger());
    }

    /* renamed from: a */
    public static /* synthetic */ void m39157a(AnalyticsDeferredProxy analyticsDeferredProxy, Provider provider) {
        analyticsDeferredProxy.m39151g(provider);
    }

    /* renamed from: b */
    public static /* synthetic */ void m39156b(AnalyticsDeferredProxy analyticsDeferredProxy, String str, Bundle bundle) {
        analyticsDeferredProxy.m39153e(str, bundle);
    }

    /* renamed from: c */
    public static /* synthetic */ void m39155c(AnalyticsDeferredProxy analyticsDeferredProxy, BreadcrumbHandler breadcrumbHandler) {
        analyticsDeferredProxy.m39152f(breadcrumbHandler);
    }

    /* renamed from: h */
    public static AnalyticsConnector.AnalyticsConnectorHandle m39150h(AnalyticsConnector analyticsConnector, C1333Sy c1333Sy) {
        AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener = analyticsConnector.registerAnalyticsConnectorListener("clx", c1333Sy);
        if (registerAnalyticsConnectorListener == null) {
            Logger.getLogger().m39132d("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            registerAnalyticsConnectorListener = analyticsConnector.registerAnalyticsConnectorListener(AppMeasurement.CRASH_ORIGIN, c1333Sy);
            if (registerAnalyticsConnectorListener != null) {
                Logger.getLogger().m39124w("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return registerAnalyticsConnectorListener;
    }

    /* renamed from: d */
    public final void m39154d() {
        this.f54753a.whenAvailable(new Deferred.DeferredHandler() { // from class: K2
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                AnalyticsDeferredProxy.m39157a(AnalyticsDeferredProxy.this, provider);
            }
        });
    }

    /* renamed from: e */
    public final /* synthetic */ void m39153e(String str, Bundle bundle) {
        this.f54754b.logEvent(str, bundle);
    }

    /* renamed from: f */
    public final /* synthetic */ void m39152f(BreadcrumbHandler breadcrumbHandler) {
        synchronized (this) {
            try {
                if (this.f54755c instanceof DisabledBreadcrumbSource) {
                    this.f54756d.add(breadcrumbHandler);
                }
                this.f54755c.registerBreadcrumbHandler(breadcrumbHandler);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void m39151g(Provider provider) {
        Logger.getLogger().m39132d("AnalyticsConnector now available.");
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) provider.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(analyticsConnector);
        C1333Sy c1333Sy = new C1333Sy();
        if (m39150h(analyticsConnector, c1333Sy) != null) {
            Logger.getLogger().m39132d("Registered Firebase Analytics listener.");
            BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
            BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                try {
                    for (BreadcrumbHandler breadcrumbHandler : this.f54756d) {
                        breadcrumbAnalyticsEventReceiver.registerBreadcrumbHandler(breadcrumbHandler);
                    }
                    c1333Sy.m66429c(breadcrumbAnalyticsEventReceiver);
                    c1333Sy.m66428d(blockingAnalyticsEventLogger);
                    this.f54755c = breadcrumbAnalyticsEventReceiver;
                    this.f54754b = blockingAnalyticsEventLogger;
                } finally {
                }
            }
            return;
        }
        Logger.getLogger().m39124w("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    public AnalyticsEventLogger getAnalyticsEventLogger() {
        return new AnalyticsEventLogger() { // from class: J2
            @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
            public final void logEvent(String str, Bundle bundle) {
                AnalyticsDeferredProxy.m39156b(AnalyticsDeferredProxy.this, str, bundle);
            }
        };
    }

    public BreadcrumbSource getDeferredBreadcrumbSource() {
        return new BreadcrumbSource() { // from class: I2
            @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
            public final void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
                AnalyticsDeferredProxy.m39155c(AnalyticsDeferredProxy.this, breadcrumbHandler);
            }
        };
    }

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred, @NonNull BreadcrumbSource breadcrumbSource, @NonNull AnalyticsEventLogger analyticsEventLogger) {
        this.f54753a = deferred;
        this.f54755c = breadcrumbSource;
        this.f54756d = new ArrayList();
        this.f54754b = analyticsEventLogger;
        m39154d();
    }
}