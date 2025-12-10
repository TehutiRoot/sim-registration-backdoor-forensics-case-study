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
/* renamed from: th.co.dtac.android.dtacone.presenter.staff.StaffCreditResetPresenter_Factory */
/* loaded from: classes8.dex */
public final class StaffCreditResetPresenter_Factory implements Factory<StaffCreditResetPresenter> {

    /* renamed from: a */
    public final Provider f86569a;

    /* renamed from: b */
    public final Provider f86570b;

    /* renamed from: c */
    public final Provider f86571c;

    public StaffCreditResetPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86569a = provider;
        this.f86570b = provider2;
        this.f86571c = provider3;
    }

    public static StaffCreditResetPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new StaffCreditResetPresenter_Factory(provider, provider2, provider3);
    }

    public static StaffCreditResetPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new StaffCreditResetPresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public StaffCreditResetPresenter get() {
        return newInstance((RTRApi) this.f86569a.get(), (RxThreadService) this.f86570b.get(), (ServerErrorService) this.f86571c.get());
    }
}