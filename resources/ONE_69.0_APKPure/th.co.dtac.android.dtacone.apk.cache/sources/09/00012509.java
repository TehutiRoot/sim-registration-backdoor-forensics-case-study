package th.p047co.dtac.android.dtacone.presenter.self_update;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.self_update.RtrProfilePresenter_Factory */
/* loaded from: classes8.dex */
public final class RtrProfilePresenter_Factory implements Factory<RtrProfilePresenter> {

    /* renamed from: a */
    public final Provider f86409a;

    /* renamed from: b */
    public final Provider f86410b;

    /* renamed from: c */
    public final Provider f86411c;

    public RtrProfilePresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86409a = provider;
        this.f86410b = provider2;
        this.f86411c = provider3;
    }

    public static RtrProfilePresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new RtrProfilePresenter_Factory(provider, provider2, provider3);
    }

    public static RtrProfilePresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new RtrProfilePresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public RtrProfilePresenter get() {
        return newInstance((RTRApiRx2) this.f86409a.get(), (Rx2ThreadService) this.f86410b.get(), (ServerErrorService) this.f86411c.get());
    }
}