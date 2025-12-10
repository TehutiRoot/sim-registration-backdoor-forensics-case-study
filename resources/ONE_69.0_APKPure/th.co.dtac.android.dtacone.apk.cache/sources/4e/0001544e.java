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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.DeviceSummaryViewModel_Factory */
/* loaded from: classes9.dex */
public final class DeviceSummaryViewModel_Factory implements Factory<DeviceSummaryViewModel> {

    /* renamed from: a */
    public final Provider f105277a;

    /* renamed from: b */
    public final Provider f105278b;

    /* renamed from: c */
    public final Provider f105279c;

    public DeviceSummaryViewModel_Factory(Provider<CustomerEnquiryRepository> provider, Provider<Rx2ThreadService> provider2, Provider<MrtrErrorService> provider3) {
        this.f105277a = provider;
        this.f105278b = provider2;
        this.f105279c = provider3;
    }

    public static DeviceSummaryViewModel_Factory create(Provider<CustomerEnquiryRepository> provider, Provider<Rx2ThreadService> provider2, Provider<MrtrErrorService> provider3) {
        return new DeviceSummaryViewModel_Factory(provider, provider2, provider3);
    }

    public static DeviceSummaryViewModel newInstance(CustomerEnquiryRepository customerEnquiryRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new DeviceSummaryViewModel(customerEnquiryRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public DeviceSummaryViewModel get() {
        return newInstance((CustomerEnquiryRepository) this.f105277a.get(), (Rx2ThreadService) this.f105278b.get(), (MrtrErrorService) this.f105279c.get());
    }
}