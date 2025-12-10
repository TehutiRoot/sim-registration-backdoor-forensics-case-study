package th.p047co.dtac.android.dtacone.presenter.reports;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.reports.RtrDatePagerPresenter_Factory */
/* loaded from: classes8.dex */
public final class RtrDatePagerPresenter_Factory implements Factory<RtrDatePagerPresenter> {

    /* renamed from: a */
    public final Provider f86363a;

    /* renamed from: b */
    public final Provider f86364b;

    /* renamed from: c */
    public final Provider f86365c;

    public RtrDatePagerPresenter_Factory(Provider<RTRApiRx2> provider, Provider<ServerErrorService> provider2, Provider<Rx2ThreadService> provider3) {
        this.f86363a = provider;
        this.f86364b = provider2;
        this.f86365c = provider3;
    }

    public static RtrDatePagerPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<ServerErrorService> provider2, Provider<Rx2ThreadService> provider3) {
        return new RtrDatePagerPresenter_Factory(provider, provider2, provider3);
    }

    public static RtrDatePagerPresenter newInstance(RTRApiRx2 rTRApiRx2, ServerErrorService serverErrorService, Rx2ThreadService rx2ThreadService) {
        return new RtrDatePagerPresenter(rTRApiRx2, serverErrorService, rx2ThreadService);
    }

    @Override // javax.inject.Provider
    public RtrDatePagerPresenter get() {
        return newInstance((RTRApiRx2) this.f86363a.get(), (ServerErrorService) this.f86364b.get(), (Rx2ThreadService) this.f86365c.get());
    }
}