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
/* renamed from: th.co.dtac.android.dtacone.presenter.staff.StaffCreditUpdatePresenter_Factory */
/* loaded from: classes8.dex */
public final class StaffCreditUpdatePresenter_Factory implements Factory<StaffCreditUpdatePresenter> {

    /* renamed from: a */
    public final Provider f86578a;

    /* renamed from: b */
    public final Provider f86579b;

    /* renamed from: c */
    public final Provider f86580c;

    public StaffCreditUpdatePresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86578a = provider;
        this.f86579b = provider2;
        this.f86580c = provider3;
    }

    public static StaffCreditUpdatePresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new StaffCreditUpdatePresenter_Factory(provider, provider2, provider3);
    }

    public static StaffCreditUpdatePresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new StaffCreditUpdatePresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public StaffCreditUpdatePresenter get() {
        return newInstance((RTRApi) this.f86578a.get(), (RxThreadService) this.f86579b.get(), (ServerErrorService) this.f86580c.get());
    }
}