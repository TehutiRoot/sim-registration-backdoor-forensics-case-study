package th.p047co.dtac.android.dtacone.presenter.reports;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.reports.RtrSummaryCommissionPresenter_Factory */
/* loaded from: classes8.dex */
public final class RtrSummaryCommissionPresenter_Factory implements Factory<RtrSummaryCommissionPresenter> {

    /* renamed from: a */
    public final Provider f86373a;

    /* renamed from: b */
    public final Provider f86374b;

    /* renamed from: c */
    public final Provider f86375c;

    /* renamed from: d */
    public final Provider f86376d;

    public RtrSummaryCommissionPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        this.f86373a = provider;
        this.f86374b = provider2;
        this.f86375c = provider3;
        this.f86376d = provider4;
    }

    public static RtrSummaryCommissionPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        return new RtrSummaryCommissionPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static RtrSummaryCommissionPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, TemporaryCache temporaryCache) {
        return new RtrSummaryCommissionPresenter(rTRApiRx2, rx2ThreadService, serverErrorService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public RtrSummaryCommissionPresenter get() {
        return newInstance((RTRApiRx2) this.f86373a.get(), (Rx2ThreadService) this.f86374b.get(), (ServerErrorService) this.f86375c.get(), (TemporaryCache) this.f86376d.get());
    }
}