package com.google.firebase.perf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.logging.ConsoleUrlGenerator;
import com.google.firebase.perf.metrics.HttpMetric;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.ImmutableBundle;
import com.google.firebase.perf.util.Timer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes4.dex */
public class FirebasePerformance implements FirebasePerformanceAttributable {
    public static final int MAX_TRACE_NAME_LENGTH = 100;

    /* renamed from: i */
    public static final AndroidLogger f56045i = AndroidLogger.getInstance();

    /* renamed from: a */
    public final Map f56046a = new ConcurrentHashMap();

    /* renamed from: b */
    public final ConfigResolver f56047b;

    /* renamed from: c */
    public final ImmutableBundle f56048c;

    /* renamed from: d */
    public Boolean f56049d;

    /* renamed from: e */
    public final FirebaseApp f56050e;

    /* renamed from: f */
    public final Provider f56051f;

    /* renamed from: g */
    public final FirebaseInstallationsApi f56052g;

    /* renamed from: h */
    public final Provider f56053h;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface HttpMethod {
        public static final String CONNECT = "CONNECT";
        public static final String DELETE = "DELETE";
        public static final String GET = "GET";
        public static final String HEAD = "HEAD";
        public static final String OPTIONS = "OPTIONS";
        public static final String PATCH = "PATCH";
        public static final String POST = "POST";
        public static final String PUT = "PUT";
        public static final String TRACE = "TRACE";
    }

    public FirebasePerformance(FirebaseApp firebaseApp, Provider provider, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider2, RemoteConfigManager remoteConfigManager, ConfigResolver configResolver, SessionManager sessionManager) {
        this.f56049d = null;
        this.f56050e = firebaseApp;
        this.f56051f = provider;
        this.f56052g = firebaseInstallationsApi;
        this.f56053h = provider2;
        if (firebaseApp == null) {
            this.f56049d = Boolean.FALSE;
            this.f56047b = configResolver;
            this.f56048c = new ImmutableBundle(new Bundle());
            return;
        }
        TransportManager.getInstance().initialize(firebaseApp, firebaseInstallationsApi, provider2);
        Context applicationContext = firebaseApp.getApplicationContext();
        ImmutableBundle m38313b = m38313b(applicationContext);
        this.f56048c = m38313b;
        remoteConfigManager.setFirebaseRemoteConfigProvider(provider);
        this.f56047b = configResolver;
        configResolver.setMetadataBundle(m38313b);
        configResolver.setApplicationContext(applicationContext);
        sessionManager.setApplicationContext(applicationContext);
        this.f56049d = configResolver.getIsPerformanceCollectionEnabled();
        AndroidLogger androidLogger = f56045i;
        if (androidLogger.isLogcatEnabled() && isPerformanceCollectionEnabled()) {
            androidLogger.info(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", ConsoleUrlGenerator.generateDashboardUrl(firebaseApp.getOptions().getProjectId(), applicationContext.getPackageName())));
        }
    }

    /* renamed from: a */
    private void m38314a(String str, String str2) {
        if (str != null && str2 != null) {
            if (!this.f56046a.containsKey(str) && this.f56046a.size() >= 5) {
                throw new IllegalArgumentException(String.format(Locale.US, "Exceeds max limit of number of attributes - %d", 5));
            }
            PerfMetricValidator.validateAttribute(str, str2);
            return;
        }
        throw new IllegalArgumentException("Attribute must not have null key or value.");
    }

    /* renamed from: b */
    public static ImmutableBundle m38313b(Context context) {
        Bundle bundle;
        ImmutableBundle immutableBundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("No perf enable meta data found ");
            sb.append(e.getMessage());
            bundle = null;
        }
        if (bundle != null) {
            immutableBundle = new ImmutableBundle(bundle);
        } else {
            immutableBundle = new ImmutableBundle();
        }
        return immutableBundle;
    }

    @NonNull
    public static FirebasePerformance getInstance() {
        return (FirebasePerformance) FirebaseApp.getInstance().get(FirebasePerformance.class);
    }

    @NonNull
    public static Trace startTrace(@NonNull String str) {
        Trace create = Trace.create(str);
        create.start();
        return create;
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    @Nullable
    public String getAttribute(@NonNull String str) {
        return (String) this.f56046a.get(str);
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    @NonNull
    public Map<String, String> getAttributes() {
        return new HashMap(this.f56046a);
    }

    public boolean isPerformanceCollectionEnabled() {
        Boolean bool = this.f56049d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return FirebaseApp.getInstance().isDataCollectionDefaultEnabled();
    }

    @NonNull
    public HttpMetric newHttpMetric(@NonNull String str, @NonNull String str2) {
        return new HttpMetric(str, str2, TransportManager.getInstance(), new Timer());
    }

    @NonNull
    public Trace newTrace(@NonNull String str) {
        return Trace.create(str);
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            m38314a(str, str2);
            z = true;
        } catch (Exception e) {
            f56045i.error("Can not set attribute %s with value %s (%s)", str, str2, e.getMessage());
        }
        if (z) {
            this.f56046a.put(str, str2);
        }
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    public void removeAttribute(@NonNull String str) {
        this.f56046a.remove(str);
    }

    public void setPerformanceCollectionEnabled(boolean z) {
        setPerformanceCollectionEnabled(Boolean.valueOf(z));
    }

    @NonNull
    public HttpMetric newHttpMetric(@NonNull URL url, @NonNull String str) {
        return new HttpMetric(url, str, TransportManager.getInstance(), new Timer());
    }

    public synchronized void setPerformanceCollectionEnabled(@Nullable Boolean bool) {
        try {
            FirebaseApp.getInstance();
            if (this.f56047b.getIsPerformanceCollectionDeactivated().booleanValue()) {
                f56045i.info("Firebase Performance is permanently disabled");
                return;
            }
            this.f56047b.setIsPerformanceCollectionEnabled(bool);
            if (bool != null) {
                this.f56049d = bool;
            } else {
                this.f56049d = this.f56047b.getIsPerformanceCollectionEnabled();
            }
            if (Boolean.TRUE.equals(this.f56049d)) {
                f56045i.info("Firebase Performance is Enabled");
            } else if (Boolean.FALSE.equals(this.f56049d)) {
                f56045i.info("Firebase Performance is Disabled");
            }
        } catch (IllegalStateException unused) {
        }
    }
}
