package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneOneCommissionReportRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14197x738b05be implements Factory<OneCommissionReportRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83322a;

    /* renamed from: b */
    public final Provider f83323b;

    /* renamed from: c */
    public final Provider f83324c;

    /* renamed from: d */
    public final Provider f83325d;

    public C14197x738b05be(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        this.f83322a = singletonRepositoryModule;
        this.f83323b = provider;
        this.f83324c = provider2;
        this.f83325d = provider3;
    }

    public static C14197x738b05be create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        return new C14197x738b05be(singletonRepositoryModule, provider, provider2, provider3);
    }

    public static OneCommissionReportRepository provideOneOneCommissionReportRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository) {
        return (OneCommissionReportRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneOneCommissionReportRepository(rTRApiRx2, rtrRx2Repository, configurationRepository));
    }

    @Override // javax.inject.Provider
    public OneCommissionReportRepository get() {
        return provideOneOneCommissionReportRepository(this.f83322a, (RTRApiRx2) this.f83323b.get(), (RtrRx2Repository) this.f83324c.get(), (ConfigurationRepository) this.f83325d.get());
    }
}
