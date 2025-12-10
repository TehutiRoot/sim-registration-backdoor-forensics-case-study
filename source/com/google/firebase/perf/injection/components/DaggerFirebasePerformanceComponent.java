package com.google.firebase.perf.injection.components;

import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.FirebasePerformance_Factory;
import com.google.firebase.perf.injection.modules.C8572x3dbbb29c;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesConfigResolverFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseAppFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesSessionManagerFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class DaggerFirebasePerformanceComponent implements FirebasePerformanceComponent {

    /* renamed from: a */
    public Provider f56122a;

    /* renamed from: b */
    public Provider f56123b;

    /* renamed from: c */
    public Provider f56124c;

    /* renamed from: d */
    public Provider f56125d;

    /* renamed from: e */
    public Provider f56126e;

    /* renamed from: f */
    public Provider f56127f;

    /* renamed from: g */
    public Provider f56128g;

    /* renamed from: h */
    public Provider f56129h;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public FirebasePerformanceModule f56130a;

        public FirebasePerformanceComponent build() {
            Preconditions.checkBuilderRequirement(this.f56130a, FirebasePerformanceModule.class);
            return new DaggerFirebasePerformanceComponent(this.f56130a);
        }

        public Builder firebasePerformanceModule(FirebasePerformanceModule firebasePerformanceModule) {
            this.f56130a = (FirebasePerformanceModule) Preconditions.checkNotNull(firebasePerformanceModule);
            return this;
        }

        public Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: a */
    public final void m38278a(FirebasePerformanceModule firebasePerformanceModule) {
        this.f56122a = FirebasePerformanceModule_ProvidesFirebaseAppFactory.create(firebasePerformanceModule);
        this.f56123b = FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory.create(firebasePerformanceModule);
        this.f56124c = FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory.create(firebasePerformanceModule);
        this.f56125d = C8572x3dbbb29c.create(firebasePerformanceModule);
        this.f56126e = FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory.create(firebasePerformanceModule);
        this.f56127f = FirebasePerformanceModule_ProvidesConfigResolverFactory.create(firebasePerformanceModule);
        FirebasePerformanceModule_ProvidesSessionManagerFactory create = FirebasePerformanceModule_ProvidesSessionManagerFactory.create(firebasePerformanceModule);
        this.f56128g = create;
        this.f56129h = DoubleCheck.provider(FirebasePerformance_Factory.create(this.f56122a, this.f56123b, this.f56124c, this.f56125d, this.f56126e, this.f56127f, create));
    }

    @Override // com.google.firebase.perf.injection.components.FirebasePerformanceComponent
    public FirebasePerformance getFirebasePerformance() {
        return (FirebasePerformance) this.f56129h.get();
    }

    public DaggerFirebasePerformanceComponent(FirebasePerformanceModule firebasePerformanceModule) {
        m38278a(firebasePerformanceModule);
    }
}
