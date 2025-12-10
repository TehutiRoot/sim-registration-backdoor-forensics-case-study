package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneStaffRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideOneStaffRepositoryFactory implements Factory<OneStaffRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83380a;

    /* renamed from: b */
    public final Provider f83381b;

    /* renamed from: c */
    public final Provider f83382c;

    public SingletonRepositoryModule_ProvideOneStaffRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<ConfigurationRepository> provider2) {
        this.f83380a = singletonRepositoryModule;
        this.f83381b = provider;
        this.f83382c = provider2;
    }

    public static SingletonRepositoryModule_ProvideOneStaffRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<ConfigurationRepository> provider2) {
        return new SingletonRepositoryModule_ProvideOneStaffRepositoryFactory(singletonRepositoryModule, provider, provider2);
    }

    public static OneStaffRepository provideOneStaffRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, ConfigurationRepository configurationRepository) {
        return (OneStaffRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneStaffRepository(rTRApiRx2, configurationRepository));
    }

    @Override // javax.inject.Provider
    public OneStaffRepository get() {
        return provideOneStaffRepository(this.f83380a, (RTRApiRx2) this.f83381b.get(), (ConfigurationRepository) this.f83382c.get());
    }
}
