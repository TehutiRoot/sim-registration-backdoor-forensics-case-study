package th.p047co.dtac.android.dtacone.presenter.reports;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.reports.RetailerSaleReportPresenter_Factory */
/* loaded from: classes8.dex */
public final class RetailerSaleReportPresenter_Factory implements Factory<RetailerSaleReportPresenter> {

    /* renamed from: a */
    public final Provider f86343a;

    /* renamed from: b */
    public final Provider f86344b;

    /* renamed from: c */
    public final Provider f86345c;

    /* renamed from: d */
    public final Provider f86346d;

    public RetailerSaleReportPresenter_Factory(Provider<RTRApi> provider, Provider<RtrRepository> provider2, Provider<RxThreadService> provider3, Provider<ServerErrorService> provider4) {
        this.f86343a = provider;
        this.f86344b = provider2;
        this.f86345c = provider3;
        this.f86346d = provider4;
    }

    public static RetailerSaleReportPresenter_Factory create(Provider<RTRApi> provider, Provider<RtrRepository> provider2, Provider<RxThreadService> provider3, Provider<ServerErrorService> provider4) {
        return new RetailerSaleReportPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static RetailerSaleReportPresenter newInstance(RTRApi rTRApi, RtrRepository rtrRepository, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new RetailerSaleReportPresenter(rTRApi, rtrRepository, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public RetailerSaleReportPresenter get() {
        return newInstance((RTRApi) this.f86343a.get(), (RtrRepository) this.f86344b.get(), (RxThreadService) this.f86345c.get(), (ServerErrorService) this.f86346d.get());
    }
}