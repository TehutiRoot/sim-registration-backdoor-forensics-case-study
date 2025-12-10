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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.viewModel.OneHomeViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneHomeViewModelFactory_Factory implements Factory<OneHomeViewModelFactory> {

    /* renamed from: a */
    public final Provider f91298a;

    /* renamed from: b */
    public final Provider f91299b;

    /* renamed from: c */
    public final Provider f91300c;

    /* renamed from: d */
    public final Provider f91301d;

    /* renamed from: e */
    public final Provider f91302e;

    /* renamed from: f */
    public final Provider f91303f;

    /* renamed from: g */
    public final Provider f91304g;

    /* renamed from: h */
    public final Provider f91305h;

    /* renamed from: i */
    public final Provider f91306i;

    public OneHomeViewModelFactory_Factory(Provider<HomeRepository> provider, Provider<Rx2ThreadService> provider2, Provider<RtrRx2Repository> provider3, Provider<PreferencesRepository> provider4, Provider<ServerErrorService> provider5, Provider<OneErrorService> provider6, Provider<ConfigurationRepository> provider7, Provider<PreferencesViewModel> provider8, Provider<UdidService> provider9) {
        this.f91298a = provider;
        this.f91299b = provider2;
        this.f91300c = provider3;
        this.f91301d = provider4;
        this.f91302e = provider5;
        this.f91303f = provider6;
        this.f91304g = provider7;
        this.f91305h = provider8;
        this.f91306i = provider9;
    }

    public static OneHomeViewModelFactory_Factory create(Provider<HomeRepository> provider, Provider<Rx2ThreadService> provider2, Provider<RtrRx2Repository> provider3, Provider<PreferencesRepository> provider4, Provider<ServerErrorService> provider5, Provider<OneErrorService> provider6, Provider<ConfigurationRepository> provider7, Provider<PreferencesViewModel> provider8, Provider<UdidService> provider9) {
        return new OneHomeViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static OneHomeViewModelFactory newInstance(HomeRepository homeRepository, Rx2ThreadService rx2ThreadService, RtrRx2Repository rtrRx2Repository, PreferencesRepository preferencesRepository, ServerErrorService serverErrorService, OneErrorService oneErrorService, ConfigurationRepository configurationRepository, PreferencesViewModel preferencesViewModel, UdidService udidService) {
        return new OneHomeViewModelFactory(homeRepository, rx2ThreadService, rtrRx2Repository, preferencesRepository, serverErrorService, oneErrorService, configurationRepository, preferencesViewModel, udidService);
    }

    @Override // javax.inject.Provider
    public OneHomeViewModelFactory get() {
        return newInstance((HomeRepository) this.f91298a.get(), (Rx2ThreadService) this.f91299b.get(), (RtrRx2Repository) this.f91300c.get(), (PreferencesRepository) this.f91301d.get(), (ServerErrorService) this.f91302e.get(), (OneErrorService) this.f91303f.get(), (ConfigurationRepository) this.f91304g.get(), (PreferencesViewModel) this.f91305h.get(), (UdidService) this.f91306i.get());
    }
}