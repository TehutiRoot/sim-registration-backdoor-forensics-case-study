package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.google.firebase.remoteconfig.internal.Personalization;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
/* loaded from: classes4.dex */
public class RemoteConfigComponent {
    public static final String ACTIVATE_FILE_NAME = "activate";
    public static final long CONNECTION_TIMEOUT_IN_SECONDS = 60;
    public static final String DEFAULTS_FILE_NAME = "defaults";
    @VisibleForTesting
    public static final String DEFAULT_NAMESPACE = "firebase";
    public static final String FETCH_FILE_NAME = "fetch";

    /* renamed from: j */
    public static final Clock f56334j = DefaultClock.getInstance();

    /* renamed from: k */
    public static final Random f56335k = new Random();

    /* renamed from: l */
    public static final Map f56336l = new HashMap();

    /* renamed from: a */
    public final Map f56337a;

    /* renamed from: b */
    public final Context f56338b;

    /* renamed from: c */
    public final ScheduledExecutorService f56339c;

    /* renamed from: d */
    public final FirebaseApp f56340d;

    /* renamed from: e */
    public final FirebaseInstallationsApi f56341e;

    /* renamed from: f */
    public final FirebaseABTesting f56342f;

    /* renamed from: g */
    public final Provider f56343g;

    /* renamed from: h */
    public final String f56344h;

    /* renamed from: i */
    public Map f56345i;

    /* renamed from: com.google.firebase.remoteconfig.RemoteConfigComponent$a */
    /* loaded from: classes4.dex */
    public static class C8628a implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a */
        public static final AtomicReference f56346a = new AtomicReference();

