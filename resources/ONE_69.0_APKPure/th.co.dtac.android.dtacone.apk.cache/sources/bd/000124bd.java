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
/* renamed from: th.co.dtac.android.dtacone.presenter.register.RegisterOwnerPresenterImpl_Factory */
/* loaded from: classes8.dex */
public final class RegisterOwnerPresenterImpl_Factory implements Factory<RegisterOwnerPresenterImpl> {

    /* renamed from: a */
    public final Provider f86308a;

    /* renamed from: b */
    public final Provider f86309b;

    /* renamed from: c */
    public final Provider f86310c;

    public RegisterOwnerPresenterImpl_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86308a = provider;
        this.f86309b = provider2;
        this.f86310c = provider3;
    }

    public static RegisterOwnerPresenterImpl_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new RegisterOwnerPresenterImpl_Factory(provider, provider2, provider3);
    }

    public static RegisterOwnerPresenterImpl newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new RegisterOwnerPresenterImpl(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public RegisterOwnerPresenterImpl get() {
        return newInstance((RTRApi) this.f86308a.get(), (RxThreadService) this.f86309b.get(), (ServerErrorService) this.f86310c.get());
    }
}