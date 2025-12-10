package th.p047co.dtac.android.dtacone.view.appOne.report.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.repository.OneProfitReportRepositoryImpl_Factory */
/* loaded from: classes10.dex */
public final class OneProfitReportRepositoryImpl_Factory implements Factory<OneProfitReportRepositoryImpl> {

    /* renamed from: a */
    public final Provider f96704a;

    /* renamed from: b */
    public final Provider f96705b;

    /* renamed from: c */
    public final Provider f96706c;

    public OneProfitReportRepositoryImpl_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        this.f96704a = provider;
        this.f96705b = provider2;
        this.f96706c = provider3;
    }

    public static OneProfitReportRepositoryImpl_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        return new OneProfitReportRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static OneProfitReportRepositoryImpl newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository) {
        return new OneProfitReportRepositoryImpl(rTRApiRx2, rtrRx2Repository, configurationRepository);
    }

    @Override // javax.inject.Provider
    public OneProfitReportRepositoryImpl get() {
        return newInstance((RTRApiRx2) this.f96704a.get(), (RtrRx2Repository) this.f96705b.get(), (ConfigurationRepository) this.f96706c.get());
    }
}