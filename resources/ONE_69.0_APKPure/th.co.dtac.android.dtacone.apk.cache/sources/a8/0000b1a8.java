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
    public final Provider f56067a;

    /* renamed from: b */
    public final Provider f56068b;

    /* renamed from: c */
    public final Provider f56069c;

    /* renamed from: d */
    public final Provider f56070d;

    /* renamed from: e */
    public final Provider f56071e;

    /* renamed from: f */
    public final Provider f56072f;

    /* renamed from: g */
    public final Provider f56073g;

    public FirebasePerformance_Factory(Provider<FirebaseApp> provider, Provider<com.google.firebase.inject.Provider<RemoteConfigComponent>> provider2, Provider<FirebaseInstallationsApi> provider3, Provider<com.google.firebase.inject.Provider<TransportFactory>> provider4, Provider<RemoteConfigManager> provider5, Provider<ConfigResolver> provider6, Provider<SessionManager> provider7) {
        this.f56067a = provider;
        this.f56068b = provider2;
        this.f56069c = provider3;
        this.f56070d = provider4;
        this.f56071e = provider5;
        this.f56072f = provider6;
        this.f56073g = provider7;
    }

    public static FirebasePerformance_Factory create(Provider<FirebaseApp> provider, Provider<com.google.firebase.inject.Provider<RemoteConfigComponent>> provider2, Provider<FirebaseInstallationsApi> provider3, Provider<com.google.firebase.inject.Provider<TransportFactory>> provider4, Provider<RemoteConfigManager> provider5, Provider<ConfigResolver> provider6, Provider<SessionManager> provider7) {
        return new FirebasePerformance_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static FirebasePerformance newInstance(FirebaseApp firebaseApp, com.google.firebase.inject.Provider<RemoteConfigComponent> provider, FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.inject.Provider<TransportFactory> provider2, RemoteConfigManager remoteConfigManager, ConfigResolver configResolver, SessionManager sessionManager) {
        return new FirebasePerformance(firebaseApp, provider, firebaseInstallationsApi, provider2, remoteConfigManager, configResolver, sessionManager);
    }

    @Override // javax.inject.Provider
    public FirebasePerformance get() {
        return newInstance((FirebaseApp) this.f56067a.get(), (com.google.firebase.inject.Provider) this.f56068b.get(), (FirebaseInstallationsApi) this.f56069c.get(), (com.google.firebase.inject.Provider) this.f56070d.get(), (RemoteConfigManager) this.f56071e.get(), (ConfigResolver) this.f56072f.get(), (SessionManager) this.f56073g.get());
    }
}