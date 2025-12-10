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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.InfoAnalyticViewModel_Factory */
/* loaded from: classes9.dex */
public final class InfoAnalyticViewModel_Factory implements Factory<InfoAnalyticViewModel> {

    /* renamed from: a */
    public final Provider f105388a;

    /* renamed from: b */
    public final Provider f105389b;

    /* renamed from: c */
    public final Provider f105390c;

    /* renamed from: d */
    public final Provider f105391d;

    /* renamed from: e */
    public final Provider f105392e;

    public InfoAnalyticViewModel_Factory(Provider<CustomerEnquiryRepository> provider, Provider<RtrRx2Repository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4, Provider<ConfigurationRepository> provider5) {
        this.f105388a = provider;
        this.f105389b = provider2;
        this.f105390c = provider3;
        this.f105391d = provider4;
        this.f105392e = provider5;
    }

    public static InfoAnalyticViewModel_Factory create(Provider<CustomerEnquiryRepository> provider, Provider<RtrRx2Repository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4, Provider<ConfigurationRepository> provider5) {
        return new InfoAnalyticViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static InfoAnalyticViewModel newInstance(CustomerEnquiryRepository customerEnquiryRepository, RtrRx2Repository rtrRx2Repository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService, ConfigurationRepository configurationRepository) {
        return new InfoAnalyticViewModel(customerEnquiryRepository, rtrRx2Repository, rx2ThreadService, mrtrErrorService, configurationRepository);
    }

    @Override // javax.inject.Provider
    public InfoAnalyticViewModel get() {
        return newInstance((CustomerEnquiryRepository) this.f105388a.get(), (RtrRx2Repository) this.f105389b.get(), (Rx2ThreadService) this.f105390c.get(), (MrtrErrorService) this.f105391d.get(), (ConfigurationRepository) this.f105392e.get());
    }
}