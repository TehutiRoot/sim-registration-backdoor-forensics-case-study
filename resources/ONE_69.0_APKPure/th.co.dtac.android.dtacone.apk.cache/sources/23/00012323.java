package th.p047co.dtac.android.dtacone.presenter.epin;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.epin.EPinConfirmPresenter_Factory */
/* loaded from: classes8.dex */
public final class EPinConfirmPresenter_Factory implements Factory<EPinConfirmPresenter> {

    /* renamed from: a */
    public final Provider f85757a;

    /* renamed from: b */
    public final Provider f85758b;

    /* renamed from: c */
    public final Provider f85759c;

    public EPinConfirmPresenter_Factory(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3) {
        this.f85757a = provider;
        this.f85758b = provider2;
        this.f85759c = provider3;
    }

    public static EPinConfirmPresenter_Factory create(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3) {
        return new EPinConfirmPresenter_Factory(provider, provider2, provider3);
    }

    public static EPinConfirmPresenter newInstance(RTRApi rTRApi, ServerErrorService serverErrorService, RxThreadService rxThreadService) {
        return new EPinConfirmPresenter(rTRApi, serverErrorService, rxThreadService);
    }

    @Override // javax.inject.Provider
    public EPinConfirmPresenter get() {
        return newInstance((RTRApi) this.f85757a.get(), (ServerErrorService) this.f85758b.get(), (RxThreadService) this.f85759c.get());
    }
}