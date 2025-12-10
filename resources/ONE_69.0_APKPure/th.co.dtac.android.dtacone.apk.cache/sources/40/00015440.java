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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.CustomerEnquiryInputViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class CustomerEnquiryInputViewModelFactory_Factory implements Factory<CustomerEnquiryInputViewModelFactory> {

    /* renamed from: a */
    public final Provider f105250a;

    /* renamed from: b */
    public final Provider f105251b;

    public CustomerEnquiryInputViewModelFactory_Factory(Provider<CustomerEnquiryRepository> provider, Provider<CardReaderService> provider2) {
        this.f105250a = provider;
        this.f105251b = provider2;
    }

    public static CustomerEnquiryInputViewModelFactory_Factory create(Provider<CustomerEnquiryRepository> provider, Provider<CardReaderService> provider2) {
        return new CustomerEnquiryInputViewModelFactory_Factory(provider, provider2);
    }

    public static CustomerEnquiryInputViewModelFactory newInstance(CustomerEnquiryRepository customerEnquiryRepository, CardReaderService cardReaderService) {
        return new CustomerEnquiryInputViewModelFactory(customerEnquiryRepository, cardReaderService);
    }

    @Override // javax.inject.Provider
    public CustomerEnquiryInputViewModelFactory get() {
        return newInstance((CustomerEnquiryRepository) this.f105250a.get(), (CardReaderService) this.f105251b.get());
    }
}