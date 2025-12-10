package th.p047co.dtac.android.dtacone.presenter.buy_dol;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolChargeDirectAccountPresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolChargeDirectAccountPresenter_Factory implements Factory<BuyDolChargeDirectAccountPresenter> {

    /* renamed from: a */
    public final Provider f85393a;

    /* renamed from: b */
    public final Provider f85394b;

    /* renamed from: c */
    public final Provider f85395c;

    public BuyDolChargeDirectAccountPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85393a = provider;
        this.f85394b = provider2;
        this.f85395c = provider3;
    }

    public static BuyDolChargeDirectAccountPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new BuyDolChargeDirectAccountPresenter_Factory(provider, provider2, provider3);
    }

    public static BuyDolChargeDirectAccountPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new BuyDolChargeDirectAccountPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public BuyDolChargeDirectAccountPresenter get() {
        return newInstance((RTRApiRx2) this.f85393a.get(), (Rx2ThreadService) this.f85394b.get(), (ServerErrorService) this.f85395c.get());
    }
}