package th.p047co.dtac.android.dtacone.presenter.rectify;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.rectify.RectifyListPresenter_Factory */
/* loaded from: classes8.dex */
public final class RectifyListPresenter_Factory implements Factory<RectifyListPresenter> {

    /* renamed from: a */
    public final Provider f86300a;

    /* renamed from: b */
    public final Provider f86301b;

    /* renamed from: c */
    public final Provider f86302c;

    public RectifyListPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86300a = provider;
        this.f86301b = provider2;
        this.f86302c = provider3;
    }

    public static RectifyListPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new RectifyListPresenter_Factory(provider, provider2, provider3);
    }

    public static RectifyListPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new RectifyListPresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public RectifyListPresenter get() {
        return newInstance((RTRApi) this.f86300a.get(), (RxThreadService) this.f86301b.get(), (ServerErrorService) this.f86302c.get());
    }
}