package th.p047co.dtac.android.dtacone.presenter.inactive_user;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.inactive_user.InactiveOwnerDetailPresenter_Factory */
/* loaded from: classes8.dex */
public final class InactiveOwnerDetailPresenter_Factory implements Factory<InactiveOwnerDetailPresenter> {

    /* renamed from: a */
    public final Provider f85877a;

    /* renamed from: b */
    public final Provider f85878b;

    /* renamed from: c */
    public final Provider f85879c;

    public InactiveOwnerDetailPresenter_Factory(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3) {
        this.f85877a = provider;
        this.f85878b = provider2;
        this.f85879c = provider3;
    }

    public static InactiveOwnerDetailPresenter_Factory create(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3) {
        return new InactiveOwnerDetailPresenter_Factory(provider, provider2, provider3);
    }

    public static InactiveOwnerDetailPresenter newInstance(RTRApi rTRApi, ServerErrorService serverErrorService, RxThreadService rxThreadService) {
        return new InactiveOwnerDetailPresenter(rTRApi, serverErrorService, rxThreadService);
    }

    @Override // javax.inject.Provider
    public InactiveOwnerDetailPresenter get() {
        return newInstance((RTRApi) this.f85877a.get(), (ServerErrorService) this.f85878b.get(), (RxThreadService) this.f85879c.get());
    }
}