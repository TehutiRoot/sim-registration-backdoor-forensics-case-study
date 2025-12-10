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
/* renamed from: th.co.dtac.android.dtacone.presenter.reports.RtrCommissionHistoryPresenter_Factory */
/* loaded from: classes8.dex */
public final class RtrCommissionHistoryPresenter_Factory implements Factory<RtrCommissionHistoryPresenter> {

    /* renamed from: a */
    public final Provider f86354a;

    /* renamed from: b */
    public final Provider f86355b;

    /* renamed from: c */
    public final Provider f86356c;

    /* renamed from: d */
    public final Provider f86357d;

    public RtrCommissionHistoryPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        this.f86354a = provider;
        this.f86355b = provider2;
        this.f86356c = provider3;
        this.f86357d = provider4;
    }

    public static RtrCommissionHistoryPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        return new RtrCommissionHistoryPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static RtrCommissionHistoryPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, TemporaryCache temporaryCache) {
        return new RtrCommissionHistoryPresenter(rTRApiRx2, rx2ThreadService, serverErrorService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public RtrCommissionHistoryPresenter get() {
        return newInstance((RTRApiRx2) this.f86354a.get(), (Rx2ThreadService) this.f86355b.get(), (ServerErrorService) this.f86356c.get(), (TemporaryCache) this.f86357d.get());
    }
}