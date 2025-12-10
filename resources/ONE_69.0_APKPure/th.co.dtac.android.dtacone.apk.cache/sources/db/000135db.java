package th.p047co.dtac.android.dtacone.view.appOne.online_activation.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.online_activation.repository.OneOnlineActivationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.online_activation.viewModel.OneOnlineActivationViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneOnlineActivationViewModelFactory_Factory implements Factory<OneOnlineActivationViewModelFactory> {

    /* renamed from: a */
    public final Provider f93032a;

    /* renamed from: b */
    public final Provider f93033b;

    /* renamed from: c */
    public final Provider f93034c;

    /* renamed from: d */
    public final Provider f93035d;

    /* renamed from: e */
    public final Provider f93036e;

    public OneOnlineActivationViewModelFactory_Factory(Provider<OneOnlineActivationRepository> provider, Provider<PreferencesViewModel> provider2, Provider<ConfigurationRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5) {
        this.f93032a = provider;
        this.f93033b = provider2;
        this.f93034c = provider3;
        this.f93035d = provider4;
        this.f93036e = provider5;
    }

    public static OneOnlineActivationViewModelFactory_Factory create(Provider<OneOnlineActivationRepository> provider, Provider<PreferencesViewModel> provider2, Provider<ConfigurationRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5) {
        return new OneOnlineActivationViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneOnlineActivationViewModelFactory newInstance(OneOnlineActivationRepository oneOnlineActivationRepository, PreferencesViewModel preferencesViewModel, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneOnlineActivationViewModelFactory(oneOnlineActivationRepository, preferencesViewModel, configurationRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneOnlineActivationViewModelFactory get() {
        return newInstance((OneOnlineActivationRepository) this.f93032a.get(), (PreferencesViewModel) this.f93033b.get(), (ConfigurationRepository) this.f93034c.get(), (Rx2ThreadService) this.f93035d.get(), (OneErrorService) this.f93036e.get());
    }
}