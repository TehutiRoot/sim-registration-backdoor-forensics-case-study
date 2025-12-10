package th.p047co.dtac.android.dtacone.presenter.force_change_password;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.force_change_password.ForceChangePasswordPresenter_Factory */
/* loaded from: classes8.dex */
public final class ForceChangePasswordPresenter_Factory implements Factory<ForceChangePasswordPresenter> {

    /* renamed from: a */
    public final Provider f85820a;

    /* renamed from: b */
    public final Provider f85821b;

    /* renamed from: c */
    public final Provider f85822c;

    public ForceChangePasswordPresenter_Factory(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3) {
        this.f85820a = provider;
        this.f85821b = provider2;
        this.f85822c = provider3;
    }

    public static ForceChangePasswordPresenter_Factory create(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3) {
        return new ForceChangePasswordPresenter_Factory(provider, provider2, provider3);
    }

    public static ForceChangePasswordPresenter newInstance(RTRApi rTRApi, ServerErrorService serverErrorService, RxThreadService rxThreadService) {
        return new ForceChangePasswordPresenter(rTRApi, serverErrorService, rxThreadService);
    }

    @Override // javax.inject.Provider
    public ForceChangePasswordPresenter get() {
        return newInstance((RTRApi) this.f85820a.get(), (ServerErrorService) this.f85821b.get(), (RxThreadService) this.f85822c.get());
    }
}