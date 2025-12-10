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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimPostpaidPackagesViewModel_Factory */
/* loaded from: classes9.dex */
public final class ESimPostpaidPackagesViewModel_Factory implements Factory<ESimPostpaidPackagesViewModel> {

    /* renamed from: a */
    public final Provider f105704a;

    /* renamed from: b */
    public final Provider f105705b;

    /* renamed from: c */
    public final Provider f105706c;

    /* renamed from: d */
    public final Provider f105707d;

    public ESimPostpaidPackagesViewModel_Factory(Provider<ESimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f105704a = provider;
        this.f105705b = provider2;
        this.f105706c = provider3;
        this.f105707d = provider4;
    }

    public static ESimPostpaidPackagesViewModel_Factory create(Provider<ESimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new ESimPostpaidPackagesViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static ESimPostpaidPackagesViewModel newInstance(ESimRepository eSimRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new ESimPostpaidPackagesViewModel(eSimRepository, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public ESimPostpaidPackagesViewModel get() {
        return newInstance((ESimRepository) this.f105704a.get(), (ConfigurationRepository) this.f105705b.get(), (Rx2ThreadService) this.f105706c.get(), (MrtrErrorService) this.f105707d.get());
    }
}