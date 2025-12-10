package th.p047co.dtac.android.dtacone.presenter.activate_dol;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.activate_dol.DolSimRListPresenter_Factory */
/* loaded from: classes8.dex */
public final class DolSimRListPresenter_Factory implements Factory<DolSimRListPresenter> {

    /* renamed from: a */
    public final Provider f85231a;

    /* renamed from: b */
    public final Provider f85232b;

    /* renamed from: c */
    public final Provider f85233c;

    public DolSimRListPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85231a = provider;
        this.f85232b = provider2;
        this.f85233c = provider3;
    }

    public static DolSimRListPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new DolSimRListPresenter_Factory(provider, provider2, provider3);
    }

    public static DolSimRListPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new DolSimRListPresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public DolSimRListPresenter get() {
        return newInstance((RTRApi) this.f85231a.get(), (RxThreadService) this.f85232b.get(), (ServerErrorService) this.f85233c.get());
    }
}