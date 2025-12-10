package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.DeviceSummaryViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class DeviceSummaryViewModelFactory_Factory implements Factory<DeviceSummaryViewModelFactory> {

    /* renamed from: a */
    public final Provider f105274a;

    /* renamed from: b */
    public final Provider f105275b;

    /* renamed from: c */
    public final Provider f105276c;

    public DeviceSummaryViewModelFactory_Factory(Provider<CustomerEnquiryRepository> provider, Provider<Rx2ThreadService> provider2, Provider<MrtrErrorService> provider3) {
        this.f105274a = provider;
        this.f105275b = provider2;
        this.f105276c = provider3;
    }

    public static DeviceSummaryViewModelFactory_Factory create(Provider<CustomerEnquiryRepository> provider, Provider<Rx2ThreadService> provider2, Provider<MrtrErrorService> provider3) {
        return new DeviceSummaryViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static DeviceSummaryViewModelFactory newInstance(CustomerEnquiryRepository customerEnquiryRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new DeviceSummaryViewModelFactory(customerEnquiryRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public DeviceSummaryViewModelFactory get() {
        return newInstance((CustomerEnquiryRepository) this.f105274a.get(), (Rx2ThreadService) this.f105275b.get(), (MrtrErrorService) this.f105276c.get());
    }
}