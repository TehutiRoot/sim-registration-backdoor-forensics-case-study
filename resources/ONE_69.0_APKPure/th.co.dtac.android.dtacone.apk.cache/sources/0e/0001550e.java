package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.SubscriberInfoViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class SubscriberInfoViewModelFactory_Factory implements Factory<SubscriberInfoViewModelFactory> {

    /* renamed from: a */
    public final Provider f105435a;

    /* renamed from: b */
    public final Provider f105436b;

    /* renamed from: c */
    public final Provider f105437c;

    /* renamed from: d */
    public final Provider f105438d;

    public SubscriberInfoViewModelFactory_Factory(Provider<CustomerEnquiryRepository> provider, Provider<RtrRx2Repository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f105435a = provider;
        this.f105436b = provider2;
        this.f105437c = provider3;
        this.f105438d = provider4;
    }

    public static SubscriberInfoViewModelFactory_Factory create(Provider<CustomerEnquiryRepository> provider, Provider<RtrRx2Repository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new SubscriberInfoViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static SubscriberInfoViewModelFactory newInstance(CustomerEnquiryRepository customerEnquiryRepository, RtrRx2Repository rtrRx2Repository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new SubscriberInfoViewModelFactory(customerEnquiryRepository, rtrRx2Repository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public SubscriberInfoViewModelFactory get() {
        return newInstance((CustomerEnquiryRepository) this.f105435a.get(), (RtrRx2Repository) this.f105436b.get(), (Rx2ThreadService) this.f105437c.get(), (MrtrErrorService) this.f105438d.get());
    }
}