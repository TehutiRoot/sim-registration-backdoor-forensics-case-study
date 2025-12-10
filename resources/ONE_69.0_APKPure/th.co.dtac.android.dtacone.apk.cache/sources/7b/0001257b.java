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
/* renamed from: th.co.dtac.android.dtacone.presenter.staff.StaffDetailPresenter_Factory */
/* loaded from: classes8.dex */
public final class StaffDetailPresenter_Factory implements Factory<StaffDetailPresenter> {

    /* renamed from: a */
    public final Provider f86587a;

    /* renamed from: b */
    public final Provider f86588b;

    /* renamed from: c */
    public final Provider f86589c;

    public StaffDetailPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86587a = provider;
        this.f86588b = provider2;
        this.f86589c = provider3;
    }

    public static StaffDetailPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new StaffDetailPresenter_Factory(provider, provider2, provider3);
    }

    public static StaffDetailPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new StaffDetailPresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public StaffDetailPresenter get() {
        return newInstance((RTRApi) this.f86587a.get(), (RxThreadService) this.f86588b.get(), (ServerErrorService) this.f86589c.get());
    }
}