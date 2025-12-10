package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.GetProfileViewModel_Factory */
/* loaded from: classes9.dex */
public final class GetProfileViewModel_Factory implements Factory<GetProfileViewModel> {

    /* renamed from: a */
    public final Provider f106120a;

    /* renamed from: b */
    public final Provider f106121b;

    /* renamed from: c */
    public final Provider f106122c;

    /* renamed from: d */
    public final Provider f106123d;

    /* renamed from: e */
    public final Provider f106124e;

    /* renamed from: f */
    public final Provider f106125f;

    /* renamed from: g */
    public final Provider f106126g;

    /* renamed from: h */
    public final Provider f106127h;

    /* renamed from: i */
    public final Provider f106128i;

    public GetProfileViewModel_Factory(Provider<LoginRepository> provider, Provider<PreferencesRepository> provider2, Provider<ConfigurationRepository> provider3, Provider<PreferencesViewModel> provider4, Provider<FirebaseMessagingTopic> provider5, Provider<Rx2ThreadService> provider6, Provider<RtrRx2Repository> provider7, Provider<MrtrErrorService> provider8, Provider<OneErrorService> provider9) {
        this.f106120a = provider;
        this.f106121b = provider2;
        this.f106122c = provider3;
        this.f106123d = provider4;
        this.f106124e = provider5;
        this.f106125f = provider6;
        this.f106126g = provider7;
        this.f106127h = provider8;
        this.f106128i = provider9;
    }

    public static GetProfileViewModel_Factory create(Provider<LoginRepository> provider, Provider<PreferencesRepository> provider2, Provider<ConfigurationRepository> provider3, Provider<PreferencesViewModel> provider4, Provider<FirebaseMessagingTopic> provider5, Provider<Rx2ThreadService> provider6, Provider<RtrRx2Repository> provider7, Provider<MrtrErrorService> provider8, Provider<OneErrorService> provider9) {
        return new GetProfileViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static GetProfileViewModel newInstance(LoginRepository loginRepository, PreferencesRepository preferencesRepository, ConfigurationRepository configurationRepository, PreferencesViewModel preferencesViewModel, FirebaseMessagingTopic firebaseMessagingTopic, Rx2ThreadService rx2ThreadService, RtrRx2Repository rtrRx2Repository, MrtrErrorService mrtrErrorService, OneErrorService oneErrorService) {
        return new GetProfileViewModel(loginRepository, preferencesRepository, configurationRepository, preferencesViewModel, firebaseMessagingTopic, rx2ThreadService, rtrRx2Repository, mrtrErrorService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public GetProfileViewModel get() {
        return newInstance((LoginRepository) this.f106120a.get(), (PreferencesRepository) this.f106121b.get(), (ConfigurationRepository) this.f106122c.get(), (PreferencesViewModel) this.f106123d.get(), (FirebaseMessagingTopic) this.f106124e.get(), (Rx2ThreadService) this.f106125f.get(), (RtrRx2Repository) this.f106126g.get(), (MrtrErrorService) this.f106127h.get(), (OneErrorService) this.f106128i.get());
    }
}