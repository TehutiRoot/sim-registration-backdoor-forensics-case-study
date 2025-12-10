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
/* renamed from: th.co.dtac.android.dtacone.presenter.new_register.RegisterMsisdnSimRPresenter_Factory */
/* loaded from: classes8.dex */
public final class RegisterMsisdnSimRPresenter_Factory implements Factory<RegisterMsisdnSimRPresenter> {

    /* renamed from: a */
    public final Provider f86033a;

    /* renamed from: b */
    public final Provider f86034b;

    /* renamed from: c */
    public final Provider f86035c;

    /* renamed from: d */
    public final Provider f86036d;

    public RegisterMsisdnSimRPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        this.f86033a = provider;
        this.f86034b = provider2;
        this.f86035c = provider3;
        this.f86036d = provider4;
    }

    public static RegisterMsisdnSimRPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        return new RegisterMsisdnSimRPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static RegisterMsisdnSimRPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, TemporaryCache temporaryCache) {
        return new RegisterMsisdnSimRPresenter(rTRApi, rxThreadService, serverErrorService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public RegisterMsisdnSimRPresenter get() {
        return newInstance((RTRApi) this.f86033a.get(), (RxThreadService) this.f86034b.get(), (ServerErrorService) this.f86035c.get(), (TemporaryCache) this.f86036d.get());
    }
}