package com.google.firebase.perf.injection.modules;

import androidx.annotation.NonNull;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import dagger.Module;

@Module
/* loaded from: classes4.dex */
public class FirebasePerformanceModule {

    /* renamed from: a */
    public final FirebaseApp f56131a;

    /* renamed from: b */
    public final FirebaseInstallationsApi f56132b;

    /* renamed from: c */
    public final Provider f56133c;

    /* renamed from: d */
    public final Provider f56134d;

    public FirebasePerformanceModule(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseInstallationsApi firebaseInstallationsApi, @NonNull Provider<RemoteConfigComponent> provider, @NonNull Provider<TransportFactory> provider2) {
        this.f56131a = firebaseApp;
        this.f56132b = firebaseInstallationsApi;
        this.f56133c = provider;
        this.f56134d = provider2;
    }

    /* renamed from: a */
    public ConfigResolver m38277a() {
        return ConfigResolver.getInstance();
    }

    /* renamed from: b */
    public FirebaseApp m38276b() {
        return this.f56131a;
    }

    /* renamed from: c */
    public FirebaseInstallationsApi m38275c() {
        return this.f56132b;
    }

    /* renamed from: d */
    public Provider m38274d() {
        return this.f56133c;
    }

    /* renamed from: e */
    public RemoteConfigManager m38273e() {
        return RemoteConfigManager.getInstance();
    }

    /* renamed from: f */
    public SessionManager m38272f() {
        return SessionManager.getInstance();
    }

    /* renamed from: g */
    public Provider m38271g() {
        return this.f56134d;
    }
}
