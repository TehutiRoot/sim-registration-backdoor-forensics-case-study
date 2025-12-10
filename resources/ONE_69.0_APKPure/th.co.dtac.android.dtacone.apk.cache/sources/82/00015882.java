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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_mnp.MrtrMnpValidateViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class MrtrMnpValidateViewModelFactory_Factory implements Factory<MrtrMnpValidateViewModelFactory> {

    /* renamed from: a */
    public final Provider f106355a;

    /* renamed from: b */
    public final Provider f106356b;

    /* renamed from: c */
    public final Provider f106357c;

    /* renamed from: d */
    public final Provider f106358d;

    public MrtrMnpValidateViewModelFactory_Factory(Provider<MrtrMnpRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f106355a = provider;
        this.f106356b = provider2;
        this.f106357c = provider3;
        this.f106358d = provider4;
    }

    public static MrtrMnpValidateViewModelFactory_Factory create(Provider<MrtrMnpRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new MrtrMnpValidateViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static MrtrMnpValidateViewModelFactory newInstance(MrtrMnpRepository mrtrMnpRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new MrtrMnpValidateViewModelFactory(mrtrMnpRepository, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrMnpValidateViewModelFactory get() {
        return newInstance((MrtrMnpRepository) this.f106355a.get(), (ConfigurationRepository) this.f106356b.get(), (Rx2ThreadService) this.f106357c.get(), (MrtrErrorService) this.f106358d.get());
    }
}