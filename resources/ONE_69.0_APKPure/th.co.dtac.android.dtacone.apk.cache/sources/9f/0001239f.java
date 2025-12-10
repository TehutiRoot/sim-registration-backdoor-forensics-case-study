package th.p047co.dtac.android.dtacone.presenter.home;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.home.HomePresenter_Factory */
/* loaded from: classes8.dex */
public final class HomePresenter_Factory implements Factory<HomePresenter> {

    /* renamed from: a */
    public final Provider f85847a;

    /* renamed from: b */
    public final Provider f85848b;

    /* renamed from: c */
    public final Provider f85849c;

    /* renamed from: d */
    public final Provider f85850d;

    /* renamed from: e */
    public final Provider f85851e;

    public HomePresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<RtrRx2Repository> provider3, Provider<ServerErrorService> provider4, Provider<ConfigurationRepository> provider5) {
        this.f85847a = provider;
        this.f85848b = provider2;
        this.f85849c = provider3;
        this.f85850d = provider4;
        this.f85851e = provider5;
    }

    public static HomePresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<RtrRx2Repository> provider3, Provider<ServerErrorService> provider4, Provider<ConfigurationRepository> provider5) {
        return new HomePresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static HomePresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, RtrRx2Repository rtrRx2Repository, ServerErrorService serverErrorService, ConfigurationRepository configurationRepository) {
        return new HomePresenter(rTRApiRx2, rx2ThreadService, rtrRx2Repository, serverErrorService, configurationRepository);
    }

    @Override // javax.inject.Provider
    public HomePresenter get() {
        return newInstance((RTRApiRx2) this.f85847a.get(), (Rx2ThreadService) this.f85848b.get(), (RtrRx2Repository) this.f85849c.get(), (ServerErrorService) this.f85850d.get(), (ConfigurationRepository) this.f85851e.get());
    }
}