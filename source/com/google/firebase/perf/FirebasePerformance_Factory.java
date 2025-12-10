package com.google.firebase.perf;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class FirebasePerformance_Factory implements Factory<FirebasePerformance> {

    /* renamed from: a */
    public final Provider f56055a;

    /* renamed from: b */
    public final Provider f56056b;

    /* renamed from: c */
    public final Provider f56057c;

    /* renamed from: d */
    public final Provider f56058d;

    /* renamed from: e */
    public final Provider f56059e;

    /* renamed from: f */
    public final Provider f56060f;

    /* renamed from: g */
    public final Provider f56061g;

    public FirebasePerformance_Factory(Provider<FirebaseApp> provider, Provider<com.google.firebase.inject.Provider<RemoteConfigComponent>> provider2, Provider<FirebaseInstallationsApi> provider3, Provider<com.google.firebase.inject.Provider<TransportFactory>> provider4, Provider<RemoteConfigManager> provider5, Provider<ConfigResolver> provider6, Provider<SessionManager> provider7) {
        this.f56055a = provider;
        this.f56056b = provider2;
        this.f56057c = provider3;
        this.f56058d = provider4;
        this.f56059e = provider5;
        this.f56060f = provider6;
        this.f56061g = provider7;
    }

    public static FirebasePerformance_Factory create(Provider<FirebaseApp> provider, Provider<com.google.firebase.inject.Provider<RemoteConfigComponent>> provider2, Provider<FirebaseInstallationsApi> provider3, Provider<com.google.firebase.inject.Provider<TransportFactory>> provider4, Provider<RemoteConfigManager> provider5, Provider<ConfigResolver> provider6, Provider<SessionManager> provider7) {
        return new FirebasePerformance_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static FirebasePerformance newInstance(FirebaseApp firebaseApp, com.google.firebase.inject.Provider<RemoteConfigComponent> provider, FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.inject.Provider<TransportFactory> provider2, RemoteConfigManager remoteConfigManager, ConfigResolver configResolver, SessionManager sessionManager) {
        return new FirebasePerformance(firebaseApp, provider, firebaseInstallationsApi, provider2, remoteConfigManager, configResolver, sessionManager);
    }

    @Override // javax.inject.Provider
    public FirebasePerformance get() {
        return newInstance((FirebaseApp) this.f56055a.get(), (com.google.firebase.inject.Provider) this.f56056b.get(), (FirebaseInstallationsApi) this.f56057c.get(), (com.google.firebase.inject.Provider) this.f56058d.get(), (RemoteConfigManager) this.f56059e.get(), (ConfigResolver) this.f56060f.get(), (SessionManager) this.f56061g.get());
    }
}
