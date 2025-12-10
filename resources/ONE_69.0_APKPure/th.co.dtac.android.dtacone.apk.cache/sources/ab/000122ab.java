package th.p047co.dtac.android.dtacone.presenter.change_password;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.change_password.ChangePasswordPresenter_Factory */
/* loaded from: classes8.dex */
public final class ChangePasswordPresenter_Factory implements Factory<ChangePasswordPresenter> {

    /* renamed from: a */
    public final Provider f85617a;

    /* renamed from: b */
    public final Provider f85618b;

    /* renamed from: c */
    public final Provider f85619c;

    public ChangePasswordPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85617a = provider;
        this.f85618b = provider2;
        this.f85619c = provider3;
    }

    public static ChangePasswordPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new ChangePasswordPresenter_Factory(provider, provider2, provider3);
    }

    public static ChangePasswordPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new ChangePasswordPresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public ChangePasswordPresenter get() {
        return newInstance((RTRApi) this.f85617a.get(), (RxThreadService) this.f85618b.get(), (ServerErrorService) this.f85619c.get());
    }
}