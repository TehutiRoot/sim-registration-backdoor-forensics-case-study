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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.SubscriberInfoViewModel_Factory */
/* loaded from: classes9.dex */
public final class SubscriberInfoViewModel_Factory implements Factory<SubscriberInfoViewModel> {

    /* renamed from: a */
    public final Provider f105439a;

    /* renamed from: b */
    public final Provider f105440b;

    /* renamed from: c */
    public final Provider f105441c;

    /* renamed from: d */
    public final Provider f105442d;

    public SubscriberInfoViewModel_Factory(Provider<CustomerEnquiryRepository> provider, Provider<RtrRx2Repository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f105439a = provider;
        this.f105440b = provider2;
        this.f105441c = provider3;
        this.f105442d = provider4;
    }

    public static SubscriberInfoViewModel_Factory create(Provider<CustomerEnquiryRepository> provider, Provider<RtrRx2Repository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new SubscriberInfoViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static SubscriberInfoViewModel newInstance(CustomerEnquiryRepository customerEnquiryRepository, RtrRx2Repository rtrRx2Repository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new SubscriberInfoViewModel(customerEnquiryRepository, rtrRx2Repository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public SubscriberInfoViewModel get() {
        return newInstance((CustomerEnquiryRepository) this.f105439a.get(), (RtrRx2Repository) this.f105440b.get(), (Rx2ThreadService) this.f105441c.get(), (MrtrErrorService) this.f105442d.get());
    }
}