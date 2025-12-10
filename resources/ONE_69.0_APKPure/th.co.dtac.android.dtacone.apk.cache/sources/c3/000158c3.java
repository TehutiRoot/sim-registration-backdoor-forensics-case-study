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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidPackagesViewModel_Factory */
/* loaded from: classes9.dex */
public final class MrtrPostpaidPackagesViewModel_Factory implements Factory<MrtrPostpaidPackagesViewModel> {

    /* renamed from: a */
    public final Provider f106439a;

    /* renamed from: b */
    public final Provider f106440b;

    /* renamed from: c */
    public final Provider f106441c;

    /* renamed from: d */
    public final Provider f106442d;

    public MrtrPostpaidPackagesViewModel_Factory(Provider<MrtrPostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f106439a = provider;
        this.f106440b = provider2;
        this.f106441c = provider3;
        this.f106442d = provider4;
    }

    public static MrtrPostpaidPackagesViewModel_Factory create(Provider<MrtrPostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new MrtrPostpaidPackagesViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static MrtrPostpaidPackagesViewModel newInstance(MrtrPostpaidRepository mrtrPostpaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new MrtrPostpaidPackagesViewModel(mrtrPostpaidRepository, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPostpaidPackagesViewModel get() {
        return newInstance((MrtrPostpaidRepository) this.f106439a.get(), (ConfigurationRepository) this.f106440b.get(), (Rx2ThreadService) this.f106441c.get(), (MrtrErrorService) this.f106442d.get());
    }
}