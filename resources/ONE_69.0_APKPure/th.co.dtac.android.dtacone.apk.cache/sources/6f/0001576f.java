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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.home.HomeViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class HomeViewModelFactory_Factory implements Factory<HomeViewModelFactory> {

    /* renamed from: a */
    public final Provider f106029a;

    /* renamed from: b */
    public final Provider f106030b;

    /* renamed from: c */
    public final Provider f106031c;

    /* renamed from: d */
    public final Provider f106032d;

    /* renamed from: e */
    public final Provider f106033e;

    /* renamed from: f */
    public final Provider f106034f;

    /* renamed from: g */
    public final Provider f106035g;

    public HomeViewModelFactory_Factory(Provider<HomeRepository> provider, Provider<Rx2ThreadService> provider2, Provider<RtrRx2Repository> provider3, Provider<PreferencesRepository> provider4, Provider<ServerErrorService> provider5, Provider<OneErrorService> provider6, Provider<ConfigurationRepository> provider7) {
        this.f106029a = provider;
        this.f106030b = provider2;
        this.f106031c = provider3;
        this.f106032d = provider4;
        this.f106033e = provider5;
        this.f106034f = provider6;
        this.f106035g = provider7;
    }

    public static HomeViewModelFactory_Factory create(Provider<HomeRepository> provider, Provider<Rx2ThreadService> provider2, Provider<RtrRx2Repository> provider3, Provider<PreferencesRepository> provider4, Provider<ServerErrorService> provider5, Provider<OneErrorService> provider6, Provider<ConfigurationRepository> provider7) {
        return new HomeViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static HomeViewModelFactory newInstance(HomeRepository homeRepository, Rx2ThreadService rx2ThreadService, RtrRx2Repository rtrRx2Repository, PreferencesRepository preferencesRepository, ServerErrorService serverErrorService, OneErrorService oneErrorService, ConfigurationRepository configurationRepository) {
        return new HomeViewModelFactory(homeRepository, rx2ThreadService, rtrRx2Repository, preferencesRepository, serverErrorService, oneErrorService, configurationRepository);
    }

    @Override // javax.inject.Provider
    public HomeViewModelFactory get() {
        return newInstance((HomeRepository) this.f106029a.get(), (Rx2ThreadService) this.f106030b.get(), (RtrRx2Repository) this.f106031c.get(), (PreferencesRepository) this.f106032d.get(), (ServerErrorService) this.f106033e.get(), (OneErrorService) this.f106034f.get(), (ConfigurationRepository) this.f106035g.get());
    }
}