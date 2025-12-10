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
/* renamed from: th.co.dtac.android.dtacone.presenter.rectify.RectifyListPresenterKt_Factory */
/* loaded from: classes8.dex */
public final class RectifyListPresenterKt_Factory implements Factory<RectifyListPresenterKt> {

    /* renamed from: a */
    public final Provider f86297a;

    /* renamed from: b */
    public final Provider f86298b;

    /* renamed from: c */
    public final Provider f86299c;

    public RectifyListPresenterKt_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86297a = provider;
        this.f86298b = provider2;
        this.f86299c = provider3;
    }

    public static RectifyListPresenterKt_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new RectifyListPresenterKt_Factory(provider, provider2, provider3);
    }

    public static RectifyListPresenterKt newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new RectifyListPresenterKt(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public RectifyListPresenterKt get() {
        return newInstance((RTRApi) this.f86297a.get(), (RxThreadService) this.f86298b.get(), (ServerErrorService) this.f86299c.get());
    }
}