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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidPackagesViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OnePostpaidPackagesViewModelFactory_Factory implements Factory<OnePostpaidPackagesViewModelFactory> {

    /* renamed from: a */
    public final Provider f94550a;

    /* renamed from: b */
    public final Provider f94551b;

    /* renamed from: c */
    public final Provider f94552c;

    /* renamed from: d */
    public final Provider f94553d;

    /* renamed from: e */
    public final Provider f94554e;

    public OnePostpaidPackagesViewModelFactory_Factory(Provider<OnePostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5) {
        this.f94550a = provider;
        this.f94551b = provider2;
        this.f94552c = provider3;
        this.f94553d = provider4;
        this.f94554e = provider5;
    }

    public static OnePostpaidPackagesViewModelFactory_Factory create(Provider<OnePostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5) {
        return new OnePostpaidPackagesViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OnePostpaidPackagesViewModelFactory newInstance(OnePostpaidRepository onePostpaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, PreferencesViewModel preferencesViewModel) {
        return new OnePostpaidPackagesViewModelFactory(onePostpaidRepository, configurationRepository, rx2ThreadService, oneErrorService, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OnePostpaidPackagesViewModelFactory get() {
        return newInstance((OnePostpaidRepository) this.f94550a.get(), (ConfigurationRepository) this.f94551b.get(), (Rx2ThreadService) this.f94552c.get(), (OneErrorService) this.f94553d.get(), (PreferencesViewModel) this.f94554e.get());
    }
}