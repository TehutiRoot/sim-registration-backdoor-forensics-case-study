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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidValidateIdCardNumberViewModel_Factory */
/* loaded from: classes9.dex */
public final class MrtrPrepaidValidateIdCardNumberViewModel_Factory implements Factory<MrtrPrepaidValidateIdCardNumberViewModel> {

    /* renamed from: a */
    public final Provider f106823a;

    /* renamed from: b */
    public final Provider f106824b;

    /* renamed from: c */
    public final Provider f106825c;

    /* renamed from: d */
    public final Provider f106826d;

    public MrtrPrepaidValidateIdCardNumberViewModel_Factory(Provider<MrtrPrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f106823a = provider;
        this.f106824b = provider2;
        this.f106825c = provider3;
        this.f106826d = provider4;
    }

    public static MrtrPrepaidValidateIdCardNumberViewModel_Factory create(Provider<MrtrPrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new MrtrPrepaidValidateIdCardNumberViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static MrtrPrepaidValidateIdCardNumberViewModel newInstance(MrtrPrepaidRepository mrtrPrepaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new MrtrPrepaidValidateIdCardNumberViewModel(mrtrPrepaidRepository, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidValidateIdCardNumberViewModel get() {
        return newInstance((MrtrPrepaidRepository) this.f106823a.get(), (ConfigurationRepository) this.f106824b.get(), (Rx2ThreadService) this.f106825c.get(), (MrtrErrorService) this.f106826d.get());
    }
}