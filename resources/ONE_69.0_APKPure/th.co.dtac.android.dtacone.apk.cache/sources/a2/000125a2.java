package th.p047co.dtac.android.dtacone.presenter.stv;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPhoenixPresenter_Factory */
/* loaded from: classes8.dex */
public final class StvPhoenixPresenter_Factory implements Factory<StvPhoenixPresenter> {

    /* renamed from: a */
    public final Provider f86640a;

    /* renamed from: b */
    public final Provider f86641b;

    /* renamed from: c */
    public final Provider f86642c;

    /* renamed from: d */
    public final Provider f86643d;

    /* renamed from: e */
    public final Provider f86644e;

    public StvPhoenixPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4, Provider<ConfigurationRepository> provider5) {
        this.f86640a = provider;
        this.f86641b = provider2;
        this.f86642c = provider3;
        this.f86643d = provider4;
        this.f86644e = provider5;
    }

    public static StvPhoenixPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4, Provider<ConfigurationRepository> provider5) {
        return new StvPhoenixPresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static StvPhoenixPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, RtrRepository rtrRepository, ConfigurationRepository configurationRepository) {
        return new StvPhoenixPresenter(rTRApi, rxThreadService, serverErrorService, rtrRepository, configurationRepository);
    }

    @Override // javax.inject.Provider
    public StvPhoenixPresenter get() {
        return newInstance((RTRApi) this.f86640a.get(), (RxThreadService) this.f86641b.get(), (ServerErrorService) this.f86642c.get(), (RtrRepository) this.f86643d.get(), (ConfigurationRepository) this.f86644e.get());
    }
}