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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepositoryImpl_Factory */
/* loaded from: classes10.dex */
public final class OneCommissionReportRepositoryImpl_Factory implements Factory<OneCommissionReportRepositoryImpl> {

    /* renamed from: a */
    public final Provider f96698a;

    /* renamed from: b */
    public final Provider f96699b;

    /* renamed from: c */
    public final Provider f96700c;

    public OneCommissionReportRepositoryImpl_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        this.f96698a = provider;
        this.f96699b = provider2;
        this.f96700c = provider3;
    }

    public static OneCommissionReportRepositoryImpl_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        return new OneCommissionReportRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static OneCommissionReportRepositoryImpl newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository) {
        return new OneCommissionReportRepositoryImpl(rTRApiRx2, rtrRx2Repository, configurationRepository);
    }

    @Override // javax.inject.Provider
    public OneCommissionReportRepositoryImpl get() {
        return newInstance((RTRApiRx2) this.f96698a.get(), (RtrRx2Repository) this.f96699b.get(), (ConfigurationRepository) this.f96700c.get());
    }
}