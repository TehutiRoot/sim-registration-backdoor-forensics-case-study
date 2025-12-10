package th.p047co.dtac.android.dtacone.presenter.force_change_password;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.force_change_password.ForceChangePasswordVerifyOtpPresenter_Factory */
/* loaded from: classes8.dex */
public final class ForceChangePasswordVerifyOtpPresenter_Factory implements Factory<ForceChangePasswordVerifyOtpPresenter> {

    /* renamed from: a */
    public final Provider f85830a;

    /* renamed from: b */
    public final Provider f85831b;

    /* renamed from: c */
    public final Provider f85832c;

    /* renamed from: d */
    public final Provider f85833d;

    public ForceChangePasswordVerifyOtpPresenter_Factory(Provider<RTRApiRx2> provider, Provider<ServerErrorService> provider2, Provider<Rx2ThreadService> provider3, Provider<TemporaryCache> provider4) {
        this.f85830a = provider;
        this.f85831b = provider2;
        this.f85832c = provider3;
        this.f85833d = provider4;
    }

    public static ForceChangePasswordVerifyOtpPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<ServerErrorService> provider2, Provider<Rx2ThreadService> provider3, Provider<TemporaryCache> provider4) {
        return new ForceChangePasswordVerifyOtpPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static ForceChangePasswordVerifyOtpPresenter newInstance(RTRApiRx2 rTRApiRx2, ServerErrorService serverErrorService, Rx2ThreadService rx2ThreadService, TemporaryCache temporaryCache) {
        return new ForceChangePasswordVerifyOtpPresenter(rTRApiRx2, serverErrorService, rx2ThreadService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public ForceChangePasswordVerifyOtpPresenter get() {
        return newInstance((RTRApiRx2) this.f85830a.get(), (ServerErrorService) this.f85831b.get(), (Rx2ThreadService) this.f85832c.get(), (TemporaryCache) this.f85833d.get());
    }
}