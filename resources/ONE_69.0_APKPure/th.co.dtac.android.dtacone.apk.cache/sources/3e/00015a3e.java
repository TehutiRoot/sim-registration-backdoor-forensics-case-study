package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid.MrtrPrepaidRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidValidateIdCardNumberViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class MrtrPrepaidValidateIdCardNumberViewModelFactory_Factory implements Factory<MrtrPrepaidValidateIdCardNumberViewModelFactory> {

    /* renamed from: a */
    public final Provider f106819a;

    /* renamed from: b */
    public final Provider f106820b;

    /* renamed from: c */
    public final Provider f106821c;

    /* renamed from: d */
    public final Provider f106822d;

    public MrtrPrepaidValidateIdCardNumberViewModelFactory_Factory(Provider<MrtrPrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f106819a = provider;
        this.f106820b = provider2;
        this.f106821c = provider3;
        this.f106822d = provider4;
    }

    public static MrtrPrepaidValidateIdCardNumberViewModelFactory_Factory create(Provider<MrtrPrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new MrtrPrepaidValidateIdCardNumberViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static MrtrPrepaidValidateIdCardNumberViewModelFactory newInstance(MrtrPrepaidRepository mrtrPrepaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new MrtrPrepaidValidateIdCardNumberViewModelFactory(mrtrPrepaidRepository, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidValidateIdCardNumberViewModelFactory get() {
        return newInstance((MrtrPrepaidRepository) this.f106819a.get(), (ConfigurationRepository) this.f106820b.get(), (Rx2ThreadService) this.f106821c.get(), (MrtrErrorService) this.f106822d.get());
    }
}