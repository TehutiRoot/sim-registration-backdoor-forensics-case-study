package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideCustomerEnquiryRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14188x2a561a9e implements Factory<CustomerEnquiryRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83222a;

    /* renamed from: b */
    public final Provider f83223b;

    /* renamed from: c */
    public final Provider f83224c;

    /* renamed from: d */
    public final Provider f83225d;

    /* renamed from: e */
    public final Provider f83226e;

    public C14188x2a561a9e(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3, Provider<ConfigurationRepository> provider4) {
        this.f83222a = singletonRepositoryModule;
        this.f83223b = provider;
        this.f83224c = provider2;
        this.f83225d = provider3;
        this.f83226e = provider4;
    }

    public static C14188x2a561a9e create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3, Provider<ConfigurationRepository> provider4) {
        return new C14188x2a561a9e(singletonRepositoryModule, provider, provider2, provider3, provider4);
    }

    public static CustomerEnquiryRepository provideCustomerEnquiryRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, FileUtil fileUtil, ConfigurationRepository configurationRepository) {
        return (CustomerEnquiryRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideCustomerEnquiryRepository(rTRApiRx2, rtrRx2Repository, fileUtil, configurationRepository));
    }

    @Override // javax.inject.Provider
    public CustomerEnquiryRepository get() {
        return provideCustomerEnquiryRepository(this.f83222a, (RTRApiRx2) this.f83223b.get(), (RtrRx2Repository) this.f83224c.get(), (FileUtil) this.f83225d.get(), (ConfigurationRepository) this.f83226e.get());
    }
}
