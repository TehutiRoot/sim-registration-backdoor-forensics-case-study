package com.google.firebase.perf.injection.modules;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* renamed from: com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory */
/* loaded from: classes4.dex */
public final class C8561x3dbbb29c implements Factory<Provider<TransportFactory>> {

    /* renamed from: a */
    public final FirebasePerformanceModule f56153a;

    public C8561x3dbbb29c(FirebasePerformanceModule firebasePerformanceModule) {
        this.f56153a = firebasePerformanceModule;
    }

    public static C8561x3dbbb29c create(FirebasePerformanceModule firebasePerformanceModule) {
        return new C8561x3dbbb29c(firebasePerformanceModule);
    }

    public static Provider<TransportFactory> providesTransportFactoryProvider(FirebasePerformanceModule firebasePerformanceModule) {
        return (Provider) Preconditions.checkNotNull(firebasePerformanceModule.m38263g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Provider<TransportFactory> get() {
        return providesTransportFactoryProvider(this.f56153a);
    }
}