        /* renamed from: b */
        public static void m37780b(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference = f56346a;
            if (atomicReference.get() == null) {
                C8628a c8628a = new C8628a();
                if (AbstractC17300An1.m69050a(atomicReference, null, c8628a)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(c8628a);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            RemoteConfigComponent.m37782o(z);
        }
    }

    public RemoteConfigComponent(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider provider) {
        this(context, scheduledExecutorService, firebaseApp, firebaseInstallationsApi, firebaseABTesting, provider, true);
    }

    /* renamed from: a */
    public static /* synthetic */ AnalyticsConnector m37796a() {
        return m37783n();
    }

    /* renamed from: i */
    public static ConfigMetadataClient m37788i(Context context, String str, String str2) {
        return new ConfigMetadataClient(context.getSharedPreferences(String.format("%s_%s_%s_%s", FirebaseABTesting.OriginService.REMOTE_CONFIG, str, str2, "settings"), 0));
    }

    /* renamed from: j */
    public static Personalization m37787j(FirebaseApp firebaseApp, String str, Provider provider) {
        if (m37784m(firebaseApp) && str.equals(DEFAULT_NAMESPACE)) {
            return new Personalization(provider);
        }
        return null;
    }

    /* renamed from: l */
    public static boolean m37785l(FirebaseApp firebaseApp, String str) {
        if (str.equals(DEFAULT_NAMESPACE) && m37784m(firebaseApp)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m37784m(FirebaseApp firebaseApp) {
        return firebaseApp.getName().equals(FirebaseApp.DEFAULT_APP_NAME);
    }

    /* renamed from: n */
    public static /* synthetic */ AnalyticsConnector m37783n() {
        return null;
    }

    /* renamed from: o */
    public static synchronized void m37782o(boolean z) {
        synchronized (RemoteConfigComponent.class) {
            for (FirebaseRemoteConfig firebaseRemoteConfig : f56336l.values()) {
                firebaseRemoteConfig.m37803t(z);
            }
        }
    }

    /* renamed from: c */
    public synchronized FirebaseRemoteConfig m37794c(FirebaseApp firebaseApp, String str, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient) {
        try {
            if (!this.f56337a.containsKey(str)) {
                FirebaseRemoteConfig firebaseRemoteConfig = new FirebaseRemoteConfig(this.f56338b, firebaseApp, firebaseInstallationsApi, m37785l(firebaseApp, str) ? firebaseABTesting : null, executor, configCacheClient, configCacheClient2, configCacheClient3, configFetchHandler, configGetParameterHandler, configMetadataClient, m37786k(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient2, this.f56338b, str, configMetadataClient));
                firebaseRemoteConfig.m37801v();
                this.f56337a.put(str, firebaseRemoteConfig);
                f56336l.put(str, firebaseRemoteConfig);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (FirebaseRemoteConfig) this.f56337a.get(str);
    }

    /* renamed from: d */
    public final ConfigCacheClient m37793d(String str, String str2) {
        return ConfigCacheClient.getInstance(this.f56339c, ConfigStorageClient.getInstance(this.f56338b, String.format("%s_%s_%s_%s.json", FirebaseABTesting.OriginService.REMOTE_CONFIG, this.f56344h, str, str2)));
    }

    /* renamed from: e */
    public FirebaseRemoteConfig m37792e() {
        return get(DEFAULT_NAMESPACE);
    }

    /* renamed from: f */
    public synchronized ConfigFetchHandler m37791f(String str, ConfigCacheClient configCacheClient, ConfigMetadataClient configMetadataClient) {
        FirebaseInstallationsApi firebaseInstallationsApi;
        Provider provider;
        try {
            firebaseInstallationsApi = this.f56341e;
            if (m37784m(this.f56340d)) {
                provider = this.f56343g;
            } else {
                provider = new Provider() { // from class: lv1
                    @Override // com.google.firebase.inject.Provider
                    public final Object get() {
                        return RemoteConfigComponent.m37796a();
                    }
                };
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new ConfigFetchHandler(firebaseInstallationsApi, provider, this.f56339c, f56334j, f56335k, configCacheClient, m37790g(this.f56340d.getOptions().getApiKey(), str, configMetadataClient), configMetadataClient, this.f56345i);
    }

    /* renamed from: g */
    public ConfigFetchHttpClient m37790g(String str, String str2, ConfigMetadataClient configMetadataClient) {
        return new ConfigFetchHttpClient(this.f56338b, this.f56340d.getOptions().getApplicationId(), str, str2, configMetadataClient.getFetchTimeoutInSeconds(), configMetadataClient.getFetchTimeoutInSeconds());
    }

    @KeepForSdk
    @VisibleForTesting
    public synchronized FirebaseRemoteConfig get(String str) {
        ConfigCacheClient m37793d;
        ConfigCacheClient m37793d2;
        ConfigCacheClient m37793d3;
        ConfigMetadataClient m37788i;
        ConfigGetParameterHandler m37789h;
        try {
            m37793d = m37793d(str, FETCH_FILE_NAME);
            m37793d2 = m37793d(str, ACTIVATE_FILE_NAME);
            m37793d3 = m37793d(str, DEFAULTS_FILE_NAME);
            m37788i = m37788i(this.f56338b, this.f56344h, str);
            m37789h = m37789h(m37793d2, m37793d3);
            final Personalization m37787j = m37787j(this.f56340d, str, this.f56343g);
            if (m37787j != null) {
                m37789h.addListener(new BiConsumer() { // from class: jv1
                    @Override // com.google.android.gms.common.util.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        Personalization.this.logArmActive((String) obj, (ConfigContainer) obj2);
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return m37794c(this.f56340d, str, this.f56341e, this.f56342f, this.f56339c, m37793d, m37793d2, m37793d3, m37791f(str, m37793d, m37788i), m37789h, m37788i);
    }

    /* renamed from: h */
    public final ConfigGetParameterHandler m37789h(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        return new ConfigGetParameterHandler(this.f56339c, configCacheClient, configCacheClient2);
    }

    /* renamed from: k */
    public synchronized ConfigRealtimeHandler m37786k(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, ConfigMetadataClient configMetadataClient) {
        return new ConfigRealtimeHandler(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, str, configMetadataClient, this.f56339c);
    }

    @VisibleForTesting
    public synchronized void setCustomHeaders(Map<String, String> map) {
        this.f56345i = map;
    }

    @VisibleForTesting
    public RemoteConfigComponent(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider<AnalyticsConnector> provider, boolean z) {
        this.f56337a = new HashMap();
        this.f56345i = new HashMap();
        this.f56338b = context;
        this.f56339c = scheduledExecutorService;
        this.f56340d = firebaseApp;
        this.f56341e = firebaseInstallationsApi;
        this.f56342f = firebaseABTesting;
        this.f56343g = provider;
        this.f56344h = firebaseApp.getOptions().getApplicationId();
        C8628a.m37780b(context);
        if (z) {
            Tasks.call(scheduledExecutorService, new Callable() { // from class: kv1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return RemoteConfigComponent.this.m37792e();
                }
            });
        }
    }
}
