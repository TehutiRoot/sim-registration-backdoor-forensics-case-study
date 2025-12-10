package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.InfoAnalyticViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class InfoAnalyticViewModelFactory_Factory implements Factory<InfoAnalyticViewModelFactory> {

    /* renamed from: a */
    public final Provider f105383a;

    /* renamed from: b */
    public final Provider f105384b;

    /* renamed from: c */
    public final Provider f105385c;

    /* renamed from: d */
    public final Provider f105386d;

    /* renamed from: e */
    public final Provider f105387e;

    public InfoAnalyticViewModelFactory_Factory(Provider<CustomerEnquiryRepository> provider, Provider<RtrRx2Repository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4, Provider<ConfigurationRepository> provider5) {
        this.f105383a = provider;
        this.f105384b = provider2;
        this.f105385c = provider3;
        this.f105386d = provider4;
        this.f105387e = provider5;
    }

    public static InfoAnalyticViewModelFactory_Factory create(Provider<CustomerEnquiryRepository> provider, Provider<RtrRx2Repository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4, Provider<ConfigurationRepository> provider5) {
        return new InfoAnalyticViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static InfoAnalyticViewModelFactory newInstance(CustomerEnquiryRepository customerEnquiryRepository, RtrRx2Repository rtrRx2Repository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService, ConfigurationRepository configurationRepository) {
        return new InfoAnalyticViewModelFactory(customerEnquiryRepository, rtrRx2Repository, rx2ThreadService, mrtrErrorService, configurationRepository);
    }

    @Override // javax.inject.Provider
    public InfoAnalyticViewModelFactory get() {
        return newInstance((CustomerEnquiryRepository) this.f105383a.get(), (RtrRx2Repository) this.f105384b.get(), (Rx2ThreadService) this.f105385c.get(), (MrtrErrorService) this.f105386d.get(), (ConfigurationRepository) this.f105387e.get());
    }
}