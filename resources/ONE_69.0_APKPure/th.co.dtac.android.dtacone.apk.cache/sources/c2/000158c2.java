package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_postpaid.MrtrPostpaidRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidPackagesViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class MrtrPostpaidPackagesViewModelFactory_Factory implements Factory<MrtrPostpaidPackagesViewModelFactory> {

    /* renamed from: a */
    public final Provider f106435a;

    /* renamed from: b */
    public final Provider f106436b;

    /* renamed from: c */
    public final Provider f106437c;

    /* renamed from: d */
    public final Provider f106438d;

    public MrtrPostpaidPackagesViewModelFactory_Factory(Provider<MrtrPostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f106435a = provider;
        this.f106436b = provider2;
        this.f106437c = provider3;
        this.f106438d = provider4;
    }

    public static MrtrPostpaidPackagesViewModelFactory_Factory create(Provider<MrtrPostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new MrtrPostpaidPackagesViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static MrtrPostpaidPackagesViewModelFactory newInstance(MrtrPostpaidRepository mrtrPostpaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new MrtrPostpaidPackagesViewModelFactory(mrtrPostpaidRepository, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPostpaidPackagesViewModelFactory get() {
        return newInstance((MrtrPostpaidRepository) this.f106435a.get(), (ConfigurationRepository) this.f106436b.get(), (Rx2ThreadService) this.f106437c.get(), (MrtrErrorService) this.f106438d.get());
    }
}