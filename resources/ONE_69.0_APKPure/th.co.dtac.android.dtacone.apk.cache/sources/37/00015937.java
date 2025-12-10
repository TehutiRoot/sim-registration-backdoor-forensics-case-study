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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidValidationViewModel_Factory */
/* loaded from: classes9.dex */
public final class MrtrPostpaidValidationViewModel_Factory implements Factory<MrtrPostpaidValidationViewModel> {

    /* renamed from: a */
    public final Provider f106570a;

    /* renamed from: b */
    public final Provider f106571b;

    /* renamed from: c */
    public final Provider f106572c;

    /* renamed from: d */
    public final Provider f106573d;

    /* renamed from: e */
    public final Provider f106574e;

    public MrtrPostpaidValidationViewModel_Factory(Provider<MrtrPostpaidRepository> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<MrtrErrorService> provider5) {
        this.f106570a = provider;
        this.f106571b = provider2;
        this.f106572c = provider3;
        this.f106573d = provider4;
        this.f106574e = provider5;
    }

    public static MrtrPostpaidValidationViewModel_Factory create(Provider<MrtrPostpaidRepository> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<MrtrErrorService> provider5) {
        return new MrtrPostpaidValidationViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrPostpaidValidationViewModel newInstance(MrtrPostpaidRepository mrtrPostpaidRepository, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new MrtrPostpaidValidationViewModel(mrtrPostpaidRepository, rtrRx2Repository, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPostpaidValidationViewModel get() {
        return newInstance((MrtrPostpaidRepository) this.f106570a.get(), (RtrRx2Repository) this.f106571b.get(), (ConfigurationRepository) this.f106572c.get(), (Rx2ThreadService) this.f106573d.get(), (MrtrErrorService) this.f106574e.get());
    }
}