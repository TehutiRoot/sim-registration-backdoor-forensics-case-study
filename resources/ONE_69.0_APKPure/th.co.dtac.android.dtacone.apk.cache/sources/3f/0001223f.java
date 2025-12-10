package th.p047co.dtac.android.dtacone.presenter.buy_dol;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolPriceListPresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolPriceListPresenter_Factory implements Factory<BuyDolPriceListPresenter> {

    /* renamed from: a */
    public final Provider f85472a;

    /* renamed from: b */
    public final Provider f85473b;

    /* renamed from: c */
    public final Provider f85474c;

    public BuyDolPriceListPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85472a = provider;
        this.f85473b = provider2;
        this.f85474c = provider3;
    }

    public static BuyDolPriceListPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new BuyDolPriceListPresenter_Factory(provider, provider2, provider3);
    }

    public static BuyDolPriceListPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService) {
        return new BuyDolPriceListPresenter(rTRApi, rxThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public BuyDolPriceListPresenter get() {
        return newInstance((RTRApi) this.f85472a.get(), (RxThreadService) this.f85473b.get(), (ServerErrorService) this.f85474c.get());
    }
}