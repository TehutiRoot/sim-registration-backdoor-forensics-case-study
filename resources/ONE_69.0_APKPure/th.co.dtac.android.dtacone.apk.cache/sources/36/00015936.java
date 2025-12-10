package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_postpaid.MrtrPostpaidRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidValidationViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class MrtrPostpaidValidationViewModelFactory_Factory implements Factory<MrtrPostpaidValidationViewModelFactory> {

    /* renamed from: a */
    public final Provider f106565a;

    /* renamed from: b */
    public final Provider f106566b;

    /* renamed from: c */
    public final Provider f106567c;

    /* renamed from: d */
    public final Provider f106568d;

    /* renamed from: e */
    public final Provider f106569e;

    public MrtrPostpaidValidationViewModelFactory_Factory(Provider<MrtrPostpaidRepository> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<MrtrErrorService> provider5) {
        this.f106565a = provider;
        this.f106566b = provider2;
        this.f106567c = provider3;
        this.f106568d = provider4;
        this.f106569e = provider5;
    }

    public static MrtrPostpaidValidationViewModelFactory_Factory create(Provider<MrtrPostpaidRepository> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<MrtrErrorService> provider5) {
        return new MrtrPostpaidValidationViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrPostpaidValidationViewModelFactory newInstance(MrtrPostpaidRepository mrtrPostpaidRepository, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new MrtrPostpaidValidationViewModelFactory(mrtrPostpaidRepository, rtrRx2Repository, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPostpaidValidationViewModelFactory get() {
        return newInstance((MrtrPostpaidRepository) this.f106565a.get(), (RtrRx2Repository) this.f106566b.get(), (ConfigurationRepository) this.f106567c.get(), (Rx2ThreadService) this.f106568d.get(), (MrtrErrorService) this.f106569e.get());
    }
}