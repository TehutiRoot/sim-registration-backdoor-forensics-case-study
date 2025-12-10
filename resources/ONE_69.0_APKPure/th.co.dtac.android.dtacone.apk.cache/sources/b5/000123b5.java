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
/* renamed from: th.co.dtac.android.dtacone.presenter.inactive_user.DeleteOwnerPresenter_Factory */
/* loaded from: classes8.dex */
public final class DeleteOwnerPresenter_Factory implements Factory<DeleteOwnerPresenter> {

    /* renamed from: a */
    public final Provider f85869a;

    /* renamed from: b */
    public final Provider f85870b;

    /* renamed from: c */
    public final Provider f85871c;

    public DeleteOwnerPresenter_Factory(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3) {
        this.f85869a = provider;
        this.f85870b = provider2;
        this.f85871c = provider3;
    }

    public static DeleteOwnerPresenter_Factory create(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3) {
        return new DeleteOwnerPresenter_Factory(provider, provider2, provider3);
    }

    public static DeleteOwnerPresenter newInstance(RTRApi rTRApi, ServerErrorService serverErrorService, RxThreadService rxThreadService) {
        return new DeleteOwnerPresenter(rTRApi, serverErrorService, rxThreadService);
    }

    @Override // javax.inject.Provider
    public DeleteOwnerPresenter get() {
        return newInstance((RTRApi) this.f85869a.get(), (ServerErrorService) this.f85870b.get(), (RxThreadService) this.f85871c.get());
    }
}