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
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel_Factory */
/* loaded from: classes7.dex */
public final class OneStvProsermOnlineViewModel_Factory implements Factory<OneStvProsermOnlineViewModel> {

    /* renamed from: a */
    public final Provider f82737a;

    /* renamed from: b */
    public final Provider f82738b;

    /* renamed from: c */
    public final Provider f82739c;

    /* renamed from: d */
    public final Provider f82740d;

    /* renamed from: e */
    public final Provider f82741e;

    /* renamed from: f */
    public final Provider f82742f;

    /* renamed from: g */
    public final Provider f82743g;

    /* renamed from: h */
    public final Provider f82744h;

    /* renamed from: i */
    public final Provider f82745i;

    public OneStvProsermOnlineViewModel_Factory(Provider<OneStvRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<ConfigurationRepository> provider4, Provider<PreferencesViewModel> provider5, Provider<ServerErrorService> provider6, Provider<UdidService> provider7, Provider<HomeRepository> provider8, Provider<RtrRx2Repository> provider9) {
        this.f82737a = provider;
        this.f82738b = provider2;
        this.f82739c = provider3;
        this.f82740d = provider4;
        this.f82741e = provider5;
        this.f82742f = provider6;
        this.f82743g = provider7;
        this.f82744h = provider8;
        this.f82745i = provider9;
    }

    public static OneStvProsermOnlineViewModel_Factory create(Provider<OneStvRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<ConfigurationRepository> provider4, Provider<PreferencesViewModel> provider5, Provider<ServerErrorService> provider6, Provider<UdidService> provider7, Provider<HomeRepository> provider8, Provider<RtrRx2Repository> provider9) {
        return new OneStvProsermOnlineViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static OneStvProsermOnlineViewModel newInstance(OneStvRepository oneStvRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, ConfigurationRepository configurationRepository, PreferencesViewModel preferencesViewModel, ServerErrorService serverErrorService, UdidService udidService, HomeRepository homeRepository, RtrRx2Repository rtrRx2Repository) {
        return new OneStvProsermOnlineViewModel(oneStvRepository, rx2ThreadService, oneErrorService, configurationRepository, preferencesViewModel, serverErrorService, udidService, homeRepository, rtrRx2Repository);
    }

    @Override // javax.inject.Provider
    public OneStvProsermOnlineViewModel get() {
        return newInstance((OneStvRepository) this.f82737a.get(), (Rx2ThreadService) this.f82738b.get(), (OneErrorService) this.f82739c.get(), (ConfigurationRepository) this.f82740d.get(), (PreferencesViewModel) this.f82741e.get(), (ServerErrorService) this.f82742f.get(), (UdidService) this.f82743g.get(), (HomeRepository) this.f82744h.get(), (RtrRx2Repository) this.f82745i.get());
    }
}
