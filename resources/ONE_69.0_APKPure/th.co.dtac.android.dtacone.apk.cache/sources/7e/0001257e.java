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
/* renamed from: th.co.dtac.android.dtacone.presenter.staff.StaffListPresenter_Factory */
/* loaded from: classes8.dex */
public final class StaffListPresenter_Factory implements Factory<StaffListPresenter> {

    /* renamed from: a */
    public final Provider f86596a;

    /* renamed from: b */
    public final Provider f86597b;

    /* renamed from: c */
    public final Provider f86598c;

    public StaffListPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86596a = provider;
        this.f86597b = provider2;
        this.f86598c = provider3;
    }

    public static StaffListPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new StaffListPresenter_Factory(provider, provider2, provider3);
    }

    public static StaffListPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new StaffListPresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public StaffListPresenter get() {
        return newInstance((RTRApi) this.f86596a.get(), (RxThreadService) this.f86597b.get(), (ServerErrorService) this.f86598c.get());
    }
}