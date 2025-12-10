package th.p047co.dtac.android.dtacone.presenter.epin;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.epin.EPinPriceListPresenter_Factory */
/* loaded from: classes8.dex */
public final class EPinPriceListPresenter_Factory implements Factory<EPinPriceListPresenter> {

    /* renamed from: a */
    public final Provider f85766a;

    /* renamed from: b */
    public final Provider f85767b;

    /* renamed from: c */
    public final Provider f85768c;

    public EPinPriceListPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85766a = provider;
        this.f85767b = provider2;
        this.f85768c = provider3;
    }

    public static EPinPriceListPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new EPinPriceListPresenter_Factory(provider, provider2, provider3);
    }

    public static EPinPriceListPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new EPinPriceListPresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public EPinPriceListPresenter get() {
        return newInstance((RTRApi) this.f85766a.get(), (RxThreadService) this.f85767b.get(), (ServerErrorService) this.f85768c.get());
    }
}