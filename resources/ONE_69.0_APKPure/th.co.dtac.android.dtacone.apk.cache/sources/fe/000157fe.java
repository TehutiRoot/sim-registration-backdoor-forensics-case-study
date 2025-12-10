package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.LoginMrtrViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class LoginMrtrViewModelFactory_Factory implements Factory<LoginMrtrViewModelFactory> {

    /* renamed from: a */
    public final Provider f106182a;

    /* renamed from: b */
    public final Provider f106183b;

    /* renamed from: c */
    public final Provider f106184c;

    /* renamed from: d */
    public final Provider f106185d;

    /* renamed from: e */
    public final Provider f106186e;

    /* renamed from: f */
    public final Provider f106187f;

    /* renamed from: g */
    public final Provider f106188g;

    /* renamed from: h */
    public final Provider f106189h;

    public LoginMrtrViewModelFactory_Factory(Provider<LoginRepository> provider, Provider<ConfigurationRepository> provider2, Provider<PreferencesRepository> provider3, Provider<TemporaryCache> provider4, Provider<Rx2ThreadService> provider5, Provider<RtrRx2Repository> provider6, Provider<MrtrErrorService> provider7, Provider<OneErrorService> provider8) {
        this.f106182a = provider;
        this.f106183b = provider2;
        this.f106184c = provider3;
        this.f106185d = provider4;
        this.f106186e = provider5;
        this.f106187f = provider6;
        this.f106188g = provider7;
        this.f106189h = provider8;
    }

    public static LoginMrtrViewModelFactory_Factory create(Provider<LoginRepository> provider, Provider<ConfigurationRepository> provider2, Provider<PreferencesRepository> provider3, Provider<TemporaryCache> provider4, Provider<Rx2ThreadService> provider5, Provider<RtrRx2Repository> provider6, Provider<MrtrErrorService> provider7, Provider<OneErrorService> provider8) {
        return new LoginMrtrViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static LoginMrtrViewModelFactory newInstance(LoginRepository loginRepository, ConfigurationRepository configurationRepository, PreferencesRepository preferencesRepository, TemporaryCache temporaryCache, Rx2ThreadService rx2ThreadService, RtrRx2Repository rtrRx2Repository, MrtrErrorService mrtrErrorService, OneErrorService oneErrorService) {
        return new LoginMrtrViewModelFactory(loginRepository, configurationRepository, preferencesRepository, temporaryCache, rx2ThreadService, rtrRx2Repository, mrtrErrorService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public LoginMrtrViewModelFactory get() {
        return newInstance((LoginRepository) this.f106182a.get(), (ConfigurationRepository) this.f106183b.get(), (PreferencesRepository) this.f106184c.get(), (TemporaryCache) this.f106185d.get(), (Rx2ThreadService) this.f106186e.get(), (RtrRx2Repository) this.f106187f.get(), (MrtrErrorService) this.f106188g.get(), (OneErrorService) this.f106189h.get());
    }
}