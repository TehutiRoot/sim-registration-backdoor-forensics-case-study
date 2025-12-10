package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.CustomerEnquiryInputViewModel_Factory */
/* loaded from: classes9.dex */
public final class CustomerEnquiryInputViewModel_Factory implements Factory<CustomerEnquiryInputViewModel> {

    /* renamed from: a */
    public final Provider f105252a;

    /* renamed from: b */
    public final Provider f105253b;

    public CustomerEnquiryInputViewModel_Factory(Provider<CustomerEnquiryRepository> provider, Provider<CardReaderService> provider2) {
        this.f105252a = provider;
        this.f105253b = provider2;
    }

    public static CustomerEnquiryInputViewModel_Factory create(Provider<CustomerEnquiryRepository> provider, Provider<CardReaderService> provider2) {
        return new CustomerEnquiryInputViewModel_Factory(provider, provider2);
    }

    public static CustomerEnquiryInputViewModel newInstance(CustomerEnquiryRepository customerEnquiryRepository, CardReaderService cardReaderService) {
        return new CustomerEnquiryInputViewModel(customerEnquiryRepository, cardReaderService);
    }

    @Override // javax.inject.Provider
    public CustomerEnquiryInputViewModel get() {
        return newInstance((CustomerEnquiryRepository) this.f105252a.get(), (CardReaderService) this.f105253b.get());
    }
}