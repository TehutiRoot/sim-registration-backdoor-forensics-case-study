package th.p047co.dtac.android.dtacone.viewmodel.home;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.home.HomeRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.home.HomeViewModel_Factory */
/* loaded from: classes9.dex */
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {

    /* renamed from: a */
    public final Provider f106036a;

    /* renamed from: b */
    public final Provider f106037b;

    /* renamed from: c */
    public final Provider f106038c;

    /* renamed from: d */
    public final Provider f106039d;

    /* renamed from: e */
    public final Provider f106040e;

    /* renamed from: f */
    public final Provider f106041f;

    /* renamed from: g */
    public final Provider f106042g;

    public HomeViewModel_Factory(Provider<HomeRepository> provider, Provider<Rx2ThreadService> provider2, Provider<RtrRx2Repository> provider3, Provider<PreferencesRepository> provider4, Provider<ServerErrorService> provider5, Provider<OneErrorService> provider6, Provider<ConfigurationRepository> provider7) {
        this.f106036a = provider;
        this.f106037b = provider2;
        this.f106038c = provider3;
        this.f106039d = provider4;
        this.f106040e = provider5;
        this.f106041f = provider6;
        this.f106042g = provider7;
    }

    public static HomeViewModel_Factory create(Provider<HomeRepository> provider, Provider<Rx2ThreadService> provider2, Provider<RtrRx2Repository> provider3, Provider<PreferencesRepository> provider4, Provider<ServerErrorService> provider5, Provider<OneErrorService> provider6, Provider<ConfigurationRepository> provider7) {
        return new HomeViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static HomeViewModel newInstance(HomeRepository homeRepository, Rx2ThreadService rx2ThreadService, RtrRx2Repository rtrRx2Repository, PreferencesRepository preferencesRepository, ServerErrorService serverErrorService, OneErrorService oneErrorService, ConfigurationRepository configurationRepository) {
        return new HomeViewModel(homeRepository, rx2ThreadService, rtrRx2Repository, preferencesRepository, serverErrorService, oneErrorService, configurationRepository);
    }

    @Override // javax.inject.Provider
    public HomeViewModel get() {
        return newInstance((HomeRepository) this.f106036a.get(), (Rx2ThreadService) this.f106037b.get(), (RtrRx2Repository) this.f106038c.get(), (PreferencesRepository) this.f106039d.get(), (ServerErrorService) this.f106040e.get(), (OneErrorService) this.f106041f.get(), (ConfigurationRepository) this.f106042g.get());
    }
}