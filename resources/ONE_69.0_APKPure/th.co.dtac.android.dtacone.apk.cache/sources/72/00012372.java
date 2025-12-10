package th.p047co.dtac.android.dtacone.presenter.force_change_password;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.force_change_password.ForceChangePasswordOtpPresenter_Factory */
/* loaded from: classes8.dex */
public final class ForceChangePasswordOtpPresenter_Factory implements Factory<ForceChangePasswordOtpPresenter> {

    /* renamed from: a */
    public final Provider f85812a;

    /* renamed from: b */
    public final Provider f85813b;

    /* renamed from: c */
    public final Provider f85814c;

    public ForceChangePasswordOtpPresenter_Factory(Provider<RTRApiRx2> provider, Provider<ServerErrorService> provider2, Provider<Rx2ThreadService> provider3) {
        this.f85812a = provider;
        this.f85813b = provider2;
        this.f85814c = provider3;
    }

    public static ForceChangePasswordOtpPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<ServerErrorService> provider2, Provider<Rx2ThreadService> provider3) {
        return new ForceChangePasswordOtpPresenter_Factory(provider, provider2, provider3);
    }

    public static ForceChangePasswordOtpPresenter newInstance(RTRApiRx2 rTRApiRx2, ServerErrorService serverErrorService, Rx2ThreadService rx2ThreadService) {
        return new ForceChangePasswordOtpPresenter(rTRApiRx2, serverErrorService, rx2ThreadService);
    }

    @Override // javax.inject.Provider
    public ForceChangePasswordOtpPresenter get() {
        return newInstance((RTRApiRx2) this.f85812a.get(), (ServerErrorService) this.f85813b.get(), (Rx2ThreadService) this.f85814c.get());
    }
}