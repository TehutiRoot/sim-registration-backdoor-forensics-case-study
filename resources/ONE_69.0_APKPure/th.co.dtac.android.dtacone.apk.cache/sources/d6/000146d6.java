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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.viewModel.OneTopUpViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneTopUpViewModelFactory_Factory implements Factory<OneTopUpViewModelFactory> {

    /* renamed from: a */
    public final Provider f98572a;

    /* renamed from: b */
    public final Provider f98573b;

    /* renamed from: c */
    public final Provider f98574c;

    /* renamed from: d */
    public final Provider f98575d;

    /* renamed from: e */
    public final Provider f98576e;

    /* renamed from: f */
    public final Provider f98577f;

    /* renamed from: g */
    public final Provider f98578g;

    /* renamed from: h */
    public final Provider f98579h;

    /* renamed from: i */
    public final Provider f98580i;

    public OneTopUpViewModelFactory_Factory(Provider<OneTopUpRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<ConfigurationRepository> provider4, Provider<PreferencesViewModel> provider5, Provider<HomeRepository> provider6, Provider<RtrRx2Repository> provider7, Provider<ServerErrorService> provider8, Provider<UdidService> provider9) {
        this.f98572a = provider;
        this.f98573b = provider2;
        this.f98574c = provider3;
        this.f98575d = provider4;
        this.f98576e = provider5;
        this.f98577f = provider6;
        this.f98578g = provider7;
        this.f98579h = provider8;
        this.f98580i = provider9;
    }

    public static OneTopUpViewModelFactory_Factory create(Provider<OneTopUpRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<ConfigurationRepository> provider4, Provider<PreferencesViewModel> provider5, Provider<HomeRepository> provider6, Provider<RtrRx2Repository> provider7, Provider<ServerErrorService> provider8, Provider<UdidService> provider9) {
        return new OneTopUpViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static OneTopUpViewModelFactory newInstance(OneTopUpRepository oneTopUpRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, ConfigurationRepository configurationRepository, PreferencesViewModel preferencesViewModel, HomeRepository homeRepository, RtrRx2Repository rtrRx2Repository, ServerErrorService serverErrorService, UdidService udidService) {
        return new OneTopUpViewModelFactory(oneTopUpRepository, rx2ThreadService, oneErrorService, configurationRepository, preferencesViewModel, homeRepository, rtrRx2Repository, serverErrorService, udidService);
    }

    @Override // javax.inject.Provider
    public OneTopUpViewModelFactory get() {
        return newInstance((OneTopUpRepository) this.f98572a.get(), (Rx2ThreadService) this.f98573b.get(), (OneErrorService) this.f98574c.get(), (ConfigurationRepository) this.f98575d.get(), (PreferencesViewModel) this.f98576e.get(), (HomeRepository) this.f98577f.get(), (RtrRx2Repository) this.f98578g.get(), (ServerErrorService) this.f98579h.get(), (UdidService) this.f98580i.get());
    }
}