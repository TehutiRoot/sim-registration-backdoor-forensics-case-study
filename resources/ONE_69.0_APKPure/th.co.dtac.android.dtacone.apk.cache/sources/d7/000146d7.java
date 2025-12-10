package th.p047co.dtac.android.dtacone.view.appOne.topup.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.home.HomeRepository;
import th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.viewModel.OneTopUpViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneTopUpViewModel_Factory implements Factory<OneTopUpViewModel> {

    /* renamed from: a */
    public final Provider f98581a;

    /* renamed from: b */
    public final Provider f98582b;

    /* renamed from: c */
    public final Provider f98583c;

    /* renamed from: d */
    public final Provider f98584d;

    /* renamed from: e */
    public final Provider f98585e;

    /* renamed from: f */
    public final Provider f98586f;

    /* renamed from: g */
    public final Provider f98587g;

    /* renamed from: h */
    public final Provider f98588h;

    /* renamed from: i */
    public final Provider f98589i;

    public OneTopUpViewModel_Factory(Provider<OneTopUpRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<ConfigurationRepository> provider4, Provider<PreferencesViewModel> provider5, Provider<HomeRepository> provider6, Provider<RtrRx2Repository> provider7, Provider<ServerErrorService> provider8, Provider<UdidService> provider9) {
        this.f98581a = provider;
        this.f98582b = provider2;
        this.f98583c = provider3;
        this.f98584d = provider4;
        this.f98585e = provider5;
        this.f98586f = provider6;
        this.f98587g = provider7;
        this.f98588h = provider8;
        this.f98589i = provider9;
    }

    public static OneTopUpViewModel_Factory create(Provider<OneTopUpRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<ConfigurationRepository> provider4, Provider<PreferencesViewModel> provider5, Provider<HomeRepository> provider6, Provider<RtrRx2Repository> provider7, Provider<ServerErrorService> provider8, Provider<UdidService> provider9) {
        return new OneTopUpViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static OneTopUpViewModel newInstance(OneTopUpRepository oneTopUpRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, ConfigurationRepository configurationRepository, PreferencesViewModel preferencesViewModel, HomeRepository homeRepository, RtrRx2Repository rtrRx2Repository, ServerErrorService serverErrorService, UdidService udidService) {
        return new OneTopUpViewModel(oneTopUpRepository, rx2ThreadService, oneErrorService, configurationRepository, preferencesViewModel, homeRepository, rtrRx2Repository, serverErrorService, udidService);
    }

    @Override // javax.inject.Provider
    public OneTopUpViewModel get() {
        return newInstance((OneTopUpRepository) this.f98581a.get(), (Rx2ThreadService) this.f98582b.get(), (OneErrorService) this.f98583c.get(), (ConfigurationRepository) this.f98584d.get(), (PreferencesViewModel) this.f98585e.get(), (HomeRepository) this.f98586f.get(), (RtrRx2Repository) this.f98587g.get(), (ServerErrorService) this.f98588h.get(), (UdidService) this.f98589i.get());
    }
}