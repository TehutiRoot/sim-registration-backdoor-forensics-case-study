package th.p047co.dtac.android.dtacone.viewmodel.esim;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimPostpaidPackagesViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class ESimPostpaidPackagesViewModelFactory_Factory implements Factory<ESimPostpaidPackagesViewModelFactory> {

    /* renamed from: a */
    public final Provider f105700a;

    /* renamed from: b */
    public final Provider f105701b;

    /* renamed from: c */
    public final Provider f105702c;

    /* renamed from: d */
    public final Provider f105703d;

    public ESimPostpaidPackagesViewModelFactory_Factory(Provider<ESimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f105700a = provider;
        this.f105701b = provider2;
        this.f105702c = provider3;
        this.f105703d = provider4;
    }

    public static ESimPostpaidPackagesViewModelFactory_Factory create(Provider<ESimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new ESimPostpaidPackagesViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static ESimPostpaidPackagesViewModelFactory newInstance(ESimRepository eSimRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new ESimPostpaidPackagesViewModelFactory(eSimRepository, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public ESimPostpaidPackagesViewModelFactory get() {
        return newInstance((ESimRepository) this.f105700a.get(), (ConfigurationRepository) this.f105701b.get(), (Rx2ThreadService) this.f105702c.get(), (MrtrErrorService) this.f105703d.get());
    }
}