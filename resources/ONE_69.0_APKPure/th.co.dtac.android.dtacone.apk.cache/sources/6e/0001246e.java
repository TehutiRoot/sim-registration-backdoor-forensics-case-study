package th.p047co.dtac.android.dtacone.presenter.prepaid;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.PrepaidPermissionPresenter_Factory */
/* loaded from: classes8.dex */
public final class PrepaidPermissionPresenter_Factory implements Factory<PrepaidPermissionPresenter> {

    /* renamed from: a */
    public final Provider f86184a;

    /* renamed from: b */
    public final Provider f86185b;

    /* renamed from: c */
    public final Provider f86186c;

    public PrepaidPermissionPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86184a = provider;
        this.f86185b = provider2;
        this.f86186c = provider3;
    }

    public static PrepaidPermissionPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new PrepaidPermissionPresenter_Factory(provider, provider2, provider3);
    }

    public static PrepaidPermissionPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new PrepaidPermissionPresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public PrepaidPermissionPresenter get() {
        return newInstance((RTRApi) this.f86184a.get(), (RxThreadService) this.f86185b.get(), (ServerErrorService) this.f86186c.get());
    }
}