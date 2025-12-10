package th.p047co.dtac.android.dtacone.app_one.viewmodel.stv;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
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
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModelFactory_Factory */
/* loaded from: classes7.dex */
public final class OneStvProsermOnlineViewModelFactory_Factory implements Factory<OneStvProsermOnlineViewModelFactory> {

    /* renamed from: a */
    public final Provider f82820a;

    /* renamed from: b */
    public final Provider f82821b;

    /* renamed from: c */
    public final Provider f82822c;

    /* renamed from: d */
    public final Provider f82823d;

    /* renamed from: e */
    public final Provider f82824e;

    /* renamed from: f */
    public final Provider f82825f;

    /* renamed from: g */
    public final Provider f82826g;

    /* renamed from: h */
    public final Provider f82827h;

    /* renamed from: i */
    public final Provider f82828i;

    public OneStvProsermOnlineViewModelFactory_Factory(Provider<OneStvRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<ConfigurationRepository> provider4, Provider<PreferencesViewModel> provider5, Provider<ServerErrorService> provider6, Provider<UdidService> provider7, Provider<HomeRepository> provider8, Provider<RtrRx2Repository> provider9) {
        this.f82820a = provider;
        this.f82821b = provider2;
        this.f82822c = provider3;
        this.f82823d = provider4;
        this.f82824e = provider5;
        this.f82825f = provider6;
        this.f82826g = provider7;
        this.f82827h = provider8;
        this.f82828i = provider9;
    }

    public static OneStvProsermOnlineViewModelFactory_Factory create(Provider<OneStvRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<ConfigurationRepository> provider4, Provider<PreferencesViewModel> provider5, Provider<ServerErrorService> provider6, Provider<UdidService> provider7, Provider<HomeRepository> provider8, Provider<RtrRx2Repository> provider9) {
        return new OneStvProsermOnlineViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static OneStvProsermOnlineViewModelFactory newInstance(OneStvRepository oneStvRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, ConfigurationRepository configurationRepository, PreferencesViewModel preferencesViewModel, ServerErrorService serverErrorService, UdidService udidService, HomeRepository homeRepository, RtrRx2Repository rtrRx2Repository) {
        return new OneStvProsermOnlineViewModelFactory(oneStvRepository, rx2ThreadService, oneErrorService, configurationRepository, preferencesViewModel, serverErrorService, udidService, homeRepository, rtrRx2Repository);
    }

    @Override // javax.inject.Provider
    public OneStvProsermOnlineViewModelFactory get() {
        return newInstance((OneStvRepository) this.f82820a.get(), (Rx2ThreadService) this.f82821b.get(), (OneErrorService) this.f82822c.get(), (ConfigurationRepository) this.f82823d.get(), (PreferencesViewModel) this.f82824e.get(), (ServerErrorService) this.f82825f.get(), (UdidService) this.f82826g.get(), (HomeRepository) this.f82827h.get(), (RtrRx2Repository) this.f82828i.get());
    }
}