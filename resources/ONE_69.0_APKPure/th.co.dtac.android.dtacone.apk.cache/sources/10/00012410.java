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
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.presenter.new_register.RegisterNoSimRPresenter_Factory */
/* loaded from: classes8.dex */
public final class RegisterNoSimRPresenter_Factory implements Factory<RegisterNoSimRPresenter> {

    /* renamed from: a */
    public final Provider f86043a;

    /* renamed from: b */
    public final Provider f86044b;

    /* renamed from: c */
    public final Provider f86045c;

    /* renamed from: d */
    public final Provider f86046d;

    public RegisterNoSimRPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        this.f86043a = provider;
        this.f86044b = provider2;
        this.f86045c = provider3;
        this.f86046d = provider4;
    }

    public static RegisterNoSimRPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        return new RegisterNoSimRPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static RegisterNoSimRPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, TemporaryCache temporaryCache) {
        return new RegisterNoSimRPresenter(rTRApi, rxThreadService, serverErrorService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public RegisterNoSimRPresenter get() {
        return newInstance((RTRApi) this.f86043a.get(), (RxThreadService) this.f86044b.get(), (ServerErrorService) this.f86045c.get(), (TemporaryCache) this.f86046d.get());
    }
}