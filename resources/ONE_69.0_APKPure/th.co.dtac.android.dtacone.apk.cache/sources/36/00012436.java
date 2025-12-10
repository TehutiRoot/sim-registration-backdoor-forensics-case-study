package th.p047co.dtac.android.dtacone.presenter.password;

import android.app.Activity;
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
/* renamed from: th.co.dtac.android.dtacone.presenter.password.VerifyPasswordPresenter_Factory */
/* loaded from: classes8.dex */
public final class VerifyPasswordPresenter_Factory implements Factory<VerifyPasswordPresenter> {

    /* renamed from: a */
    public final Provider f86108a;

    /* renamed from: b */
    public final Provider f86109b;

    /* renamed from: c */
    public final Provider f86110c;

    /* renamed from: d */
    public final Provider f86111d;

    public VerifyPasswordPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<Activity> provider4) {
        this.f86108a = provider;
        this.f86109b = provider2;
        this.f86110c = provider3;
        this.f86111d = provider4;
    }

    public static VerifyPasswordPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<Activity> provider4) {
        return new VerifyPasswordPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static VerifyPasswordPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, Activity activity) {
        return new VerifyPasswordPresenter(rTRApiRx2, rx2ThreadService, serverErrorService, activity);
    }

    @Override // javax.inject.Provider
    public VerifyPasswordPresenter get() {
        return newInstance((RTRApiRx2) this.f86108a.get(), (Rx2ThreadService) this.f86109b.get(), (ServerErrorService) this.f86110c.get(), (Activity) this.f86111d.get());
    }
}