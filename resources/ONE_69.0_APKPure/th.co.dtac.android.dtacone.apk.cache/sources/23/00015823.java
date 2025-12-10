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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimValidateViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class MrtrChangeSimValidateViewModelFactory_Factory implements Factory<MrtrChangeSimValidateViewModelFactory> {

    /* renamed from: a */
    public final Provider f106241a;

    /* renamed from: b */
    public final Provider f106242b;

    /* renamed from: c */
    public final Provider f106243c;

    /* renamed from: d */
    public final Provider f106244d;

    public MrtrChangeSimValidateViewModelFactory_Factory(Provider<MrtrChangeSimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f106241a = provider;
        this.f106242b = provider2;
        this.f106243c = provider3;
        this.f106244d = provider4;
    }

    public static MrtrChangeSimValidateViewModelFactory_Factory create(Provider<MrtrChangeSimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new MrtrChangeSimValidateViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static MrtrChangeSimValidateViewModelFactory newInstance(MrtrChangeSimRepository mrtrChangeSimRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new MrtrChangeSimValidateViewModelFactory(mrtrChangeSimRepository, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrChangeSimValidateViewModelFactory get() {
        return newInstance((MrtrChangeSimRepository) this.f106241a.get(), (ConfigurationRepository) this.f106242b.get(), (Rx2ThreadService) this.f106243c.get(), (MrtrErrorService) this.f106244d.get());
    }
}