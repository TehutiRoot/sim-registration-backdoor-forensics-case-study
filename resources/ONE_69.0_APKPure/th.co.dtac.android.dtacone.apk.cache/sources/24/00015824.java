package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimValidateViewModel_Factory */
/* loaded from: classes9.dex */
public final class MrtrChangeSimValidateViewModel_Factory implements Factory<MrtrChangeSimValidateViewModel> {

    /* renamed from: a */
    public final Provider f106245a;

    /* renamed from: b */
    public final Provider f106246b;

    /* renamed from: c */
    public final Provider f106247c;

    /* renamed from: d */
    public final Provider f106248d;

    public MrtrChangeSimValidateViewModel_Factory(Provider<MrtrChangeSimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f106245a = provider;
        this.f106246b = provider2;
        this.f106247c = provider3;
        this.f106248d = provider4;
    }

    public static MrtrChangeSimValidateViewModel_Factory create(Provider<MrtrChangeSimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new MrtrChangeSimValidateViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static MrtrChangeSimValidateViewModel newInstance(MrtrChangeSimRepository mrtrChangeSimRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new MrtrChangeSimValidateViewModel(mrtrChangeSimRepository, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrChangeSimValidateViewModel get() {
        return newInstance((MrtrChangeSimRepository) this.f106245a.get(), (ConfigurationRepository) this.f106246b.get(), (Rx2ThreadService) this.f106247c.get(), (MrtrErrorService) this.f106248d.get());
    }
}