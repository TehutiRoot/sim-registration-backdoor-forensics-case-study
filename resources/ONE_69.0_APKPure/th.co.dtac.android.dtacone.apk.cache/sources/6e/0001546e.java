package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.IdentityInfoViewModel_Factory */
/* loaded from: classes9.dex */
public final class IdentityInfoViewModel_Factory implements Factory<IdentityInfoViewModel> {

    /* renamed from: a */
    public final Provider f105321a;

    /* renamed from: b */
    public final Provider f105322b;

    /* renamed from: c */
    public final Provider f105323c;

    /* renamed from: d */
    public final Provider f105324d;

    /* renamed from: e */
    public final Provider f105325e;

    /* renamed from: f */
    public final Provider f105326f;

    public IdentityInfoViewModel_Factory(Provider<CustomerEnquiryRepository> provider, Provider<RTRApiRx2> provider2, Provider<RtrRx2Repository> provider3, Provider<Rx2ThreadService> provider4, Provider<ConfigurationRepository> provider5, Provider<MrtrErrorService> provider6) {
        this.f105321a = provider;
        this.f105322b = provider2;
        this.f105323c = provider3;
        this.f105324d = provider4;
        this.f105325e = provider5;
        this.f105326f = provider6;
    }

    public static IdentityInfoViewModel_Factory create(Provider<CustomerEnquiryRepository> provider, Provider<RTRApiRx2> provider2, Provider<RtrRx2Repository> provider3, Provider<Rx2ThreadService> provider4, Provider<ConfigurationRepository> provider5, Provider<MrtrErrorService> provider6) {
        return new IdentityInfoViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static IdentityInfoViewModel newInstance(CustomerEnquiryRepository customerEnquiryRepository, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, Rx2ThreadService rx2ThreadService, ConfigurationRepository configurationRepository, MrtrErrorService mrtrErrorService) {
        return new IdentityInfoViewModel(customerEnquiryRepository, rTRApiRx2, rtrRx2Repository, rx2ThreadService, configurationRepository, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public IdentityInfoViewModel get() {
        return newInstance((CustomerEnquiryRepository) this.f105321a.get(), (RTRApiRx2) this.f105322b.get(), (RtrRx2Repository) this.f105323c.get(), (Rx2ThreadService) this.f105324d.get(), (ConfigurationRepository) this.f105325e.get(), (MrtrErrorService) this.f105326f.get());
    }
}