package th.p047co.dtac.android.dtacone.presenter.permission;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.permission.MrtrPermissionPresenter_Factory */
/* loaded from: classes8.dex */
public final class MrtrPermissionPresenter_Factory implements Factory<MrtrPermissionPresenter> {

    /* renamed from: a */
    public final Provider f86118a;

    /* renamed from: b */
    public final Provider f86119b;

    /* renamed from: c */
    public final Provider f86120c;

    public MrtrPermissionPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86118a = provider;
        this.f86119b = provider2;
        this.f86120c = provider3;
    }

    public static MrtrPermissionPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new MrtrPermissionPresenter_Factory(provider, provider2, provider3);
    }

    public static MrtrPermissionPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new MrtrPermissionPresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPermissionPresenter get() {
        return newInstance((RTRApi) this.f86118a.get(), (RxThreadService) this.f86119b.get(), (ServerErrorService) this.f86120c.get());
    }
}