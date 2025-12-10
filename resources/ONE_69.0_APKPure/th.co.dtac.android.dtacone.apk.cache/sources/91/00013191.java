package th.p047co.dtac.android.dtacone.view.appOne.home.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.home.HomeRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.viewModel.OneHomeViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneHomeViewModel_Factory implements Factory<OneHomeViewModel> {

    /* renamed from: a */
    public final Provider f91307a;

    /* renamed from: b */
    public final Provider f91308b;

    /* renamed from: c */
    public final Provider f91309c;

    /* renamed from: d */
    public final Provider f91310d;

    /* renamed from: e */
    public final Provider f91311e;

    /* renamed from: f */
    public final Provider f91312f;

    /* renamed from: g */
    public final Provider f91313g;

    /* renamed from: h */
    public final Provider f91314h;

    /* renamed from: i */
    public final Provider f91315i;

    public OneHomeViewModel_Factory(Provider<HomeRepository> provider, Provider<Rx2ThreadService> provider2, Provider<RtrRx2Repository> provider3, Provider<PreferencesRepository> provider4, Provider<ServerErrorService> provider5, Provider<OneErrorService> provider6, Provider<ConfigurationRepository> provider7, Provider<PreferencesViewModel> provider8, Provider<UdidService> provider9) {
        this.f91307a = provider;
        this.f91308b = provider2;
        this.f91309c = provider3;
        this.f91310d = provider4;
        this.f91311e = provider5;
        this.f91312f = provider6;
        this.f91313g = provider7;
        this.f91314h = provider8;
        this.f91315i = provider9;
    }

    public static OneHomeViewModel_Factory create(Provider<HomeRepository> provider, Provider<Rx2ThreadService> provider2, Provider<RtrRx2Repository> provider3, Provider<PreferencesRepository> provider4, Provider<ServerErrorService> provider5, Provider<OneErrorService> provider6, Provider<ConfigurationRepository> provider7, Provider<PreferencesViewModel> provider8, Provider<UdidService> provider9) {
        return new OneHomeViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static OneHomeViewModel newInstance(HomeRepository homeRepository, Rx2ThreadService rx2ThreadService, RtrRx2Repository rtrRx2Repository, PreferencesRepository preferencesRepository, ServerErrorService serverErrorService, OneErrorService oneErrorService, ConfigurationRepository configurationRepository, PreferencesViewModel preferencesViewModel, UdidService udidService) {
        return new OneHomeViewModel(homeRepository, rx2ThreadService, rtrRx2Repository, preferencesRepository, serverErrorService, oneErrorService, configurationRepository, preferencesViewModel, udidService);
    }

    @Override // javax.inject.Provider
    public OneHomeViewModel get() {
        return newInstance((HomeRepository) this.f91307a.get(), (Rx2ThreadService) this.f91308b.get(), (RtrRx2Repository) this.f91309c.get(), (PreferencesRepository) this.f91310d.get(), (ServerErrorService) this.f91311e.get(), (OneErrorService) this.f91312f.get(), (ConfigurationRepository) this.f91313g.get(), (PreferencesViewModel) this.f91314h.get(), (UdidService) this.f91315i.get());
    }
}