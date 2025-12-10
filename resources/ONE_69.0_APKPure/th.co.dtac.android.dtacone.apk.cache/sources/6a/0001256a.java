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
/* renamed from: th.co.dtac.android.dtacone.presenter.staff.AddNewStaffPresenter_Factory */
/* loaded from: classes8.dex */
public final class AddNewStaffPresenter_Factory implements Factory<AddNewStaffPresenter> {

    /* renamed from: a */
    public final Provider f86552a;

    /* renamed from: b */
    public final Provider f86553b;

    /* renamed from: c */
    public final Provider f86554c;

    public AddNewStaffPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86552a = provider;
        this.f86553b = provider2;
        this.f86554c = provider3;
    }

    public static AddNewStaffPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new AddNewStaffPresenter_Factory(provider, provider2, provider3);
    }

    public static AddNewStaffPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new AddNewStaffPresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public AddNewStaffPresenter get() {
        return newInstance((RTRApi) this.f86552a.get(), (RxThreadService) this.f86553b.get(), (ServerErrorService) this.f86554c.get());
    }
}