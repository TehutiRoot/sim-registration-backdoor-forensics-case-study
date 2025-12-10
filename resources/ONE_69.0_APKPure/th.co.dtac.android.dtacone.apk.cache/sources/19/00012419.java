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
/* renamed from: th.co.dtac.android.dtacone.presenter.new_register.RegisterVerifyMsisdnPresenter_Factory */
/* loaded from: classes8.dex */
public final class RegisterVerifyMsisdnPresenter_Factory implements Factory<RegisterVerifyMsisdnPresenter> {

    /* renamed from: a */
    public final Provider f86073a;

    /* renamed from: b */
    public final Provider f86074b;

    /* renamed from: c */
    public final Provider f86075c;

    /* renamed from: d */
    public final Provider f86076d;

    public RegisterVerifyMsisdnPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        this.f86073a = provider;
        this.f86074b = provider2;
        this.f86075c = provider3;
        this.f86076d = provider4;
    }

    public static RegisterVerifyMsisdnPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        return new RegisterVerifyMsisdnPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static RegisterVerifyMsisdnPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, TemporaryCache temporaryCache) {
        return new RegisterVerifyMsisdnPresenter(rTRApi, rxThreadService, serverErrorService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public RegisterVerifyMsisdnPresenter get() {
        return newInstance((RTRApi) this.f86073a.get(), (RxThreadService) this.f86074b.get(), (ServerErrorService) this.f86075c.get(), (TemporaryCache) this.f86076d.get());
    }
}