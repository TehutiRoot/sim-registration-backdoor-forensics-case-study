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
/* renamed from: th.co.dtac.android.dtacone.presenter.reports.DetailProfitReportPresenter_Factory */
/* loaded from: classes8.dex */
public final class DetailProfitReportPresenter_Factory implements Factory<DetailProfitReportPresenter> {

    /* renamed from: a */
    public final Provider f86325a;

    /* renamed from: b */
    public final Provider f86326b;

    /* renamed from: c */
    public final Provider f86327c;

    public DetailProfitReportPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86325a = provider;
        this.f86326b = provider2;
        this.f86327c = provider3;
    }

    public static DetailProfitReportPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new DetailProfitReportPresenter_Factory(provider, provider2, provider3);
    }

    public static DetailProfitReportPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new DetailProfitReportPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public DetailProfitReportPresenter get() {
        return newInstance((RTRApiRx2) this.f86325a.get(), (Rx2ThreadService) this.f86326b.get(), (ServerErrorService) this.f86327c.get());
    }
}