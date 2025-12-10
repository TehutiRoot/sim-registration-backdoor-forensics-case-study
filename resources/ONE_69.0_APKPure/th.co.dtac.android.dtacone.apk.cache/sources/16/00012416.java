package th.p047co.dtac.android.dtacone.presenter.new_register;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.new_register.RegisterRtrCodeFormPresenter_Factory */
/* loaded from: classes8.dex */
public final class RegisterRtrCodeFormPresenter_Factory implements Factory<RegisterRtrCodeFormPresenter> {

    /* renamed from: a */
    public final Provider f86063a;

    /* renamed from: b */
    public final Provider f86064b;

    /* renamed from: c */
    public final Provider f86065c;

    /* renamed from: d */
    public final Provider f86066d;

    public RegisterRtrCodeFormPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        this.f86063a = provider;
        this.f86064b = provider2;
        this.f86065c = provider3;
        this.f86066d = provider4;
    }

    public static RegisterRtrCodeFormPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        return new RegisterRtrCodeFormPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static RegisterRtrCodeFormPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, TemporaryCache temporaryCache) {
        return new RegisterRtrCodeFormPresenter(rTRApi, rxThreadService, serverErrorService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public RegisterRtrCodeFormPresenter get() {
        return newInstance((RTRApi) this.f86063a.get(), (RxThreadService) this.f86064b.get(), (ServerErrorService) this.f86065c.get(), (TemporaryCache) this.f86066d.get());
    }
}