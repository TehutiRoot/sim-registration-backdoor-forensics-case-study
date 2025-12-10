package th.p047co.dtac.android.dtacone.presenter.register;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.register.RegisterStatusPresenter_Factory */
/* loaded from: classes8.dex */
public final class RegisterStatusPresenter_Factory implements Factory<RegisterStatusPresenter> {

    /* renamed from: a */
    public final Provider f86316a;

    /* renamed from: b */
    public final Provider f86317b;

    /* renamed from: c */
    public final Provider f86318c;

    public RegisterStatusPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86316a = provider;
        this.f86317b = provider2;
        this.f86318c = provider3;
    }

    public static RegisterStatusPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new RegisterStatusPresenter_Factory(provider, provider2, provider3);
    }

    public static RegisterStatusPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new RegisterStatusPresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public RegisterStatusPresenter get() {
        return newInstance((RTRApi) this.f86316a.get(), (RxThreadService) this.f86317b.get(), (ServerErrorService) this.f86318c.get());
    }
}