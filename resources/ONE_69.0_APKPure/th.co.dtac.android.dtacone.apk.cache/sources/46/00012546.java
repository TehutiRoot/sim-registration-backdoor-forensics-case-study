package th.p047co.dtac.android.dtacone.presenter.service;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.service.PerformanceReportPresenter_Factory */
/* loaded from: classes8.dex */
public final class PerformanceReportPresenter_Factory implements Factory<PerformanceReportPresenter> {

    /* renamed from: a */
    public final Provider f86492a;

    /* renamed from: b */
    public final Provider f86493b;

    /* renamed from: c */
    public final Provider f86494c;

    /* renamed from: d */
    public final Provider f86495d;

    public PerformanceReportPresenter_Factory(Provider<RTRApi> provider, Provider<RtrRepository> provider2, Provider<RxThreadService> provider3, Provider<ServerErrorService> provider4) {
        this.f86492a = provider;
        this.f86493b = provider2;
        this.f86494c = provider3;
        this.f86495d = provider4;
    }

    public static PerformanceReportPresenter_Factory create(Provider<RTRApi> provider, Provider<RtrRepository> provider2, Provider<RxThreadService> provider3, Provider<ServerErrorService> provider4) {
        return new PerformanceReportPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static PerformanceReportPresenter newInstance(RTRApi rTRApi, RtrRepository rtrRepository, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new PerformanceReportPresenter(rTRApi, rtrRepository, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public PerformanceReportPresenter get() {
        return newInstance((RTRApi) this.f86492a.get(), (RtrRepository) this.f86493b.get(), (RxThreadService) this.f86494c.get(), (ServerErrorService) this.f86495d.get());
    }
}