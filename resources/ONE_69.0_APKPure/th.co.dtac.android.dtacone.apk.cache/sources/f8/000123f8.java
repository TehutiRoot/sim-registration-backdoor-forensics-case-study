package th.p047co.dtac.android.dtacone.presenter.login;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.login.RequestOtpPresenter_Factory */
/* loaded from: classes8.dex */
public final class RequestOtpPresenter_Factory implements Factory<RequestOtpPresenter> {

    /* renamed from: a */
    public final Provider f85980a;

    /* renamed from: b */
    public final Provider f85981b;

    /* renamed from: c */
    public final Provider f85982c;

    /* renamed from: d */
    public final Provider f85983d;

    public RequestOtpPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<TemporaryCache> provider3, Provider<ServerErrorService> provider4) {
        this.f85980a = provider;
        this.f85981b = provider2;
        this.f85982c = provider3;
        this.f85983d = provider4;
    }

    public static RequestOtpPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<TemporaryCache> provider3, Provider<ServerErrorService> provider4) {
        return new RequestOtpPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static RequestOtpPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, TemporaryCache temporaryCache, ServerErrorService serverErrorService) {
        return new RequestOtpPresenter(rTRApi, rxThreadService, temporaryCache, serverErrorService);
    }

    @Override // javax.inject.Provider
    public RequestOtpPresenter get() {
        return newInstance((RTRApi) this.f85980a.get(), (RxThreadService) this.f85981b.get(), (TemporaryCache) this.f85982c.get(), (ServerErrorService) this.f85983d.get());
    }
}