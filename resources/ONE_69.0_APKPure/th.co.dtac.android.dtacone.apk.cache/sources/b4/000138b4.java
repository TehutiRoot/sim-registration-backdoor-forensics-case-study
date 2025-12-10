package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidPackagesViewModel_Factory */
/* loaded from: classes10.dex */
public final class OnePostpaidPackagesViewModel_Factory implements Factory<OnePostpaidPackagesViewModel> {

    /* renamed from: a */
    public final Provider f94555a;

    /* renamed from: b */
    public final Provider f94556b;

    /* renamed from: c */
    public final Provider f94557c;

    /* renamed from: d */
    public final Provider f94558d;

    /* renamed from: e */
    public final Provider f94559e;

    public OnePostpaidPackagesViewModel_Factory(Provider<OnePostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5) {
        this.f94555a = provider;
        this.f94556b = provider2;
        this.f94557c = provider3;
        this.f94558d = provider4;
        this.f94559e = provider5;
    }

    public static OnePostpaidPackagesViewModel_Factory create(Provider<OnePostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5) {
        return new OnePostpaidPackagesViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OnePostpaidPackagesViewModel newInstance(OnePostpaidRepository onePostpaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, PreferencesViewModel preferencesViewModel) {
        return new OnePostpaidPackagesViewModel(onePostpaidRepository, configurationRepository, rx2ThreadService, oneErrorService, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OnePostpaidPackagesViewModel get() {
        return newInstance((OnePostpaidRepository) this.f94555a.get(), (ConfigurationRepository) this.f94556b.get(), (Rx2ThreadService) this.f94557c.get(), (OneErrorService) this.f94558d.get(), (PreferencesViewModel) this.f94559e.get());
    }
}