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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.IdentityInfoViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class IdentityInfoViewModelFactory_Factory implements Factory<IdentityInfoViewModelFactory> {

    /* renamed from: a */
    public final Provider f105315a;

    /* renamed from: b */
    public final Provider f105316b;

    /* renamed from: c */
    public final Provider f105317c;

    /* renamed from: d */
    public final Provider f105318d;

    /* renamed from: e */
    public final Provider f105319e;

    /* renamed from: f */
    public final Provider f105320f;

    public IdentityInfoViewModelFactory_Factory(Provider<CustomerEnquiryRepository> provider, Provider<RTRApiRx2> provider2, Provider<RtrRx2Repository> provider3, Provider<Rx2ThreadService> provider4, Provider<ConfigurationRepository> provider5, Provider<MrtrErrorService> provider6) {
        this.f105315a = provider;
        this.f105316b = provider2;
        this.f105317c = provider3;
        this.f105318d = provider4;
        this.f105319e = provider5;
        this.f105320f = provider6;
    }

    public static IdentityInfoViewModelFactory_Factory create(Provider<CustomerEnquiryRepository> provider, Provider<RTRApiRx2> provider2, Provider<RtrRx2Repository> provider3, Provider<Rx2ThreadService> provider4, Provider<ConfigurationRepository> provider5, Provider<MrtrErrorService> provider6) {
        return new IdentityInfoViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static IdentityInfoViewModelFactory newInstance(CustomerEnquiryRepository customerEnquiryRepository, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, Rx2ThreadService rx2ThreadService, ConfigurationRepository configurationRepository, MrtrErrorService mrtrErrorService) {
        return new IdentityInfoViewModelFactory(customerEnquiryRepository, rTRApiRx2, rtrRx2Repository, rx2ThreadService, configurationRepository, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public IdentityInfoViewModelFactory get() {
        return newInstance((CustomerEnquiryRepository) this.f105315a.get(), (RTRApiRx2) this.f105316b.get(), (RtrRx2Repository) this.f105317c.get(), (Rx2ThreadService) this.f105318d.get(), (ConfigurationRepository) this.f105319e.get(), (MrtrErrorService) this.f105320f.get());
    }
}