package th.p047co.dtac.android.dtacone.presenter.service;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.service.UserInfoPresenter_Factory */
/* loaded from: classes8.dex */
public final class UserInfoPresenter_Factory implements Factory<UserInfoPresenter> {

    /* renamed from: a */
    public final Provider f86502a;

    /* renamed from: b */
    public final Provider f86503b;

    /* renamed from: c */
    public final Provider f86504c;

    public UserInfoPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86502a = provider;
        this.f86503b = provider2;
        this.f86504c = provider3;
    }

    public static UserInfoPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new UserInfoPresenter_Factory(provider, provider2, provider3);
    }

    public static UserInfoPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new UserInfoPresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public UserInfoPresenter get() {
        return newInstance((RTRApi) this.f86502a.get(), (RxThreadService) this.f86503b.get(), (ServerErrorService) this.f86504c.get());
    }
}