package th.p047co.dtac.android.dtacone.repository.customer_enquiry;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository_Factory */
/* loaded from: classes8.dex */
public final class CustomerEnquiryRepository_Factory implements Factory<CustomerEnquiryRepository> {

    /* renamed from: a */
    public final Provider f86825a;

    /* renamed from: b */
    public final Provider f86826b;

    /* renamed from: c */
    public final Provider f86827c;

    public CustomerEnquiryRepository_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        this.f86825a = provider;
        this.f86826b = provider2;
        this.f86827c = provider3;
    }

    public static CustomerEnquiryRepository_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        return new CustomerEnquiryRepository_Factory(provider, provider2, provider3);
    }

    public static CustomerEnquiryRepository newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository) {
        return new CustomerEnquiryRepository(rTRApiRx2, rtrRx2Repository, configurationRepository);
    }

    @Override // javax.inject.Provider
    public CustomerEnquiryRepository get() {
        return newInstance((RTRApiRx2) this.f86825a.get(), (RtrRx2Repository) this.f86826b.get(), (ConfigurationRepository) this.f86827c.get());
    }
}