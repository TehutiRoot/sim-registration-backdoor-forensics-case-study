package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.repository.OneChangePasswordRepository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneChangePasswordRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14192x56a2a7f2 implements Factory<OneChangePasswordRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83290a;

    /* renamed from: b */
    public final Provider f83291b;

    /* renamed from: c */
    public final Provider f83292c;

    public C14192x56a2a7f2(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<ConfigurationRepository> provider2) {
        this.f83290a = singletonRepositoryModule;
        this.f83291b = provider;
        this.f83292c = provider2;
    }

    public static C14192x56a2a7f2 create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<ConfigurationRepository> provider2) {
        return new C14192x56a2a7f2(singletonRepositoryModule, provider, provider2);
    }

    public static OneChangePasswordRepository provideOneChangePasswordRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, ConfigurationRepository configurationRepository) {
        return (OneChangePasswordRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneChangePasswordRepository(rTRApiRx2, configurationRepository));
    }

    @Override // javax.inject.Provider
    public OneChangePasswordRepository get() {
        return provideOneChangePasswordRepository(this.f83290a, (RTRApiRx2) this.f83291b.get(), (ConfigurationRepository) this.f83292c.get());
    }
}
