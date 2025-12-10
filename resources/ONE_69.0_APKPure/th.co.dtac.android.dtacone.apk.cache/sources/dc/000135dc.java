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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.online_activation.viewModel.OneOnlineActivationViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneOnlineActivationViewModel_Factory implements Factory<OneOnlineActivationViewModel> {

    /* renamed from: a */
    public final Provider f93037a;

    /* renamed from: b */
    public final Provider f93038b;

    /* renamed from: c */
    public final Provider f93039c;

    /* renamed from: d */
    public final Provider f93040d;

    /* renamed from: e */
    public final Provider f93041e;

    public OneOnlineActivationViewModel_Factory(Provider<OneOnlineActivationRepository> provider, Provider<PreferencesViewModel> provider2, Provider<ConfigurationRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5) {
        this.f93037a = provider;
        this.f93038b = provider2;
        this.f93039c = provider3;
        this.f93040d = provider4;
        this.f93041e = provider5;
    }

    public static OneOnlineActivationViewModel_Factory create(Provider<OneOnlineActivationRepository> provider, Provider<PreferencesViewModel> provider2, Provider<ConfigurationRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5) {
        return new OneOnlineActivationViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneOnlineActivationViewModel newInstance(OneOnlineActivationRepository oneOnlineActivationRepository, PreferencesViewModel preferencesViewModel, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneOnlineActivationViewModel(oneOnlineActivationRepository, preferencesViewModel, configurationRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneOnlineActivationViewModel get() {
        return newInstance((OneOnlineActivationRepository) this.f93037a.get(), (PreferencesViewModel) this.f93038b.get(), (ConfigurationRepository) this.f93039c.get(), (Rx2ThreadService) this.f93040d.get(), (OneErrorService) this.f93041e.get());
    }
}