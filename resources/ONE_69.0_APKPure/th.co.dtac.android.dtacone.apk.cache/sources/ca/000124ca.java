package th.p047co.dtac.android.dtacone.presenter.reports;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.reports.RetailerProfilePresenter_Factory */
/* loaded from: classes8.dex */
public final class RetailerProfilePresenter_Factory implements Factory<RetailerProfilePresenter> {

    /* renamed from: a */
    public final Provider f86333a;

    /* renamed from: b */
    public final Provider f86334b;

    /* renamed from: c */
    public final Provider f86335c;

    public RetailerProfilePresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86333a = provider;
        this.f86334b = provider2;
        this.f86335c = provider3;
    }

    public static RetailerProfilePresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new RetailerProfilePresenter_Factory(provider, provider2, provider3);
    }

    public static RetailerProfilePresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new RetailerProfilePresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public RetailerProfilePresenter get() {
        return newInstance((RTRApi) this.f86333a.get(), (RxThreadService) this.f86334b.get(), (ServerErrorService) this.f86335c.get());
    }
}