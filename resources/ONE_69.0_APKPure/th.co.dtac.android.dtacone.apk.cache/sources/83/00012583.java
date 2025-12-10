package th.p047co.dtac.android.dtacone.presenter.staff;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.staff.UserPermissionPresenter_Factory */
/* loaded from: classes8.dex */
public final class UserPermissionPresenter_Factory implements Factory<UserPermissionPresenter> {

    /* renamed from: a */
    public final Provider f86607a;

    /* renamed from: b */
    public final Provider f86608b;

    /* renamed from: c */
    public final Provider f86609c;

    /* renamed from: d */
    public final Provider f86610d;

    public UserPermissionPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4) {
        this.f86607a = provider;
        this.f86608b = provider2;
        this.f86609c = provider3;
        this.f86610d = provider4;
    }

    public static UserPermissionPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4) {
        return new UserPermissionPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static UserPermissionPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, RtrRepository rtrRepository) {
        return new UserPermissionPresenter(rTRApi, rxThreadService, serverErrorService, rtrRepository);
    }

    @Override // javax.inject.Provider
    public UserPermissionPresenter get() {
        return newInstance((RTRApi) this.f86607a.get(), (RxThreadService) this.f86608b.get(), (ServerErrorService) this.f86609c.get(), (RtrRepository) this.f86610d.get());
    }
}