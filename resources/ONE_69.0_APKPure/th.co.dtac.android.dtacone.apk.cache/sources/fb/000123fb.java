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
/* renamed from: th.co.dtac.android.dtacone.presenter.login.VerifyOtpPresenter_Factory */
/* loaded from: classes8.dex */
public final class VerifyOtpPresenter_Factory implements Factory<VerifyOtpPresenter> {

    /* renamed from: a */
    public final Provider f85990a;

    /* renamed from: b */
    public final Provider f85991b;

    /* renamed from: c */
    public final Provider f85992c;

    /* renamed from: d */
    public final Provider f85993d;

    public VerifyOtpPresenter_Factory(Provider<RTRApi> provider, Provider<TemporaryCache> provider2, Provider<RxThreadService> provider3, Provider<ServerErrorService> provider4) {
        this.f85990a = provider;
        this.f85991b = provider2;
        this.f85992c = provider3;
        this.f85993d = provider4;
    }

    public static VerifyOtpPresenter_Factory create(Provider<RTRApi> provider, Provider<TemporaryCache> provider2, Provider<RxThreadService> provider3, Provider<ServerErrorService> provider4) {
        return new VerifyOtpPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static VerifyOtpPresenter newInstance(RTRApi rTRApi, TemporaryCache temporaryCache, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new VerifyOtpPresenter(rTRApi, temporaryCache, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public VerifyOtpPresenter get() {
        return newInstance((RTRApi) this.f85990a.get(), (TemporaryCache) this.f85991b.get(), (RxThreadService) this.f85992c.get(), (ServerErrorService) this.f85993d.get());
    }
}