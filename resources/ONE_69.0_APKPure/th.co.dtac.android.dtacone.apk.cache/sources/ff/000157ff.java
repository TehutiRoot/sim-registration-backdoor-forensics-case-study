package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.LoginMrtrViewModel_Factory */
/* loaded from: classes9.dex */
public final class LoginMrtrViewModel_Factory implements Factory<LoginMrtrViewModel> {

    /* renamed from: a */
    public final Provider f106190a;

    /* renamed from: b */
    public final Provider f106191b;

    /* renamed from: c */
    public final Provider f106192c;

    /* renamed from: d */
    public final Provider f106193d;

    /* renamed from: e */
    public final Provider f106194e;

    /* renamed from: f */
    public final Provider f106195f;

    /* renamed from: g */
    public final Provider f106196g;

    public LoginMrtrViewModel_Factory(Provider<LoginRepository> provider, Provider<ConfigurationRepository> provider2, Provider<PreferencesRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<RtrRx2Repository> provider5, Provider<MrtrErrorService> provider6, Provider<OneErrorService> provider7) {
        this.f106190a = provider;
        this.f106191b = provider2;
        this.f106192c = provider3;
        this.f106193d = provider4;
        this.f106194e = provider5;
        this.f106195f = provider6;
        this.f106196g = provider7;
    }

    public static LoginMrtrViewModel_Factory create(Provider<LoginRepository> provider, Provider<ConfigurationRepository> provider2, Provider<PreferencesRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<RtrRx2Repository> provider5, Provider<MrtrErrorService> provider6, Provider<OneErrorService> provider7) {
        return new LoginMrtrViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static LoginMrtrViewModel newInstance(LoginRepository loginRepository, ConfigurationRepository configurationRepository, PreferencesRepository preferencesRepository, Rx2ThreadService rx2ThreadService, RtrRx2Repository rtrRx2Repository, MrtrErrorService mrtrErrorService, OneErrorService oneErrorService) {
        return new LoginMrtrViewModel(loginRepository, configurationRepository, preferencesRepository, rx2ThreadService, rtrRx2Repository, mrtrErrorService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public LoginMrtrViewModel get() {
        return newInstance((LoginRepository) this.f106190a.get(), (ConfigurationRepository) this.f106191b.get(), (PreferencesRepository) this.f106192c.get(), (Rx2ThreadService) this.f106193d.get(), (RtrRx2Repository) this.f106194e.get(), (MrtrErrorService) this.f106195f.get(), (OneErrorService) this.f106196g.get());
    }
}