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
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.presenter.rectify.RectifyConfirmPresenter_Factory */
/* loaded from: classes8.dex */
public final class RectifyConfirmPresenter_Factory implements Factory<RectifyConfirmPresenter> {

    /* renamed from: a */
    public final Provider f86280a;

    /* renamed from: b */
    public final Provider f86281b;

    /* renamed from: c */
    public final Provider f86282c;

    public RectifyConfirmPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86280a = provider;
        this.f86281b = provider2;
        this.f86282c = provider3;
    }

    public static RectifyConfirmPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new RectifyConfirmPresenter_Factory(provider, provider2, provider3);
    }

    public static RectifyConfirmPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new RectifyConfirmPresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public RectifyConfirmPresenter get() {
        return newInstance((RTRApi) this.f86280a.get(), (RxThreadService) this.f86281b.get(), (ServerErrorService) this.f86282c.get());
    }
}