package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public class ConfigRealtimeHandler {

    /* renamed from: a */
    public final Set f56416a;

    /* renamed from: b */
    public final ConfigRealtimeHttpClient f56417b;

    /* renamed from: c */
    public final ConfigFetchHandler f56418c;

    /* renamed from: d */
    public final FirebaseApp f56419d;

    /* renamed from: e */
    public final FirebaseInstallationsApi f56420e;

    /* renamed from: f */
    public final ConfigCacheClient f56421f;

    /* renamed from: g */
    public final Context f56422g;

    /* renamed from: h */
    public final String f56423h;

    /* renamed from: i */
    public final ConfigMetadataClient f56424i;

    /* renamed from: j */
    public final ScheduledExecutorService f56425j;

    /* loaded from: classes4.dex */
    public class ConfigUpdateListenerRegistrationInternal implements ConfigUpdateListenerRegistration {

        /* renamed from: a */
        public final ConfigUpdateListener f56426a;

        public ConfigUpdateListenerRegistrationInternal(ConfigUpdateListener configUpdateListener) {
            this.f56426a = configUpdateListener;
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration
        public void remove() {
            ConfigRealtimeHandler.this.m37686c(this.f56426a);
        }
    }

    public ConfigRealtimeHandler(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, ConfigMetadataClient configMetadataClient, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f56416a = linkedHashSet;
        this.f56417b = new ConfigRealtimeHttpClient(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, str, linkedHashSet, configMetadataClient, scheduledExecutorService);
        this.f56419d = firebaseApp;
        this.f56418c = configFetchHandler;
        this.f56420e = firebaseInstallationsApi;
        this.f56421f = configCacheClient;
        this.f56422g = context;
        this.f56423h = str;
        this.f56424i = configMetadataClient;
        this.f56425j = scheduledExecutorService;
    }

    @NonNull
    public synchronized ConfigUpdateListenerRegistration addRealtimeConfigUpdateListener(@NonNull ConfigUpdateListener configUpdateListener) {
        this.f56416a.add(configUpdateListener);
        m37687b();
        return new ConfigUpdateListenerRegistrationInternal(configUpdateListener);
    }

    /* renamed from: b */
    public final synchronized void m37687b() {
        if (!this.f56416a.isEmpty()) {
            this.f56417b.startHttpConnection();
        }
    }

    /* renamed from: c */
    public final synchronized void m37686c(ConfigUpdateListener configUpdateListener) {
        this.f56416a.remove(configUpdateListener);
    }

    public synchronized void setBackgroundState(boolean z) {
        this.f56417b.m37664v(z);
        if (!z) {
            m37687b();
        }
    }
}
