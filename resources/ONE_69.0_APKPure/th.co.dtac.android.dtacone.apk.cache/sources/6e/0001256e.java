package th.p047co.dtac.android.dtacone.presenter.staff;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.staff.RenameStaffPresenter_Factory */
/* loaded from: classes8.dex */
public final class RenameStaffPresenter_Factory implements Factory<RenameStaffPresenter> {

    /* renamed from: a */
    public final Provider f86560a;

    /* renamed from: b */
    public final Provider f86561b;

    /* renamed from: c */
    public final Provider f86562c;

    public RenameStaffPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86560a = provider;
        this.f86561b = provider2;
        this.f86562c = provider3;
    }

    public static RenameStaffPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new RenameStaffPresenter_Factory(provider, provider2, provider3);
    }

    public static RenameStaffPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new RenameStaffPresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public RenameStaffPresenter get() {
        return newInstance((RTRApi) this.f86560a.get(), (RxThreadService) this.f86561b.get(), (ServerErrorService) this.f86562c.get());
    }
}