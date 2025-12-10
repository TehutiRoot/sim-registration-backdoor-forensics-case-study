package th.p047co.dtac.android.dtacone.presenter.activate_dol;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.activate_dol.DolVerifyActivatePresenter_Factory */
/* loaded from: classes8.dex */
public final class DolVerifyActivatePresenter_Factory implements Factory<DolVerifyActivatePresenter> {

    /* renamed from: a */
    public final Provider f85240a;

    /* renamed from: b */
    public final Provider f85241b;

    /* renamed from: c */
    public final Provider f85242c;

    /* renamed from: d */
    public final Provider f85243d;

    public DolVerifyActivatePresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<RtrRepository> provider3, Provider<ServerErrorService> provider4) {
        this.f85240a = provider;
        this.f85241b = provider2;
        this.f85242c = provider3;
        this.f85243d = provider4;
    }

    public static DolVerifyActivatePresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<RtrRepository> provider3, Provider<ServerErrorService> provider4) {
        return new DolVerifyActivatePresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static DolVerifyActivatePresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, RtrRepository rtrRepository, ServerErrorService serverErrorService) {
        return new DolVerifyActivatePresenter(rTRApi, rxThreadService, rtrRepository, serverErrorService);
    }

    @Override // javax.inject.Provider
    public DolVerifyActivatePresenter get() {
        return newInstance((RTRApi) this.f85240a.get(), (RxThreadService) this.f85241b.get(), (RtrRepository) this.f85242c.get(), (ServerErrorService) this.f85243d.get());
    }
}