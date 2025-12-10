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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidValidationViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OnePostpaidValidationViewModelFactory_Factory implements Factory<OnePostpaidValidationViewModelFactory> {

    /* renamed from: a */
    public final Provider f94737a;

    /* renamed from: b */
    public final Provider f94738b;

    /* renamed from: c */
    public final Provider f94739c;

    /* renamed from: d */
    public final Provider f94740d;

    /* renamed from: e */
    public final Provider f94741e;

    public OnePostpaidValidationViewModelFactory_Factory(Provider<OnePostpaidRepository> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5) {
        this.f94737a = provider;
        this.f94738b = provider2;
        this.f94739c = provider3;
        this.f94740d = provider4;
        this.f94741e = provider5;
    }

    public static OnePostpaidValidationViewModelFactory_Factory create(Provider<OnePostpaidRepository> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5) {
        return new OnePostpaidValidationViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OnePostpaidValidationViewModelFactory newInstance(OnePostpaidRepository onePostpaidRepository, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OnePostpaidValidationViewModelFactory(onePostpaidRepository, rtrRx2Repository, configurationRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OnePostpaidValidationViewModelFactory get() {
        return newInstance((OnePostpaidRepository) this.f94737a.get(), (RtrRx2Repository) this.f94738b.get(), (ConfigurationRepository) this.f94739c.get(), (Rx2ThreadService) this.f94740d.get(), (OneErrorService) this.f94741e.get());
    }
}