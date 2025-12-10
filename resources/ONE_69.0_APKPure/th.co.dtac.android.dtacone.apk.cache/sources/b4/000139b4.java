package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidValidationViewModel_Factory */
/* loaded from: classes10.dex */
public final class OnePostpaidValidationViewModel_Factory implements Factory<OnePostpaidValidationViewModel> {

    /* renamed from: a */
    public final Provider f94742a;

    /* renamed from: b */
    public final Provider f94743b;

    /* renamed from: c */
    public final Provider f94744c;

    /* renamed from: d */
    public final Provider f94745d;

    /* renamed from: e */
    public final Provider f94746e;

    public OnePostpaidValidationViewModel_Factory(Provider<OnePostpaidRepository> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5) {
        this.f94742a = provider;
        this.f94743b = provider2;
        this.f94744c = provider3;
        this.f94745d = provider4;
        this.f94746e = provider5;
    }

    public static OnePostpaidValidationViewModel_Factory create(Provider<OnePostpaidRepository> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5) {
        return new OnePostpaidValidationViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OnePostpaidValidationViewModel newInstance(OnePostpaidRepository onePostpaidRepository, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OnePostpaidValidationViewModel(onePostpaidRepository, rtrRx2Repository, configurationRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OnePostpaidValidationViewModel get() {
        return newInstance((OnePostpaidRepository) this.f94742a.get(), (RtrRx2Repository) this.f94743b.get(), (ConfigurationRepository) this.f94744c.get(), (Rx2ThreadService) this.f94745d.get(), (OneErrorService) this.f94746e.get());
    }
}