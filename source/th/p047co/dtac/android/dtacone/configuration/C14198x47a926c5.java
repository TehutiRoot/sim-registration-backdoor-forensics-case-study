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
import th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneProfitReportRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneOneProfitReportRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14198x47a926c5 implements Factory<OneProfitReportRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83326a;

    /* renamed from: b */
    public final Provider f83327b;

    /* renamed from: c */
    public final Provider f83328c;

    /* renamed from: d */
    public final Provider f83329d;

    public C14198x47a926c5(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        this.f83326a = singletonRepositoryModule;
        this.f83327b = provider;
        this.f83328c = provider2;
        this.f83329d = provider3;
    }

    public static C14198x47a926c5 create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        return new C14198x47a926c5(singletonRepositoryModule, provider, provider2, provider3);
    }

    public static OneProfitReportRepository provideOneOneProfitReportRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository) {
        return (OneProfitReportRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneOneProfitReportRepository(rTRApiRx2, rtrRx2Repository, configurationRepository));
    }

    @Override // javax.inject.Provider
    public OneProfitReportRepository get() {
        return provideOneOneProfitReportRepository(this.f83326a, (RTRApiRx2) this.f83327b.get(), (RtrRx2Repository) this.f83328c.get(), (ConfigurationRepository) this.f83329d.get());
    }
}
