package th.p047co.dtac.android.dtacone.presenter.buy_dol;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolChargePresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolChargePresenter_Factory implements Factory<BuyDolChargePresenter> {

    /* renamed from: a */
    public final Provider f85401a;

    /* renamed from: b */
    public final Provider f85402b;

    /* renamed from: c */
    public final Provider f85403c;

    public BuyDolChargePresenter_Factory(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85401a = provider;
        this.f85402b = provider2;
        this.f85403c = provider3;
    }

    public static BuyDolChargePresenter_Factory create(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new BuyDolChargePresenter_Factory(provider, provider2, provider3);
    }

    public static BuyDolChargePresenter newInstance(RTRApi rTRApi, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new BuyDolChargePresenter(rTRApi, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public BuyDolChargePresenter get() {
        return newInstance((RTRApi) this.f85401a.get(), (Rx2ThreadService) this.f85402b.get(), (ServerErrorService) this.f85403c.get());
    }
}