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
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolChargeV2Presenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolChargeV2Presenter_Factory implements Factory<BuyDolChargeV2Presenter> {

    /* renamed from: a */
    public final Provider f85410a;

    /* renamed from: b */
    public final Provider f85411b;

    /* renamed from: c */
    public final Provider f85412c;

    public BuyDolChargeV2Presenter_Factory(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85410a = provider;
        this.f85411b = provider2;
        this.f85412c = provider3;
    }

    public static BuyDolChargeV2Presenter_Factory create(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new BuyDolChargeV2Presenter_Factory(provider, provider2, provider3);
    }

    public static BuyDolChargeV2Presenter newInstance(RTRApi rTRApi, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new BuyDolChargeV2Presenter(rTRApi, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public BuyDolChargeV2Presenter get() {
        return newInstance((RTRApi) this.f85410a.get(), (Rx2ThreadService) this.f85411b.get(), (ServerErrorService) this.f85412c.get());
    }
}