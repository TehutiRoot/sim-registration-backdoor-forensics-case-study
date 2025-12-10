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
/* renamed from: th.co.dtac.android.dtacone.presenter.new_register.RegisterOneSimRPresenter_Factory */
/* loaded from: classes8.dex */
public final class RegisterOneSimRPresenter_Factory implements Factory<RegisterOneSimRPresenter> {

    /* renamed from: a */
    public final Provider f86053a;

    /* renamed from: b */
    public final Provider f86054b;

    /* renamed from: c */
    public final Provider f86055c;

    /* renamed from: d */
    public final Provider f86056d;

    public RegisterOneSimRPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        this.f86053a = provider;
        this.f86054b = provider2;
        this.f86055c = provider3;
        this.f86056d = provider4;
    }

    public static RegisterOneSimRPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        return new RegisterOneSimRPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static RegisterOneSimRPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, TemporaryCache temporaryCache) {
        return new RegisterOneSimRPresenter(rTRApi, rxThreadService, serverErrorService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public RegisterOneSimRPresenter get() {
        return newInstance((RTRApi) this.f86053a.get(), (RxThreadService) this.f86054b.get(), (ServerErrorService) this.f86055c.get(), (TemporaryCache) this.f86056d.get());
    }
}