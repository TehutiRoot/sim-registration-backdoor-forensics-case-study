package th.p047co.dtac.android.dtacone.viewmodel.mrtr_mnp;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_mnp.MrtrMnpRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_mnp.MrtrMnpValidateViewModel_Factory */
/* loaded from: classes9.dex */
public final class MrtrMnpValidateViewModel_Factory implements Factory<MrtrMnpValidateViewModel> {

    /* renamed from: a */
    public final Provider f106359a;

    /* renamed from: b */
    public final Provider f106360b;

    /* renamed from: c */
    public final Provider f106361c;

    /* renamed from: d */
    public final Provider f106362d;

    public MrtrMnpValidateViewModel_Factory(Provider<MrtrMnpRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f106359a = provider;
        this.f106360b = provider2;
        this.f106361c = provider3;
        this.f106362d = provider4;
    }

    public static MrtrMnpValidateViewModel_Factory create(Provider<MrtrMnpRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new MrtrMnpValidateViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static MrtrMnpValidateViewModel newInstance(MrtrMnpRepository mrtrMnpRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new MrtrMnpValidateViewModel(mrtrMnpRepository, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrMnpValidateViewModel get() {
        return newInstance((MrtrMnpRepository) this.f106359a.get(), (ConfigurationRepository) this.f106360b.get(), (Rx2ThreadService) this.f106361c.get(), (MrtrErrorService) this.f106362d.get());
    }
}