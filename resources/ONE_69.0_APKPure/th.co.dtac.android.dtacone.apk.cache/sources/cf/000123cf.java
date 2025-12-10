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
/* renamed from: th.co.dtac.android.dtacone.presenter.inactive_user.OwnerListPresenter_Factory */
/* loaded from: classes8.dex */
public final class OwnerListPresenter_Factory implements Factory<OwnerListPresenter> {

    /* renamed from: a */
    public final Provider f85903a;

    /* renamed from: b */
    public final Provider f85904b;

    /* renamed from: c */
    public final Provider f85905c;

    public OwnerListPresenter_Factory(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3) {
        this.f85903a = provider;
        this.f85904b = provider2;
        this.f85905c = provider3;
    }

    public static OwnerListPresenter_Factory create(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3) {
        return new OwnerListPresenter_Factory(provider, provider2, provider3);
    }

    public static OwnerListPresenter newInstance(RTRApi rTRApi, ServerErrorService serverErrorService, RxThreadService rxThreadService) {
        return new OwnerListPresenter(rTRApi, serverErrorService, rxThreadService);
    }

    @Override // javax.inject.Provider
    public OwnerListPresenter get() {
        return newInstance((RTRApi) this.f85903a.get(), (ServerErrorService) this.f85904b.get(), (RxThreadService) this.f85905c.get());
    }
}