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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.GetProfileViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class GetProfileViewModelFactory_Factory implements Factory<GetProfileViewModelFactory> {

    /* renamed from: a */
    public final Provider f106111a;

    /* renamed from: b */
    public final Provider f106112b;

    /* renamed from: c */
    public final Provider f106113c;

    /* renamed from: d */
    public final Provider f106114d;

    /* renamed from: e */
    public final Provider f106115e;

    /* renamed from: f */
    public final Provider f106116f;

    /* renamed from: g */
    public final Provider f106117g;

    /* renamed from: h */
    public final Provider f106118h;

    /* renamed from: i */
    public final Provider f106119i;

    public GetProfileViewModelFactory_Factory(Provider<LoginRepository> provider, Provider<PreferencesRepository> provider2, Provider<ConfigurationRepository> provider3, Provider<PreferencesViewModel> provider4, Provider<FirebaseMessagingTopic> provider5, Provider<Rx2ThreadService> provider6, Provider<RtrRx2Repository> provider7, Provider<MrtrErrorService> provider8, Provider<OneErrorService> provider9) {
        this.f106111a = provider;
        this.f106112b = provider2;
        this.f106113c = provider3;
        this.f106114d = provider4;
        this.f106115e = provider5;
        this.f106116f = provider6;
        this.f106117g = provider7;
        this.f106118h = provider8;
        this.f106119i = provider9;
    }

    public static GetProfileViewModelFactory_Factory create(Provider<LoginRepository> provider, Provider<PreferencesRepository> provider2, Provider<ConfigurationRepository> provider3, Provider<PreferencesViewModel> provider4, Provider<FirebaseMessagingTopic> provider5, Provider<Rx2ThreadService> provider6, Provider<RtrRx2Repository> provider7, Provider<MrtrErrorService> provider8, Provider<OneErrorService> provider9) {
        return new GetProfileViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static GetProfileViewModelFactory newInstance(LoginRepository loginRepository, PreferencesRepository preferencesRepository, ConfigurationRepository configurationRepository, PreferencesViewModel preferencesViewModel, FirebaseMessagingTopic firebaseMessagingTopic, Rx2ThreadService rx2ThreadService, RtrRx2Repository rtrRx2Repository, MrtrErrorService mrtrErrorService, OneErrorService oneErrorService) {
        return new GetProfileViewModelFactory(loginRepository, preferencesRepository, configurationRepository, preferencesViewModel, firebaseMessagingTopic, rx2ThreadService, rtrRx2Repository, mrtrErrorService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public GetProfileViewModelFactory get() {
        return newInstance((LoginRepository) this.f106111a.get(), (PreferencesRepository) this.f106112b.get(), (ConfigurationRepository) this.f106113c.get(), (PreferencesViewModel) this.f106114d.get(), (FirebaseMessagingTopic) this.f106115e.get(), (Rx2ThreadService) this.f106116f.get(), (RtrRx2Repository) this.f106117g.get(), (MrtrErrorService) this.f106118h.get(), (OneErrorService) this.f106119i.get());
    }
}